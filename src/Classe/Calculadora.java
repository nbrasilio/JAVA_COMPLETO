package Classe;

public class Calculadora {
	double resultado;
	
	// recebe par�meetro e retorna resultado
	double somar(double a, double b) {
		resultado = (a + b);
		return resultado;
	}
	
	// recebe par�metro, mas n�o retorna resultado 
	void acrescentar(double a) {
		resultado += a;
	}
	// n�o recebe par�metro, mas retorna resultado
	double obterResultado() {
		return resultado;
	}
	
	// n�o recebe par�metro e n�o retorno resultado
	void limpar() {	
		resultado = 0;
	}
}
