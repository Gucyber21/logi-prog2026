import java.util.Scanner;

public class JogoDaVelha {

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  ---------");
            }
        }
        System.out.println();
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        char jogadorAtual = 'X';
        boolean jogoTerminou = false;

        while (!jogoTerminou) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Vez do jogador " + jogadorAtual);
            System.out.print("Digite linha (1 a 3) e coluna (1 a 3): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite apenas números inteiros de 1 a 3.");
                scanner.next();
                continue;
            }
            int linha = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite apenas números inteiros de 1 a 3.");
                scanner.next();
                continue;
            }
            int coluna = scanner.nextInt();

            if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
                System.out.println("Posição fora do tabuleiro. Escolha valores entre 1 e 3.");
                continue;
            }

            int idxLinha = linha - 1;
            int idxColuna = coluna - 1;

            if (tabuleiro[idxLinha][idxColuna] != ' ') {
                System.out.println("Posição já ocupada. Tente novamente.");
                continue;
            }

            tabuleiro[idxLinha][idxColuna] = jogadorAtual;

            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoTerminou = true;
            } else if (tabuleiroCheio(tabuleiro)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Empate!");
                jogoTerminou = true;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }
}
