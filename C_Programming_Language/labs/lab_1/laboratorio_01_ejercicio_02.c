#include <stdio.h>

double velocidad_km = 0;
double distancia_m = 0;
double tiempo_min = 0;
double tiempo_s = 0;
double tiempo_cs = 0;
double distancia = 0;

double tiempo_total_segundos = 0;
double velocidad_ms = 0;

int main(){
    printf("Distancia recorrida en metros: ");
    scanf("%lf", &distancia);

    printf("Minutos: ");
    scanf("%lf", &tiempo_min);

    printf("Segundos: ");
    scanf("%lf", &tiempo_s);

    printf("Centesimas de segundo: ");
    scanf("%lf", &tiempo_cs);

    tiempo_total_segundos = tiempo_min * 60 + tiempo_s + tiempo_cs / 100;

    velocidad_ms = distancia / tiempo_total_segundos;

    velocidad_km = velocidad_ms * 3600 / 1000;

    printf("La velocidad en km/h es: %lf", velocidad_km);

    return 0;
}
