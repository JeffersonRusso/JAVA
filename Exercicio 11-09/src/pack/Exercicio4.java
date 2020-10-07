package pack;

import java.util.Scanner;

public class Exercicio4 {
	
	private int mtz [][];
	private int mtz2 [][];
	private int auxmtz [][];
	private Scanner sc;
	private int select;
	private int con = 1;
	
	public void definir()
	{
		sc = new Scanner(System.in);
		auxmtz = new int [2][2];
		mtz = new int [2][2];
		mtz2 = new int [2][2];
		
		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz.length; j++) {
				System.out.println("Entre com o valor da posição da matriz 1 : " + i + " " + j);
				mtz[i][j] = sc.nextInt();
				System.out.println("Entre com o valor da posição da matriz 2 : " + i + " " + j);
				mtz2[i][j] = sc.nextInt();
			}
		}
	}
	public int [][] math()
	{
		System.out.println("Selecione 1 para subtrair 2 para somar e 3 para adicionar uma constante");
		select = sc.nextInt();
		if(select == 1)
		{
			for (int i = 0; i < mtz.length; i++) {
				for (int j = 0; j < mtz.length; j++) {
					auxmtz[i][j] = mtz[i][j] - mtz2 [i][j];
				}
			}
		}
		if(select == 2)
		{
			for (int i = 0; i < mtz.length; i++) {
				for (int j = 0; j < mtz.length; j++) {
					auxmtz[i][j] = mtz[i][j] + mtz2 [i][j];
				}
			}
		}
		if(select == 3)
		{
			for (int i = 0; i < mtz.length; i++) {
				for (int j = 0; j < mtz.length; j++) {
					mtz[i][j] = mtz[i][j] + con;
					mtz2[i][j] = mtz2[i][j] + con;
					System.out.println("Vetor ["+i+"]["+j+"] = " + mtz[i][j] );
					System.out.println("Vetor ["+i+"]["+j+"] = " + mtz2[i][j] );
				}
			}
		}
		return auxmtz;
	}
}

