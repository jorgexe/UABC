# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 60: Ambito de una variable local
"""
def mi_funcion():    
    x = 10    
    print("valor dentro de la función:",x) 
          
x = 20
mi_funcion()
print("valor fuera de la función:",x)
