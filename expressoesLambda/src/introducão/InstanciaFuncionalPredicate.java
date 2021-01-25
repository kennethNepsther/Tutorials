package introducão;

import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

public class InstanciaFuncionalPredicate {
	
	//============INSTANCIA FUNCIONAL PREDICATE=========
	
	public static void filtro(List<String>lista, Predicate<String>condicao ) {
		
//==========================1ª forma=========================================
		//for(String str :lista) if(condicao.test(str)) System.out.println(str);
		
//================================2ª forma=====================================================
		//lista.stream().filter((str)->condicao.test(str)).forEach((str)->System.out.println(str));
		
//================================3ª Forma=============================
		lista.stream().filter(condicao::test).forEach(System.out::println);
	}

	public static void main(String[] args) {
	
		List<String>lista = Arrays.asList(
				"Fortunner","Ford",
				"Mazda","Mini",
				"Alfa romeu","Aston martin"
				);
		System.out.println("=======Carros com Letra F============");
		filtro(lista, s ->s.startsWith("M"));
		
		System.out.println("");
		System.out.println("=======Carros com que finalizam Letra A============");
		filtro(lista, s ->s.endsWith("a"));
		
//		System.out.println("");
//		System.out.println("=======Imprimir a lista toda============");
//		filtro(lista, s ->true);
		
		System.out.println("");
		System.out.println("=======Carros com mais de 6 caracteres============");
		filtro(lista, s ->s.length()>6);
		
				

	}
}
