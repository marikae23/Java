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
// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
// A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem  (x = y = 0). 
// Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
    
import java.util.Scanner;
import java.util.Locale;

public class QuadrantePlano {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a coordenada x: ");
        double x = scanner.nextDouble();

        System.out.println("Digite a coordenada y: ");
        double y = scanner.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
        }

        scanner.close();
    }
}

