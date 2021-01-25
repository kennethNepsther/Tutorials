package modulo001;
import java.util.Scanner;

public class TabuadaAoAvesso {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

//		System.out.println("Insira um o numero ");
//		int num = teclado.nextInt();
//
//		for (int i = 10; i > 1; i--) 
//			System.out.println(num + " x " + i + " = " + num * i);
		
//============Soma de 1 a 100========================		
/*		int num =0;
		for (int i = 1; i <= 1000; i++) 
			 num+=i;			
		System.out.println(num); 
									*/		
//============== Com while========================
/*		int i=1;
		while(i<=10) {
			num+=i;
			i++;
		}System.out.println(num); */
		
//==============Soma de numeros num intervalo=======================
		System.out.println("Insira o valor inicial ");
		int numInicial = teclado.nextInt();
		
		System.out.println("Insira o valor final ");
		int numFinal = teclado.nextInt();
		int soma=0;	
		
		while(numInicial<=numFinal) {
			soma+=numInicial;
			numInicial++;
		}System.out.println(soma);
	}

}
