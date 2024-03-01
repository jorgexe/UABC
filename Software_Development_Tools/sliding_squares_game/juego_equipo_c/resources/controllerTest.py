import pygame

pygame.init()
pygame.joystick.init()

# Imprimir la cantidad de joysticks conectados
print(f'Joysticks conectados: {pygame.joystick.get_count()}')

# Iterar sobre cada joystick y mostrar su nombre
for i in range(pygame.joystick.get_count()):
    joystick = pygame.joystick.Joystick(i)
    joystick.init()
    print(f'Joystick {i}: {joystick.get_name()}')

# Mantener el programa corriendo para probar inputs
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.JOYBUTTONDOWN:
            print(f'Botón presionado en joystick {event.joy}: {event.button}')

pygame.quit()
