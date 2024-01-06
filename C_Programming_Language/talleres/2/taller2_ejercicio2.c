#include <stdio.h>
#include <string.h>
#include <math.h>

double PI = 3.141592;

int main(){
    char seleccion[] = "";

    printf("Ingrese una operacion (TRIANGULO, CIRCULO, CUADRADO): ");
    scanf("%s", seleccion);

    if(strcmp(seleccion,"TRIANGULO") == 0){

        double a, b, c, area;

        printf("Ingrese el lado a: ");
        scanf("%lf", &a);
        printf("Ingrese el lado b: ");
        scanf("%lf", &b);
        printf("Ingrese el lado c: ");
        scanf("%lf", &c);

        if((a + b) > c && (b + c) > a && (a + c) > b ){
            double s;

            s = (a + b + c) / 2;
            area = sqrt(s * (s - a) * (s - b) * (s - c));

            printf("El area es %lf", area);
        }
        else{
            printf("Los datos ingresados del triangulo NO son validos. ");
        }
    
    }
    else if(strcmp(seleccion,"CIRCULO") == 0){
        double radio, area, perimetro;

        printf("Ingrese el radio del circulo: ");
        scanf("%lf", &radio);

        area = PI * pow(radio,2);
        perimetro = PI * 2 * radio;

        printf("El area es: %lf \n",area );
        printf("El perimetro es: %lf", perimetro);

    }
    else if(strcmp(seleccion,"CUADRADO") == 0){
        double base, altura, area, perimetro;

        printf("Ingrese la base: ");
        scanf("%lf", &base);
        printf("Ingrese la altura: ");
        scanf("%lf", &altura);

        area = base * altura;
        perimetro = 2 * (base + altura);

        printf("El area es: %lf \n",area );
        printf("El perimetro es: %lf", perimetro);
    }
    else
        printf("Error, ingrese una operacion correcta: TRIANGULO, CIRCULO, CUADRADO. ");


    return 0;
}