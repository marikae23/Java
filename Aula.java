package aula_Java;

public class Teste {

    public static void main(String[] args) {
        String product1 = "Computador";
        double price1 = 2100;
        String product2 = "Mesa de escritório";
        double price2 = 650.50;
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        System.out.printf("%s custa R$ %.2f reais%n", product1, price1);
        System.out.printf("%s custa R$ %.2f reais%n", product2, price2);
        System.out.printf("Registro: %d anos, código: %d e com gênero %d", age, code, gender);
        System.out.print("Medida com oito casas decimais:" + measure + "\n");
		System.out.printf("Cercado (três casas decimais): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f", measure);
    }
}


package aula_Java;
import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int func;	
    	double hours;
    	double hour_pay;
    	double paycheck;
    	
    	System.out.println("Quantos funcionários? ");
    	func sc1 = int.next();
    	
    	
    }
}
