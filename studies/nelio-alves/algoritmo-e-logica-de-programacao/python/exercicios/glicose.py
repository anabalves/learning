medidaGlicose: float

medidaGlicose = float(input("Digite a medida da glicose: "))

if medidaGlicose <= 100:
    print("Classificacao: normal")
elif medidaGlicose <= 140:
    print("Classificacao: elevado")
else:
    print("Classificacao: diabetes")
