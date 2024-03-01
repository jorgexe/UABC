#include <stdio.h>

int main(){
    double kwh_bimestre = 0, total_pagar = 0;

    printf("Ingrese la cantidad de kWh consumidos en el bimestre: ");
    scanf("%lf", &kwh_bimestre);

    if(kwh_bimestre < 0){
        printf("Ingrese una cantidad de consumo valida. ");
    }
    else if(kwh_bimestre < 1000){
        total_pagar = kwh_bimestre * 1.2;
    }
    else if(kwh_bimestre >= 1000 && kwh_bimestre <= 1500){
        total_pagar = 999 * 1.2 * 0.25 + (kwh_bimestre - 999);
    }
    else if(kwh_bimestre > 1500 && kwh_bimestre < 2500){
        total_pagar = 999 * 1.2 * 0.15 + (kwh_bimestre - 999) * 0.8;
    }
    else{
        total_pagar = 999 * 1.2 * 0.05 + (kwh_bimestre - 999) * 0.5;
    }

    printf("El total a pagar es: %lf", total_pagar);

    return 0;
}