#include <stdio.h>

int main(){
    int n  = 0, tres = 3, uno_mod_cuatro = 0, tres_mod_cuatro = 1;

    printf("Ingrese el numero maximo: ");
    scanf("%d", &n);

    for (int i = n; i > 2; i--){
        for (int j = (i - 1); j >= 2; j--){
            if (i % j == 0){
                break;
            }
            else if (j == 3){
                if (i != 4){
                    printf("%d \n", i);
                }

                if ( i % 4 == 3){
                    tres_mod_cuatro++;
                }
                else if ( i % 4 == 1){
                    uno_mod_cuatro++;
                }
                
            }

        }
    }
    
    printf("%d \n", tres);

    if (uno_mod_cuatro > tres_mod_cuatro){
        printf("De 3 a %d: 1 mod 4 = %d, 3 mod 4 = %d, por lo tanto 1 mod 4 es mayor. ", n, uno_mod_cuatro, tres_mod_cuatro);
    }
    else if (tres_mod_cuatro > uno_mod_cuatro){
        printf("De 3 a %d: 1 mod 4 = %d, 3 mod 4 = %d, por lo tanto 3 mod 4 es mayor. ", n, uno_mod_cuatro, tres_mod_cuatro);
    }
    else{
        printf("De 3 a %d: 1 mod 4 = %d, 3 mod 4 = %d, por lo tanto son iguales. ", n, uno_mod_cuatro, tres_mod_cuatro);
    }

    return 0;
    
}