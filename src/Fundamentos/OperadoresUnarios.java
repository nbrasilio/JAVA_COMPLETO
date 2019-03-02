package Fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		// Incremento e decremento
		num1++;
		System.out.println("num1:" + num1);
		--num1;
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		System.out.println(++num1 == num2--); //soma antes e subtrai depois da pergunta
		System.out.println("num2:" + num2);
		
		// Complemento bin�rio
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// Nega��o l�gica
		System.out.println(!false);
		System.out.println(!true);
		
	}

}
