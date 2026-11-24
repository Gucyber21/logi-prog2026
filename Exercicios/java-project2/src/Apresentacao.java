import java.util.Scanner;

public class Apresentacao {

    public static void apresentar(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        apresentar(nome);

        scanner.close();
    }
}
