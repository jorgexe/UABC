# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Estructuras de control de seleccion

Programa 20. Hacer un programa que muestre si un numero introducido por el
usuario es un numero positivo, negativo o cero, utilizando la sentencia if-elseif
"""

numero = int(input("Introduce un numero: "))
if numero > 0:
    print("Positivo")
elif numero < 0:
    print("Negativo")
else:
    print("Cero")