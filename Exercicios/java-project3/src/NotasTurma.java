import java.util.Locale;
import java.util.Scanner;
public class NotasTurma{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] notas = new double[5];
        double soma = 0.0;
        int aprovados = 0;
        int reprovados = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota do " + (i + 1) + "° aluno:");
            notas[i] = scanner.nextDouble();
            soma += notas[i];

            if(notas[i] >= 7.0){
                aprovados++;
            }else{
                reprovados++;
            }
        }
        double media = soma / notas.length;
        System.out.printf("%nMédia da turma: %.2f%n", media);
        System.out.println("Aprovados (notas >= 7):" + aprovados);
        System.out.println("Reprovados (notas < 7): " + reprovados);
        scanner.close();
    }
}
