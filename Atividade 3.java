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
