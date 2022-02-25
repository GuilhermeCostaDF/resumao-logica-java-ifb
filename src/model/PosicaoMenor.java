package model;

public class PosicaoMenor {
	public int valores[];
	private int min;
	private int pos;
	
	public void verificar() {
		
		min = valores[0];
		
		for(int i=0; i < valores.length; i++) {
			if(valores[i] < min) {
				min = valores[i];
				pos = i+1;
			}
		}
		
		System.out.println("Maior valor: " + min + "\t Posição: " + pos);
	}
}
