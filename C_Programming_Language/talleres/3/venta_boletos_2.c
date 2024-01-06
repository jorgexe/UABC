#include <stdio.h>
#include <string.h>

void cobrar();
void imprimir_asientos( char a[][5], char b[][5], char c[][5], char d[][5], char e[][5], char f[][5]);
void obtener_fila(char *f);
int obtener_num_asiento();

int main(){

        char asientos_a[][5] = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12"};
        char asientos_b[][5] = {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12"};
        char asientos_c[][5] = {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12"};
        char asientos_d[][5] = {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12"};
        char asientos_e[][5] = {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10", "E11", "E12"};
        char asientos_f[][5] = {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12"};
        char fila_asiento[2], continuar[2];
        int num_asiento = 0, num_boletos = 72;
        char *asiento_a_revisar, ocupado[3] = "##";

    while(num_boletos > 0){
        printf("\n");
        printf("########## CINEMECS CIMARRON DE TIJUANA ##########\n\n");
        printf("Bienvenido, elija un asiento por favor. \n     Asientos disponibles:\n\n");
        
        //funcion imprimir asientos
        imprimir_asientos( asientos_a, asientos_b, asientos_c, asientos_d, asientos_e, asientos_f);

        obtener_fila(fila_asiento);
        
        num_asiento = obtener_num_asiento();

        if (fila_asiento[0] == 65){
            if(strcmp(asientos_a[num_asiento - 1], "##") == 0){
                printf("Asiento ocupado, ingrese otro por favor. ");
            }
            else{
                strcpy(asientos_a[num_asiento - 1], "##");
                cobrar();
                num_boletos--;
            }
        }
        else if (fila_asiento[0] == 66){
            if(strcmp(asientos_b[num_asiento - 1], "##") == 0){
                printf("Asiento ocupado, ingrese otro por favor. \n");
            }
            else{
                strcpy(asientos_b[num_asiento - 1], "##");
                cobrar();
                num_boletos--;
            }
        }
        else if (fila_asiento[0] == 67){
            if(strcmp(asientos_c[num_asiento - 1], "##") == 0){
                printf("Asiento ocupado, ingrese otro por favor. ");
            }
            else{
                strcpy(asientos_c[num_asiento - 1], "##");
                cobrar();
                num_boletos--;
            }
        }
        else if (fila_asiento[0] == 68){
            if(strcmp(asientos_d[num_asiento - 1], "##") == 0){
                printf("Asiento ocupado, ingrese otro por favor. ");
            }
            else{
                strcpy(asientos_d[num_asiento - 1], "##");
                cobrar();
                num_boletos--;
            }
        }
        else if (fila_asiento[0] == 69){
            if(strcmp(asientos_e[num_asiento - 1], "##") == 0){
                printf("Asiento ocupado, ingrese otro por favor. ");
            }
            else{
                strcpy(asientos_e[num_asiento - 1], "##");
                cobrar();
                num_boletos--;
            }
        }
        else if (fila_asiento[0] == 70){
            if(strcmp(asientos_f[num_asiento - 1], "##") == 0){
                printf("Asiento ocupado, ingrese otro por favor. ");
            }
            else{
                strcpy(asientos_f[num_asiento - 1], "##");
                cobrar();
                num_boletos--;
            }
        }

    }

    return 0;
}

void cobrar(){

    int precio = 0, estudiante = 0;

    printf("¿Eres estudiante?: (1 = si, 2 = no) ");
    scanf("%d", &estudiante);

    if (estudiante == 1){
        precio = 60;
    }
    else {
        precio = 120;
    }

    printf("Total a pagar: $%d\n Gracias por su compra.\n", precio);
}

void imprimir_asientos( char a[][5], char b[][5], char c[][5], char d[][5], char e[][5], char f[][5]){
    

    for (int i = 0; i < 12; i++){
        printf("[%s] ", a[i]);
    }
    printf("\n");
    for (int i = 0; i < 12; i++){
        printf("[%s] ", b[i]);
    }
    printf("\n");
    for (int i = 0; i < 12; i++){
        printf("[%s] ", c[i]);
    }
    printf("\n");
    for (int i = 0; i < 12; i++){
        printf("[%s] ", d[i]);
    }
    printf("\n");
    for (int i = 0; i < 12; i++){
        printf("[%s] ", e[i]);
    }
    printf("\n");
    for (int i = 0; i < 12; i++){
        printf("[%s] ", f[i]);
    }
    printf("\n\n");

    printf("(## = Asiento ocupado)\n\n");

}

void obtener_fila(char *f){

    char fila[2];

    while(1){
        fflush(stdin);
        printf("Ingrese la fila del asiento (letra mayuscula de A a F): ");
        scanf("%c", &fila);

        //revisar si el asiento es valido en la parte alfabetica
        if(fila[0] < 65 || fila[0] > 70){
            printf("Fila INVALIDA. \n");
        }
        else{
            break;
        }
    }

    strcpy(f, fila);
}

int obtener_num_asiento(){

    int num = 0;

    while(1){
        printf("Ingrese el numero de asiento (numero del 1 al 12): ");
        scanf("%d", &num);
    
        //revisar si el asiento es valido en la parte numerica
        if(num < 1 || num > 12){
            printf("Numero INVALIDO. \n");
        }
        else{
            break;
        }
    }

    return num;
}
