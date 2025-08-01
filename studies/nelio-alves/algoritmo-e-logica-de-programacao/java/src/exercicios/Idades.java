package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nomePrimeiraPessoa, nomeSegundaPessoa;
		int idadePrimeiraPessoa, idadeSegundaPessoa;
		double idadeMedia;

		System.out.println("Dados da primeira pessoa:");

		System.out.print("Nome: ");
		nomePrimeiraPessoa = sc.nextLine();

		System.out.print("Idade: ");
		idadePrimeiraPessoa = sc.nextInt();

		System.out.println("Dados da segunda pessoa:");

		System.out.print("Nome: ");
		sc.nextLine();
		nomeSegundaPessoa = sc.nextLine();

		System.out.print("Idade: ");
		idadeSegundaPessoa = sc.nextInt();

		idadeMedia =  (idadePrimeiraPessoa +  idadeSegundaPessoa) / 2.0;

		System.out.printf("A idade media de %s e %s eh de %.1f anos", nomePrimeiraPessoa, nomeSegundaPessoa, idadeMedia);

		sc.close();
	}
}
