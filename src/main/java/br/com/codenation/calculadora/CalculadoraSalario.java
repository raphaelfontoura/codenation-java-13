package br.com.codenation.calculadora;


public class CalculadoraSalario {
	
	double salarioMinimo = 1039.00;

	public long calcularSalarioLiquido(double salarioBase) {
		
		if (salarioBase < salarioMinimo) {
			return Math.round(0.0);
		}
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
		return Math.round(calcularIrrf(salarioBase));
	}
	
	
	private double calcularInss(double salarioBase) {
		if (salarioBase <= 1500.00)
			return salarioBase - (salarioBase * 0.08);
		else if (salarioBase <= 4000.00)
			return salarioBase - (salarioBase * 0.09);
		else
			return salarioBase - (salarioBase * 0.11);
	}
	
	private double calcularIrrf(double salarioBase) {
		
		double salarioInss = calcularInss(salarioBase);
		
		if (salarioBase <= 3000.00) {
			return salarioInss;
		} else if (salarioBase <= 6000.00) {
			return salarioInss - (salarioInss * 0.075);
		} else {
			return salarioInss - (salarioInss * 0.15);
		}
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/