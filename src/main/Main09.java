package main;

import model.Ordem;

public class Main09 {

	public static void main(String[] args) {
		Ordem primeiraVerificacao = new Ordem(4,7);
		Ordem segundaVerificacao = new Ordem(11,6);
		Ordem terceiraVerificacao = new Ordem(200,400);
		
		primeiraVerificacao.verificar();
		segundaVerificacao.verificar();
		terceiraVerificacao.verificar();

	}

}
