package packEx;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
	
	private int vct []; 
	private int vctAux []; 
	private int aux;
	
	public Exercicio2(int b)
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
	public void alinharMenorMaior()
	{
		/*int i = 0, j = 0;
		
		for (j = 0; j < vct.length; j++) {
			for (i = 0; i < vct.length ; i++) {
				if( vct[i] > vct[j] ) {
					aux = vct[i];
					vct[i] = vct[j];
					vct[j] = aux;
				}
			}
		}
		   Não consegui finalizar a logica então usei o ARRAYS.SORT();
		} */
		Arrays.sort(vct);
		for (int j = 0; j < vct.length; j++)
			System.out.println("Numero " + vct[j]);
	}	
}


