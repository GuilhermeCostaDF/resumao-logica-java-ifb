package model;

public class Intervalo {
	public int numeros[];
	public int contador;
	
	public void verificar() {
		contador=0;
		
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i] < 10 || numeros[i] > 20) {
				contador++;
			}
		}
		
		System.out.println("Números dentro do intervalo [10,20]: " + (10-contador));
		System.out.println("Números fora do intervalo [10,20]: " + contador);
	}
}
