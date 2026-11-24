import java.util.Scanner;

public class MatrizSimetrica {

    public static boolean ehSimetrica(int[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }
        int linhas = m.length;
        for (int l = 0; l < linhas; l++) {
            if (m[l] == null || m[l].length != linhas) {
                return false;
            }
            for (int c = l + 1; c < linhas; c++) {
                if (m[l][c] != m[c][l]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrar(int[][] m) {
        if (m == null) {
            return;
        }
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                System.out.print(m[l][c]);
                if (c < m[l].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os 16 elementos da matriz 4x4:");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                matriz[l][c] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz informada:");
        mostrar(matriz);

        if (ehSimetrica(matriz)) {
            System.out.println("\nA matriz é simétrica.");
        } else {
            System.out.println("\nA matriz não é simétrica.");
        }

        scanner.close();
    }
}
