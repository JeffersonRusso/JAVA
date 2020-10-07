package pack;

public class Aviao {
	private String modelo;
	private String combustivel;
	private int limitepassageiros;
	private int velocidade;
	private int preco;
	
	public Aviao(String modelo, String conbustivel, int limitepass, int vel, int preco)
	{
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.limitepassageiros = limitepass;
		this.velocidade = vel;
		this.preco = preco;
	}
	
	public String imprimirCaracteristicas()
	{
		System.out.println("---------------------------------------------");
		String aviao = "Modelo :" + modelo + " \ntipo de combustivel : " + combustivel + " \nlimite"
				+ " de passageiros : " + limitepassageiros + " \nvelocidade : " + velocidade + " \nPREÇO : " + preco;
		return aviao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getLimitepassageiros() {
		return limitepassageiros;
	}
	public void setLimitepassageiros(int limitepassageiros) {
		this.limitepassageiros = limitepassageiros;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	

}
