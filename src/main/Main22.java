package main;

import java.util.Scanner;

import model.GrupoAmigos;

public class Main22 {

	public static void main(String[] args) {
		GrupoAmigos grupo = new GrupoAmigos();
		Scanner scan = new Scanner(System.in);

		System.out.println("Primeiro homem: ");
		grupo.homem1 = scan.nextInt();
		System.out.println("Segundo homem: ");
		grupo.homem2 = scan.nextInt();
		System.out.println("Primeira mulher: ");
		grupo.mulher1 = scan.nextInt();
		System.out.println("Segunda mulher: ");
		grupo.mulher2 = scan.nextInt();
		
		grupo.calcular();
		
	}

}
