package br.com.codenation.calculadora;

public class TestaCalculadoraClt {
	
	public static void main(String[] args) {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		System.out.println(calculadora.calcularSalarioLiquido(6000.00));
		System.out.println(calculadora.calcularSalarioLiquido(4000.00));
		System.out.println(calculadora.calcularSalarioLiquido(3290.00));
		
	}
	
}
