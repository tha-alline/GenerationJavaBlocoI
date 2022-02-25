package ExeciciosLogica;

import java.util.Scanner;

public class ProgramacaoSequencial3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int minutos, segundos, horas, segInfor;
		
		System.out.println("Informe o tempo em segundos: ");
		segInfor = leia.nextInt();
		
		horas = segInfor / 3600;
		minutos = (segInfor % 3600) / 60;
		segundos = (segInfor % 3600) % 60;
		
		System.out.println("O evento durou: " + horas + " horas " + minutos + " minutos " + segundos + " segundos.");
		
		
		leia.close();

	}
}