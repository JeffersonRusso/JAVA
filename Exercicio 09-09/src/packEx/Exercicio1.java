package packEx;

import java.util.Scanner;

public class Exercicio1 {
	
	private int x,y,z;
	private int vct [];
	private int max;
	
	public Exercicio1(int b)
	{
		vct = new int[b];
	}
	
	public void pegarnumeros()
	{
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < vct.length; i++) {
			System.out.println("Digite o numero º"+i);
			vct[i] = sc.nextInt();
		}
		
	}
	public void calcularMaior()
	{
		int i = 0, j = 0;
		
		for (j = 0; j < vct.length; j++) {
			for (i = 0; i < vct.length ; i++) {
				if(vct[j] > vct[i])
					max = vct[j];
			}	
		}
		System.out.println("Maior Numero" + max);
	}

}
