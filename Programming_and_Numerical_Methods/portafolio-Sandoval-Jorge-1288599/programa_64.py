# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 64: Ejemplo de una función donde se muestran los diferentes reglas de 
ámbitos de una variable
"""

def par_o_impar(num):#definicion de una función que toma como parametro,num
    num = num % 2 #residuo cuando el numero se divide entre 2
    if num == 1:
        return "par"
    else:
        return "impar"
num = 4 #variable global
print(par_o_impar(num))# llamada de la funcion que el print imprime elretorno de la función
par_o_impar(5) #llamada de la funcion que no hace nada con el valor deretorno