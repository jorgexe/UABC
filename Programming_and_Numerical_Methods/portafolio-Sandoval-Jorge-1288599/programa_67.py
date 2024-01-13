# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 67: Para la siguiente porción de código, cual seria la salida de las 
siguientes llamadas de función
"""

def f(a, b):
    x = a + b
    y = a - b
    print(x * y)
    return x / y
a = 1
b = 2
x = 5
y = 6
print(f(x,y))
print(f(a,b))
print(f(x,a))
print(f(y,b))
