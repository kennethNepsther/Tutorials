package introducão;

import java.util.Arrays;
import java.util.List;

public class Stream {
	
	// Stream na pratica

	public static void main(String[] args) {
	
//=====================Antes do Java 8========================
		List<String>lista1 = Arrays.asList(
				"kenneth","luzolo","Landinho","Stelvio","Mimosa"
			);
//		for(String lista: lista1) {
//			System.out.println(lista);
//		}
		
//==================Usando Expressão lambda==================
			lista1.forEach(saida -> System.out.println(saida));
		
//============usando Lambda com metod reference============
		//lista1.forEach(System.out::println);
		
	}

}
