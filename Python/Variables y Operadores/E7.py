"""
Para la cadena cad = “Volando, volando... siempre arriba”, crear un algoritmo
que nos indique la posición de la letra ‘d’ en los 7 primeros caracteres de cad.
b) Igual pero ahora busca la letra ‘d’ en los 7 últimos
"""
cad = "Volando, volando... siempre arrdiba"
# cad[0:7] es un substring, me elige los primeros 7 caracteres, despues me busca el caracter "d", si está, me devuelve
# la posicion, si no, me devuelve -1
print("Primeros 7:", cad[0:7].find("d"))
print("Ultimos 7:", cad[len(cad) - 7:len(cad)].find("d"))
