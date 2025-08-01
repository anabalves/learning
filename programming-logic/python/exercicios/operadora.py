quantMinutos: int; minutosExcedentes: int
valorPagamento: float

quantMinutos = int(input("Digite a quantidade de minutos: "))

valorPagamento = 50.0

if quantMinutos > 100:
	minutosExcedentes = quantMinutos - 100
	valorPagamento = valorPagamento + minutosExcedentes * 2.0

print(f"Valor a pagar: R$ {valorPagamento:.2f}")