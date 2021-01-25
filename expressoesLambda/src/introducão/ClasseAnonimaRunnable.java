package introducão;

public class ClasseAnonimaRunnable {
	

	public static void main(String[] args) {
		
		System.out.println("=== inicio do teste======");
		
		//Implementação da classe anonima Runnable
//===========================Lambda forma antiga==================================
		Runnable r1 = new Runnable() {
			@Override
			public void run() {				
				System.out.println("Estudando as expressões Lambda forma antiga");				
			}			
		};
		
		r1.run();
		
//===========================Lambda forma melhorada============================================
		Runnable r2 = () -> System.out.println("Estudando as expressões Lambda forma melhorda");		
		r2.run();

		
		
		
		
		
	}

}
