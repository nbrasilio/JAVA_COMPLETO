package Classe;

public class ValorPadrao {
	// vari�veis de classe ou de inst�ncias s�o inicializadas de forma impl�cita (assumem valores)
	static int a;
	static boolean b;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		
		// vari�vel local tem que ser inicializada de forma expl�cita
		int b = 1;
		System.out.println(b);
		Object c = null;
		System.out.println(c);
	}

}
