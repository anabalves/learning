indice = float(input("Informe o indice de poluicao: "))

if 0.3 <= indice < 0.4:
    print("As empresas do 1 grupo devem parar as atividades.")
elif 0.4 <= indice < 0.5:
    print("As empresas do 1 e 2 grupos devem parar as atividades.")
elif indice >= 0.5:
    print("Todas as empresas devem parar suas atividades.")
else:
    print("Níveis aceitáveis.")
