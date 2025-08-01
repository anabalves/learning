import math

r: float; area: float

r = float(input("Digite o valor do raio do circulo: "))

area = 3.14159 * math.pow(r, 2)

print(f"AREA = {area:.3f}")