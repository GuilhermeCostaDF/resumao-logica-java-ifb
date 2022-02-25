package main;

import java.util.Scanner;
import model.Triangulo;

public class Main01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		int resultado;
		
		System.out.println("Valor da base: ");
		triangulo.base = scan.nextInt();
		
		System.out.println("Valor do lado 1 : ");
		triangulo.lado1 = scan.nextInt();
		
		System.out.println("Valor do lado 2 : ");
		triangulo.lado2 = scan.nextInt();
		
		resultado = triangulo.calcularPerimetro();
		
		System.out.println("Perímetro: " + resultado);

	}
}
