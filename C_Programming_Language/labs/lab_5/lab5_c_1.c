#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void pares_en_arreglo(int arr[], int arrpares[], int size);
void impares_en_arreglo(int *arr, int *arrimpares, int size);
int num_pares(int arr[]);
int num_impares(int arr[]);

int main(){
    srand(time(NULL));

    int arr[100];

    printf("Arreglo original: \n\n");

    for (int i = 0; i < 100; i++){
        arr[i] = 1+rand()%100;
        printf("%d, ",arr[i]);
    }
    printf("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

    int pares_en_arr = num_pares(arr);
    int impares_en_arr = num_impares(arr);

    printf("Numero de pares: %d\n", pares_en_arr);
    printf("Numero de impares: %d\n", impares_en_arr);

    int pares[pares_en_arr], impares[impares_en_arr];

    pares_en_arreglo(arr, pares, 100);
    impares_en_arreglo(arr, impares, 100);
    

    printf("\nArreglo de pares: \n");
    for (int i = 0; i < pares_en_arr; i++){
        printf("%d, ",pares[i]);
    }
    printf("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    printf("Arreglo de impares: \n");
    for (int i = 0; i < impares_en_arr; i++){
        printf("%d, ",impares[i]);
    }

    return 0;
}

int num_pares(int arr[]){
    int x = 0;

    for (int i = 0; i < 100; i++){
        if(arr[i]%2 == 0){
            x++;
        }
    }

    return x;
}

int num_impares(int arr[]){
    int x = 0;

    for (int i = 0; i < 100; i++){
        if(arr[i]%2 != 0){
            x++;
        }
    }

    return x;
}

void pares_en_arreglo(int arr[], int arrpares[], int size){
    int x = 0;
    for (int i = 0; i < size; i++){
        if( arr[i]%2 == 0){
            arrpares[x] = arr[i];
            x++;
        }
    }
}

void impares_en_arreglo(int *arr, int *arrimpares, int size){
    int x = 0;
    for (int i = 0; i < size; i++){
        if( arr[i]%2 != 0){
            arrimpares[x] = arr[i];
            x++;
        }
    }
}