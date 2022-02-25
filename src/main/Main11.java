package main;

import java.util.Scanner;
import model.Numero;

public class Main11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Numero num = new Numero();
		char opt = 'S';
				
		while(opt != 'N' && opt!= 'n') {
			System.out.println("Digite o número:");
			num.num = scan.nextInt();
			num.verificar();
			
			System.out.println("Deseja verificar mais? [S/N]");
			opt = scan.next().charAt(0);
		}
		
		System.out.println("Programa Encerrado!");		
	}
}
