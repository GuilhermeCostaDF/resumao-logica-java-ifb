package main;

import java.util.Scanner;

import model.MediaAproveitamento;

public class Main24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MediaAproveitamento aluno1 = new MediaAproveitamento();
		
		System.out.println("Nota 1: ");
		aluno1.nota1 = scan.nextFloat();
		System.out.println("Nota 2: ");
		aluno1.nota2 = scan.nextFloat();
		System.out.println("Nota 3: ");
		aluno1.nota3 = scan.nextFloat();
		System.out.println("Média dos exercícios: ");
		aluno1.mediaExercicios = scan.nextFloat();
		
		aluno1.calcular();
	}

}
