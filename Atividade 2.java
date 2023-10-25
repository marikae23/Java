// Escreva um algoritmo que solicita ao usuário dois operandos e um código de operação 
// (1 - Soma, 2 - Subtração, 3 - Divisão ou 4 - Multiplicação) e realiza a operação correspondente sobre os operandos fornecidos pelo usuário:

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro operando: ");
        double operando1 = scanner.nextDouble();

        System.out.println("Digite o segundo operando: ");
        double operando2 = scanner.nextDouble();

        System.out.println("Escolha a operação (1 - Soma, 2 - Subtração, 3 - Divisão, 4 - Multiplicação): ");
        int codigoOperacao = scanner.nextInt();

        double resultado = 0.0;

        switch (codigoOperacao) {
            case 1:
                resultado = operando1 + operando2;
                System.out.println("A soma é: " + resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                System.out.println("A subtração é: " + resultado);
                break;
            case 3:
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    System.out.println("A divisão é: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            case 4:
                resultado = operando1 * operando2;
                System.out.println("A multiplicação é: " + resultado);
                break;
            default:
                System.out.println("Código de operação inválido.");
        }

        scanner.close();
    }
}

___________________________________________________
