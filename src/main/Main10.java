package main;

import model.Salario;

public class Main10 {

	public static void main(String[] args) {
		Salario trabalhador1 = new Salario();
	
		trabalhador1.horasTrabalhadasSem = 40;
		trabalhador1.salarioHora = 50;		

		Salario trabalhador2 = new Salario(50,50);
		
		System.out.println("Salario Trabalhador 1: " + trabalhador1.calcularSalario());
		System.out.println("Salario Trabalhador 2: " + trabalhador2.calcularSalario());
	}	
}
