package api;

public class ExplorandoString {
	
	public static void main(String[] args) {
		String nome = new String ("Leonardo");
		nome = "Leonardo";
		
		// Alguns m�todos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("leonardo"));
		System.out.println(nome.startsWith("Leo"));
		System.out.println(nome.endsWith("rdo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" � legal!").concat("!"));
		
		// A String � imut�vel
		System.out.println(nome);
		
		// Para alterar � necess�rio atribuir outro valor explicitamente
		nome = nome.toUpperCase().substring(0,3).concat(" � legal!!");
		System.out.println(nome);
		
	}

}
