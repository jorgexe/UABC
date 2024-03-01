/*   Banco Fuerte Cimarrón - Sandoval Romo Jorge Alejandro

Un banco que se va inagurar en las instalaciones de la UABC, requiere de un sistema decajero, 
donde le permita al operador del banco, dar de alta cuentas de usuarios, asicomo poder retirar 
dinero de la cuenta del usuario o abonar dinero a la cuentadel usuario, también se debe de poder 
de dar de baja a una cuenta de usuariocon la unica restricción que primero se debe de vaciar el credito 
de la cuenta para poder eliminarla del sistema.

Diseñe la estuctura correspondiente para poder almacenar la información del cliente

Diseñe la estructura del banco para poder tener un control de todos los clientes

    La interface del programa debe contener lo siguiente:

Un menu que contengan las siguientes opciones:

Dar de alta usuario
Dar de baja usuario
Retirar dinero
Abonar dinero
Salir

Para dar de alta un usuario, le debe de pedir todos los datos necesarios para crearla cuenta de usuario 
que el banco usará para guardar el dinero.

Para dar de baja a un usuario, es necesario que la cuenta no tenga nada de dinero,de lo contrario lo 
manda a retirar dinero.

Para retirar dinero, se debe de ingresar el usuario y su PIN, una vez que se verifiqueque es el usuario, 
mostrar la cantidad actual de dinero que tiene y pedir cuanto desearetirar, retirando el dinero y 
restandolo de la cuenta.

Para abonar dinero, se debe de ingresar el usuario y su PIN, una vez que se verifiqueque es el usuario, 
mostrar la cantidad de dinero actual y pedir cuanto desea abonar, alabonar mostrar la nueva cantidad de 
dinero.

Salir , simplemente cierra el sistema del banco.
*/

#include <stdio.h>
#include <stdlib.h>

#define MAXIMO_CLIENTES 100000

struct Datos_cliente{
    int numero_cuenta;
    char nombre[50];
    int pin;
    float saldo;
};

struct Banco {
    struct Datos_cliente* clientes[MAXIMO_CLIENTES];
    int numero_clientes;
    int contador_num_cuentas;
};

void desplegar_menu();
int seleccion_menu();
void alta_usuario(struct Banco* banco);
void baja_usuario(struct Banco* banco);
void retirar_dinero(struct Banco* banco);
void abonar_dinero(struct Banco* banco);

int main(){

    struct Banco banco;
    banco.numero_clientes = 0;
    banco.contador_num_cuentas = 0;

    while(1){
        desplegar_menu();

        int seleccion = -1;
        while(seleccion < 1 || seleccion > 5){
            seleccion = seleccion_menu();
        }  

        if (seleccion == 1){
            alta_usuario(&banco);
        }
        else if (seleccion == 2){
            baja_usuario(&banco);
        }
        else if (seleccion == 3){
            retirar_dinero(&banco);
        }
        else if (seleccion == 4){
            abonar_dinero(&banco);
        }
        else {
            printf("\n * GRACIAS POR SU PREFERENCIA * \n\n");
            break;
        }
   
    }

    int i;
    for (i = 0; i < banco.numero_clientes; i++) {
        free(banco.clientes[i]);
    }

    return 0;
}

void desplegar_menu(){

    printf("\n--------------------------------\n");
    printf("| BANCO FUERTE CIMARRON |\n");
    printf("--------------------------------\n");
    printf("1.- Dar de alta usuario\n");
    printf("2.- Dar de baja usuario\n");
    printf("3.- Retirar dinero\n");
    printf("4.- Abonar dinero\n");
    printf("\n5.- SALIR\n");
    printf("--------------------------------\n");
    printf("...>");
}

int seleccion_menu(){

    int seleccion;
    scanf("%d", &seleccion);

    return seleccion;
}

void alta_usuario(struct Banco* banco){

    if (banco -> numero_clientes >= MAXIMO_CLIENTES) {
        printf("! ! ! ERROR: El bacno ha excedido el numero de clientes permitido ! ! !\n");
        return;
    }

    struct Datos_cliente* nuevo_cliente = (struct Datos_cliente*)malloc(sizeof(struct Datos_cliente));

    printf("\nIngrese el nombre del nuevo cliente: ");
    scanf("%s", nuevo_cliente -> nombre);

    printf("Ingrese el nuevo PIN: ");
    scanf("%d", &(nuevo_cliente -> pin));

    printf("Ingrese el saldo inicial: ");
    scanf("%f", &(nuevo_cliente->saldo));

    banco -> clientes[banco->numero_clientes] = nuevo_cliente;
    banco -> numero_clientes++;

    banco -> contador_num_cuentas++;
    nuevo_cliente -> numero_cuenta = banco -> contador_num_cuentas;
    printf("\nEl nuevo numero de cuenta es: %d\n", banco -> contador_num_cuentas);

    printf("\n *** Cliente dado de alta exitosamente ***\n\n");
}

void baja_usuario(struct Banco* banco){
    int numero_cuenta;

    printf("\nIngrese el número de cuenta del cliente a dar de baja: ");
    scanf("%d", &numero_cuenta);

    for (int i = 0; i < banco -> numero_clientes; i++) {
        if (banco -> clientes[i] -> numero_cuenta == numero_cuenta) {
            if (banco -> clientes[i] -> saldo == 0) {
                free(banco -> clientes[i]);
                int j;
                for (j = i; j < banco -> numero_clientes - 1; j++) {
                    banco -> clientes[j] = banco -> clientes[j + 1];
                }
                banco -> numero_clientes--;

                printf("\n *** Cliente dado de baja exitosamente *** \n\n");
                return;
            } else {
                printf("\n ! ! ! El cliente tiene saldo pendiente. Por favor, retire el dinero antes de darlo de baja ! ! ! \n\n");
                return;
            }
        }
    }

    printf(" \n! ! ! No se encontró ningún cliente con el número de cuenta ingresado ! ! ! \n\n");
}

void retirar_dinero(struct Banco* banco){
    int numero_cuenta;
    int pin;
    float cantidad;

    printf("\nIngrese el número de cuenta: ");
    scanf("%d", &numero_cuenta);

    printf("Ingrese el PIN: ");
    scanf("%d", &pin);

    for (int i = 0; i < banco->numero_clientes; i++) {
        if (banco -> clientes[i] -> numero_cuenta == numero_cuenta && banco -> clientes[i] -> pin == pin) {
            printf("Bienvenido, %s\n", banco -> clientes[i] -> nombre);
            printf("Su saldo actual es: %.2f\n", banco -> clientes[i] -> saldo);

            printf("Ingrese la cantidad a retirar: ");
            scanf("%f", &cantidad);

            if (cantidad <= banco->clientes[i]->saldo) {
                banco -> clientes[i] -> saldo -= cantidad;
                printf(" \n*** Retiro exitoso. Su saldo actual es: %.2f ***\n\n", banco -> clientes[i] -> saldo);
            } else {
                printf("\n ! ! ! Saldo insuficiente ! ! ! \n\n");
            }

            return;
        }
    }

    printf("\n ! ! ! Número de cuenta o PIN incorrecto ! ! ! \n\n");
}

void abonar_dinero(struct Banco* banco){
    int numero_cuenta;
    int pin;
    float cantidad;

    printf("\nIngrese el número de cuenta: ");
    scanf("%d", &numero_cuenta);

    printf("Ingrese el PIN: ");
    scanf("%d", &pin);

    for (int i = 0; i < banco -> numero_clientes; i++) {
        if (banco -> clientes[i] -> numero_cuenta == numero_cuenta && banco -> clientes[i]->pin == pin) {
            printf("Bienvenido, %s\n", banco -> clientes[i] -> nombre);
            printf("Su saldo actual es: %.2f\n", banco -> clientes[i]->saldo);

            printf("Ingrese la cantidad a abonar: ");
            scanf("%f", &cantidad);

            banco -> clientes[i] -> saldo += cantidad;
            printf("\n *** Abono exitoso. Su saldo actual es: %.2f *** \n\n", banco -> clientes[i] -> saldo);

            return;
        }
    }

    printf("\n ! ! ! Número de cuenta o PIN incorrecto ! ! ! \n\n");
}