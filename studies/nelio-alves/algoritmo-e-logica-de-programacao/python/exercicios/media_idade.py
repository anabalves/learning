idade: int; soma: int; cont: float
media: float
soma = 0
cont = 0

print("Digite as idades:")
idade = int(input())

if idade < 0:
	print("IMPOSSIVEL CALCULAR")
else:
	while idade >= 0:
		soma = soma + idade
		cont = cont + 1

		idade = int(input())

	media = soma / cont

	print(f"MEDIA = {media:.2f}")