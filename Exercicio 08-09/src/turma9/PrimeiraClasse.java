package turma9;

import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JTextPane;

public class PrimeiraClasse{
	
	public Scanner sc;

	public static void main (String args[])
	{
		PrimeiraClasse exc = new PrimeiraClasse();
		
		exc.exercicios();
	}
	public void exercicios()
	{
		System.out.println("escolha o exercicio 1 2 ou 3");
		sc = new Scanner(System.in);
		
		int number = sc.nextInt();
	
		switch (number) {
		  case 1:
			  exercicio3();
		    break;
		  case 2:
			  exercicio4();
		  case 3:
			   exercicio5();
		    break;
		  default:
			    System.out.println("esse exercicio não existe");
		}
	}
	public void exercicio3()
	{
		int seconds, cont = 0, h = 0, m = 0; 
		
		sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo de processamento em segundos");
		
		seconds = sc.nextInt();
		
		for (cont = 0; cont < seconds; cont++)
		{
			float mod;
			mod = cont % 60;

			if ( mod == 1 ) {
				m++;
				}
			if ( m == 60 ) {
				h++;
				m = 0;
			}		
		}
		System.out.println (" HORAS: " + h + " minutos : " + m);	
	}
	public void exercicio4()
	{
		int a, b, c;
		double r, s, d;
		
		System.out.println("digite o numero a");
		
		a = sc.nextInt();
		
		System.out.println("digite o numero b");
		
		b = sc.nextInt();
		
		System.out.println("digite o numero c");
		
		c = sc.nextInt();
		
		r = Math.pow(a / b, 2);	
		s = Math.pow(a / c, 2);	
		d = Math.pow(r / s, 2);	

		System.out.println ("Resultado da expressão é : " + d );

}
	public void exercicio5()
	{
		double nota1, nota2, nota3, media;
		int peso1, peso2, peso3;

		System.out.println ("entre com a primeira nota e o primeiro peso" );
		nota1 = sc.nextInt();
		peso1 = sc.nextInt();

		System.out.println ("entre com a segunda nota e o segundo peso" );
		nota2 = sc.nextInt();
		peso2 = sc.nextInt();

		System.out.println ("entre com a terceira nota e o terceiro peso" );
		nota3 = sc.nextInt();
		peso3 = sc.nextInt();

		media = ( nota1 * peso1 + nota2 * peso2 + nota3 * peso3 ) / 3;

		System.out.println ("a media é :  " + media );
	}
}




