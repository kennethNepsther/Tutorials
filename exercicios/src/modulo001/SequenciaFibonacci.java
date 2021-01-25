package modulo001;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int aux;

		for (int i = 0; i < 30; i++) {
			System.out.print(" " + a); //
			aux = a;
			a += b;
			b = aux;
		}

	}

}
