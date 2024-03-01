# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 29: Programa que maneja if, if anidados
"""

num_a = 5
num_b = 7
num_suerte = 7
if type(num_a) != int or type(num_b) != int:
    print("No has capturado numeros enteros")
else:
    if num_a > 0 and num_b > 0:
        print("Ambos numeros son positivos")
    elif num_a < 0 and num_b < 0:
        print("ambos numeros son negativos")
    else:
        print("los numeros tienen signos opuestos")
if num_a == num_suerte or num_b == num_suerte:
    print("Has adivinado el numero de la suerte")
else:
    print("se tiene un numero secreto en mente...")
