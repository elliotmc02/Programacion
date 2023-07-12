"""
Escribe un programa que calcule el salario semanal de un trabajador teniendo en
cuenta que las horas ordinarias (las 40 primeras horas de trabajo) se pagan a 12 eu-
ros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
"""
horas = int(input("Introduzca el numero de horas trabajadas durante la semana: "))
horasExtras = horas - 40
sueldo = 0
if horas > 40:
    sueldo = 40 * 12 + horasExtras * 16
else:
    sueldo = horas * 12
print("Sueldo semanal:", sueldo, "euros")
