package main;

import java.util.Scanner;
import model.VetorMult;

public class Main32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VetorMult vetor = new VetorMult();
		vetor.valores = new int[10];
		vetor.valoresMult = new int[10];
		
		for(int i=0;i<vetor.valores.length;i++) {
			System.out.println((i+1)+"º Número: ");
			vetor.valores[i] = scan.nextInt();
		}
		
		System.out.println("Número para multiplicar: ");
		vetor.num = scan.nextInt();
		
		vetor.calcular();
	}

}
