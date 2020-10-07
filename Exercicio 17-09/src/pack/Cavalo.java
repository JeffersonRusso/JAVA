package pack;

public class Cavalo extends Animal {
	
	private String nome;
	private String som;
	private int idade;
	private boolean correr;
	
	public Cavalo(String _nome, String _som, int _idade, boolean _correr)
	{
		super(_nome, _som, _idade, _correr);
	}
	public void correr(boolean correr)
	{
		this.correr = correr;
		if (correr == true) {
			System.out.println("o cavalo esta correndo");
		}
		else
			System.out.println("o cavalo esta andando");
	}

}
