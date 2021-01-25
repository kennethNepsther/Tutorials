package modulo001;

import java.util.Scanner;

public class SomaTodosAlgarismos {

	private static Scanner teclado;

	public static void main(String[] args) {
		int somaAlgarismo = 0;
		teclado = new Scanner(System.in);

		System.out.println("Insira um numero maior ou igual a 10");
		int num = teclado.nextInt();
		if(num<10) {
			System.out.println("O numero deve ser maior ou igual a 10");
		}else {
			
			while (num > 9) {
				//1-obter o resto da divisao por 10 do numero digitado
				int restoDivisao = num % 10;
				//2-Incrementar o resto da divisao na soma
				somaAlgarismo += restoDivisao;
				//3-dividir por 10 e atribuir no numero
				num /= 10;
			}System.out.println("A soma dos algarismo é: "+somaAlgarismo);
		}

		

	}

}
