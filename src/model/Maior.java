package model;

public class Maior {
	public int n1;
	public int n2;

	public Maior(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void verificar() {
		if(n1>n2) {
			System.out.println("Maior: " + n1);
		}
		else {
			System.out.println("Maior: " + n2);
		}
	}
}
