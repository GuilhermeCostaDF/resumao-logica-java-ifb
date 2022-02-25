package main;

import java.util.Arrays;
import java.util.Random;

import model.MinMax;

public class Main28 {

	public static void main(String[] args) {
		Random gerador = new Random();
		MinMax vetor = new MinMax();
		vetor.valores = new int[100];
		
		for(int i=0; i < 100; i++) {
			vetor.valores[i] = gerador.nextInt(1001); // gera números aleatórios entre 0 e 1000;
		}
	

		System.out.println("Vetor: " + Arrays.toString(vetor.valores));
		vetor.verificar();
	}
}
