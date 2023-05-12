"""
Crea un algoritmo que, partiendo de la cadena “LA LLUVIA EN SEVILLA ES UNA
MARAVILLA” obtenga las cadenas “sevilla es una maravilla” y “la lluvia es
una maravilla”. Muestra ambas por pantalla.
"""
cadena = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA"
# pasamos a minusculas, y metemos en un array cada palabra
palabras = cadena.lower().split()
# eliminamos la palabra "en" ya que no se va a usar
palabras.remove("en")
# lo que hace join es juntar todos los elementos de una lista, tupla o string separadas por el primer parametro que le
# damos, en este caso un espacio. Lo que hace el ":" despues del numero (o antes), te saca los elementos a partir de ahi
print(" ".join(palabras[2:]))
print(palabras[0], palabras[1], " ".join(palabras[3:]))
