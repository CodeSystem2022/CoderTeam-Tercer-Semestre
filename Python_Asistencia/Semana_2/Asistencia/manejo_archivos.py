#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w',encoding='utf8' )#La w es de write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras.\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción.\n')
    archivo.write('Las letras son: \nr read, \na append, \nw write, \nx crea un archivo')
    archivo.write('\nt esta es para texto o text, \nb archivos binarios, \nw+ lee y escribe son iguales r+\n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close()#Para que se cierre el archivo.
#archivo.write('Todo quedó perfecto'): este es un error



















