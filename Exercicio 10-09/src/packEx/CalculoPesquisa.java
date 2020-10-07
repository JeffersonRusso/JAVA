package packEx;
/*número de pessoas calmas;
número de mulheres nervosas;
número de homens agressivos;
número de outros calmos;
número de pessoas nervosas com mais de 40 anos;
número de pessoas calmas com menos de 18 anos.*/
public class CalculoPesquisa {
	
	private int numPessoasCalm;
	private int numMulheresNerv;
	private int numHomensAgre;
	private int numPessCalmQRT;
	private int numPessCalmDZT;
	private Pessoa p[];

	public CalculoPesquisa(Pessoa [] p)
	{
		this.p = p;
		PessoasCalma();
		 calMulheresNerv();
		 calHomensAgre();
		 calHomensAgre();
		 numPessCalmQRT();
		 numPessCalmDZT();
	}
	public void PessoasCalma()
	{
		for (int i = 0; i < p.length; i++) {
			if(p[i].getTemperamento() == "CALMO")
				numPessoasCalm++;
		}
	}
	private void calMulheresNerv()
	{
		for (int i = 0; i < p.length; i++) {
			if(p[i].getTemperamento() == "NERVOSAS" && p[i].getOrientacao() == "M")
				 numMulheresNerv++;
		}
	}
	private void calHomensAgre()
	{
		for (int i = 0; i < p.length; i++) {
			if(p[i].getTemperamento() == "AGRESSIVO" && p[i].getOrientacao() == "H")
				numHomensAgre++;
		}
	}
	private void numPessCalmQRT()
	{
		for (int i = 0; i < p.length; i++) {
			if(p[i].getTemperamento() == "CALMO" && p[i].getIdade() > 40)
				numPessCalmQRT++;
		}
	}
	private void numPessCalmDZT()
	{
		for (int i = 0; i < p.length; i++) {
			if(p[i].getTemperamento() == "CALMO" && p[i].getIdade() < 18)
				numPessCalmDZT++;
		}
	}
	/////////////////////////////////////
	public int getNumPessoasCalm() {
		return numPessoasCalm;
	}
	public int getNumMulheresNerv() {
		return numMulheresNerv;
	}
	public int getNumPessCalmQRT() {
		return numPessCalmQRT;
	}
	public int getNumPessCalmDZT() {
		return numPessCalmDZT;
	}
	public int getNumHomensAgress() {
		return numHomensAgre;
	}
}
