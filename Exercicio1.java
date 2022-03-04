package Exercicios;

public class Exercicio1 {
		
	public  static  void  main ( String [] args ) {
			
			int n, div, resto;
			
			for (n =  1000; n <=  1999; n ++ ) {
				div = n /  11;
				resto = n %  11;
				
				if (resto ==  5 ) 
				{
					System.out.println( " O número " +n +" dividido por 11 tem resto igual a 5");
				}

			}
	}
}	
