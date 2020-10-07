package pack;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int select, indexVct;
		Scanner sc;
		exercicio1 ex1;
		Exercicio4 ex4;
		Print pt;
			
		//descomente para continuar com o exercicio 4
		
		
		 
		ex4 = new Exercicio4();
		ex4.definir();
		pt = new Print(ex4.math());
		pt = new Print(ex4.math());
		
		
		
		
		ex1 = new exercicio1();
		sc = new Scanner (System.in);
		
		do {
			System.out.println("Bem Vindo ao Exercicio 1 "
				+ "Porfavor, para iniciar você deve informar o tamanho ( index )"
				+ " do seu Vetor ( > 0) ");
			indexVct = sc.nextInt();
			ex1.setVct(indexVct);
			ex1.definir();
			if (indexVct < 1) {
				System.out.println("ERRO : Index < 1");
				}
		} while (indexVct < 1);
		do {
			
		System.out.println("Seu index é " + ex1.getVct().length);
		System.out.println("Você pode : \n1 - definir valores do seu vetor "
									+ " \n2 - definir um valor em um index expecifico"
									+ " \n3 - fazer a soma de index expecificos"
									+ " \n4 - Mostrar valores na tela");
		select = 0;
		select = sc.nextInt();
							
		
			switch (select) {
			case 1:
				ex1.definir();
				System.out.println("teste");
				break;
			case 2:
				ex1.modificarUmValor();
				break;	
			case 3:
				ex1.math();
				break;	
			case 4:
				pt = new Print(ex1.getVct());
				break;
			default:
				System.out.println("Essa opção é invalida");
				break;
			}
		} while(select != 0);
		

	}

}
