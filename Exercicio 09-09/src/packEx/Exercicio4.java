package packEx;

public class Exercicio4 
{
	public Exercicio4()
	{
		
	}
	public void parOuImpar(int numero)
	{
		int x = numero % 2;
		
		if(x == 0)
		{
			System.out.println("o numero "+ numero + " Esse numero � par");
			 raizQuadrada(numero);
		}
		if(x != 0)
		{
			System.out.println("o numero " + numero + " Esse numero � impar");
			elevadoQuadrado(numero);
		}
	}
	private void raizQuadrada(int numero)
	{
		double sqrt = Math.sqrt(numero);
		System.out.println("a raiz quadrada dele � " + sqrt);
	}
	private void elevadoQuadrado(int numero)
	{
		double pow = Math.pow(numero, 2);
		System.out.println("elevado ao quadrado" + pow);
	}
	
}
