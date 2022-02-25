package model;

public class Contagem {
	public int valor;
	
	public void retornar() {
		for(int i=1; i<=valor;i++) {
			System.out.println(i);
		}
	}
}
