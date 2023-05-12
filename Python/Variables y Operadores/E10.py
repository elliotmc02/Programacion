"""
Crea un algoritmo que sirva para resolver ecuaciones de segundo grado del tipo:
ax2+bx+c=0 Vamos a suponer que a,b y c no van a ser cero nunca.
"""
# The math module supplies mathematical functions on floating-point numbers, while the cmath module supplies equivalent
# functions on complex numbers. For example, math.sqrt(-1) raises an exception, but cmath.sqrt(-1) returns 1j.
# cmath es mas complejo que math. En el caso de intentar hacer la raiz cuadrada de un numero negativo, con math te
# salta una excepcion, mientras con cmath de devuelve xj
import cmath

a = float(input("A: "))
b = float(input("B: "))
c = float(input("C: "))
print("x1:", (-b - cmath.sqrt((b ** 2) - (4 * a * c))) / (2 * a))
print("x2:", (-b + cmath.sqrt((b ** 2) - (4 * a * c))) / (2 * a))
