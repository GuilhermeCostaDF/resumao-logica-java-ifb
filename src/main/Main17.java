package main;

import java.util.Random;
import java.util.Arrays; 
import model.NumerosIguais;

public class Main17 {

	public static void main(String[] args) {
		Random gerador = new Random();
		NumerosIguais vetor = new NumerosIguais();
		
		vetor.valores = new int[50];
				
		for(int i=0; i<50; i++) {
			vetor.valores[i] = gerador.nextInt(100);
			}
		System.out.println("Vetor: " + Arrays.toString(vetor.valores));
		vetor.verificar();	
	}
}
