package packEx;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros
 *  no teclado. E no
final imprimir a média dos números múltiplos de 3. 
Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio6 {
	
	public Exercicio6()
	{
		int [] a;
		int x, select, i;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("Entre com a quantidade de numeros"
			+ "que você vai digitar");
			
			x = sc.nextInt();
			a = new int [x];
			
		for (i = 0; i < a.length; i++) {
			System.out.print("digite :");
			a[i] = sc.nextInt();
			if (a[i] % 3 == 0)
				media = media + a[i];
		}
		System.out.println("deseja sair? digite 0");
		select = sc.nextInt();
		}while(select != 0);
		
	    media = media / i;
	    System.out.println("a media é " + media);
	}
}
