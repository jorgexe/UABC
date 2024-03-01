# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 58: Función que regresa el valor absoluto de un número.
"""

def valor_absoluto(num):    
    """Esta función regresa el valor absoluto    de el numero que recibe la función"""
     
    if num >= 0:        
        return num    
    else:        
        return -num  
    
print(valor_absoluto(2)) 
print(valor_absoluto(-4))