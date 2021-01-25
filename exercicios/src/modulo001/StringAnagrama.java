package modulo001;

import java.util.Scanner;

public class StringAnagrama {
	/*
	 * Determinar se uma string é anagrama da outra(permutação) EX: ROMA é anagrama
	 * de AMOR e de RAMO, mas não é de MARRON
	 */

	private static Scanner teclado;

	private static boolean verificaAnagrama(String frase1, String frase2) {
		int resul = 0;
		for (int i = 0; i < frase1.length(); i++)
			resul = resul ^ frase1.charAt(i); // (^)--> XOR

		for (int i = 0; i < frase2.length(); i++)
			resul = resul ^ frase2.charAt(i);

		return (resul == 0);
	}

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira frase: ");		
		String frase1 = teclado.nextLine();
		
		System.out.println("Digite a segunda frase: ");		
		String frase2 = teclado.next();
		

		if (verificaAnagrama(frase1, frase2))
			System.out.println("É anagrama");
		else
			System.out.println("Não é anagrama");

	}

}
