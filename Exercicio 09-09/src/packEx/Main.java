package packEx;

import java.util.Scanner;

public class Main {
	
	private int a;

	public static void main(String[] args) {
		
		int select = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do exercicio 1 2 3 ou 4");
		
		select = sc.nextInt();
		
		switch (select) {
		case 1:
			Exercicio1 ex1 = new Exercicio1(5);
			ex1.pegarnumeros();
			ex1.calcularMaior();
			
			break;
		case 2:
			Exercicio2 ex2 = new Exercicio2(5);
			ex2.pegarnumeros();
			ex2.alinharMenorMaior();
			
			break;
		case 3:
			Exercicio3 ex3 = new Exercicio3();
			ex3.Categoria();
			break;
		case 4:
			Exercicio4 ex4 = new Exercicio4();
			ex4.parOuImpar(sc.nextInt());
			break;

		default:
			System.out.println("Não existe");
			
			break;
		}
	}

}
