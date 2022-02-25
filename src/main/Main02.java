package main;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h;
		int m;
		int s;
		int totalEmSegundos;
		
		System.out.println("Horas: ");
		h = scan.nextInt();
		System.out.println("Minutos: ");
		m = scan.nextInt();
		System.out.println("Segundos: ");
		s = scan.nextInt();
		
		totalEmSegundos = (h * 3600) + (m * 60) + s;

		System.out.println("Hora: "+h+":"+m+":"+s);
		System.out.println("Total em segundos: " + totalEmSegundos);

	}
}
