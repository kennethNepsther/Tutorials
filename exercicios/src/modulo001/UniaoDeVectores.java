package modulo001;

import java.util.Arrays;

public class UniaoDeVectores {
	/**
	 * @author Kenneth luzolo *
	 */
	/*
	 * Algoritmo que faz a união em dois vectores A e B e retorna em um vector C
	 */
	
	private static int[] uniao(int[] vector1, int[] vector2) {

		int[] vector = new int[vector1.length + vector2.length];
		int cont = 0;
		for (int i = 0; i < vector1.length; i++) {
			vector[cont++] = vector1[i];
		}

		for (int i = 0; i < vector2.length; i++) {
			if (!existe(vector2[i], vector, cont)) {
				vector[cont++] = vector2[i];
			}
		}
		vector = Arrays.copyOf(vector, cont);
		return vector;

	}

	private static boolean existe(int x, int[] vector, int cont) {
		for (int i = 0; i < cont; i++) {
			if (vector[i] == x) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int[] vector1 = { 1, 2, 3, 4, 5 };
		int[] vector2 = { 1, 2, 3, 6, 7, 5, 8, 9, 19 };

		int[] vectUniao = uniao(vector1, vector2);
		System.out.println("Vector União= " + Arrays.toString(vectUniao));

	}

}
