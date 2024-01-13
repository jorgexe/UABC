# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 57: Función que regresa más de un valor de retorno.
"""
def cuadrado_y_cubo(numero):
    return numero ** 2,numero ** 3
c1,c2 = cuadrado_y_cubo(8)
print(c1)
print(c2)
