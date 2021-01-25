package modulo001;

import java.util.Arrays;

public class VectorIntersecao {
	private static int[] intersecao(int[] vectorA, int[] vectorB) {
		int cont = 0;
		int[] aux = new int[vectorA.length + vectorB.length];

		for (int i = 0; i < vectorA.length; i++) {
			for (int j = 0; j < vectorB.length; j++) {
				if (vectorA[i] == vectorB[j])
					aux[cont++] = vectorA[i];
			}
		}
		int[] novoVector = new int[cont];

		for (int i = 0; i < cont; i++) {
			novoVector[i] = aux[i];

		}

		return novoVector;
	}

	public static void main(String[] args) {
		int[] vectorA = { 1, 2, 3, 4, 5, 6 };
		int[] vectorB = { 2, 4, 5, 6, 8, 10 };
		int[] vectorC = intersecao(vectorA, vectorB);

		System.out.println("Vector Intersecao: " + Arrays.toString(vectorC));

	}

}
