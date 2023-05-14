"""
Realiza un programa pida por teclado al usuario un numero entero entre 10 y 30. A
continuación la máquina debe sacar un número aleatorio entre 1 y 50 y mostrarlo por
pantalla.
Finalmente, indica usando un mensaje por pantalla quien es el que tiene el número
más alto.
Debes de tener en cuenta que si el usuario no introduce un número válido, el progra-
ma mostrará un mensaje de error y acabará
"""

import random

num = int(input("Dame un numero entre 10 y 30: "))
if num < 10 or num > 30:
    print("Error, introduzca un numero correcto.")
else:
    numMaquina = random.randrange(1, 51)
    print("La maquina saca ", numMaquina)
    if num > numMaquina:
        print("Has ganado")
    elif num < numMaquina:
        print("La maquina ha ganado")
    else:
        print("Empate")
