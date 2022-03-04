package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public  static  void  main ( String [] args ) {
		 Scanner ler = new Scanner (System.in);
		 
		 int n, resto, divisão;
			
			for (n =  0 ; n <=  10; n ++ ) {
				System.out.println( " Digite um número: " );
				n = ler .nextInt();
				
				divisão = n /  2 ;
				resto = n %  2 ;
				
				if (resto ==  0 ) {
					System.out.println( " Este número é par! " );
				} 
				else {
					System.out.println( " Este número é impar! " );
				}
			}
		}
}
	