package model;

public class SomaMaiores {
	public int num1;
	public int num2;
	public int num3;
	
		public void verificar() {
			
			if(num1 > num2 && num2 > num3) {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Soma dos dois maiores: " + (num1+num2));			
			}else if(num1 > num3 && num3 > num2) {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Soma dos dois maiores: " + (num1+num3));
			}else if(num2 > num1 && num1 > num3){
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Soma dos dois maiores: " + (num2+num1));
			}else if(num2 > num3 && num3 > num1) {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Soma dos dois maiores: " + (num2+num3));				
			}else if(num3 > num1 && num1 > num2) {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Soma dos dois maiores: " + (num3+num1));
			}else {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Soma dos dois maiores: " + (num3+num2));
			}
		}
}
