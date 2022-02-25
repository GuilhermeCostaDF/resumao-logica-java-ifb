package main;

import java.util.Scanner;
import model.Negativos;

public class Main26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Negativos array = new Negativos();
		array.numeros = new int[10];
		
		for(int i=0; i<10;i++) {
			System.out.println((i+1)+"º Número: ");
			array.numeros[i] = scan.nextInt();
		}
		
		array.verificar();
	}
}
