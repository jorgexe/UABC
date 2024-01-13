# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 71.1: La forma más sencilla de crear una figura con ejes es usando la 
función plot, dondeen la gráfica se muestras los puntos de x y y en los ejes.
"""
import matplotlib.pyplot as plt
x = [1,2,3,4]
y = [1,4,2,3]
plt.plot(x,y) #traza los puntos (x,y) en los ejes
