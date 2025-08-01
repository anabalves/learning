vetor = []
maiores_50 = False

for n in range(0, 10):
    num = int(input("Informe {0} valor para o vetor: ".format(n+1)))
    vetor.append(num)

for n in vetor:
    if n > 50:
        print("O numero {0} esta na posicao {1} do vetor.".format(n, vetor.index(n)))
        maiores_50 = True

if not maiores_50:
    print("Nao existe nenhum numero maior que 50.")
