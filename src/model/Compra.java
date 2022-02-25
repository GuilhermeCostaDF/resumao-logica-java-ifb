package model;

public class Compra {
	public String nomeProduto;
	public int quantidade;
	public float precoUnitario;
	
	private double desconto;
	private double valor;
	private double valorFinal;
	
	public void calcular() {
		
		valor = quantidade * precoUnitario;
		
		if(quantidade <=5) {
			desconto = valor * 0.02;
		}else if(quantidade > 5 && quantidade <=10) {
			desconto = valor * 0.03;
		}else {
			desconto = valor * 0.05;
		}
		
		valorFinal = valor - desconto;
		
		System.out.println("Você comprou " +  quantidade + " " + 
							nomeProduto + "(s)");
		System.out.println("Total a pagar: R$ " + valorFinal);
	}
}
