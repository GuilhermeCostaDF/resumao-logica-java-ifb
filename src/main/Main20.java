package main;

import java.util.Scanner;

import model.Contagem;

public class Main20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Contagem num = new Contagem();
		
		System.out.println("Digite um valor: ");
		num.valor = scan.nextInt();

		num.retornar();
	}
}
