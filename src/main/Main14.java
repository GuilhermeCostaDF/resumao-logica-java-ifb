package main;

import java.util.Scanner;
import model.OrdemCrescente;

public class Main14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OrdemCrescente nums = new OrdemCrescente();
		
		System.out.println("Primeiro Número: ");
		nums.num1 = scan.nextInt();
		System.out.println("Segundo Número: ");
		nums.num2 = scan.nextInt();
		System.out.println("Terceiro Número: ");
		nums.num3 = scan.nextInt();
		
		nums.verificar();
	}
}