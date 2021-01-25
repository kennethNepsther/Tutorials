package modulo001;

import java.util.Scanner;

public class SomaProgressao {
private static Scanner teclado;

/*
 * Dado um numero inteiro positivo n,
 * calcular a soma dos primeiros inteiros posetivos
 * */

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int soma =0;
		int i=1;
		 
		System.out.println("Insira um numero inteiro positivo: ");
		int numero = teclado.nextInt();
		
//=============Primeira Solução============
		
		while(i<=numero) {
			soma += i;
			i++;
		}
		System.out.println("A soma é: "+soma);
		
//===============Segunda Solução===================		
				
		soma =((1 + numero)*numero)/2;
				System.out.println("A soma é: "+soma);
		
		
	}

}
