import java.uitl.Scanner;
public class ManipularMatriz {
    public static boolean existe(int[][] m, int numero){
        for(int i=0; i < m.length; i++) {
            for(int j=0, j < m[i].length; j++) {
                if(m[i][j] == numero){
                    return true;
                }
            }
        }
        return false;
    }

    public static void substituir(int[][] m, int antigo, int novo){
        for(int i=0; i < m.length; i++){
            for(int j=0; i < m[i].length; j++){
                if(m[i][j] == antigo){
                    m[i][j] == novo;
                    return;
                }
            }
        }
    }
    public static void imprimirMatriz(int[][] m){
        for(int i=0; i < m.length; i++){
            for(int j=0; i < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args);
        int[][] matriz = {
            {10, 20}
            {30, 40}
            {50, 60}
            {70, 80}
        };
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número para buscar: ");
    int numeroBuscado = scanner.nextInt();

    if(existe(matriz, numeroBuscado)){
        System.out.print("Número encontrado! Digite o novo valor:");
        int novoValor = scanner.nextInt();

        substituir(matriz, numeroBuscado, novoValor);

        System.out.println("\nMatriz atualizada:");
        imprimirMatriz(matriz);
    }else{
        System.out.println("o número "+ numeroBuscado + "não existe na matriz.");
    }
    scanner.close();
}
