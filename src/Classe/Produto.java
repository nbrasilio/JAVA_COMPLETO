package Classe;

public class Produto {
	// vari�veis de inst�ncia (objeto)
	String nome;
	double preco;

	// vari�vel da classe
	static double desconto;
	
	Produto() {
	}

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;		
	}
	
	double precoComDesconto() {
		return preco - (preco * desconto);	
	}
}