nomePrimeiraPessoa: str ; nomeSegundaPessoa: str
idadePrimeiraPessoa: int ; idadeSegundaPessoa: int
idadeMedia: float

print("Dados da primeira pessoa:")
nomePrimeiraPessoa = str(input("Nome: "))
idadePrimeiraPessoa = int(input("Idade: "))

print("Dados da segunda pessoa:")
nomeSegundaPessoa = str(input("Nome: "))
idadeSegundaPessoa = int(input("Idade: "))

idadeMedia = (idadePrimeiraPessoa + idadeSegundaPessoa) / 2.0

print(f"A idade media de {nomePrimeiraPessoa} e {nomeSegundaPessoa} eh de {idadeMedia:.1f} anos")