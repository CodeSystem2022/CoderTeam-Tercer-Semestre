from Dominio.Pelicula import Pelicula
from Servicio.catalogo_peliculas import Catalogo_Peliculas as cp
opcion = None

while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar Pelicula')
        print('2. Listar las peliculas')
        print('3. Eliminar catalogo de Pelicula')
        print('4. Salir')
        opcion = int(input('Digite una opcion de menu: '))
        if opcion == 1:
            nombre_pelicula = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()

    except Exception as e:
        print(f'Ocurrio un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del programa')