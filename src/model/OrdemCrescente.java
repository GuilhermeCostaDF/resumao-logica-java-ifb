package model;

public class OrdemCrescente {
	public int num1;
	public int num2;
	public int num3;
	
		public void verificar() {
			
			if(num1 < num2 && num2 < num3) {
				System.out.println("N?meros lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Ordem Crescente: " + num1 +" "+ num2 +" "+ num3);			
			}else if(num1 < num3 && num3 < num2) {
				System.out.println("N?meros lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Ordem Crescente: " + num1+" " + num3+" " + num2);
			}else if(num2 < num1 && num1 < num3){
				System.out.println("N?meros lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Ordem Crescente: " + num2+" " + num1+" " + num3);
			}else if(num2 < num3 && num3 < num1) {
				System.out.println("N?meros lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Ordem Crescente: " + num2+" " + num3+" " + num1);				
			}else if(num3 < num1 && num1 < num2) {
				System.out.println("N?meros lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Ordem Crescente: " + num3+" " + num1+" " + num2);
			}else {
				System.out.println("N?meros lidos: "+ num1 +" "+ num2 +" "+num3);
				System.out.println("Ordem Crescente: " + num3+" " + num2 +" "+ num1);
			}
		}
}
