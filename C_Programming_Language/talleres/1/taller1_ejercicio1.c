/******************************************************************************

Usando solamente printf, scanf, y operadores aritméticos, haz
un programa donde le pidas al usuario que teclee su edad y que el
programa te imprima en la consola, cuantos meses a vivido,
cuantas semandas a vivido, cuantos días a vivido , cuantas horas a
vivido y cuantos minutos a vivido..

*******************************************************************************/
#include <stdio.h>

int main()
{
    int edad, meses, semanas, dias, horas, minutos;
    
    printf("Ingrese su edad: ");
    scanf("%d", &edad);
    
    meses = edad * 12;
    semanas = edad * 52;
    dias = edad * 365;
    horas = dias * 24;
    minutos = horas * 60;
    
    printf("Usted ha vivido: \n");
    printf("Años: %d \n", edad);
    printf("Meses: %d \n", meses);
    printf("Semanas: %d \n", semanas);
    printf("Dias: %d \n", dias);
    printf("Horas: %d \n", horas);
    printf("Minutos: %d \n", minutos);

    return 0;
}
