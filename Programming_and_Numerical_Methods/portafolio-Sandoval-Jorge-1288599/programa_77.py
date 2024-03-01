# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 77:
"""
import matplotlib.pyplot as plt
x = [1,2,3,4]
x2 = [3,2,4,1]
x3 = [4,3,2,1]
y = [1,4,2,3]
plt.subplots() # Crea una figura y los ejes
plt.plot(x, x, label='linear') # Plot los datos en el eje.
plt.plot(x, x2, label='quadratic') # Plot los datos en eleje.
plt.plot(x, x3, label='cubic') # Plot los datos en el eje.
plt.xlabel('x label') # Agrega una etiqueta en el eje x
plt.ylabel('y label') # Agrega una etiqueta en el eje y
plt.title("Simple Plot") # # Agrega una titulo en la figura
plt.legend() # Agrega una leyenda en la grafica.