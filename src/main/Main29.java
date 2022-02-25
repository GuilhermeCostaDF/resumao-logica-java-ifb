package main;

import java.util.Arrays;
import java.util.Scanner;

import model.MaxEMedia;

public class Main29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MaxEMedia vetor = new MaxEMedia();
		int qtd;
		
		System.out.println("Quantidade de valores a serem lidos: ");
		qtd = scan.nextInt();
		
		vetor.valores = new double[qtd];
		for(int i=0; i<vetor.valores.length;i++) {
			System.out.println((i+1) +"º Número: ");
			vetor.valores[i] = scan.nextDouble();
		}
		
		System.out.println("Vetor: " + Arrays.toString(vetor.valores));
		vetor.verificar();		
	}

}
