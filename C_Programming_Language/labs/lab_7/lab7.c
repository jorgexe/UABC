#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Texto {
    int id;
    char oracion[256];
    char quien[20];
    char opcion1[20];
    char opcion2[20];
    struct Texto* siguiente1;
    struct Texto* siguiente2;
} Texto;

Texto* crear_texto(int id, char* oracion, char* quien, char* opcion1, char*opcion2);
void ligar_textos(Texto* texto_base, Texto* opcion1, Texto* opcion2);
void imprimir_texto(Texto* texto);
Texto* escoger_opcion(Texto* texto);

int main(){

    //Crear los mensajes que se van a usar con la funcion crear_texto(id, texto, emisor)
    Texto *texto1 = crear_texto(1,"Whew, Hey hay otra nueva persona aquí", "???","          ","[2] Continuar");
    Texto *texto2 = crear_texto(2,"Huuh? Entonces todos ustedes  son…?", "Makoto","          ","[2]  Continuar");
    Texto *texto3 = crear_texto(3,"See, todos somos nuevos aquí, se supone que hoy sería nuestro primer día de clases", "???","          ","[2]  Continuar");
    Texto *texto4 = crear_texto(4,"Entonces … Contándolo a el eso nos hace 15, parece ser que podría ser el último , pero me pregunto si serán todos …", "???","          ","[2]  Continuar");
    Texto *texto5 = crear_texto(5,"Hola que tal, Mi nombre es Makoto Naegi, Disculpen por llegar tarde, Algunas cosas sucedieron y derrepente me quede dormido", "Makoto","[1]  Ishimaru","[2]  Toko");
    Texto *texto6 = crear_texto(6,"Yo soy Kiyotaka Ishimaru, yo creo en la simplicidad!, trabajemos juntos para lograr obtener nuestra educación", "Ishimaru","          ","[2]  Continuar");
    Texto *texto7 = crear_texto(7,"Bueno de cualquier forma, me puedes llamar Taka, tu nombre es Makoto verdad?", "Ishimaru","[1]  Toko","[2]  Sayaka");
    Texto *texto8 = crear_texto(8,"(.. Ishimaru es algo molesto..) No es como que se vayan acordar de mi nombre pero …", "Toko","          ","[2]  Continuar");
    Texto *texto9 = crear_texto(9,"Me llamo T-Toko …  Toko Fukawa … …., No es agradable que se me queden viendo … … Dejen de mirarme como si fuera un animal de exhibición …", "Toko","[1]  Ishimaru", "[2]  Sayaka");
    Texto *texto10 = crear_texto(10,"Hola a todos, me llamó  Sayaka Maizono. Estoy emocionada por conocer a todos … ", "Sayaka","          ","[2]  Continuar");
    Texto *texto11 = crear_texto(11,"Yo se que parezco una muñeca pero no lo soy, estoy viva, … … Peeero soy psíquica ….  … Es broma, pero tengo muy buena intuición.", "Sayaka","     ","     ");

    //Ligar textos con la funcion ligar_texto()
    ligar_textos(texto1, NULL, texto2);
    ligar_textos(texto2, NULL, texto3);
    ligar_textos(texto3, NULL, texto4);
    ligar_textos(texto4, NULL, texto5);
    ligar_textos(texto5, texto6, texto8);
    ligar_textos(texto6, NULL, texto7);
    ligar_textos(texto7, texto8, texto10);
    ligar_textos(texto8, NULL, texto9);
    ligar_textos(texto9, texto6, texto10);
    ligar_textos(texto10, NULL, texto11);
    ligar_textos(texto11, NULL, NULL);

    //Imprimir el primer texto para iniciar el juego y escoger la primera opcion del juego
    imprimir_texto(texto1);
    Texto* texto_seleccionado = escoger_opcion(texto1);
    if(texto_seleccionado == NULL){
        printf("\n\n THE END. ");
        return 0;
    }

    //ciclo del programa principal
    while(1){
        imprimir_texto(texto_seleccionado);

        Texto* temp_texto = escoger_opcion(texto_seleccionado);
        texto_seleccionado = temp_texto;
        if(texto_seleccionado == NULL){
            printf("\n\n*** THE END *** ");
            break;
        }
    }

    free(texto1);
    free(texto2);
    free(texto3);
    free(texto4);
    free(texto5);
    free(texto6);
    free(texto7);
    free(texto8);
    free(texto9);
    free(texto10);
    free(texto11);
    free(texto_seleccionado);
    return 0;
}

Texto* crear_texto(int id, char* oracion, char* quien, char* opcion1, char*opcion2){
    Texto *texto1 =  (Texto*)malloc(sizeof(Texto));

    strcpy(texto1->oracion,oracion);
    strcpy(texto1->quien,quien);
    strcpy(texto1->opcion1,opcion1);
    strcpy(texto1->opcion2,opcion2);

    texto1->id = id;

    texto1->siguiente1 = NULL;
    texto1->siguiente2 = NULL;

    return texto1;
}

void ligar_textos(Texto* texto_base, Texto* opcion1, Texto* opcion2){
    texto_base->siguiente1 = opcion1;
    texto_base->siguiente2 = opcion2;
}

void imprimir_texto(Texto* texto){

    int largo_texto = strlen(texto->oracion);
    int contador_renglones = 1, renglones_max = 4;

    printf("----------\n");
    printf("| %s |\n", texto->quien);
    printf("-------------------------------------------------------------------\n");
    for(int i = 0; i < largo_texto; i++){
        printf("%c",texto->oracion[i]);
        if((i+1)%65 == 0){
            contador_renglones++;
            if(contador_renglones > renglones_max){
                break;
            }
            printf("\n");
        }
    }
    printf("\n-------------------------------------------------------------------\n");
    printf("| %s | %s |\n",texto->opcion1,texto->opcion2);
    printf("-------------------------------------------------------------------\n");
    printf("...>");
}

Texto* escoger_opcion(Texto* texto){
    int eleccion;
    scanf("%d", &eleccion);

    if(eleccion == 1){
        return texto->siguiente1;
    }
    else {
        return texto->siguiente2;
    }
}