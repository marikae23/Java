package teste;
import java.util.Locale;
import java.util.Scanner;

public class aula {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite o número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz digitada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
            
            sc.close();
           
        }
    }
}
