package ExeciciosLogica;

import java.util.Scanner;

public class ProgramacaoSequencial8 {
	
	public static void main(String[] args) {

		double custoAoConsumidor, custoDeFabrica; 
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor de f�brica do ve�culo" 
				+ " que deseja consultar: ");
		custoDeFabrica=leia.nextDouble();

		double imposto= custoDeFabrica*0.45;
		double perDistribuidor= custoDeFabrica*0.28;

		custoAoConsumidor= custoDeFabrica+imposto+perDistribuidor;

		System.out.println("O valor do ve�culo ao consumidor � de: "
				+custoAoConsumidor);

		}
}
