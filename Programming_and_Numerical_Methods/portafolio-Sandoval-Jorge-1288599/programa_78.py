# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 78:
"""

import matplotlib.pyplot as plt
x = [1, 2, 3, 4]
y = [3 , 10, 2, 5]
plt.subplot(2,1,1) # primer subplot
plt.plot(x,y,'o-')
plt.title('Primer grafica')
plt.xlabel('x')
plt.ylabel('y')

plt.subplot(2,1,2) # el segundo subplot
plt.plot([4, 5, 6],[-11 , 2 , -3],'.-')
plt.xlabel('w')
plt.ylabel('z')