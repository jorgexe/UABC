#include <stdio.h>

int main(){

    int num_calif = 0, contador = 1;
    double promedio = 0, calificacion = 0, suma_calif = 0;

    printf("Ingrese el numero de calificaciones a ingresar: ");
    scanf("%d", &num_calif);

    while(contador <= num_calif){
        
        printf("Ingrese la calificacion %d: ", contador);
        scanf("%lf", &calificacion);

        contador++;

        if(calificacion < 0 || calificacion > 10){
            printf("Error. Ingrese una calificacion valida. \n");
            contador--;
        }
        else{
            suma_calif = suma_calif + calificacion;
        }

    }

    promedio = suma_calif / num_calif;

    if( promedio < 6){
        printf("El promedio es: %lf, alumno REPROBADO. ", promedio);
    }
    else{
        printf("El promedio es: %lf, alumno APROBADO. ", promedio);
    }
    
    return 0;
    
}