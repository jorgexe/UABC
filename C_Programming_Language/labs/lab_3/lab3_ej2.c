#include <stdio.h>
#include <stdbool.h>

int main(){

    char texto[] = "l2z@z2l";
    int size = 0, i = 0;
    bool numero = false, especial = false, palindromo = true;

    size = sizeof(texto) / sizeof(texto[0]) -1;

    for (int j = 0; j < size; j++){
        if (texto[i] != texto[size - 1 - i]){
            palindromo = false;
        }

        if (texto[i] == '0' || texto[i] == '1' || texto[i] == '2' || texto[i] == '3' || texto[i] == '4' || texto[i] == '5' || texto[i] == '6' ||texto[i] == '7' || texto[i] == '8' || texto[i] == '9'){
            numero = true;
        }

        if (texto[i] == '@' || texto[i] == '#' || texto[i] == '.' || texto[i] == '!'){
            especial = true;
        }

        i++;
    }

    if(numero == true && especial == true && palindromo == true){
        printf("La palabra: %s, es valida", texto);
    }
    else{
        printf("La palabra: %s, es invalida", texto);
    }

    return 0;
}