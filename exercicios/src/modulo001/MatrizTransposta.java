package modulo001;

import java.util.Random;

public class MatrizTransposta {
	
	static int[][] criaMatriz(int linha, int coluna) {
		Random gerador = new Random();

		int[][] matriz = new int[linha][coluna];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = gerador.nextInt(100);

			}
		}

		return matriz;
	}

	static void imprimeMatriz(int[][] matriz) {
		System.out.println("-----Imprimindo a Matriz------");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}

	static void imprimeMatrizTransposta(int[][] matriz) {
		System.out.println("-----Imprimindo a Matriz Transposta------");
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {
		
		int[][] matriz = criaMatriz(3, 4);
		imprimeMatriz(matriz);
		imprimeMatrizTransposta(matriz);

	}

}
