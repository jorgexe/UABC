#include <stdio.h>

void imprimirInterseccion(int arr1[], int size1, int arr2[], int size2);
void imprimirDiferencia(int arr1[], int size1, int arr2[], int size2);
void imprimirComplemento(int arr1[], int size1, int arr2[], int size2);

int main() {
  int arr1[] = {1, 2, 3, 4, 5};
  int size1 = sizeof(arr1) / sizeof(arr1[0]);

  int arr2[] = {3, 4, 5, 6, 7};
  int size2 = sizeof(arr2) / sizeof(arr2[0]);

  printf("\nProblema 1: Intersección. \n");
  imprimirInterseccion(arr1, size1, arr2, size2);

  printf("\nProblema 2: Diferencia. \n");
  imprimirDiferencia(arr1, size1, arr2, size2);

  printf("\nProblema 3: Complemento. \n");
  imprimirComplemento(arr1, size1, arr2, size2);

  return 0;
}

/*
Problema 1: Intersección de arreglos
• Escribe una función que reciba como parámetro 2 arreglos, y que imprima sólo
aquellos valores que se encuentren en ambos arreglos.

La complejidad de tiempo es T(n^2) debido a los bucles anidados, donde n es el
tamaño del arreglo más grande.

Complejidad de tiempo: T(n^2) debido a los bucles anidados, donde n es el tamaño
del arreglo más grande. Función de complejidad cuadrática. 4n^2 + 4n + 2 =
T(n^2)
*/

void imprimirInterseccion(int arr1[], int size1, int arr2[], int size2) {
  for (int i = 0; i < size1; i++) {   // (1 + (n + 1) + n) = 2n + 2
    for (int j = 0; j < size2; j++) { // (1 + (n + 1) + n) = 2n + 2
      if (arr1[i] == arr2[j]) {       // 1
        printf("%d ", arr1[i]);       // 1
        break;
      }
    }
  }
}

/*
Problema 2: Diferencia de arreglos
• Escribe una función que reciba como parámetro 2 arreglos, y que imprima sólo
aquellos elementos que están en el primer arreglo, pero que no están en el
segundo arreglo.

La complejidad de tiempo es T(n^2) debido a los bucles anidados, donde n es el
tamaño del arreglo más grande.

Complejidad de tiempo: T(n^2) debido a los bucles anidados, donde n es el tamaño
del arreglo más grande. Función de complejidad cuadrática. 4n^2 + 4n + 2
*/

void imprimirDiferencia(int arr1[], int size1, int arr2[], int size2) {
  for (int i = 0; i < size1; i++) { // (1 + (n + 1) + n) = 2n + 2

    int encontrado = 0; // 1

    for (int j = 0; j < size2; j++) { // (1 + (n + 1) + n) = 2n + 2
      if (arr1[i] == arr2[j]) {       // 1
        encontrado = 1;               // 1
        break;
      }
    }

    if (!encontrado) { // 1
      printf("%d ", arr1[i]);
    }
  }
}

/*
Problema 3: Arreglos
• Escribe una función que reciba como parámetro 2 arreglos, y que imprima todos
los elementos que no estén en el primer arreglo.

La complejidad de tiempo es T(n^2) debido a los bucles anidados, donde n es el
tamaño del arreglo más grande.

Complejidad de tiempo: T(n^2) debido a los bucles anidados, donde n es el tamaño
del arreglo más grande. Función de complejidad cuadrática. 4n^2 + 4n + 2

*/

void imprimirComplemento(int arr1[], int size1, int arr2[], int size2) {
  for (int i = 0; i < size2; i++) {   // (1 + (n + 1) + n) = 2n + 2
    int encontrado = 0;               // 1
    for (int j = 0; j < size1; j++) { // (1 + (n + 1) + n) = 2n + 2
      if (arr2[i] == arr1[j]) {       // 1
        encontrado = 1;               // 1
        break;
      }
    }
    if (!encontrado) { // 1
      printf("%d ", arr2[i]);
    }
  }
}
