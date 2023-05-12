"""
Solicita dos números por teclado. Muestra por pantalla la suma, la resta, la
multiplicación, la potencia y la división de ambos números. Usa la siguiente plantilla:
La suma de __ y __ es:
La resta de __ y __ es:
La multiplicación de __ y __ es:
El cociente de __ entre __ da:
__ elevado a __ da:
"""
import math

n1 = int(input("Numero 1: "))
n2 = int(input("Numero 2: "))
print("La suma de", n1, "y", n2, "es:", n1 + n2)
print("La resta de", n1, "y", n2, "es:", n1 - n2)
print("La multiplicacion de", n1, "y", n2, "es:", n1 * n2)
print("El cociente de", n1, "entre", n2, "da:", n1 / n2)
# se puede usar math.pow o **, la segunda no habria que importar math
print(n1, "elevado a", n2, "da:", math.pow(n1, n2))
print(n1, "elevado a", n2, "da:", n1**n2)


