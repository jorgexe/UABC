# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 66: Función que define una función dentro de otra función.
"""

def f1():
    x = 88
    def f2(x=x): # Remember enclosing scope X with defaults
        print(x)
    f2()
f1() # Prints 88