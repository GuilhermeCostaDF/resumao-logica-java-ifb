package main;

import java.util.Scanner;
import model.Fahrenheit;

public class Main05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Fahrenheit fahrenheit = new Fahrenheit();
		
		System.out.println("Digite o valor em Fahrenheit: ");
		fahrenheit.valorF = scan.nextFloat();
		
		System.out.println("Celsius: " + fahrenheit.valorEmCelsius());
	}

}
