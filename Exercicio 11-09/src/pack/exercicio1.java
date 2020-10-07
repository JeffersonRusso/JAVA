package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 implements Controls {
	
		private int vct[];
		Scanner sc;
		private int hand;
		private int soma;
		private int pos;
	
		public void definir()
		{
			if(vct.length <= 0 )
			{
				System.out.println("Vetor não iniciado");
				return;
			}
			sc = new Scanner(System.in);		
			for (int idx = 0; idx < vct.length; idx++) {
				System.out.println("Entre com o "+ ( idx + 1 ) +" Valor");
				hand = sc.nextInt();
				vct[idx] = hand;
			}
		}
		public void math()
		{
			do {
				do {
					sc = new Scanner (System.in);
					System.out.println("Qual posição você gostaria de modificar? as possibilidades são de"
							+ " 0 até " + (vct.length ));
					System.out.println("Defina qual posição do vetor você quer acessar");
					pos = sc.nextInt() -1;
					if(pos < 0 || pos > vct.length)
						System.out.println("numero invalido");
				} while (pos < 0 || pos > vct.length);
						
			soma = soma + vct[pos];
			System.out.println("Digite -1 para sair ou 1 para continuar | a soma atual é " + soma);
			hand = sc.nextInt();
			} while(hand > 0);
			System.out.println("A SOMA DOS VETORES INFORMADOS : " + soma);
			soma = 0;
		}
		public void modificarUmValor()
		{
			System.out.println("Qual posição você gostaria de modificar? as possibilidades são de"
					+ " 1 até " + (vct.length ));
			sc = new Scanner (System.in);
			pos = sc.nextInt() -1;
			if(pos < 0 || pos > vct.length) {
				System.out.println("Posição invalida");
				return;
			}
			System.out.println("Indique o novo valor para posição " + pos + 1 + " VALOR ATUAL : " + vct[pos]);
			hand = sc.nextInt();
			setValueVct(pos, hand);
		}
		
		public void setVct(int pos) {
			this.vct = new int [pos];
		}
		
		public int [] getVct() {
			return this.vct;
		}
		private void setValueVct(int pos, int value) {
			this.vct[pos] = value;
		}
}
