#include <stdio.h>
#include <math.h>

int main(){

    double a, b, c, discriminante, resultado_1, resultado_2, caso_imaginario;

    printf("Ingrese el valor A: ");
    scanf("%lf", &a);
    printf("Ingrese el valor B: ");
    scanf("%lf", &b);
    printf("Ingrese el valor C: ");
    scanf("%lf", &c);

    discriminante = pow(b,2) - 4 * a * c;

    if(discriminante > 0){

        resultado_1 = (-b + sqrt(discriminante)) / (2 * a);

        resultado_2 = (-b - sqrt(discriminante)) / (2 * a);

        printf("Resultado 1: %lf \n", resultado_1);

        printf("Resultado 2: %lf", resultado_2);
    }
    else if (discriminante == 0){

        resultado_1 = (-b) / (2 * a);

        printf("Resultado 1: %lf \n", resultado_1);
    }
    else{
        resultado_1 = (-b ) / (2 * a);

        caso_imaginario = sqrt(-discriminante) / (2 * a);

        printf("Resultado 1: %lf", resultado_1);
        printf(" + i %lf\n", caso_imaginario);
        printf("Resultado 2: %lf", resultado_1);
        printf(" - i %lf\n", caso_imaginario);
    }

    return 0;
    
}