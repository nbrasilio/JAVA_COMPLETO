package Controle;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
			
		// INICIO DO LA�O
		for (int indice = 0; indice < 3; indice++) {
			nota = scanner.nextDouble();
			somaDasNotas += nota;	
		}
		//FINAL DO LA�O
		
			scanner.close();
			double mediaDasNotas = somaDasNotas / 3;
			System.out.println("NUMERO DE NOTAS:" + 3);
			System.out.println("SOMA DAS NOTAS: " + somaDasNotas);
			System.out.printf("MEDIA CALCULADA: %.2f\n", mediaDasNotas);
			System.out.printf("A m�dia � %.2f", somaDasNotas / 3);

	}

}
