#include <stdio.h>

int main(){
    int x = 0, suma = 0;

    do{
        printf("Ingrese numero: ");
        scanf("%d", &x);
        if (x < 0){
            suma = suma + x;
        }

    } while (x < 0);

    printf("La suma es: %d ", suma);
    
    return 0;
}