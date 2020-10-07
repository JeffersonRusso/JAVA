package pack;



import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operario operario = new Operario("gustavo", 24);
		Vendedor vendedor = new Vendedor("pablo", 40);
		
		Ordem construir = new Ordem("Casas Construtora RIF", 'A', 165);
		Ordem vender = new Ordem("Vender Casas da RIF", 'C', 75);
		
		operario.setTrabalhoAtual(construir);
		operario.imprimirFolha();
		
		String date = " _____setembro_____ \n ";
		for(int a = 1; a < 31; a ++ ) {
			date = date + a + " ";
			if( a < 10)
				date = date + " ";
			if(a % 7 == 0 && a != 0)
				date = date + "\n"; 
		}
		date = date + "\nADD\nEXIT\nLIST"; 
		String aux;
		aux = JOptionPane.showInputDialog (null , date);

		vendedor.setTrabalhoAtual(vender);
		vendedor.imprimirFolha();
	}
}
