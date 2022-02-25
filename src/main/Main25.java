package main;

import java.util.Scanner;

import model.MediaProva;

public class Main25 {

	public static void main(String[] args) {
		MediaProva aluno1 = new MediaProva();
		Scanner scan = new Scanner(System.in);
		char resp;
		
		do {
			System.out.println("Nota 1: ");
			aluno1.nota1 = scan.nextFloat();
			while(aluno1.nota1 < 0 || aluno1.nota1 > 10) {
				System.out.println("Apenas valores entre 0 e 10");
				System.out.println("Nota 1: ");
				aluno1.nota1 = scan.nextFloat();
			}
			
			System.out.println("Nota 2: ");
			aluno1.nota2 = scan.nextFloat();
			while(aluno1.nota2 < 0 || aluno1.nota2 > 10) {
				System.out.println("Apenas valores entre 0 e 10");
				System.out.println("Nota 2: ");
				aluno1.nota2 = scan.nextFloat();
			}
			
			aluno1.calcular();
			
			System.out.println("NOVO CÁLCULO (S/N)");
			resp = scan.next().charAt(0);
			
		}while (resp != 'n' && resp != 'N');

	}
}
