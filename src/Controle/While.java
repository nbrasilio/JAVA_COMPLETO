package Controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		// INICIO DO LA�O
		while(nota != -1) {
			nota = scanner.nextDouble();
			
			if (nota <=10 && nota >=0) {
				somaDasNotas += nota;
				numeroDeNotas ++;
			}	
		}
		
		// FINAL DO LA�O
		
		scanner.close();
		double mediaDasNotas = somaDasNotas / numeroDeNotas;
		System.out.println("NUMERO DE NOTAS:" + numeroDeNotas);
		System.out.println("SOMA DAS NOTAS: " + somaDasNotas);
		System.out.println("MEDIA CALCULADA:" + mediaDasNotas);
		System.out.printf("A m�dia � %.2f", somaDasNotas / numeroDeNotas);
		
	}
	
	
}
