package pack;

public class Cachorro extends Animal {
	
	private String nome;
	private String som;
	private int idade;
	private boolean correr;
	
	public Cachorro(String _nome, String _som, int _idade, boolean _correr)
	{
		super(_nome, _som, _idade, _correr);
	}

	public void correr(boolean correr)
	{
		this.correr = correr;
		if (correr == true) {
			System.out.println("o cachorro esta correndo");
		}
		else
			System.out.println("o cachorro esta andando");
	}

}
