N: int
a: float; b: float; c: float; media: float

N = int(input("Quantos casos voce vai digitar? "))

for i in range(N):
	print("Digite tres numeros:")
	a = float(input())
	b = float(input())
	c = float(input())

	media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0

	print(f"MEDIA = {media:.1f}")