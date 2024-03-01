#include <stdio.h>

int main(){
    int a, b, c;

    printf("Ingrese el primer numero: ");
    scanf("%d", &a);
    printf("Ingrese el segundo numero: ");
    scanf("%d", &b);
    printf("Ingrese el tercer numero: ");
    scanf("%d", &c);

    if(a > b && a > c && b > c){
        printf("%d es mayor que %d y %d, y %d es mayor que %d", a, b, c, b, c);
    }
    else if(a > b && a > c && c > b){
        printf("%d es mayor que %d y %d, y %d es mayor que %d", a, c, b, c, b);
    }
    else if(b > a && b > c && a > c){
        printf("%d es mayor que %d y %d, y %d es mayor que %d", b, a, c, a, c);
    }
    else if(b > c && b > a && c > a){
        printf("%d es mayor que %d y %d, y %d es mayor que %d", b, c, a, c, a);
    }
    else if(c > a && c > b && a > b){
        printf("%d es mayor que %d y %d, y %d es mayor que %d", c, a, b, a, b);
    }
    else if(c > b && c > a && b > a){
        printf("%d es mayor que %d y %d, y %d es mayor que %d", c, b, a, b, a);
    }  
    else if(a == b && a == c){
        printf("TODOS LOS NUMEROS SON IGUALES");
    }
    else if(a == b && a > c){
        printf("%d = %d pero mayor que %d", a, b, c);
    }
    else if(a == b && a < c){
        printf("%d = %d pero menor que %d", a, b, c);
    }
    else if(a == c && a > b){
        printf("%d = %d pero mayor que %d", a, c, b);
    }
    else if(a == c && a < b){
        printf("%d = %d pero menor que %d", a, c, b);
    }
    else if(b == c && b > a){
        printf("%d = %d pero mayor que %d", b, c, a);
    }
    else if(b == c && b < a){
        printf("%d = %d pero menor que %d", b, c, a);
    }

    return 0;
}