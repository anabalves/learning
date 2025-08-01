escala: str
tempCelsius: float; tempFahrenheit: float

escala = str(input("Voce vai digitar a temperatura em qual escala (C/F)? "))

if escala == 'F' or escala == 'f':
	tempFahrenheit = float(input("Digite a temperatura em Fahrenheit: "))

	tempCelsius = 5.0 / 9.0 * (tempFahrenheit - 32.0)
	print(f"Temperatura equivalente em Celsius: {tempCelsius:.2f}")
elif escala == 'C' or escala == 'c':
	tempCelsius = float(input("Digite a temperatura em Celsius: "))

	tempFahrenheit = tempCelsius * 9.0 / 5.0 + 32.0
	print(f"Temperatura equivalente em Fahrenheit: {tempFahrenheit:.2f}")
else:
	print("Escala invalida!")