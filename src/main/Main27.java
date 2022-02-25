package main;

import java.util.Scanner;
import model.Intervalo;

public class Main27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Intervalo array = new Intervalo();
		array.numeros = new int[10];
		
		for(int i=0; i<10;i++) {
			System.out.println((i+1)+"º Número: ");
			array.numeros[i] = scan.nextInt();
		}
		
		array.verificar();
	}
}
