precoUnitario: float; dinheiroRecebido: float; troco: float
qtd: int

precoUnitario = float(input("Preco unitario do produto: "))
qtd = int(input("Quantidade comprada: "))
dinheiroRecebido = float(input("Dinheiro recebido: "))

troco = dinheiroRecebido - (precoUnitario * qtd)

print(f"TROCO = {troco:.2f}")