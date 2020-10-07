package pack;


import java.util.Scanner;

public class Exercicio2  {
	
	Scanner cs;

	
	public Exercicio2()
	{
		int[] n = new int [10];
		cs = new Scanner(System.in);
		int Number, somapar = 0, somaimpar = 0, contador =0;
	
		for (int i = 0; i < n.length; i++) {
			System.out.println("digite o valor");
			
			Number = cs.nextInt();
			n[i] = Number;
			
		}
		for (int i = 0; i < n.length; i++) 
		{
			if (n[i] % 2 == 0) {
				System.out.println("É par " + n[i]);
				somapar = somapar + n[i];
			
			}
			else
			{
				System.out.println("é impar" + n[i]);
				somaimpar = somaimpar + n[i];
				contador = contador + 1;
			}
			
		}
		System.out.println("CONTADOR : " + contador);
		
	}
		
}
	
