package modulo001;

import java.util.Arrays;

/*
 * Este programa remove numeros  repetidos em um vector
 * */

public class RemoveDuplicado {
	private static int[] removerDuplicado(int[] vector) {
		int indx = vector.length;

		int[] novoVector = Arrays.copyOf(vector, indx);
		for (int i = 0; i < indx; i++) {
			int k = i + 1;
			int removidos = 0;
			for (int j = i + 1; j < indx; j++) {
				if (novoVector[j] == novoVector[i])
					removidos++;
				else
					novoVector[k++] = novoVector[j];
			}
			indx -= removidos;
		}
		novoVector = Arrays.copyOf(novoVector, indx);

		return novoVector;

	}

	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4, 4, 2, 3, 1, 5, 2, 6, 7, 8, 9, 6, 7, 8,10,5,89 };
		


		int[] novoVector = removerDuplicado(vector);
		System.out.println("Novo vector = "+Arrays.toString(novoVector));

	}

}
