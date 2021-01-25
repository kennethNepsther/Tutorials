package modulo001;

import java.util.Random;

/*
 * @Author Kenneth Luzolo
 * */

/*
 * Dado um n inteiro 0<n<=10, é um sequencia de n Numeros de 0 a 99,
 * determinar quantos estão entre 0 e 9, 10 e 19...,90 e 99.
 * */
public class IntervaloNumerico {

	static int[] gerarVector(int dim) {
		Random gerar = new Random();
		int[] vector = new int[dim];
		for (int j = 0; j < vector.length; j++) {
			vector[j] = gerar.nextInt(100);
		}

		return vector;
	}

	public static void main(String[] args) {
		int[] vector = gerarVector(100);

		int[] cont = new int[10];

		for (int i = 0; i < vector.length; i++) {
			cont[vector[i] / 10]++;
		}
		for (int j = 0; j < 10; j++) {
			System.out.printf("[%d - %d] = %d\n", j * 10, j * 10 + 9, cont[j]);

		}

	}

}
