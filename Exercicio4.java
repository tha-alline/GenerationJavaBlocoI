import java.util.Scanner;
import  java.lang.Math;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		double divisao=0.0, resto, quadrado, raiz;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		divisao = numero / 2;
		resto = numero % 2;

		if(resto != 0)
		{
			quadrado= numero*numero;
			System.out.println("O n�mero escolhido � impar e o quadrado dele �: " + quadrado);
		}
		
		else{
			raiz = Math.sqrt (numero);
			System.out.println("O n�mero escolhido � par e sua raiz �: " + raiz);
		}
	
		ler.close();
	}

}