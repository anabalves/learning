p = float(input("Informe o peso dos peixes: "))

if p > 50:
    e = (p - 50)
    m = e * 4.00
    print("Você deverá pagar R$ {0:.2f}".format(m))
else:
    m = 0
    e = 0
    print("Multas: {0}".format(m))
    print("Excesso: {0}".format(e))
