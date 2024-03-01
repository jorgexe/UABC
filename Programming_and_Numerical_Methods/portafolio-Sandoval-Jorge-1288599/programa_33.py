# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 33: Algunas veces, estando dentro de un ciclo se necesita terminar 
con la iteración actual y saltara la siguiente de forma inmediata. 
Es ese caso se utiliza la sentencia continue para pasar a la siguienteiteración 
sin terminar la ejecución del bucle para la actual.
"""

x = 10
while x:
    x -= 1
    if x % 2 != 0:
        continue
    print(x, end=' ')