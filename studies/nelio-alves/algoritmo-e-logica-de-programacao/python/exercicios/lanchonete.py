codigoProduto: int; quantidade: int
valorPagamento: float

codigoProduto = int(input("Codigo do produto comprado: "))
quantidade = int(input("Quantidade comprada: "))

valorPagamento = 0
if codigoProduto == 1:
	valorPagamento = quantidade * 5.00
elif codigoProduto == 2:
	valorPagamento = quantidade * 3.50
elif codigoProduto == 3:
	valorPagamento = quantidade * 4.80
elif codigoProduto == 4:
	valorPagamento = quantidade * 8.90
elif codigoProduto == 5:
	valorPagamento = quantidade * 7.32

print(f"Valor a pagar: R$ {valorPagamento:.2f}")