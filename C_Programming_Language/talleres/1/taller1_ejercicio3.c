/******************************************************************************

Usando solamente printf, scanf, operadores aritméticos y la
librería de math.h, haz un programa que le pida al usuario que
teclee el valor de x, el valor de C es igual a 2 y el valor de S es
igual a 0.5 y hagas la siguiente operación mostrando en la consola
el resutlado.

*******************************************************************************/
#include <stdio.h>
#include <math.h>

int main()
{
    float x, c = 2, s = 0.5,g, euler = 2.718281828459045235360, exponente;
    
    printf("Ingrese un valor x: ");
    scanf("%f", &x);
    
    exponente = -(pow((x-c),2) / (pow((2*s),2)));
    
    g = pow(euler,exponente);
    
    printf("G es igual a: %f", g);
    
    return 0;
}