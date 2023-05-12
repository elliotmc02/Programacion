"""
Crea un algoritmo que calcule la media de 5 números que se le pasan por teclado
"""
numeros = [float(input("Numero: ")) for _ in range(5)]
print(sum(numeros) / len(numeros))

# en una linea, pero no podriamos usar el len del array
# print(sum([float(input("Ingrese un número: ")) for _ in range(5)]) / 5)
