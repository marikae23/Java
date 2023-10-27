import java.util.Scanner;

public class CalculadoraNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("a) A soma dos números: " + somarNumeros(numero1, numero2));
        System.out.println("b) O produto do primeiro número pelo quadrado do segundo: " + produtoQuadrado(numero1, numero2));
        System.out.println("c) O quadrado do primeiro número: " + quadrado(numero1));
        System.out.println("d) O módulo do primeiro número: " + modulo(numero1));
    }
    public static double somarNumeros(double num1, double num2) {
        return num1 + num2;
    }
    public static double produtoQuadrado(double num1, double num2) {
        return num1 * (num2 * num2);
    }
    public static double quadrado(double num) {
        return num * num;
    }
    public static double modulo(double num) {
        return Math.abs(num);
    }
}

___________________________________________________

import java.util.Scanner;

public class RemoverVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase ou palavra: ");
        String input = scanner.nextLine();
        String resultado = removerVogais(input);
        System.out.println("Resultado após remover as vogais: " + resultado);
    }

    public static String removerVogais(String input) {
        String resultado = input.replaceAll("[aeiouAEIOU]", "");
        return resultado;
    }
}

___________________________________________________

public class CalculaMedia {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;
        char tipoMedia = 'A';

        double media = calcularMedia(nota1, nota2, nota3, tipoMedia);

        System.out.println("A média do aluno é: " + media);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, char tipoMedia) {
        if (tipoMedia == 'A' || tipoMedia == 'a') {
        } else if (tipoMedia == 'P' || tipoMedia == 'p') {
            return (5 * nota1 + 3 * nota2 + 2 * nota3) / (5 + 3 + 2);
        } else {
            System.out.println("Tipo de média inválido. Use 'A' para média aritmética ou 'P' para média ponderada.");
            return 0.0;
        }
    }
}
