import java.util.Locale;
import java.util.Scanner;

public class BoletimAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String[] alunos = new String[4];
        String[] disciplinas = {"Lógica", "Banco de Dados", "Redes"};
        double[][] notas = new double[4][3];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine().trim();
            while (alunos[i].isEmpty()) {
                System.out.print("Nome inválido. Digite o nome do aluno " + (i + 1) + ": ");
                alunos[i] = scanner.nextLine().trim();
            }

            for (int j = 0; j < disciplinas.length; j++) {
                System.out.print("Nota de " + alunos[i] + " em " + disciplinas[j] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // limpa a quebra de linha pendente
        }

        double[] mediasAlunos = new double[alunos.length];
        int indiceMaiorMedia = 0;

        System.out.println("\n--- Médias e Situação dos Alunos ---");
        for (int i = 0; i < alunos.length; i++) {
            double somaAluno = 0.0;
            for (int j = 0; j < disciplinas.length; j++) {
                somaAluno += notas[i][j];
            }
            mediasAlunos[i] = somaAluno / disciplinas.length;

            String situacao;
            if (mediasAlunos[i] >= 7.0) {
                situacao = "Aprovado";
            } else if (mediasAlunos[i] >= 5.0) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }

            if (mediasAlunos[i] > mediasAlunos[indiceMaiorMedia]) {
                indiceMaiorMedia = i;
            }

            System.out.printf("%s -> Média: %.2f | Situação: %s%n",
                    alunos[i], mediasAlunos[i], situacao);
        }

        System.out.println("\n--- Média por Disciplina ---");
        for (int j = 0; j < disciplinas.length; j++) {
            double somaDisciplina = 0.0;
            for (int i = 0; i < alunos.length; i++) {
                somaDisciplina += notas[i][j];
            }
            double mediaDisciplina = somaDisciplina / alunos.length;
            System.out.printf("%s: %.2f%n", disciplinas[j], mediaDisciplina);
        }

        System.out.printf("%nAluno com a maior média: %s (%.2f)%n",
                alunos[indiceMaiorMedia], mediasAlunos[indiceMaiorMedia]);

        scanner.close();
    }
}
