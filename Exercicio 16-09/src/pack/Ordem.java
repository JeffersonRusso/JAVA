package pack;

public class Ordem {
	private String nomeOrdem;
	public int horas;
	public char categoriaOrdem; // A B OU C ( ADD 10% A / 20% B / 30% C )
	
	public Ordem(String nome, char categoria, int horas)
	{
		this.nomeOrdem = nome;
		this.categoriaOrdem = categoria;
		this.horas = horas;
	}
	public void InserirOrdem(String _nomeOrdem)
	{
		this.nomeOrdem = _nomeOrdem;
	}
	public void IserirCategoria(char _Categoria)
	{
		this.categoriaOrdem = _Categoria;
	}
	public int horas()
	{
		return horas;
	}
	// HORAS REFERENTE PARA FINALIZAR A ORDEM 
	public int porcentoBonusCategoria()
	{
		if(categoriaOrdem == 'A')
			return 10;
		
		if(categoriaOrdem == 'B')
			return 20;
		
		if(categoriaOrdem == 'C')
			return 30;
		
		return 0;
	}

}
