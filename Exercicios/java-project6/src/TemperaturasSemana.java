import java.util.Locale;
import java.util.Scanner;

public class TemperaturasSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Permite digitar valores decimais com ponto (ex: 26.5)

        String[] dias = {
            "Domingo",
            "Segunda-feira",
            "Terça-feira",
            "Quarta-feira",
            "Quinta-feira",
            "Sexta-feira",
            "Sábado"
        };

        double[] temperaturas = new double[7];
        double soma = 0.0;

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Digite a temperatura de " + dias[i] + " (°C): ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        int indiceMaisQuente = 0;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[indiceMaisQuente]) {
                indiceMaisQuente = i;
            }
        }

        System.out.printf("%nMédia da semana: %.2f °C%n", media);

        System.out.println("\nDias acima da média:");
        boolean encontrouAcima = false;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("- %s: %.2f °C%n", dias[i], temperaturas[i]);
                encontrouAcima = true;
            }
        }
        if (!encontrouAcima) {
            System.out.println("- Nenhum dia ficou estritamente acima da média.");
        }

        System.out.printf("%nDia mais quente: %s (%.2f °C)%n", dias[indiceMaisQuente], temperaturas[indiceMaisQuente]);

        scanner.close();
    }
}
