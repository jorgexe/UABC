#include <stdio.h>

int main(){
    int ano = 0;

    printf("Ingrese un año: ");
    scanf("%d", &ano);

    if((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)){
        printf("El año es bisiesto. ");
    }
    else{
        printf("El año no es bisiesto. ");
    }

    return 0;
}