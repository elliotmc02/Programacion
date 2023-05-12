"""
Diseña un algoritmo que pida por teclado un tiempo expresado en segundos y
muestre por pantalla ese valor expresado en horas, minutos y segundos.
"""
seg = int(input("Dame los segundos: "))
print("Horas:", int(seg / 3600), "Minutos:", int((seg % 3600) / 60), "Segundos:", int((seg % 3600) % 60))
