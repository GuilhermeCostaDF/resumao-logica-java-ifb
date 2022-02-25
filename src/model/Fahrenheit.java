package model;

public class Fahrenheit {
	public float valorF;
	
	public float valorEmCelsius() {
		return (valorF - 32) * 5/9;
	}
}
