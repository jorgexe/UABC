# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 62: Ambito de una variable global
"""

# Ambito Global
X = 99
def func(Y):
    # Ambito Local
    Z = X + Y
    # X y la función func asignada en el modulo: global
    # Y y Z asignado en función: local
    # X es una variable global
    return Z
print(func(1))
print()