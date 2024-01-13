# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 69: Para la siguiente porción de código, cual seria la salida de las
siguientes llamadas de función
"""

from math import atan
def derivatives(f,x,h=0.0001): # h has a default value
    df =(f(x+h) - f(x-h))/(2.0*h)
    ddf =(f(x+h) - 2.0*f(x) + f(x-h))/h**2
    return df,ddf
df,ddf = derivatives(atan,0.5) # Uses default value of h
print('Primer derivada =',df)
print('Segunda derivada =',ddf)