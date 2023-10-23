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
    }
}
