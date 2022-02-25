package model;

public class MaxEMedia {
	public double valores[];
	private double max;
	private double sum;
	private double media;
	
	public void verificar() {
		
		max = valores[0];
		sum = 0;
		
		for(int i=0; i<valores.length;i++) {
			if(valores[i] >= max) {
				max = valores[i];
			}
			sum = sum + valores[i];
		}
		
		media = sum / valores.length;
		
		System.out.println("Maior valor: " + max);
		System.out.println("Média dos valores: " + media);
	}
}
