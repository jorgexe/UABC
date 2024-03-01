# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 76:
"""
import matplotlib.pyplot as plt
x = list(range(0,10)) #crear una lista de 0 a 10
y = list(range(-10,0)) #crear una lista de -10 a 0
plt.plot(x,y,'ro') #grafica los puntos de x y y, con estilo color rojo y circulos
plt.title("Primer grafica") #titulo de la grafica
plt.xlabel("Eje x") #etiqueta eje x
plt.ylabel("Eje y") #etiqueta eje
