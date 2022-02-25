package model;

public class GrupoAmigos {
	public int homem1;
	public int homem2;
	public int mulher1;
	public int mulher2;
	
	public void calcular() {
		if(homem1 > homem2 && mulher1 > mulher2) {
			System.out.println("Soma: " + (homem1 + mulher2));
			System.out.println("Produto: " + (homem2 * mulher1));
		}else if (homem1 > homem2 && mulher1 < mulher2){
			System.out.println("Soma: " + (homem1 + mulher1));
			System.out.println("Produto: " + (homem2 * mulher2));
		}else if(homem2 > homem1 && mulher1 > mulher2) {
			System.out.println("Soma: " + (homem2 + mulher2));
			System.out.println("Produto: " + (homem1 * mulher1));
		}else {
			System.out.println("Soma: " + (homem1 + mulher2));
			System.out.println("Produto: " + (homem2 * mulher1));
		}
	}
}
