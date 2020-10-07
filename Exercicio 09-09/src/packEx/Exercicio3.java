package packEx;

import java.util.Scanner;

public class Exercicio3 {
	
	private int idade;
	public Exercicio3()
	{
	
	}
	public void Categoria()
	{
		Scanner scIdade = new Scanner(System.in);
		idade = scIdade.nextInt();
		
		if (idade>9 && idade<15)
		{
			System.out.println("Infantil");
		}
		if(idade>=15 && idade<18)
		{
			System.out.println("Juvenil");
		}
		if (idade>=18 && idade<=25)
		{
			System.out.println("Adulto");
		}
		if (idade<10 || idade>25)
		{
			System.out.println("idade fora da categorização" );
		}
	}

		
}


