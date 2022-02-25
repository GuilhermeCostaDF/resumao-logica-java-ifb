package main;

import java.util.Scanner;
import model.SomaMaiores;

public class Main13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SomaMaiores nums = new SomaMaiores();
		
		System.out.println("Primeiro Número: ");
		nums.num1 = scan.nextInt();
		System.out.println("Segundo Número: ");
		nums.num2 = scan.nextInt();
		System.out.println("Terceiro Número: ");
		nums.num3 = scan.nextInt();
		
		nums.verificar();
	}
}
