# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 26. Ejercicio: Cual seria la salida de cada código si los valores 
decaptura de número fueran los que se muestran en la tabla, 
utilizando if-anidados
"""
num_a = int(input("Numero a: "))
num_b = int(input("Numero b: "))
if num_a < 0 :
    print("Num_a: es negativo")
    if num_b < 0:
        print("Num_b: es negativo")
print("Fin")
