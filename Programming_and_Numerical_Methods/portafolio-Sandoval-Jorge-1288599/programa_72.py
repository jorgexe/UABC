# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 72: Hay varias formas de trazar múltiples conjuntos de datos, laforma 
más sencilla es llamar a plot varias veces.
"""

import matplotlib.pyplot as plt
x = [1,2,3,4]
y = [1,4,2,3]
plt.plot(x, y, 'bo')
plt.plot(y, x, 'go')