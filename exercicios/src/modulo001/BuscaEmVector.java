package modulo001;

import java.util.Random;
import java.util.Scanner;

public class BuscaEmVector {
	
	private static Scanner teclado;
	
	static int[] gerarVector(int x, int[]vector) {
		
		Random gerar = new Random();		
		int i=0;
		vector = new int[x];
		
		while(i<10) {
			vector[i] = gerar.nextInt(100);			
			i++;			
		}
		
		return vector;
	}


	static boolean buscaElemento(int x, int[]vector) {
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]==x)
				return true;			
		}
		return false;
	}
	

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Entre o tamanho do vector: "); 
		int x = teclado.nextInt();				
		int[] vector = new int[x];		
		gerarVector(x, vector);	
				
		System.out.println("Digite o elemento a procurar: ");
		int num = teclado.nextInt();
		
		if(buscaElemento(num, vector))
			System.out.println("Elemento encotrado");
		else
			System.out.println("Elemento não encotrado");
			
		
		

	}

}
