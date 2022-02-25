package main;

import java.util.Scanner;

import model.ContagemMod;

public class Main21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContagemMod num = new ContagemMod();
		System.out.println("Digite um valor: ");
		num.valor = scan.nextInt();
		while(num.valor <= 0) {
			System.out.println("Digite um valor: ");
			num.valor = scan.nextInt();
		}
		num.retornar();
	}
}
