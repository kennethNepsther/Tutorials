package modulo001;

import java.util.Scanner;

public class SomaAlgarismosRecurssivo {
	
	public static int somaAlgarismo(int num) {
		if(num < 10)
			return num;
		else
			return somaAlgarismo(num/10)+num % 10;
	}

	private static Scanner teclado;
	

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);

		System.out.println("Insira o numero");
		int num = teclado.nextInt();
		
		int soma = somaAlgarismo(num);

		System.out.println("A soma dos algarismo é: "+soma);

	}

}
