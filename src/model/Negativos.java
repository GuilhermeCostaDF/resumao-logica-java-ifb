package model;

public class Negativos {
	public int numeros[];
	public int contador;
	
	public void verificar() {
		contador = 0;
		for(int i=0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				contador++;
			}
		}
		
		if(contador == 0) {
			System.out.println("N�o h� n�meros negativos!");
		}else if(contador == 1){
			System.out.println("Existe 1 n�mero negativo!");
		}else {
			System.out.println("Existem "+ contador + " n�meros negativos!");
		}
	}
}
