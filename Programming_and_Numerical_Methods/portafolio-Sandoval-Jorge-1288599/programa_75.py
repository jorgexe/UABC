# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 75: Se pueden utilizar las propiedades de Line2D, como 
argumentosutilizando las palabras claves para tener mas control de la 
apariencia en lagráfica. Las propiedades de Line y fmt pueden ser mezclados.
"""

import matplotlib.pyplot as plt
x = [1,2,3,4]
y = [1,4,2,3]
plt.title("Primer grafica") #titulo de la grafica
plt.xlabel("Eje x") #etiqueta en el eje x
plt.ylabel("Eje y") #etiqueta en el eje y
plt.plot(x,y,'go--', linewidth=2, markersize=12) #Plot los puntos (x,y) en los ejes