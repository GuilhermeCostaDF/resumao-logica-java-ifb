package model;

public class MediaProva {
	public float nota1;
	public float nota2;
	private float media;
	
	public void calcular() {
		media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
	}
}
