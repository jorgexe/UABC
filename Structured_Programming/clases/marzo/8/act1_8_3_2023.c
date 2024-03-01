#include <stdio.h>

int piramide(){

    int pisos;
    char espacio[1] = " ";
    char asterisco[1] = "*";
    int num_espacios;
    int num_asteriscos = -1;

    printf("Ingrese el numero de pisos: ");
    scanf("%d", &pisos);

    for (int i = 1; i < pisos; i++){
        num_asteriscos = num_asteriscos + 2;
        num_espacios = pisos - i;

        for (int j = 1; j < num_espacios; j++){
            printf("%c",espacio[0]);
        }

        for (int j = 0; j < num_asteriscos; j++){
            printf("%c",asterisco[0]);
        }
        
        printf("\n");
    }
        
    
}

int main(){
    piramide();

    return 0;
}