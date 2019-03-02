package Colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
	
	public static void main(String[] args) {
//		Set<String> aprovados = new HashSet<>(); N�O RESPEITA A ORDEM DE INSER��O
//		Set<String> aprovados = new LinkedHashSet<>(); //RESPEITA A ORDEM DE INSE��O
		Set<String> aprovados = new TreeSet<>(); //ORDEM DO TIPO ATRIBUTO (ALFAB�TICA, NUM�RICA)
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
			
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}

}
