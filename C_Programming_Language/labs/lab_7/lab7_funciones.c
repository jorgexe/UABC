#include <stdio.h>
#include <string.h>
#include "lab7_funciones.h"
#include "lab7.c"

Texto* crear_texto(int* id, char* oracion, char* quien, char* opcion1, char*opcion2){
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

    printf("----------\n");
    printf("| %s |\n", texto->quien);
    printf("-------------------------------------------------------------------\n");
    for(int i = 0; i < largo_texto; i++){
        printf("%c",texto->oracion[i]);
        if(i%68 == 0){
            printf("\n");
        }
    }
    printf("-------------------------------------------------------------------\n");
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
    else if(eleccion == 2){
        return texto->siguiente2;
    }
}