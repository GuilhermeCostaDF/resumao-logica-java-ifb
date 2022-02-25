package model;

import java.util.Arrays;

public class VetorMult {
	public int valores[];
	public int num;
	public int valoresMult[];
	
	public void calcular() {
		for(int i=0; i<valores.length;i++) {
			valoresMult[i] = valores[i] * num;
		}
		
		System.out.println("Vetor: " + Arrays.toString(valores));
		System.out.println("Vetor Multiplicado: " + Arrays.toString(valoresMult));
	}
}
