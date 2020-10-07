package pack;

public class ProdutoEletronico {
	private String modelo;
	private int serie;
	private int voltagem;
	private String nome;
	private int preco;
	
	public ProdutoEletronico(String nome, String modelo, int serie, int voltagem, int preco)
	{
		this.nome = nome;
		this.modelo = modelo;
		this.serie = serie;
		this.voltagem = voltagem;
		this.preco = preco;
	}
	public String imprimirProduto()
	{
		System.out.println("---------------------------------------------");
		String produto = "Nome : " + nome + "\nModelo : " + modelo + "\nserie" + serie + "\nVoltagem :"
				+ "" + voltagem + "\nPREÇO : " + preco;
		return produto;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}
