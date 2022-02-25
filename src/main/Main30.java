package main;

import java.util.Arrays;
import java.util.Scanner;

import model.PosicaoMenor;

public class Main30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PosicaoMenor vetor = new PosicaoMenor();
		vetor.valores = new int[20];
		
		for(int i=0;i<vetor.valores.length;i++) {
			do {
				System.out.println((i+1)+"º Número: ");
				vetor.valores[i] = scan.nextInt();
			}while(vetor.valores[i]<=0);
		}
		
		System.out.println("Vetor: " + Arrays.toString(vetor.valores));
		vetor.verificar();	
	}

}
