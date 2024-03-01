#include <stdio.h>
#include <math.h>

int main(){
    double x = 0, constante = 0, fx = 0, fxdx = 0;
    int grado = 0;

    printf("Ingrese X: ");
    scanf("%lf", &x);

    printf("Ingrese el grado del polinomio: ");
    scanf("%d", &grado);

    for ( int i = 0; i <= grado; i++ ){

        printf("Ingrese la constante del grado %d : ", i);
        scanf("%lf", &constante);

        fx = fx + constante * pow(x,(i));

        if(i != 0){
            fxdx = fxdx + (constante * i * pow(x,(i - 1)));
        }
    }

    printf("F(x) = %lf \n", fx);
    printf("F(x)' = %lf", fxdx);



    return 0;

}