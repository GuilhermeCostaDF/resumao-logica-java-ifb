package main;

import java.util.Scanner;
import model.Custo;

public class Main04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Custo custo = new Custo();
		
		System.out.println("Valor de fábrica: ");
		custo.valorFabrica = scan.nextDouble();
		
		System.out.println("Valor final: " + custo.valorFinal());
	}

}
