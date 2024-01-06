#include <stdio.h>

int max_comun_divisor(int n, int m){

    int r, c;

    if(m == 0){
        return n;
    }
    else if(n == 0){
        return m;
    }

    r = n%m;

    //n = m;

    //m = r;

    max_comun_divisor(m, r);

}

int main(){

    int n, m, mcd;

    printf("Ingrese un numero: ");
    scanf("%d", &n);

    printf("Ingrese otro numero: ");
    scanf("%d", &m);

    mcd = max_comun_divisor(n, m);
    printf("El maximo comun divisor es %d ", mcd );

    return 0;
}





