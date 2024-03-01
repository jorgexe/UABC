# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 16: format
"""
num=10
print('el numero es {0}'.format(num))
print('{numero}+{otronumero}'.format(numero=num,otronumero='15'))
print('cadena: {0:2} \nEntero: {1:d} \nFlotante:{2:f}'.format(num,int(num),float(num)))