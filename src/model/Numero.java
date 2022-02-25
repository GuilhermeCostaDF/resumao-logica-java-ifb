package model;

public class Numero {
	public int num;
	
	public void verificar() {
		if (num < 0) {
			System.out.println("O número é negativo!");
		}
		else if(num == 0) {
			System.out.println("O número é igual a 0");
		}
		else {
			System.out.println("O número é positivo");
		}
	}
}
