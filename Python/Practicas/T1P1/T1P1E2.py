"""
Realiza un programa pida al usuario un tres calificaciones (valores enteros entre 0 y
10). Si alguna de esas notas no es correcta, el programa mostrará un mensaje de
error indicando que nota o notas no son correctas y terminará.
A continuación calculará la media de esas tres notas (sin decimales) y mostrará por
pantalla si la media es INSUFICIENTE, SUFICIENTE, NOTABLE o SOBRESALIENTE
(nada más).
"""
nota1 = int(input("Nota 1: "))
if nota1 < 0 or nota1 > 10:
    exit("La nota 1 no es correcta")
nota2 = int(input("Nota 2: "))
if nota2 < 0 or nota2 > 10:
    exit("La nota 2 no es correcta")
nota3 = int(input("Nota 3: "))
if nota3 < 0 or nota3 > 10:
    exit("La nota 3 no es correcta")
media = round(nota1 + nota2 + nota3) / 3
if media < 5:
    print("INSUFICIENTE")
elif media == 5 or media == 6:
    print("SUFICIENTE")
elif media == 7 or media == 8:
    print("NOTABLE")
else:
    print("SOBRESALIENTE")

