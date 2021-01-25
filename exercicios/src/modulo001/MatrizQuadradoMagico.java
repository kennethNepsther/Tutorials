package modulo001;

/* * Matriz é quadrada é chamada quadrado magico se a soma dos elementos de cada linha,
 * soma dos elementos de cada coluna, e as somas das diagonais principais e secundarias,
 * sao iguais.
 * */

/*
 * @author: Kenneth Luzolo
 * */

public class MatrizQuadradoMagico {
	
	static boolean quadradoMagico(int[][] matriz) {
		int somaPrincipal = 0;
		int somaOutros = 0;
		// soma os elementos da primeira linha
		for (int j = 0; j < matriz[0].length; j++) {
			somaPrincipal += matriz[0][j];
		}
		// somando outras linhas
		for (int i = 1; i < matriz.length; i++) {
			somaOutros = 0;
			for (int j = 0; j < matriz[0].length; j++) {
				somaOutros += matriz[i][j];
			}
			if (somaPrincipal != somaOutros) {
				return false; // Não é quadrado Magico
			}
		}
		// somando as colunas
		for (int i = 0; i < matriz[0].length; i++) {
			somaOutros = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				somaOutros += matriz[i][j];				
			}
			if (somaPrincipal != somaOutros) {
				return false; // Não é quadrado Magico
			}
			
		}
		//somar os elementos da diagonal Principal
		somaOutros = 0;
		for (int i = 0; i < matriz.length; i++) {
			somaOutros += matriz[i][i];
		}
		if (somaPrincipal != somaOutros) {
			return false; 
		}
		//somar os elementos da diagonal Secundaria
		somaOutros = 0;
		int linhaActual=0;
		for (int j =  matriz.length-1; j >=0; j--) {
			somaOutros += matriz[linhaActual][j];
			linhaActual++;
		}
		if (somaPrincipal != somaOutros) {
			return false;
		}
		return true; //É quadrado Magico
		
	}

	public static void main(String[] args) {
		
		int[][]matriz = new int[3][3];
//		Random gerarNumeros = new Random();
//		
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz.length; j++) {
//				matriz[i][j] = gerarNumeros.nextInt(100);
//			}
//		}		
		
		matriz[0][0]=3;
		matriz[0][1]=4;
		matriz[0][2]=8;
		matriz[1][0]=10;
		matriz[1][1]=5;
		matriz[1][2]=0;
		matriz[2][0]=2;
		matriz[2][1]=6;
		matriz[2][2]=7;
		
		if(quadradoMagico(matriz)) 
			System.out.println("A matriz quadrada é um: QUADRADO MAGICO");
		else
			System.out.println("A matriz quadrada NÃO É QUADRADO MAGICO");			

	}

}
