# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 68: Para la siguiente porción de código, cual seria la salida de las 
siguientes llamadas de función
"""
def add_one(a, b):
    x = a + 1
    y = b + 1
    def mult(a,b):
        return a*b
    return mult(x,y)
a = 1
b = 2
x = 5
y = 6
print(add_one(x,y))
print(add_one(a,b))
print(add_one(x,a))
print(add_one(y,b))
