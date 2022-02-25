package main;

import java.util.Arrays;
import java.util.Random;

import model.Comparacao;

public class Main19 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		Comparacao vetor = new Comparacao();
		vetor.vetor1 = new int[15];
		vetor.vetor2 = new int[15];
		
		//Laço para preencher os vetores
		for(int i=0; i< vetor.vetor1.length;i++) {
			vetor.vetor1[i] = gerador.nextInt(10);
			vetor.vetor2[i] = gerador.nextInt(10);
		}
		System.out.println("Primeiro vetor: " + Arrays.toString(vetor.vetor1));
		System.out.println("Segundo vetor: " + Arrays.toString(vetor.vetor2));
		vetor.verificar();
	}
}
