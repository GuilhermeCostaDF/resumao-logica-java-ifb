package model;

public class Ordem {
	public int n1;
	public int n2;

	public Ordem(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void verificar() {
		if(n1<n2) {
			System.out.println(n1 + " " + n2);
		}
		else {
			System.out.println(n2 + " " + n1);
		}
	}
}
