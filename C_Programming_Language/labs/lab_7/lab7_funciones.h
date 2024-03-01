#pragma once
#include "lab7.c"

Texto* crear_texto(int* id, char* oracion, char* quien, char* opcion1, char*opcion2);
void ligar_textos(Texto* texto_base, Texto* opcion1, Texto* opcion2);
void imprimir_texto(Texto* texto);
Texto* escoger_opcion(Texto* texto);