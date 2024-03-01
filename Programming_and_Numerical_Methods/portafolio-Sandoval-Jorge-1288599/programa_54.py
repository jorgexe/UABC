# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 54: La sentencia return es opcional dentro de una función, 
puededevolver o no, un valor y es posible que aparezca más de una vez dentro de 
unamisma función.
"""
#return que no devuelve ningún valor
def cuadrado_de_par(numero):
    if not numero % 2 == 0:
        return
    else:
        print(numero ** 2)
        
cuadrado_de_par(8)
cuadrado_de_par(3)
