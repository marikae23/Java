// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:

// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159).
// c) a área do trapézio que tem A e B por bases e C por altura. 
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

package aulas_java;
import java.util.Scanner;

public class aulas_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = input.nextDouble();
        
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
    
        System.out.printf("Área do triângulo: %.4f%n", areaTriangulo);
        System.out.printf("Área do círculo: %.4f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.4f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.4f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.4f%n", areaRetangulo);
        
        input.close();
    }
}

___________________________________________________
    
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D).

// Entrada:     Saída:
// 5            Diferença = -26
// 6
// 7
// 8

import java.util.Scanner;

public class CalculoDiferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os valores de A, B, C e D
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();
        System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();

        // Calcula a diferença do produto de C e D
        int diferenca = (A * B - C * D);

        // Exibe o resultado
        System.out.println("A diferença do produto de C e D é: " + diferenca);

        // Fecha o scanner
        scanner.close();
    }
}
