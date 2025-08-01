A: float; B: float; C: float
areaQuadrado: float; areaTriangulo: float; areaTrapezio: float

A = float(input("Digite a medida A: "))
B = float(input("Digite a medida B: "))
C = float(input("Digite a medida C: "))

areaQuadrado = A * A
areaTriangulo = (A * B) / 2
areaTrapezio = ((A + B) * C) / 2

print(f"AREA DO QUADRADO = {areaQuadrado:.4f}")
print(f"AREA DO TRIANGULO = {areaTriangulo:.4f}")
print(f"AREA DO TRAPEZIO = {areaTrapezio:.4f}")