"""
Diseña un algoritmo que pida dos números por teclado (m y n) y calcule las
siguientes expresiones:
a) m / n*(m-n)
b) 12.3 / m + 5 - n * 9
c) m * 2048 / n*1024 - mn
d) El resto de la división: (3203 /m-n)n / (n2*m3)
"""
m = float(input("Numero 1: "))
n = float(input("Numero 2: "))
print("a)", m / n * (m - n))
print("b)", 12.3 / m + 5 - n * 9)
print("c)", m * 2048 / n * 1024 - m * n)
print("d) El resto de la division:", (3203 / m - n) * n / (n * 2 * m * 3))
