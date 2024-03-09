/*
Actividad: Escribe un programa que capture los gastos de una persona y que calcule cuánto ha gastado en total. 
El programa debe tener las siguientes opciones: 

Capturar gasto (10pts) 
Mostrar gasto en alimentos (30pts, por la función que implementa el método de selección) 
Mostrar gasto en diversión (30pts, por la función que implementa el método de burbuja) 
Mostrar gasto en pagos fijos (30pts, por la función que implementa el método inserción) 


Los datos que se deben capturar de cada gasto son: 

Categoría (alimentos, diversión, pagos fijos). 
Concepto
Costo


Para la opción "Mostrar gasto en alimentos", el programa debe mostrar los gastos en alimentos ordenados 
por conceptos en orden ascendente, y el ordenamiento se debe realizar por selección. 
Al final debe mostrar el total de gasto en la categoría "alimentos".


Para la opción "Mostrar gasto en diversión", el programa debe mostrar los gastos en diversión ordenados 
por concepto en orden descendente, y el ordenamiento se debe realizar por burbuja. 
Al final debe mostrar el total de gasto en la categoría "diversión".


Para la opción "Mostrar gasto en pagos fijos", el programa debe mostrar los gastos en pagos fijos ordenados 
por concepto en orden ascendente, y el ordenamiento se debe realizar por el método de la inserción. 
Al final debe mostrar el total de gasto en la categoría "pagos fijos".



Nota: 

Sólo se pueden utilizar las librerías stdlib.h, stdio.h, y string.h (para comparación).
Cada algoritmo de ordenamiento debe de ser una función que reciba como parámetro los datos a ordenar 
y que imprima los datos ordenados.

*/
#include <stdio.h>
#include <string.h>

// Estructura para almacenar la información de un gasto
struct Gasto {
    char categoria[20];
    char concepto[50];
    float costo;
};

void capturarGasto(struct Gasto *gasto);
void ordenarPorSeleccion(struct Gasto gastos[], int n);
void ordenarPorBurbuja(struct Gasto gastos[], int n);
void ordenarPorInsercion(struct Gasto gastos[], int n);
void mostrarGastosYTotal(struct Gasto gastos[], int n, const char *categoria, void (*ordenar)(struct Gasto[], int));

int main() {
    // Número máximo de gastos
    const int MAX_GASTOS = 100;

    // Arreglo para almacenar los gastos
    struct Gasto gastos[MAX_GASTOS];

    // Número actual de gastos
    int numGastos = 0;

    // Menú principal
    int opcion;
    do {
        printf("\nMenú:\n");
        printf("1. Capturar gasto\n");
        printf("2. Mostrar gasto en alimentos\n");
        printf("3. Mostrar gasto en diversión\n");
        printf("4. Mostrar gasto en pagos fijos\n");
        printf("0. Salir\n");
        printf("Ingrese su opción: ");
        scanf("%d", &opcion);

        switch (opcion) {
            case 1:
                if (numGastos < MAX_GASTOS) {
                    capturarGasto(&gastos[numGastos]);
                    numGastos++;
                } else {
                    printf("¡Ya se han capturado el máximo de gastos!\n");
                }
                break;
            case 2:
                mostrarGastosYTotal(gastos, numGastos, "alimentos", ordenarPorSeleccion);
                break;
            case 3:
                mostrarGastosYTotal(gastos, numGastos, "diversión", ordenarPorBurbuja);
                break;
            case 4:
                mostrarGastosYTotal(gastos, numGastos, "pagos fijos", ordenarPorInsercion);
                break;
            case 0:
                printf("Saliendo del programa. ¡Hasta luego!\n");
                break;
            default:
                printf("Opción no válida. Intente nuevamente.\n");
        }

    } while (opcion != 0);

    return 0;
}

// Función para capturar un gasto
void capturarGasto(struct Gasto *gasto) {
    printf("Ingrese la categoría (alimentos, diversión, pagos fijos): ");
    scanf("%s", gasto->categoria);
    printf("Ingrese el concepto: ");
    scanf("%s", gasto->concepto);
    printf("Ingrese el costo: ");
    scanf("%f", &(gasto->costo));
}

// Función de ordenamiento por selección
void ordenarPorSeleccion(struct Gasto gastos[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (strcmp(gastos[j].concepto, gastos[minIndex].concepto) < 0) {
                minIndex = j;
            }
        }
        struct Gasto temp = gastos[i];
        gastos[i] = gastos[minIndex];
        gastos[minIndex] = temp;
    }
}

// Función de ordenamiento por burbuja
void ordenarPorBurbuja(struct Gasto gastos[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (strcmp(gastos[j].concepto, gastos[j + 1].concepto) < 0) {
                struct Gasto temp = gastos[j];
                gastos[j] = gastos[j + 1];
                gastos[j + 1] = temp;
            }
        }
    }
}

// Función de ordenamiento por inserción
void ordenarPorInsercion(struct Gasto gastos[], int n) {
    for (int i = 1; i < n; i++) {
        struct Gasto key = gastos[i];
        int j = i - 1;
        while (j >= 0 && strcmp(gastos[j].concepto, key.concepto) > 0) {
            gastos[j + 1] = gastos[j];
            j = j - 1;
        }
        gastos[j + 1] = key;
    }
}

// Función para mostrar gastos y calcular total por categoría
void mostrarGastosYTotal(struct Gasto gastos[], int n, const char *categoria, void (*ordenar)(struct Gasto[], int)) {
    printf("\nGastos en %s:\n", categoria);
    
    // Ordenar los gastos
    ordenar(gastos, n);

    // Mostrar gastos ordenados
    float total = 0.0;
    for (int i = 0; i < n; i++) {
        if (strcmp(gastos[i].categoria, categoria) == 0) {
            printf("%s - %.2f\n", gastos[i].concepto, gastos[i].costo);
            total += gastos[i].costo;
        }
    }
    printf("Total en %s: %.2f\n", categoria, total);
}

