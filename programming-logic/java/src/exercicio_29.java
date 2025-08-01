import java.util.Scanner;

public class exercicio_29 {

    public static void main(String[] args) {
        String nome_usuario, senha;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome de usuario: ");
        nome_usuario = teclado.next();
        System.out.print("Informe a senha: ");
        senha = teclado.next();

        while (nome_usuario.equals(senha)) {
            System.out.println("Erro: O nome de usuário e senha devem ser diferentes.");
            System.out.print("Informe o nome de usuario: ");
            nome_usuario = teclado.next();
            System.out.print("Informe a senha: ");
            senha = teclado.next();
        }

        teclado.close();
    }

}
