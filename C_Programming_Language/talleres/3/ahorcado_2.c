#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void seleccion_palabra(char *s);
void gen_var_progreso(int len,char *s);
int revisar_uso(char ingreso_letra, char *progreso, char *palabra);
int evaluar_letra_correcta(char letra_ingresada, char *palabra, char *progreso);

int main(){
    char palabra_seleccionada[50], progreso[100] = { 0 }, letra_ingresada[1];
    int vidas = 3, aciertos_totales = 0, aciertos_temporales = 0;

    printf("####### A H O R C A D O v1.15.3 #######\n");

    seleccion_palabra(palabra_seleccionada);
    gen_var_progreso(strlen(palabra_seleccionada), progreso);
    //printf("%s\n",palabra_seleccionada);
    //printf("%s",progreso);

    while(vidas > 0){
        fflush(stdin);
        printf("##########################################\n");
        printf("Vidas restantes: %d \n", vidas);
        printf("Aciertos: %d \n\n", aciertos_totales);
        printf("%s\n\n", progreso);

        printf("Ingrese una letra: ");
        scanf("%c", &letra_ingresada);

        while(1){
            if (revisar_uso(letra_ingresada[0], progreso, palabra_seleccionada) == 1){
                printf("Ya haz usado esta letra, intenta otra: \n");
                break;
            }

            aciertos_temporales = evaluar_letra_correcta(letra_ingresada[0], palabra_seleccionada, progreso);

            aciertos_totales+=aciertos_temporales;

            if(aciertos_temporales == 0){
                vidas--;
            }

            aciertos_temporales = 0;

            break;
        }

        if (aciertos_totales == strlen(palabra_seleccionada)){
            printf("VICTORIA");
            return 0;
        }

    }

    printf("YOU DIED");

    return 0;
}

void seleccion_palabra(char *s){
    char lista_palabras[][20] = {"UABC", "CIMARRON", "UNIVERSIDAD", "SOFTWARE", "INGENIERIA","MURCIELAGO"};
    srand(time(NULL));
    int r=0+rand()%5;
    strcpy(s, lista_palabras[r]);
}

void gen_var_progreso(int len, char *s){
    char prog[100] = { 0 }, guion_bajo[1] = "_", espacio[1] = " ";
    for(int i = 0; i < 2 * len; i+=2){
        prog[i] = guion_bajo[0];
        prog[i + 1] = espacio[0];
    }
    strcpy(s, prog);
}

int revisar_uso(char ingreso_letra, char *progreso, char *palabra){
    for(int i = 0; i < strlen(palabra); i++){
        if(ingreso_letra == progreso[i]){
            return 1;
        }
    }

    return 0;
}

int evaluar_letra_correcta(char letra_ingresada, char *palabra, char *progreso){

    int aciertos_temporales = 0;

    for (int i = 0; i < strlen(palabra); i++){
        if(letra_ingresada == palabra[i]){
            aciertos_temporales++;

            progreso[2*i] = letra_ingresada;
        }
    }

    return aciertos_temporales;
}