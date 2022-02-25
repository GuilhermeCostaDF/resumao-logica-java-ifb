package model;

public class Custo {
	public double valorFabrica;
	
	public double valorFinal() {
		return valorFabrica + (valorFabrica * 0.28) + (valorFabrica * 0.45);
	}
}
