import javax.swing.JOptionPane;

public class calculadora2{
	
	public static void main(String[] args) {

		//Declaração de variáveis
		double numero1 = 0;
		double numero2 = 0;
		double resultado = 0;
		
		//Ler números
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o número 1"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o número 2"));
		
		//OUTPUTS
		
		// Resultado da Soma
		System.out.println("--------------- Soma ---------------");
		System.out.println();
		Imprimir(Soma(numero1, numero2), numero1, numero2, " + ");
		System.out.println();
		
		// Resultado da Subtração
		System.out.println("--------------- Subtração ---------------");
		System.out.println();
		Imprimir(Subtracao(numero1, numero2), numero1, numero2, " - ");
		System.out.println();
		
		// Resultado da Divisão
		System.out.println("--------------- Divisão ---------------");
		System.out.println();
		Imprimir(Divisao(numero1, numero2), numero1, numero2, " / ");
		System.out.println();
		
		// Resultado da Multiplicação
		System.out.println("--------------- Multiplicação ---------------");
		System.out.println();
		Imprimir(Multiplicacao(numero1, numero2), numero1, numero2, " * ");
		System.out.println();
	}
	
	public static double[] Soma(double n1, double n2) {
		//Declaração do vetor
		double v[] = {n1 + n2, Math.round(n1 + n2)};
		
		
		//Return do vetor
		return v;
	}
	
	public static double[] Divisao(double n1, double n2) {
		//Declaração do vetor
		double v[] = {n1 / n2, Math.round(n1 / n2)};
	
		//Return do vetor
		return v;
	}
	
	public static double[] Multiplicacao(double n1, double n2) {
		//Declaração do vetor
		double v[] = {n1 * n2, Math.round(n1 * n2)};
	
		//Return do vetor
		return v;
	}
	
	public static double[] Subtracao(double n1, double n2) {
		
		//Declaração do vetor
		double v[] = {n1 - n2, Math.round(n1 - n2)};
		
		
		//Return do vetor
		return v;
	}
	
	public static void Imprimir(double[] v, double n1, double n2, String operador) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%.2f " + operador + " %.2f = %.2f %n", n1, n2, v[i]);
		}
	}
	
}