archivo = open('prueba.txt','r', encoding='utf8')#Las letras son 'r'
#print(archivo.read())
#print(archivo.read(5))
#print(archivo.read(5))#Continuamos desde la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#Vamos a iterar el archivo en cada una de las lineas
#for linea in archivo:
    #print(linea) iteramos todos los elementos del archivo
#print(archivo.readlines()[11]): #accedemos al archivo como si fuera una lista

#Anexamos información, copiamos otro
archivo2 = open('copia.txt', 'w', encoding='UTF8')
archivo2.write(archivo.read())
archivo.close() #cerramos el primer archivo
archivo2.close() #cerramos el segundo archivo

print('Se ha terminado el proceso de leer y copiar archivos')














