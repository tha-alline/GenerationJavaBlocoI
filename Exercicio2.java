package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public  static  void  main ( String [] args ) {
		 Scanner ler = new Scanner (System.in);
		 
		 int n, resto, divis�o;
			
			for (n =  0 ; n <=  10; n ++ ) {
				System.out.println( " Digite um n�mero: " );
				n = ler .nextInt();
				
				divis�o = n /  2 ;
				resto = n %  2 ;
				
				if (resto ==  0 ) {
					System.out.println( " Este n�mero � par! " );
				} 
				else {
					System.out.println( " Este n�mero � impar! " );
				}
			}
		}
}
	