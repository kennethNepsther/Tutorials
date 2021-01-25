package introducão;

public class IntefaceFuncional {
	
	// Interface funcional
	
	interface Num{
		double getValue(); 
	}
	
	interface ValorNumerico{
		boolean teste(int x);
	}
	
	interface ValorNumerico2{
		boolean teste(int x, int y);
	}
	
	public static void main(String[] args) {
		
		//Expressão Lambda utilando constante
		Num n1 = () -> 333.393;
		System.out.println(n1.getValue());
		
		//Expressão Lambda utilzando Random
		Num n2 = () -> Math.random()*100;
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
//======================================================
		
		ValorNumerico ePar = (int i) ->(i % 2)==0;
		//System.out.println(ePar.teste(60));
		//System.out.println(ePar.teste(61)); 
		
		if(ePar.teste(61)== true)
			System.out.println("o numero é par");
		else
			System.out.println("o numero é Impar");
//======================================================
		
		ValorNumerico2 eDivisivel = (y,z) ->(y % z)==0;
		System.out.println(eDivisivel.teste(10,2));
		

	}

}
