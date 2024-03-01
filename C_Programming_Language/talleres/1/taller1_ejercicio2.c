/******************************************************************************

Usando solamente printf, scanf, operadores aritméticos y la
librería de math.h, haz un programa donde pida que el usuario
teclee , los 3 lados de un triángulo y el programa calcule el área del
triángulo usando la formula de Heran, mostrando en la consola el
resultado.

*******************************************************************************/
#include <stdio.h>
#include <math.h>

int main()
{
    float a, b, c, s, area;
    
    printf("Ingrese el lado A del triangulo: ");
    scanf("%f", &a);
    printf("Ingrese el lado B del triangulo: ");
    scanf("%f", &b);
    printf("Ingrese el lado C del triangulo: ");
    scanf("%f", &c);
    
    s = (a + b + c)/2;
    area = sqrt(s*(s-a)*(s-b)*(s-c));
    
    printf("El area del triangulo es: %f", area);
    

    return 0;
}