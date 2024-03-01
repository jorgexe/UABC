# -*- coding: utf-8 -*-
"""
Created on Jun 13 

@author: Jorge Sandoval 1288599

Programa 37: Programa que capture las calificaciones de un alumno, 
cuandotermine el usuario debe introducir -1
"""
nota = int(input("Introduce una calificacion o pulse -1para terminar:"))
while nota != -1:
    nota = int(input("Introduce una calificacion o pulse-1 para terminar:"))
print("Finalizo el ciclo")
