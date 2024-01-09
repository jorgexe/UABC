import pygame
import random

# Define some colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
GREEN = (0, 255, 0)
RED = (255, 0, 0)
ICE_BLUE = (173, 216, 230)  # Color azul hielo
PURPLE = (128, 0, 128)  # Color morado
VERDE_UABC = (15,92,24) # Color verde UABC
AZUL_MARINO = (0,0,128) # Color azul marino
YELLOW = (255, 255, 0)  # Color amarillo

# Set the dimensions of the grid
grid_width = 50
grid_height = 50
grid_margin = 5

current_background_color = WHITE  # El color inicial de fondo es blanco

# Set the dimensions of the window
window_width = (grid_width + grid_margin) * 10 + grid_margin
window_height = (grid_height + grid_margin) * 10 + grid_margin

# Initialize Pygame
pygame.init()

pygame.joystick.init()  # Inicializa el joystick

# Crear objetos Joystick para cada control conectado
joysticks = [pygame.joystick.Joystick(i) for i in range(pygame.joystick.get_count())]
for joystick in joysticks:
    joystick.init()

sound_move = pygame.mixer.Sound("resources/sound/move_sound.wav")  # Sonido para el movimiento
sound_win = pygame.mixer.Sound("resources/sound/win_sound.wav")    # Sonido para ganar
sound_select = pygame.mixer.Sound("resources/sound/select_sound.wav")  # Sonido para selección en el menú
pygame.mixer.music.load("resources/sound/game_music.mp3")  # Música de juego
pygame.mixer.music.load("resources/sound/music_menu.mp3")  # Música de fondo menu

# Set the size of the window
screen = pygame.display.set_mode([window_width, window_height])

# Set the title of the window
pygame.display.set_caption("Sliding Square")

# Set the font for the text
font = pygame.font.Font(None, 36)

# Set the position of the hole
hole_x = 9
hole_y = 9

# Set the clock for the game
clock = pygame.time.Clock()

# Define the positions of the obstacles for each level
obstacle_positions = [
    # Nivel 1
    [
        (9,8), (7,9)
    ],  
    # Nivel 2
    [
        (9,8), (7,9), (8,7)
    ], 
    # Nivel 3
    [
        (9,8), (7,9), (8,7), (4,8)
    ], 
    # Nivel 4
    [
        (9,8), (7,9), (8,7), (4,8), (6,8)
    ], 
    # Nivel 5
    [
        (9,8), (7,9), (8,7), (4,8), (6,8), (4,6), (9,0)
    ],
    # Nivel 6
    [
        (9,8), (7,9), (8,6), (1,4), (0,5), (0,7), (0,8)
    ],
    # Nivel 7
    [
        (2, 1), (8, 3), (4, 5), (7, 2), (1, 4),
        (3, 7), (6, 8), (0, 9), (9, 8), (2, 6),
        (5, 3), (7, 5), (8, 6), (1, 8), (3, 2),
        (0, 4), (4, 7), (6, 0), (9, 1), (2, 9),
        (3, 5), (5, 7), (7, 9), (8, 1), (1, 2),
        (4, 2), (6, 4), (7, 0), (3, 9), (5, 0), (7,7)
    ],
    # Nivel 8
    [
        (2, 1), (8, 3), (4, 5), (7, 2), (1, 4),
        (3, 7), (6, 8), (0, 9), (9, 8), (2, 6),
        (5, 3), (7, 5), (1, 8), (3, 2),
        (0, 4), (4, 7), (6, 0), (9, 1), (2, 9),
        (3, 5), (5, 7), (7, 9), (8, 1), (1, 2),
        (4, 2), (6, 4), (7, 0), (3, 9), (5, 0),
        (0, 1), (2, 3), (3, 4), (4, 6),
        (5, 8), (6, 9), (7, 1), (8, 2), (9, 5)
    ]
]

# Set the current level
level = 0

# Set the number of levels
num_levels = len(obstacle_positions)

# Initialize player 1 position
player1_x = 0
player1_y = 0

# Initialize player 2 position
player2_x = 1
player2_y = 0

# Initialize occupied positions
occupied_positions = set([(player1_x, player1_y), (player2_x, player2_y)])
# Asegurarse de que la posición del objetivo no esté ocupada
occupied_positions.discard((hole_x, hole_y))  


# Initialize variable to track players at the goal
players_at_goal = 0

# Inicializacion variables de animación
player1_target_x = player1_x
player1_target_y = player1_y
player1_animating = False

player2_target_x = player2_x
player2_target_y = player2_y
player2_animating = False

animation_speed = 2 #velocidad de animación

background_colors = [
    (255, 0, 0),    # Rojo
    (0, 255, 0),    # Verde
    (0, 0, 255),    # Azul
    (255, 255, 0),  # Amarillo
    (255, 165, 0),  # Naranja
    (255, 0, 255),  # Magenta
    (0, 255, 255),  # Cyan
    (255, 255, 255) # Blanco
]

def change_background():
    return random.choice(background_colors)

def start_movement_animation(player_num, direction_x, direction_y):
    # Reproducir sonido de movimiento
    pygame.mixer.Sound.play(sound_move)

    global player1_x, player1_y, player1_target_x, player1_target_y, player1_animating
    global player2_x, player2_y, player2_target_x, player2_target_y, player2_animating

    target_x, target_y = (player1_x, player1_y) if player_num == 1 else (player2_x, player2_y)

    # Moverse en línea recta hasta encontrar un obstáculo o el borde del tablero
    while True:
        next_x = target_x + direction_x
        next_y = target_y + direction_y

        if next_x < 0 or next_x >= 10 or next_y < 0 or next_y >= 10 or is_obstacle(next_x, next_y, obstacle_positions):
            break  # Detiene el movimiento si encuentra un borde o un obstáculo

        if player_num == 1 and (next_x, next_y) == (player2_x, player2_y):
            break  # Detiene si el jugador 1 se encuentra con el jugador 2
        if player_num == 2 and (next_x, next_y) == (player1_x, player1_y):
            break  # Detiene si el jugador 2 se encuentra con el jugador 1
        
        # Agregar esta línea para cambiar el color de fondo cada vez que se inicia la animación de movimiento
        global current_background_color
        current_background_color = change_background()

        target_x, target_y = next_x, next_y

    if player_num == 1:
        player1_target_x, player1_target_y = target_x, target_y
        player1_animating = True
    elif player_num == 2:
        player2_target_x, player2_target_y = target_x, target_y
        player2_animating = True



def is_obstacle(x, y, obstacles):
    for obstacle in obstacles[level]:
        if obstacle[0] == x and obstacle[1] == y:
            return True
    return False

def is_final(x, y):
    return x == hole_x and y == hole_y

def move_character(character_x, character_y, direction_x, direction_y):
    new_x = character_x + direction_x
    new_y = character_y + direction_y

    while (0 <= new_x < 10) and (0 <= new_y < 10) and (not is_obstacle(new_x, new_y, obstacle_positions)):
        
        if (new_x, new_y) in occupied_positions:
            break  # Detiene el movimiento si la posición está ocupada
        if is_final(new_x, new_y):  # Verifica si es la posición final
            return new_x, new_y  # Devuelve la posición del objetivo, lo que significa que el jugador ha ganado
        character_x = new_x
        character_y = new_y
        new_x += direction_x
        new_y += direction_y
        pygame.mixer.Sound.play(sound_move)

    return character_x, character_y

def show_instructions():
    instructions = [
        "Objetivo: ",
        "Mover los cuadrados a la casilla verde.",
        "Controles Jugador 1: ",
        "W (arriba), S (abajo), A (izquierda), D (derecha)",
        "Controles Jugador 2: ",
        "Flechas del teclado",
        "Para control SNES",
        "X (ARRIBA), A (DERECHA), B (ABAJO), Y (IZQUIERDA)",
        "Evita los obstáculos y llega a la meta.",
        " ",
        "Presiona 'B' O 'L1'para volver al menú."
    ]

    running = True
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                exit()
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_b:  # Tecla para volver al menú
                    pygame.mixer.Sound.play(sound_select)
                    running = False
            if event.type == pygame.JOYBUTTONDOWN:
                if event.button == 4:  # Botón 4: L1
                    pygame.mixer.Sound.play(sound_select)
                    running = False

        screen.fill(BLACK)
        for i, line in enumerate(instructions):
            text = font.render(line, True, WHITE)
            screen.blit(text, [20, 30 + 30 * i])

        pygame.display.flip()
        clock.tick(60)

def show_informacion():
    instructions = [
        "Información:",
        "Desarrollado por: ",
        "Equipo C: ",
        "Aaron Jimenez",
        "David Martinez",
        "Jorge Sandoval",
        "Version: 1.14",
        " ",
        "Presiona 'B' o 'L1' para volver al menú."
    ]

    running = True
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                exit()
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_b:  # Tecla para volver al menú
                    running = False
            if event.type == pygame.JOYBUTTONDOWN:
                if event.button == 4:  # Botón 4: L1
                    pygame.mixer.Sound.play(sound_select)
                    running = False

        screen.fill(BLACK)
        for i, line in enumerate(instructions):
            text = font.render(line, True, WHITE)
            screen.blit(text, [20, 30 + 30 * i])

        pygame.display.flip()
        clock.tick(60)

# Opciones del menú
menu_options = ["Iniciar Juego", "Instrucciones","Informacion", "Salir"]
current_option = 0

# Load a background image
background_image = pygame.image.load('resources/images/menu_background.jpeg')
background_image = pygame.transform.scale(background_image, (window_width, window_height))

# Load a custom font
custom_font = pygame.font.Font('resources/arcadeclassic/ARCADECLASSIC.ttf', 36)

title_font = pygame.font.Font('resources/arcadeclassic/ARCADECLASSIC.ttf', 64)

# In your draw_menu function, blit the background image before drawing the text
def draw_menu():
    screen.blit(background_image, [0, 0])  # Draw the background image

    # Define el título del juego y renderízalo
    title_text = title_font.render('SLIDING SQUARES', True, YELLOW)  # Cambia 'Nombre del Juego' y YOUR_TITLE_COLOR
    # Calcula las coordenadas para centrar el título
    title_x = (window_width - title_text.get_width()) // 2
    title_y = (window_height // 10)  # Ajusta según la posición deseada
    # Dibuja el título en la pantalla
    screen.blit(title_text, (title_x, title_y))

    for i, option in enumerate(menu_options):
        if i == current_option:
            color = GREEN
            # Increase the size for the selected option for highlight effect by loading the font with a larger size
            selected_font = pygame.font.Font('resources/arcadeclassic/ARCADECLASSIC.ttf', 48)
            text = selected_font.render(option, True, color)
        else:
            color = WHITE
            text = custom_font.render(option, True, color)
        screen.blit(text, [window_width / 2 - text.get_width() / 2, 150 + 50 * i])

def handle_menu_events():
    global current_option
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.mixer.Sound.play(sound_select)
            return 'Salir'
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_UP:
                pygame.mixer.Sound.play(sound_select)
                current_option = (current_option - 1) % len(menu_options)
            elif event.key == pygame.K_DOWN:
                pygame.mixer.Sound.play(sound_select)
                current_option = (current_option + 1) % len(menu_options)
            elif event.key == pygame.K_RETURN:
                pygame.mixer.Sound.play(sound_select)
                return menu_options[current_option]
            
        # Manejar eventos del joystick
        if event.type == pygame.JOYBUTTONDOWN:
            if event.button == 0:  # Botón 0: Arriba
                pygame.mixer.Sound.play(sound_select)
                current_option = (current_option - 1) % len(menu_options)
            elif event.button == 2:  # Botón 2: Abajo
                pygame.mixer.Sound.play(sound_select)
                current_option = (current_option + 1) % len(menu_options)
            elif event.button == 5:  # Botón 3: Izquierda
                pygame.mixer.Sound.play(sound_select)
                return menu_options[current_option]
    return None

# Bucle del menú
menu_done = False
pygame.mixer.music.load("resources/sound/music_menu.mp3")  # Carga la música de fondo del menú
pygame.mixer.music.play(-1)  # Reproduce la música de fondo indefinidamente

while not menu_done:
    choice = handle_menu_events()
    if choice == "Iniciar Juego":
        pygame.mixer.music.stop()  # Detiene la música del menú
        pygame.mixer.music.load("resources/sound/game_music.mp3")  # Carga la música del juego
        pygame.mixer.music.play(-1)  # Comienza a reproducir la música del juego
        menu_done = True
    elif choice == "Instrucciones":
        show_instructions()  # Mostrar instrucciones
    elif choice == "Informacion":
        show_informacion()
    elif choice == "Salir":
        pygame.quit()
        exit()

    draw_menu()
    pygame.display.flip()
    clock.tick(60)

def show_end_screen():
    end_screen_running = True
    while end_screen_running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                end_screen_running = False
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_ESCAPE:  # Puedes usar cualquier tecla que prefieras para salir
                    end_screen_running = False

        screen.fill(BLACK)
        congratulations_text = font.render(" ! Felicidades ! Sigue trabajando en equipo.", True, GREEN)
        screen.blit(congratulations_text, [window_width / 2 - congratulations_text.get_width() / 2, window_height / 2 - congratulations_text.get_height() / 2])

        # Dibuja el botón de salir
        exit_button_text = font.render("Salir", True, WHITE)
        exit_button_rect = exit_button_text.get_rect(center=(window_width / 2, window_height / 2 + 50))
        pygame.draw.rect(screen, RED, exit_button_rect)  # Dibuja el fondo del botón
        screen.blit(exit_button_text, exit_button_rect)

        pygame.display.flip()
        clock.tick(60)

    pygame.quit()
    exit()


pygame.mixer.music.play(-1)  # Reproducir música de fondo    
while level < num_levels:
    done = False

    while not done:
        for event in pygame.event.get():
            # Rellenar el fondo con el color actual
            screen.fill(current_background_color)

            if event.type == pygame.QUIT:
                done = True

            # Manejar eventos del joystick
            elif event.type == pygame.JOYBUTTONDOWN:
                if event.joy == 0: # Joystick jugador 1
                    if event.button == 0:  # Botón 0: Arriba
                        start_movement_animation(1, 0, -1)
                    elif event.button == 1:  # Botón 1: Derecha
                        start_movement_animation(1, 1, 0)
                    elif event.button == 2:  # Botón 2: Abajo
                        start_movement_animation(1, 0, 1)
                    elif event.button == 3:  # Botón 3: Izquierda
                        start_movement_animation(1, -1, 0)
                elif event.joy == 1: # Joystick jugador 2
                    if event.button == 0:  # Botón 0: Arriba
                        start_movement_animation(2, 0, -1)
                    elif event.button == 1:  # Botón 1: Derecha
                        start_movement_animation(2, 1, 0)
                    elif event.button == 2:  # Botón 2: Abajo
                        start_movement_animation(2, 0, 1)
                    elif event.button == 3:  # Botón 3: Izquierda
                        start_movement_animation(2, -1, 0)

            # Set the direction of movement when a key is pressed
            elif event.type == pygame.KEYDOWN:
                if not player1_animating and not player2_animating:  # Solo permite el movimiento si no se está animando actualmente
                    if event.key == pygame.K_a:  # Left for player 1
                        start_movement_animation(1,-1,0)
                    elif event.key == pygame.K_d:  # Right for player 1
                        start_movement_animation(1,1,0)
                    elif event.key == pygame.K_w:  # Up for player 1
                        start_movement_animation(1,0,-1)
                    elif event.key == pygame.K_s:  # Down for player 1
                        start_movement_animation(1,0,1)
                    elif event.key == pygame.K_LEFT:  # Left for player 2
                        start_movement_animation(2,-1,0)
                    elif event.key == pygame.K_RIGHT:  # Right for player 2
                        start_movement_animation(2,1,0)
                    elif event.key == pygame.K_UP:  # Up for player 2
                        start_movement_animation(2,0,-1)
                    elif event.key == pygame.K_DOWN:  # Down for player 2
                        start_movement_animation(2,0,1)
        if done:
            break

        # Lógica de la animación jugador 1
        if player1_animating:
            # Si no ha llegado a su posición objetivo, sigue moviéndose
            if round(player1_x) != player1_target_x or round(player1_y) != player1_target_y:
                player1_x += (player1_target_x - player1_x) / animation_speed
                player1_y += (player1_target_y - player1_y) / animation_speed
            else:
                player1_x = player1_target_x
                player1_y = player1_target_y
                player1_animating = False
                player1_animating = False
            
        
        # Lógica de la animación jugador 2
        if player2_animating:
            # Si no ha llegado a su posición objetivo, sigue moviéndose
            if round(player2_x) != player2_target_x or round(player2_y) != player2_target_y:
                player2_x += (player2_target_x - player2_x) / animation_speed
                player2_y += (player2_target_y - player2_y) / animation_speed
            else:
                player2_x = player2_target_x
                player2_y = player2_target_y
                player2_animating = False
                player2_animating = False

        # Draw the grid
        for row in range(10):
            for column in range(10):
                color = BLACK
                if is_final(column, row):
                    color = GREEN
                elif is_obstacle(column, row, obstacle_positions):
                    color = PURPLE
                pygame.draw.rect(screen, color, [(grid_margin + grid_width) * column + grid_margin, (grid_margin + grid_height) * row + grid_margin, grid_width, grid_height])

        # Draw player 1
        pygame.draw.rect(screen, ICE_BLUE, [player1_x * (grid_width + grid_margin) + grid_margin, player1_y * (grid_height + grid_margin) + grid_margin, grid_width, grid_height])

        # Draw player 2
        pygame.draw.rect(screen, RED, [player2_x * (grid_width + grid_margin) + grid_margin, player2_y * (grid_height + grid_margin) + grid_margin, grid_width, grid_height])

        # Check if both players have reached the goal
        if is_final(player1_x, player1_y):
            players_at_goal += 1

        if is_final(player2_x, player2_y):
            players_at_goal += 1

        # Al final de un nivel, antes de incrementar el nivel y reiniciar las posiciones
        if players_at_goal == 2:  # Both players reached the goal
            pygame.mixer.Sound.play(sound_win)
            text = font.render("Both players win!", True, RED)
            screen.blit(text, [window_width / 2 - text.get_width() / 2, window_height / 2 - text.get_height() / 2])

            pygame.display.flip()
            pygame.time.wait(2000)  # Wait for 2 seconds before moving to the next level

            level += 1  # Incrementar el nivel
            players_at_goal = 0  # Reiniciar la variable para el próximo nivel

            # Resetear posiciones de los jugadores cada nuevo nivel
            player1_x = 0
            player1_y = 0
            player2_x = 1
            player2_y = 0

            # Reiniciar posiciones ocupadas para el nuevo nivel
            occupied_positions = set([(player1_x, player1_y), (player2_x, player2_y)])
            occupied_positions.discard((hole_x, hole_y))  # Asegurarse de que la posición del objetivo no esté ocupada

            if level >= num_levels:
                done = True
                show_end_screen()  # Muestra la pantalla de finalización en lugar de salir directamente

        # Update the display
        pygame.display.flip()

        # Set the frames per second
        clock.tick(60)

    if done:
        break

# Quit Pygame properly
pygame.quit()

