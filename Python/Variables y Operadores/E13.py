"""
Se necesita un algoritmo que calcule el coste total de baldosas cuadradas necesarias
para cubrir el suelo de una habitación rectangular. El programa solicitará como datos las
dimensiones de la habitación en metros (ancho y largo), el lado de cada baldosa
expresado en centímetros y el precio por baldosa expresado en euros.
Con esos datos calculará el número de baldosas necesarias que hay que colocar en la
habitación (redondeando hacia arriba si el resultado no es un numero entero) y el precio
total a invertir.
"""
ancho = float(input("Introduce el ancho de la habitación en metros: "))
largo = float(input("Introduce el largo de la habitación en metros: "))
lado = float(input("Introduce el lado de cada baldosa en centímetros: "))
precio = float(input("Introduce el precio por baldosa en euros: "))

num_baldosas = round(ancho * largo / (lado / 100)**2)

print("Número de baldosas necesarias:", num_baldosas)
print("Coste total de las baldosas necesarias:", num_baldosas * precio, "euros")
