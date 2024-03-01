# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 70: Función recursiva.
"""

def contador(n):
    if n<=0:
        print('Despegue!')
    else:
        print(n)
        contador(n-1)
contador(5)