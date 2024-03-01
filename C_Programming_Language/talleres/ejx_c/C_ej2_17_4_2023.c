#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void inicializar_matriz(int *matriz[][], int filas, int columnas);
void imprimir_arreglo(int *matriz[][], int filas, int columnas);

int main(){

    int **matriz;

    inicializar_matriz(matriz,5,5);
    

    return 0;
}

void inicializar_matriz(int *matriz[][], int filas, int columnas){
    srand(time(NULL));

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            int r=rand()%100;
            *matriz[i][j] = r;
        }
    }
}

void imprimir_arreglo(int *matriz[][], int filas, int columnas){
    for (int i = 0; i < filas; i++){
        printf("[ ");
        for (int j = 0; j < columnas; j++){
            printf("%d",matriz[i][j]);
        }
        printf(" ]\n");
    }
}