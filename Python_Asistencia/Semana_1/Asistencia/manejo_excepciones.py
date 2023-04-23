
from NumerosIgualesExcepcion import  NumerosIgualesExcepcion
'''
try:
    10/0
except Exception as e: # nombramos con la variable e, de excepción
    print(f'Ocurrió un error : {e}')
# except zeroDivisionError as e: # la puedo capturar siendo específicos,
# pero es mejor usar objetos más genéricos usando la clase padre
#     print(f'Ocurrió un error : {e}')
# vamos a declarar variables en vez de usar literales
'''
resultado = None  #None = La variable no tiene ningún valor
# Estas variables están fuera del bloque, puedo pedirlas dentro
'''a = 10 # '10' si modifico por cadena muestra TypeDivisionError
b = 0'''

try:
    a = int(input('Digite el primer número: '))
    b = int(input('Digite el segundo número: '))
    if a == b:
        raise NumerosIgualesExcepcion('Son números iguales')
    resultado = a/b  # la variable resultado nos permite ver mejor
except TypeError as e:
    print(f'TypeError - Ocurrió un error : {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error : {type(e)}')
except Exception as e:  #nombramos con la variable e, de excepción
    print(f'Ocurrió un error : {e}')
else:
    print("No se arrojo ninguna excepción")
finally: # siempre se va a ejecutar
    print("Ejecución de este bloque finally")

print(f'El resultado es {resultado}')
print('seguimos')