package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = 0, soma = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			n = ler.nextInt();
			soma = soma + n ;
			System.out.println("A soma dos n�meros �: " + soma);
		}while(n>0);
	ler.close();
	}
}