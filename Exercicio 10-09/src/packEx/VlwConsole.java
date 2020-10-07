package packEx;

public class VlwConsole {
	
	public void imprimirPesquisa(CalculoPesquisa c)
	{
		System.out.println("Pessoas Calmas "           + c.getNumPessoasCalm());
		System.out.println("Pessoas Calmas com 18 < "  +c.getNumPessCalmDZT());
		System.out.println("Pessoas Calmas com 40 > "  +c.getNumPessCalmQRT());
		System.out.println("Homens agressivos "        +c.getNumHomensAgress());
		System.out.println("Mulheres nervosas "        +c.getNumMulheresNerv());
	}
}
