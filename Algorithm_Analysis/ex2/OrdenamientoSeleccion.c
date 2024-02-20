// Algoritmo de ordenamiento por selección

#include <stdio.h>

int main() {
    int arreglo[] = {7, 12, 9 , 14, 11, 8, 3};
    int n = 7;
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

    for (i = 0; i < n; i++) {
        printf("%d ", arreglo[i]);
    }
    printf("\n");

    return 0;
}