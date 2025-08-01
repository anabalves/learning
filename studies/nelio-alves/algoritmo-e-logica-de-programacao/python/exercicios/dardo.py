distDardo1: float; distDardo2: float; distDardo3: float; maior: float

print("Digite as tres distancias:")
distDardo1 = float(input())
distDardo2 = float(input())
distDardo3 = float(input())

if distDardo1 > distDardo2 and distDardo1 > distDardo3:
	maior = distDardo1
elif distDardo2 > distDardo3:
	maior = distDardo2
else:
	maior = distDardo3

print(f"MAIOR DISTANCIA = {maior:.2f}")