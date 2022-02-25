package model;

public class MaiorNum {
	public int num1;
	public int num2;
	public int num3;
	
		public void verificar() {
			
			if(num1 > num2 && num2 > num3) {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Maior: " + num1);			
			}else if(num2 > num1 && num1 > num3) {
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Maior: " + num2);
			}else{
				System.out.println("Números lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Maior: " + num3);
			}
		}
}
