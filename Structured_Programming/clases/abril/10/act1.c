#include <stdio.h>
#include <string.h>

int main(){

    char names[5][20];
    char ingreso[20];

    for (int i = 0; i < 5; i++){
        printf("Ingrese un nombre: ");
        scanf("%s", names[i]);
    }

    while(1){
        printf("Ingrese un nombre a verificar: ");
        scanf("%s", ingreso);

        if(strcmp(ingreso,"fin") == 0){
            break;
        }

        for (int i = 0; i < 5; i++){
            if (strcmp(ingreso, names[i]) == 0){
                printf("El nombre si se encuentra en la lista.\n");
                break;
            }
            if(i==4){
                printf("El nombre no se encuentra en la lista. \n");
            }
        }
    }
    
    return 0;
}
