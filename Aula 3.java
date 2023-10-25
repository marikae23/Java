package aulas;

public class Aulasjava {

	public static void main(String[] args) {
		int numero = 10;
		if(eMultiploDe2(numero)) {
			System.out.println(numero + " é um multiplo de 2");
		} else {
			System.out.println(numero + " não é múltiplo de 2");
		}

	}
	
	public static boolean eMultiploDe2(int numero) {
		return numero %2 == 0;
	}

}

﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏﹏
