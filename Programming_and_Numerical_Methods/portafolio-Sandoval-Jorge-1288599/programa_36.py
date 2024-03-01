# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 36: Mostrar la suma (acumulador) de los números del 1 al 10,utilizando
un ciclo while controlado por contador
"""
contador = 1
suma = 0
while contador <= 10:
    suma += contador
    contador += 1
print("Fin del ciclo")
print("La suma de los numeros es:",suma)
