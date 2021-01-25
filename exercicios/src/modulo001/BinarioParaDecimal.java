package modulo001;

import java.util.Scanner;

public class BinarioParaDecimal {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int potencia = 0;
		int decimal = 0;
		System.out.println("Insira um numero binario");
		String numeroBinario = teclado.next();
		
		for (int i = numeroBinario.length()-1; i>=0; i--) {
			decimal += Math.pow(2, potencia) * Character.getNumericValue(numeroBinario.charAt(i));
			potencia ++;
			
		}
		System.out.println("Decimal= "+decimal);
	}

}
