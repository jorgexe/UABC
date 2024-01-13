# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 79:
"""

import matplotlib.pyplot as plt
x = [1, 2, 3, 4]
y = [3 , 10, 2, 5]

plt.subplot(2,2,1) # primer subplot
plt.plot(x,y,'ro-')

plt.subplot(2,2,2) # el segundo subplot
plt.plot([4, 5, 6],[-11 , 2 , -3],'.-')

plt.subplot(2,2,3) # primer subplot
plt.plot(y,x,'g^-')

plt.subplot(2,2,4) # el segundo subplot
plt.plot([-11 , 2 , -3],[4, 5, 6],'y.-')