package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import model.Vetor;

public class Main18 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner scan = new Scanner(System.in);
		Vetor vetor = new Vetor();
		vetor.valores = new int[30];
		
		for(int i=0; i<30;i++) {
			vetor.valores[i] = gerador.nextInt(50);
		}
		
		System.out.println("Digite um número para verificar [Entre 0 e 50]: ");
		vetor.numVerificador = scan.nextInt();
		
		System.out.println("Vetor: " + Arrays.toString(vetor.valores));
		vetor.verificar();
		scan.close();
	}
}
