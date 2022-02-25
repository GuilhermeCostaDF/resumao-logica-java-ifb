package main;

import java.util.Scanner;

import model.Macas;

public class Main07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Macas maca = new Macas();
		
		System.out.println("Quantidade de maçãs: ");
		maca.unidadesCompradas = scan.nextInt();

		maca.calcular();
	}

}
