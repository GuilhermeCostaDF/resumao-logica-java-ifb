package main;

import java.util.Scanner;

import model.Idade;

public class Main03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Idade idade = new Idade();
		
		System.out.println("Qual a sua idade?");
		idade.idade = scan.nextInt();
		idade.verificar();
		
	}

}
