package main;

import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigoUsuario;
		int senha;
			
		System.out.println("C�digo do usu�rio: ");
		codigoUsuario = scan.nextInt();
		while(codigoUsuario != 1234) {
			System.out.println("Usu�rio inv�lido!");
			System.out.println("C�digo do usu�rio: ");
			codigoUsuario = scan.nextInt();
		}
		
		System.out.println("Senha: ");
		senha = scan.nextInt();
		while(senha != 9999) {
			System.out.println("Senha incorreta!");
			System.out.println("Senha: ");
			senha = scan.nextInt();
		}
		System.out.println("Acesso Permitido!");
	}
}
