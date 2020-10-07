package pack;

public class Preguica extends Animal {
	
	private String nome;
	protected String som;
	private int idade;
	private boolean correr;
	
	public Preguica(String _nome, String _som, int _idade, boolean _correr)
	{
		super(_nome, _som, _idade, _correr);
	}
	public void correr(boolean correr)
	{
		this.correr = correr;
		if (correr == true) {
			System.out.println("a Preguica esta correndo");
		}
		else
			System.out.println("a Preguica esta andando");
	}

}
