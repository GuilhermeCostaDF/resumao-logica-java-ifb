package main;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n1,n2,n3;
		float media;
		
		n1 = scan.nextFloat();
		n2 = scan.nextFloat();
		n3 = scan.nextFloat();
		
		media = (n1*2 + n2*3 + n3*5) / 10;
		
		System.out.println("Média final: " + media);

	}

}
