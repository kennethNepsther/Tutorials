package modulo001;
import java.util.Scanner;

public class ParImpar {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		System.out.println("Insira um o numero ");
		teclado = new Scanner(System.in);
		int num = teclado.nextInt();		
		
		String categoria = num % 2== 0 ? "O numero é PAR" :"O numero é IMPAR " ;
		
		System.out.println(categoria);

	}

}
