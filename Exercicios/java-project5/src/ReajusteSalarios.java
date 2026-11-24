import java.util.Locale;
import java.util.Scanner;
public class ReajusteSalarios{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double[] salarios = new double[5];
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o salário do " +(i + 1) + "° funcionário (R$):");
            salarios[i] = scanner.nextDouble();
            if (salarios[i] < 2000.0){
                salarios[i] = salarios[i]*1.10;
            }
        }
        System.out.println("\nSalários atualizados:");
        for(int i = 0; i < salarios.lenght; i++){
            System.out.printf("%d° funcionário: R$ %.2f%n", (i + 1), salarios[i]);
        }
        scanner.close();
    }
}
