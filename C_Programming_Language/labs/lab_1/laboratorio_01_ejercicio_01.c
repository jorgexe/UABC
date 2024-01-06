#include <stdio.h>

double acres = 0;
double num_hectareas = 0;

int main(){
    printf("Ingrese el numero de acres: ");
    scanf("%lf", &acres);

    num_hectareas = (acres * 4047) / 10000;

    printf("El numero en hectareas es: %lf", num_hectareas);
    
    return 0;
}




