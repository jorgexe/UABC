# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 23: Cuál de las sentencias nunca se imprimirían independientementedel 
valor de x?
"""

numero = int(input("Introduce un numero:"))
if numero < 2:
    print("Este numero es menor que dos")
elif numero >= 2:
    print("Este numero es Mayor de dos o igual")
else:
    print("Algo mas")
print("Fin")

