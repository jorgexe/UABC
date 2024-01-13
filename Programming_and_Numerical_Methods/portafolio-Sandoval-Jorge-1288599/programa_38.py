# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 38: Programa que capture numeros positivos utilizando un 
ciclocontrolado por bandera
"""

band = True
while band:
    num = int(input("introduce un numero positivo:"))
    if num <= 0:
        band = False
print("el ciclo finalizo")