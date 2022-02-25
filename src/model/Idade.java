package model;

public class Idade {
	public int idade;
	
	public void verificar(){
		if(idade >= 18) {
			System.out.println("Maior de 18 anos");
		}
		else {
			System.out.println("Menor de 18 anos");
		}
	}
}
