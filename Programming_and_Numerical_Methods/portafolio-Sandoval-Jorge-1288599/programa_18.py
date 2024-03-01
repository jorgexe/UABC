# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Estructuras de control de seleccion

Programa 18: Hacer un programa que muestre si un numero capturado por elusuario, 
es un numero positivo, negativo o cero
"""

num_a = int(input("Introduce un numero: "))
if num_a > 0:
    print("Positivo")
if num_a < 0:
    print("Negativo")
if num_a == 0:
    print("Cero")
print("Termino!")