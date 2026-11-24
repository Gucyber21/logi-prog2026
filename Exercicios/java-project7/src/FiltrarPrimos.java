import java.util.Arrays;
import java.util.Scanner;

public class FiltrarPrimos {

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] filtrarPrimos(int[] v) {
        int quantidadePrimos = 0;
        for (int num : v) {
            if (ehPrimo(num)) {
                quantidadePrimos++;
            }
        }

        int[] primos = new int[quantidadePrimos];
        int indice = 0;
        for (int num : v) {
            if (ehPrimo(num)) {
                primos[indice++] = num;
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int[] apenasPrimos = filtrarPrimos(numeros);

        System.out.println("Vetor original: " + Arrays.toString(numeros));
        System.out.println("Números primos: " + Arrays.toString(apenasPrimos));

        scanner.close();
    }
}
