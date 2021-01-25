package modulo001;

import java.util.Arrays;
import java.util.Random;

public class OrdenacaoPorSelecao {

	static int[] gerarVector(int dim) {
		Random gerar = new Random();
		int[] vector = new int[dim];
		for (int j = 0; j < vector.length; j++) {
			vector[j] = gerar.nextInt(100);
		}

		return vector;
	}

	static void ordenacaoPorSelecao(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			int menor = i;
			for (int j = i+1; j < vector.length; j++) {
				if (vector[j] < vector[menor])
					menor = j;
			}
			trocar(vector, i, menor);
		}
	}

	private static void trocar(int[] vector, int i, int menor) {
		int aux = vector[i];
		vector[i] = menor;
		vector[menor] = aux;

	}

	static void mostrarVector(int[] vector) {
		System.out.println("---Imprimindo o vector----");
		for (int cont : vector)
			System.out.print(cont + " ");
	}

	public static void main(String[] args) {

		int[] vector = gerarVector(10);
		//mostrarVector(vector);
		ordenacaoPorSelecao(vector);
		//System.out.println("---Vector Ordenado----");
		System.out.println(Arrays.toString(vector));

	}

}
