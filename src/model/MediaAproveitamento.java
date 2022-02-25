package model;

public class MediaAproveitamento {
	public float nota1;
	public float nota2;
	public float nota3;
	public float mediaExercicios;
	private float mediaAproveitamento;
	
	public void calcular() {
		mediaAproveitamento = (nota1+nota2*2+nota3*3+mediaExercicios)/6;
		
		if(mediaAproveitamento < 6) {
			System.out.println("Conceito: D");
		}else if(mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			System.out.println("Conceito: C");
		}else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			System.out.println("Conceito: B");
		}else {
			System.out.println("Conceita: A");
		}
	}
}
