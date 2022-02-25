package model;

public class NumerosIguais {
	public int valores[];
	
	public void verificar() {
		for(int i=0; i < 50;i++) {
			for(int j=i+1; j<50;j++) {
				if(valores[i] == valores[j]) {
					System.out.println("Números repetidos na posição " + (i+1) + " e " + (j+1));
				}
			}
		}
	}
}

