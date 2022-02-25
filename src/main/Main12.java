package main;

import java.util.Scanner;
import model.MaiorNum;

public class Main12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MaiorNum nums = new MaiorNum();
		
		System.out.println("Primeiro Número: ");
		nums.num1 = scan.nextInt();
		System.out.println("Segundo Número: ");
		nums.num2 = scan.nextInt();
		System.out.println("Terceiro Número: ");
		nums.num3 = scan.nextInt();
		
		nums.verificar();
	}

}
