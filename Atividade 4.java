package teste;

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Digite a temperatura em graus Celsius:");
            double celsius = sc.nextDouble(); 
            double fahrenheit = (9 * celsius / 5 + 32); 
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
            System.out.println("Deseja repetir (y/n)? ");
            repetir = sc.next().charAt(0); 

        } while (repetir == 'Y' || repetir == 'y'); 

        sc.close(); 
    }
}
