package pack;

public class Animal {
	private String nome;
	protected String som;
	private int idade;
	private boolean correr;
	
	public Animal(String _nome, String _som, int _idade, boolean _correr)
	{
		super();
		this.nome = _nome;
		this.som = _som;
		this.idade = _idade;
		this.correr = _correr;
	}
	public void emitirSom()
	{
		System.out.println(som);
	}
	public void correr(boolean correr)
	{
		this.correr = correr;
	}

}
