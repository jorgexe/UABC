// Programa con los métodos de ordenamiento básicos: burbuja, selección e inserción
// Jorge Alejandro Sandoval Romo 1288599
// Diego Villanueva Estrada 1290586

#include <stdio.h>

void bubble(int array[], int n);
void selection(int array[], int n);
void insertion(int array[], int n);

int main() {
    int array_a[] = {7, 12, 9 , 14, 11, 8,3};
    int array_b[] = {7, 12, 9 , 14, 11, 8,3};
    int array_c[] = {7, 12, 9 , 14, 11, 8,3};
    int size_a = sizeof(array_a)/sizeof(array_a[0]);
    int size_b = sizeof(array_b)/sizeof(array_b[0]);
    int size_c = sizeof(array_c)/sizeof(array_c[0]);

    int i;

    printf("Arreglo original: ");
    for (i = 0; i < size_a; i++) {
        printf("%d ", array_a[i]);
    }
    printf("\n");

    bubble(array_a, size_a);
    printf("Arreglo ordenado con burbuja: ");
    for (i = 0; i < size_a; i++) {
        printf("%d ", array_a[i]);
    }
    printf("\n");

    selection(array_b, size_b);
    printf("Arreglo ordenado con selección: ");
    for (i = 0; i < size_b; i++) {
        printf("%d ", array_b[i]);
    }
    printf("\n");

    insertion(array_c, size_c);
    printf("Arreglo ordenado con inserción: ");
    for (i = 0; i < size_c; i++) {
        printf("%d ", array_c[i]);
    }
    printf("\n");

    return 0;
}

void bubble(int array[], int n) {
    int i, j, aux;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - 1; j++) {
            if (array[j] > array[j + 1]) {
                aux = array[j];
                array[j] = array[j + 1];
                array[j + 1] = aux;
            }
        }
    }
}

void selection(int array[], int n) {
    int i, j, min, aux;
    for (i = 0; i < n - 1; i++) {
        min = i;
        for (j = i + 1; j < n; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        aux = array[i];
        array[i] = array[min];
        array[min] = aux;
    }
}

void insertion(int array[], int n) {
    int i, j, aux;
    for (i = 1; i < n; i++) {
        aux = array[i];
        j = i - 1;
        while (j >= 0 && array[j] > aux) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = aux;
    }
}

