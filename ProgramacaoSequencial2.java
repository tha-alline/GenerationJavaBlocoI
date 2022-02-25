package ExeciciosLogica;

import java.util.Scanner;

public class ProgramacaoSequencial2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.println("Escreva sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		anos = idadeDias / 365;
		meses = (idadeDias / 12) / 365;
		dias = (idadeDias / 365) % 30;
		
		System.out.println("Você tem " + anos + "anos " + meses + "meses " + dias + "dias ");
				
		leia.close();
	}
}
