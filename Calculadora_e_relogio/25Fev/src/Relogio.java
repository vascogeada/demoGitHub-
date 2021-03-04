import javax.swing.JOptionPane;

public class Relogio{
	
	public static void main(String[] args) {

		//Declaração de variáveis

		
		int segundos = 59;
		int minutos = 55;
		int horas = 1;
		
		int[] horario = {horas, minutos, segundos};
		
		
		//OUTPUTS
		
		// Resultado da Soma
		System.out.println("--------------- Horário ---------------");	
		System.out.println("Horas, Minutos, Segundos = " + horas + ":" + minutos +  ":" + segundos);
		System.out.println("");
		
		System.out.println("--------------- Avançar 1 segundo ---------------");		
		
		horario = avancarSegundos(segundos, minutos, horas, horario);
		imprimir(horario);

		
		System.out.println("--------------- Avançar 1 Minuto ---------------");

		horario = avancarSegundos(segundos, minutos, horas, horario);
		imprimir(horario);

		
		System.out.println("--------------- Avançar 1 Hora ---------------");
		
		horario = avancarHoras(segundos, minutos, horas, horario);
		imprimir(horario);

		System.out.println("--------------- Recuar 1 Segundo ---------------");
		
		horario = recuarSegundos(horas, minutos, segundos, horario);
		imprimir(horario);
		
		System.out.println("--------------- Recuar 1 Minuto ---------------");
		
		horario = recuarMinutos(horas, minutos, segundos, horario);
		imprimir(horario);
		
		System.out.println("--------------- Recuar 1 Hora ---------------");
		
		horario = recuarHoras(horas, minutos, segundos, horario);
		imprimir(horario);
		
		//LÓGICA
	}
	
	
	public static void imprimir(int[] horario) {
		
		System.out.print("Horas, Minutos, Segundos = " );
		for (int i = 0; i < horario.length; i++) {
			if(i == 2) {
				System.out.print(horario[i]);
			}else {
				System.out.print(horario[i] + ":");
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static int[] avancarSegundos (int horas, int minutos, int segundos, int[] horario) {

		
		if(horario[2] == 59) {
			horario = avancarMinutos(segundos, minutos, horas, horario);
			horario[2] = 0;
		} else {
			horario[2]++;
		}
		
		return horario;
	}
	
	
	
	public static int[] avancarMinutos(int horas, int minutos, int segundos, int[] horario) {
		
		if(horario[1] == 59) {
			horario = avancarHoras(segundos, minutos, horas, horario);
			horario[1] = 0;
		} else {
			horario[1]++;
		}
			
		return horario;
	}
	
	public static int[] avancarHoras(int segundos, int minutos, int horas, int[] horario) {
		
		if(horario[0] >= 24) {
			for (int i = 0; i < horario.length; i++) {
				horario[i] = 0;
			}
		} else {
			horario[0]++;
		}
		
		return horario;
	}
	
	public static int[] recuarSegundos (int horas, int minutos, int segundos, int[] horario) {

		
		if(horario[2] <= 0) {
			horario = recuarHoras(segundos, minutos, horas, horario);
			horario[2] = 59;
		} else {
			horario[2]--;
		}
		
		return horario;
	}
	
	public static int[] recuarMinutos(int horas, int minutos, int segundos, int[] horario) {
		
		if(horario[1] <= 0) {
			horario = recuarSegundos(segundos, minutos, horas, horario);
			horario[1] = 0;
		} else {
			horario[1]--;
		}
			
		return horario;
	}
	
	public static int[] recuarHoras(int segundos, int minutos, int horas, int[] horario) {
		
		if(horario[0] <= 0) {
			horario = recuarMinutos(segundos, minutos, horas, horario);
			horario[0] = 0;
		} else {
			horario[0]--;
		}
		
		return horario;
	}
	
}