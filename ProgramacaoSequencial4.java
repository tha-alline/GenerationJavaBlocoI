package ExeciciosLogica;

import java.util.Scanner;

public class ProgramacaoSequencial4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double R, S, D;
		double a, b, c;
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Informe o valor de C: ");
		c = leia.nextInt();
		
		 R = Math.pow(a+b,2.0);
		 S = Math.pow(b+c, 2.0);
		 D = (R + S) / 2;
		 
		 System.out.println("O valor de D é: " + D);
		 
	
		 leia.close();
		
	}

}
