import javax.swing.JOptionPane;

public class calculadora{
	
	public static void main(String[] args) {
		//Declaração de variáveis
		double numero1 = 0;
		double numero2 = 0;
		
		//Ler números
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o número 1"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o número 2"));
		
		//OUTPUTS
	
		// Resultado da Soma
		System.out.println("--------------- Soma ---------------");
		System.out.println();
		Imprimir(numero1, numero2, Soma(numero1, numero2), "+" );
		System.out.println();
		
		// Resultado da Subtração
		System.out.println("--------------- Subtração ---------------");
		System.out.println();
		Imprimir(numero1, numero2, Subtracao(numero1, numero2), "-" );
		System.out.println();
		
		// Resultado da Divisão
		System.out.println("--------------- Divisão ---------------");
		System.out.println();
		Imprimir( numero1, numero2, Divisao(numero1, numero2), "/" );
		System.out.println();
		
		// Resultado da Multiplicação
		System.out.println("--------------- Multiplicação ---------------");
		System.out.println();
		Imprimir(numero1, numero2, Multiplicacao(numero1, numero2), "*" );
		System.out.println();
	}
	
	public static double Soma(double n1, double n2) {
		
		return n1 + n2;
	}
	
	public static double Divisao(double n1, double n2) {
		
		return n1 / n2;
	}
	
	public static double Multiplicacao(double n1, double n2) {
		
		return n1 * n2;
	}
	
	public static double Subtracao(double n1, double n2) {
		
		return n1 - n2;
	}
	
	public static void Imprimir( double numero1, double numero2, double resultado, String operador) {
		
		System.out.printf("%.2f " + operador + " %.2f = %.2f %n", numero1, numero2, resultado);
	}
	
}