"""
Crea un algoritmo que simule el lanzamiento de un dado de N caras. El número de
caras del dado se solicitará por teclado
"""
# en python hay que importar el random
import random
# Desde el 1 hasta X + 1, +1 para que tambien sea inclusive
print(random.randrange(1, (int(input("Dame un numero: ")) + 1)))
