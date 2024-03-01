# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 71: Función recursiva
"""

def print_n(s, n):
    if n<=0:
        return
    print(s)
    print_n(s, n-1)
print_n('hola', 5)

