package modulo001;

import java.util.Scanner;

public class Leitura_Imprensao {
/*
 * Programa que lê o nome idade e cidade nascimento do usuario,
 * em seguida imprima-os.
 * */

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in); 
		
		System.out.println("Insira o teu nome:");
		String nome = teclado.nextLine();
		
		System.out.println("Insira o nome da cidade onde nasceste::");
		String CidadeDeNascimento = teclado.nextLine();
		
		System.out.println("Insira a tua Idade:");
		int idade = teclado.nextInt();		
		
		
		//System.out.println("o seu nome é "+nome+" estas com "+idade+" anos "+"nasceste em "+CidadeDeNascimento);		
		System.out.printf("o seu nome é %s estas com %d vives em %s ",nome,idade,CidadeDeNascimento);
		

	}

}
