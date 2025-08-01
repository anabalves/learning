nome = input("Informe o nome de usuario: ")
senha = input("Informe a senha: ")

while nome == senha:
    print("Nome de usuario e senha devem ser diferentes.")
    nome = input("Informe o nome de usuario: ")
    senha = input("Informe a senha: ")
