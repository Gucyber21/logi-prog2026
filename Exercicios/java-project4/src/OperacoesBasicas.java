import java.util.Locale;
import java.util.Scanner;

public class OperacoesBasicas {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static Double dividir(double a, double b) {
        if (b == 0.0) {
            return null;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));

        Double resultadoDivisao = dividir(num1, num2);
        if (resultadoDivisao != null) {
            System.out.println("Divisão: " + resultadoDivisao);
        } else {
            System.out.println("Divisão: não é possível dividir por zero.");
        }

        scanner.close();
    }
}
