package model;

public class Triangulo2 {
	public int a;
	public int b;
	public int c;
	
	public void verificar() {
		if(a > b+c || b > a+c || c > a+b) {
			System.out.println("Os valores NÃO formam um triangulo!");
		}else {
			System.out.println("Os valores formam um triangulo!");
		}
	}
}
