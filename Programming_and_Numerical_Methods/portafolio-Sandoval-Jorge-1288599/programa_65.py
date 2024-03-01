# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 65: Dentro de una función puede llamar a otra función a esto se le llamacomposición.
"""

import math
def distancia(x1, y1, x2, y2):
    dx=x2-x1
    dy=y2-y1
    draiz = dx**2 + dy**2
    result = math.sqrt(draiz)
    return result
def area_circulo(xc, yc, xp, yp):
    radio = distancia(xc, yc, xp, yp)
    result = area(radio)
    return result
def area(radio):
    return math.pi*radio**2