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
    	// importamos a classe Scanner para poder ler dados do teclado. Criação de uma instância do Scanner:
        Scanner input = new Scanner(System.in);
        
        // Input para ler os valores de ponto flutuante. Leitura dos valores de A, B e C
        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = input.nextDouble();
        
        // System.out.print para solicitar ao usuário que insira os valores e input.nextDouble() para ler esses valores como números de ponto flutuante e armazená-los nas variáveis. Cálculo das áreas
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        
        // Exibição das áreas calculadas
        System.out.printf("Área do triângulo: %.4f%n", areaTriangulo);
        System.out.printf("Área do círculo: %.4f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.4f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.4f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.4f%n", areaRetangulo);
        
        input.close();
    }
}

