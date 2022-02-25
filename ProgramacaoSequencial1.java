package ExeciciosLogica;

import java.util.Scanner;

public class ProgramacaoSequencial1 {

public  static  void  main (String [] args) {
		
		Scanner leia =  new Scanner (System.in);
		
		int diasAno =  365 ;
		int diasMes =  30 ;
		int dias, meses, anos;
		
		System.out.println( " Informe sua idade em anos: " );
		anos = leia.nextInt();
		
		System.out.println( " Informe os meses: " );
		meses = leia . nextInt();
		
		System.out.println( " Informe os dias: " );
		dias = leia . nextInt();
		
		dias = (anos * diasAno) + (meses * diasMes) + dias;
				
		System.out.println(dias);	
		
		leia . close();
		
		}
}
