idade = int(input("Informe sua idade: "))

if 5 <= idade <= 7:
    print("Infantil A")
elif 8 <= idade <= 11:
    print("Infantil B")
elif 12 <= idade <= 13:
    print("Juvenil A")
elif 13 <= idade <= 17:
    print("Juvenil B")
elif idade > 18:
    print("Adulto")
else:
    print("Idade abaixo do limite")
