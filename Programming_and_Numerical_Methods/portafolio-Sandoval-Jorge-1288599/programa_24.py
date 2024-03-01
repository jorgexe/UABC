# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 24: Cuál de las sentencias nunca se imprimirían independientemente del valorde x?
"""

numero = int(input("Introduce un numero:"))
if numero < 2:
    print("Este numero es menor que dos")
elif numero < 20:
    print("Este numero es menor de veinte")
elif numero < 10:
    print("menor de 10")
else:
    print("Algo mas")