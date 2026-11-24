import java.util.Locale;
import java.util.Scanner;

public class SomaNotasAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[][] notas = new double[3][2];
        double totalGeral = 0.0;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            for (int disciplina = 0; disciplina < notas[aluno].length; disciplina++) {
                System.out.print("Digite a nota do aluno " + (aluno + 1)
                        + " na disciplina " + (disciplina + 1) + ": ");
                notas[aluno][disciplina] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Resumo das Notas ---");
        for (int aluno = 0; aluno < notas.length; aluno++) {
            double somaAluno = 0.0;
            for (int disciplina = 0; disciplina < notas[aluno].length; disciplina++) {
                somaAluno += notas[aluno][disciplina];
            }
            totalGeral += somaAluno;
            System.out.printf("Aluno %d - Soma das notas: %.2f%n", (aluno + 1), somaAluno);
        }

        System.out.printf("Total geral das notas: %.2f%n", totalGeral);

        scanner.close();
    }
}
