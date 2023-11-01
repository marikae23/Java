import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de questões: ");
        int N = sc.nextInt(); // Número de questões
        sc.nextLine(); // Consumir a quebra de linha

        System.out.print("Gabarito da prova: ");
        String gabarito = sc.nextLine(); // Ler o gabarito

        System.out.print("Respostas do candidato: ");
        String respostasCandidato = sc.nextLine(); // Ler as respostas do candidato

        int acertos = 0;

        for (int i = 0; i < N; i++) {
            if (gabarito.charAt(i) == respostasCandidato.charAt(i)) {
                acertos++;
            }
        }

        System.out.println("Número de acertos do candidato: " + acertos);
    }
}