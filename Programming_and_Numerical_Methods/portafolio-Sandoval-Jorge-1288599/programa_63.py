# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 63: Es una forma de encapsular sentencias de código, para Python es 
mediante laindentación
"""

var_global = "existo fuera de la funcion func"
def func():
    # en la function, var_global es una variable global
    var_global= "Puedo acceder a mi dentro de la funcion"
    var_local =  "existo dentro de la función funk"
    print(var_global)
    print(var_local)