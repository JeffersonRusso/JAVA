package packEx;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int idade ,total = 1, x = 0;
		String temperamento = "";
		String orienta��o = "";
		int escolha;
		String H = "H";
		String M = "M";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escolha o exercicio 1 2 ou 3");
		
		escolha = sc.nextInt();
		
		if(escolha == 1) {
			
		Exercicio1 ex1 = new Exercicio1();
		ex1.percorrerNumeros(11000,2000); 
		}
		
		if(escolha == 2) {
			
		Pessoa p[] = new Pessoa[2];
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("Digite o sexo da pessoa 1 - M    2 - H");
			escolha = sc.nextInt();
			if(escolha == 1)
				orienta��o = M;
			if(escolha == 2)
				orienta��o = H;
			
			System.out.println("Escolha o temperamento 1- calmo 2- nervoso 3- agressivo");
			
			x = sc.nextInt();
			if(x == 1)
				temperamento = "CALMO";
				if(x == 2)
					temperamento = "NERVOSAS";
					if(x == 3)
						temperamento = "AGRESSIVO";
					
			System.out.println("informe a idade");
			idade = sc.nextInt();
	
			// eu n�o sei o motivo, por�m quando criei a classe contrutora
			//PESSOA(IDADE, ORIENTACAO E TEMPERAMENTO)
			//N�o estava fazendo set nas variaveis, entao eu tive que imprementar
			// os sets manualmente
			p[i] = new Pessoa();
			p[i].setOrientacao(orienta��o);
			p[i].setTemperamento(temperamento);
			p[i].setIdade(idade);
		}
		
		CalculoPesquisa resultado = new CalculoPesquisa(p);
		VlwConsole mostrar = new VlwConsole ();
		mostrar.imprimirPesquisa(resultado);
		
		}
		if(escolha == 3) {
			Exercicio6 ex6 = new Exercicio6();
			
		}
			
	}
}

