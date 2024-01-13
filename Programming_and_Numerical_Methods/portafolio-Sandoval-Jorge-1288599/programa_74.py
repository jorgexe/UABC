# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 74: La gráfica puede ser personalizada dandole un titulo, etiquetas,
utilizando las funciones title(), xlabel(), ylabel().
"""
import matplotlib.pyplot as plt
x = [1,2,3,4]
y = [1,4,2,3]
plt.plot(x,y) #Plot los puntos (x,y) en los ejes
plt.title("Primer grafica") #titulo de la grafica
plt.xlabel("Eje x") #etiqueta en el eje x
plt.ylabel("Eje y") #etiqueta en el eje y
