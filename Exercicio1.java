import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String args[])
	
	{ Scanner ler = new Scanner (System.in);
	int N1, N2, N3;
	
	System.out.println("Digite o primeiro n�mero: ");
	N1 = ler.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	N2 = ler.nextInt();
	
	System.out.println("Digite o terceiro n�mero: ");
	N3 = ler.nextInt();
	
		if(N1>=N2 && N2>=N3)
	{
		System.out.println("O maior n�mero �: "+N1);
	}
	
		if (N2>=N3 && N2>=N1)
	{
		System.out.println("O maior n�mero �: "+ N2);
	}
	
		if (N3>=N2 && N3>=N1)
	{
		System.out.println("O maior n�mero �: "+N3);
	}
	
	}
}
