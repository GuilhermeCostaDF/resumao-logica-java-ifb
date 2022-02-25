package main;

import model.Maior;

public class Main08 {

	public static void main(String[] args) {
		
		Maior primeiraVerificacao = new Maior(4,7);
		Maior segundaVerificacao = new Maior(11,6);
		Maior terceiraVerificacao = new Maior(200,400);
		
		primeiraVerificacao.verificar();
		segundaVerificacao.verificar();
		terceiraVerificacao.verificar();
	}

}
