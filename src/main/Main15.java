package main;

import java.util.Scanner;
import model.Triangulo2;

public class Main15 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Triangulo2 triangulo = new Triangulo2();
		
		System.out.println("Digite o primeiro lado: ");
		triangulo.a = scan.nextInt();
		System.out.println("Digite o segundo lado: ");
		triangulo.b = scan.nextInt();
		System.out.println("Digite o terceiro lado: ");
		triangulo.c = scan.nextInt();
		
		triangulo.verificar();
	}
}
