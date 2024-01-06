#include <stdio.h>

int main(){
    int contrasena = 1234, ingreso = 0,intentos = 3;

    while(intentos > 0){

        intentos--;

        printf("Contrasena: ");
        scanf("%d", &ingreso);

        if(ingreso == contrasena){
            printf("Contrasena correcta. ");
            return 0;
        }
        else{
            printf("Contrasena incorrecta. Le quedan %d intentos.\n",intentos);
        }
    
    }

    printf("Haz agotadao tu numero de intentos. ");

    return 0;

}