package model;

public class Macas {
	public int unidadesCompradas;
	
	public void calcular() {
		if (unidadesCompradas < 12) {
			System.out.println("Valor da compra: R$" + unidadesCompradas*1.30);
		}
		else {
			System.out.println("Valor da compra: R$" + unidadesCompradas*1.00);
		}
	}
}
