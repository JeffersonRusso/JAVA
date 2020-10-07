package packEx;

import java.util.Scanner;

public class Exercicio1 {
	
	public void percorrerNumeros(int max, int min)
	{
		for (int i = min; max > i; i++) {
			resto5(i);	
		}
	}
	private void resto5(int number)
	{
		if(number % 11 == 5)
			System.out.println(number + " dividido por 11 resta 5");
	}

}
