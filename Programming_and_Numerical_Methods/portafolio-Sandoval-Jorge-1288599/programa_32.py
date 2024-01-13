# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 32: A veces no se sabe si hay que terminar un bucle hasta que se ha 
recorridola mitad del cuerpo del mismo. Se puede usar la sentencia break para 
salir fuera de élcuando se desee.
"""
i = 1
while i < 6:
    print(i)
    if (i == 3):
        break
    i += 1
