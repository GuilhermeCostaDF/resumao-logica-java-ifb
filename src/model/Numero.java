package model;

public class Numero {
	public int num;
	
	public void verificar() {
		if (num < 0) {
			System.out.println("O n�mero � negativo!");
		}
		else if(num == 0) {
			System.out.println("O n�mero � igual a 0");
		}
		else {
			System.out.println("O n�mero � positivo");
		}
	}
}
