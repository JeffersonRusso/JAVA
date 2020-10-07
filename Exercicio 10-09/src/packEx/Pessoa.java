package packEx;

public class Pessoa {
	
	private String orientacao;
	private int idade;
	private String temperamento;
	
	public void setOrientacao(String orientacao)
	{
		this.orientacao = orientacao;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	public void setTemperamento(String temperamento)
	{
		this.temperamento = temperamento;
	}
	public String getOrientacao()
	{
		return orientacao;
	}
	public int getIdade()
	{
		return idade;
	}
	public String getTemperamento()
	{
		return temperamento;
	}
}
