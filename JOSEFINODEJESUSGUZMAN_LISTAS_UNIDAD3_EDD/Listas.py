# -*- coding: utf-8 -*-
"""
Created on Thu Nov 12 23:27:12 2020

@author: JOSE
"""
# definiendo la funcion capturar
def capturar():
    global lista
    lista=[]
    print("cuantos elementos va a tener la lista :")
    n=input()
    n=int(n)
    for i in range(0,n):# se ocupa un bucle for con el rango del indice
        print ("ingrese el elmento del indice: ",i)# se introduce los elmentos que que contendra las listas
        elemento=input()# se lee el elemento
        lista.insert(i,elemento)# se inserta los elementos
#definiendo la funcion mostrar         
def mostrar():# se define el metodo mostrar
    print (lista)
    

#definiendo la funcion agregar
def agregar():
   print("ingrese el elemento que desea agregar:")
   elemento=input()
   print("ingrese el indice donde se desea agregarlo:")
   indice=input()
   indice= int (indice)   
   longitud=len(lista)
   longitud=int(longitud)
   if (indice>longitud or indice<0):# se crea una condicion para saber si los datos estan en los indices
       print("el indice debe estar entre 0 y",longitud)# se introduce los el mensaje de la condicion
   else:
      lista.insert(indice,elemento)
      print("elemento agregado")# se introduce el mensaje por defecto
   
#definiendo la funcion eliminar
def eliminar():
  print ("ingrese el indice del elemento que desea eliminar:")
  indice=input()
  indice=int(indice)    
  longitud=len(lista)
  longitud=int(longitud)
  if (indice>longitud or indice<0):
       print("el indice debe estar entre 0 y",longitud-1)
  else:
      del lista[indice]
      print("elemento eliminado")   

# definiendo a la funcion principal
def principal():
    opcion="1"
    while(opcion!="5"):# se utiliza un while para iteracion 
        # se crea un menu de las listas
        print("manipulacion de una lista")
        print("1.capturar listas")
        print("2.mostrar listas")
        print("3.agregar un elemento de la listas")
        print("4.eliminar un elemento de la listas")
        print("5. salir")
        print("que desea hacer ?")
        opcion =input()# se lee la opcion a ejecutar
        if (opcion=="1"):# se utiliza la condicion para iterar y hasta que llegue el numero indicado
            capturar()
        elif (opcion=="2"):
            mostrar()
        elif (opcion=="3"):
            agregar()
        elif (opcion=="4"):
                eliminar()
        elif (opcion=="5"):
         print ("¡programa terminado!:")
    else:
         print("¡opcion incorrecta!")
        
#llamando la funcion principal

principal()# se llama el metodo principal
