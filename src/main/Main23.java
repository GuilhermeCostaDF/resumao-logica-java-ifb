package main;

import java.util.Scanner;

import model.Compra;

public class Main23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Compra compra = new Compra();
		
		System.out.println("Nome do produto: ");
		compra.nomeProduto = scan.next();
		
		System.out.println("Quantidade: ");
		compra.quantidade = scan.nextInt();
		
		System.out.println("Preço Unitário: ");
		compra.precoUnitario = scan.nextFloat();
		
		compra.calcular();
	}

}
