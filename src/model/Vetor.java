package model;

public class Vetor {
	public int valores[];
	public int numVerificador;
	private int qtde=0;
	
	public void verificar() {
		for(int i=0; i< valores.length;i++) {
			if(valores[i] == numVerificador) {
				qtde++;
			}
		}
		System.out.println("O valor "+ numVerificador +" aparece "+ qtde + " vezes.");
	}
}
