package ExeciciosLogica;

import java.util.Scanner;

public class ProgramacaoSequencial7 {

	public static void main(String[] args) {

		int a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		a=leia.nextInt();
		System.out.println("Digite um n�mero: ");
		b=leia.nextInt();
		System.out.println("Digite um n�mero: ");
		c=leia.nextInt();
		System.out.println("Digite um n�mero: ");
		d=leia.nextInt();
		System.out.println("Digite um n�mero: ");
		e=leia.nextInt();
		System.out.println("Digite um n�mero: ");
		f=leia.nextInt();

		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));

		System.out.println("O valor de x �: " + x + "\nO valor de y �: "+y);
	}
}
