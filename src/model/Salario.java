package model;

public class Salario {
	
	public double horasTrabalhadasSem;
	public double salarioHora, valorExtra;
	public double horaExtra;
	
	public Salario() {
		
	}
	
	public Salario(int horasTrabalhadasSem, double salarioHora) {
		this.horasTrabalhadasSem = horasTrabalhadasSem;
		this.salarioHora = salarioHora;
	}
	
	public double calcularSalario() {
		if(horasTrabalhadasSem <= 40) {
			return (horasTrabalhadasSem * salarioHora) * 4;
		}
		else {
			horaExtra = horasTrabalhadasSem - 40;
			valorExtra = (salarioHora * 0.5) * horaExtra;
			return ((horasTrabalhadasSem * salarioHora) + valorExtra )*4;
		}
	}
}
