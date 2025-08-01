n: int
media: float

n = int(input("Quantos alunos serao digitados? "))

nomes: [str] = [0 for x in range(n)]
notasPrimeiroSemestre: [float] = [0 for x in range(n)]
notasSegundoSemestre: [float] = [0 for x in range(n)]

for i in range(n):
	print(f"Digite nome, primeira e segunda nota do {i + 1}o aluno:")
	nomes[i] = str(input())
	notasPrimeiroSemestre[i] = float(input())
	notasSegundoSemestre[i] = float(input())

print("Alunos aprovados:")
for i in range(n):
	media = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i]) / 2

	if media >= 6.0:
		print(nomes[i])