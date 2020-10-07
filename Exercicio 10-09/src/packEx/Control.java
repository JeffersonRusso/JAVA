package packEx;

import java.util.Scanner;

public class Control {
	
	public void perguntasPessoa(Pessoa[] p)
	{
		int idade ,total = 1, x;
		String temperamento = "";
		String orientação = "";
		int escolha = ' ';
		String H = "HOMEM";
		String M = "MULHER";
		int i = 0;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu sexo : 1-M OU 2-F");
		escolha = sc.nextInt();

			if(escolha == 1)	
				orientação = "MULHER";
			if(escolha == 2)
				orientação = "HOMEM";
				
			System.out.println("Escolha o temperamento 1- calmo 2- nervoso 3- agressivo");
			
			x = sc.nextInt();
			if(x == 1)
				temperamento = "calmo";
				if(x == 2)
					temperamento = "nervoso";
					if(x == 3)
						temperamento = "agressivo";
					
			System.out.println("informe a idade");
			idade = sc.nextInt();
	}
				
}


