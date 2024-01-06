#include <stdio.h>
#include <string.h>

int main(){

    double num_1, num_2, resultado;
    char texto[]= "";

    printf("Ingrese el tipo de operacion (SUMA, RESTA O MULTIPLICACION): ");
    scanf("%s", &texto);

    if(strcmp(texto,"SUMA") == 0){
        printf("Ingrese el primer valor: ");
        scanf("%lf", &num_1);
        printf("Ingrese el segundo valor: ");
        scanf("%lf", &num_2);

        resultado = num_1 + num_2;
        printf("El resultado de la SUMA es: %lf", resultado);
    }
    else if (strcmp(texto,"RESTA") == 0){
        printf("Ingrese el primer valor: ");
        scanf("%lf", &num_1);
        printf("Ingrese el segundo valor: ");
        scanf("%lf", &num_2);

        resultado = num_1 - num_2;
        printf("El resultado de la RESTA es: %lf", resultado);
    }
    else if (strcmp(texto,"MULTIPLICACION") == 0){
        printf("Ingrese el primer valor: ");
        scanf("%lf", &num_1);
        printf("Ingrese el segundo valor: ");
        scanf("%lf", &num_2);

        resultado = num_1 * num_2;
        printf("El resultado de la MULTIPLICACION es: %lf", resultado);
    }
    else{
        printf("Error, ingrese una operacion valida. ");
    }

}