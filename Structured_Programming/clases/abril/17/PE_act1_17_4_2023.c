#include <stdio.h>
#include <string.h>

struct estructura_canciones{
    char cancion[20];
};

int main(){
    struct estructura_canciones canciones[20];
    int num_canciones = 5;
    char seleccion[20];
    int canciones_ingresadas = 0;

    while(1){
        fflush(stdin);
        printf("*** Menu *** \ncancion (Agregar una cacnion)\n");
        printf("titulo (Mostrar el titulo de todas las canciones)\nfrase (Ingrese la palabra de algun titulo)\n");
        printf("salir (Cerrar el programa)\n\n");

        printf("Ingrese una instruccion: ");
        scanf("%s", seleccion);

        if (strcmp(seleccion,"cancion") == 0){

            if(canciones_ingresadas == 5){
                printf("!!!!! Ya no puedes agregar mas canciones. !!!!! \n");
            }
            else {
                printf("Ingresa el titulo de la cancion %d:", canciones_ingresadas + 1);
                scanf("%s",canciones[canciones_ingresadas].cancion);
                canciones_ingresadas++;
            }
        }
        else if(strcmp(seleccion,"titulo") == 0){
            printf("* * * * * * * * * * \n");
            for(int i = 0; i < canciones_ingresadas;i++){
                printf("%s\n", canciones[i].cancion);
            }
            printf("* * * * * * * * * * \n");
        }
        else if(strcmp(seleccion,"salir") == 0){
            break;
        }
        else{
            for(int i = 0; i < num_canciones; i++){
                if(strcmp(seleccion,canciones[i].cancion) == 0){
                    printf("La cancion que buscas es: %s \n",canciones[i].cancion);
                }
            }
        }
        
    }

    printf("Gracias por su preferencia :)");
}