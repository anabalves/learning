num1: int; num2: int; num3: int; menor: int

num1 = int(input("Primeiro valor: "))
num2 = int(input("Segundo valor: "))
num3 = int(input("Terceiro valor: "))

if num1 < num2 and num1 < num3:
	menor = num1
elif num2 < num3:
	menor = num2
else:
	menor = num3

print(f"MENOR = {menor}")