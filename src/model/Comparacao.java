package model;

public class Comparacao{
	public int vetor1[];
	public int vetor2[];
	private int qtde=0;
	
	
	public void verificar() {
		for(int i=0; i<vetor1.length;i++) {
			if(vetor1[i] == vetor2[i]) {
				qtde++;
			}
		}
		if(qtde == 0) {
			System.out.println("Os vetores n�o tem valores iguais na mesma posi��o.");
		}else if(qtde == 1) {
			System.out.println("Os vetores tem "+qtde+" valor igual na mesma posi��o.");
		}else {
			System.out.println("Os vetores tem "+qtde+" valores iguais nas mesmas posi��es.");
		}
		
	}
}
