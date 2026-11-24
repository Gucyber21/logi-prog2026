import java.util.Scanner;
public class MaiorMenorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        System.out.println("Digite os 12 números inteiros da matriz 4x3:");
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                int valor = matriz[linha][coluna];
                if(valor > maior){
                    maior = valor;
                }
            }
        }
        System.out.println("Maior elemento:" + maior);
        System.out.println("Menor elemento:" + menor);
        scanner.close();
    }
}
