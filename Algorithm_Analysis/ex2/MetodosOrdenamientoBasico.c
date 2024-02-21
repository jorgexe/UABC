// Programa con los métodos de ordenamiento básicos: burbuja, selección e inserción
// Jorge Alejandro Sandoval Romo 1288599
// Diego Villanueva Estrada 1290586

#include <stdio.h>

void burbuja(int arreglo[], int n);
void seleccion(int arreglo[], int n);
void insercion(int arreglo[], int n);

int main() {
    int arreglo[] = {7, 12, 9 , 14, 11, 8, 3};
    int n = 7;
    int i;

    printf("Arreglo original: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arreglo[i]);
    }
    printf("\n");

    burbuja(arreglo, n);
    printf("Arreglo ordenado con burbuja: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arreglo[i]);
    }
    printf("\n");

    int arreglo2[] = {7, 12, 9 , 14, 11, 8, 3};
    seleccion(arreglo2, n);
    printf("Arreglo ordenado con selección: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arreglo2[i]);
    }
    printf("\n");

    int arreglo3[] = {7, 12, 9 , 14, 11, 8, 3};
    insercion(arreglo3, n);
    printf("Arreglo ordenado con inserción: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arreglo3[i]);
    }
    printf("\n");

    return 0;
}

void burbuja(int arreglo[], int n) {
    int i, j, aux;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - 1; j++) {
            if (arreglo[j] > arreglo[j + 1]) {
                aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
            }
        }
    }
}

void seleccion(int arreglo[], int n) {
    int i, j, min, aux;
    for (i = 0; i < n - 1; i++) {
        min = i;
        for (j = i + 1; j < n; j++) {
            if (arreglo[j] < arreglo[min]) {
                min = j;
            }
        }
        aux = arreglo[i];
        arreglo[i] = arreglo[min];
        arreglo[min] = aux;
    }
}

void insercion(int arreglo[], int n) {
    int i, j, aux;
    for (i = 1; i < n; i++) {
        aux = arreglo[i];
        j = i - 1;
        while (j >= 0 && arreglo[j] > aux) {
            arreglo[j + 1] = arreglo[j];
            j--;
        }
        arreglo[j + 1] = aux;
    }
}

