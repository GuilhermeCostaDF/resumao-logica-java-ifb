package model;

public class MinMax {
	public int valores[];
	private int min;
	private int max;
	
	public void verificar() {
		
		min=valores[0];
		max=valores[0];
		
		for(int i=1; i<valores.length;i++) {
			if(valores[i] < min ) {
				min = valores[i];
			}
			if(valores[i] > max) {
				max = valores[i];
			}
		}

		System.out.println("Menor valor: " + min);
		System.out.println("Maior valor: " + max);
	}
}
