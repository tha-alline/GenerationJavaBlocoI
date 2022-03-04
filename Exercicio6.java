package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public  static  void  main ( String [] args ) {
		
		Scanner ler = new Scanner(System.in);
   
		int numero = 1, media = 0, contagem = 0;

		do {
				System.out.println("Digite um valor :");
				numero = ler.nextInt();
		
				if(numero % 3 == 0) 
				{ media = media + numero;
				contagem = contagem + 1;}
		}
		while(numero != 0);
		ler.close();
		
		media = media/contagem;

		System.out.println("A media dos numeros multiplos de 3 é :" + media);

	}
}
