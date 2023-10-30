package teste;

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Digite a temperatura em graus Celsius:");
            double celsius = sc.nextDouble(); // Corrected the variable name
            double fahrenheit = (9 * celsius / 5 + 32); // Corrected the formula (changed 52 to 32)
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
            System.out.println("Deseja repetir (y/n)? ");
            repetir = sc.next().charAt(0); // Corrected the syntax for getting the first character

        } while (repetir == 'Y' || repetir == 'y'); // Corrected the condition

        sc.close(); // Corrected the method name and added a semicolon at the end
    }
}