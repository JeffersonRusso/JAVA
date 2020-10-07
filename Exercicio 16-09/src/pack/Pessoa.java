package pack;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String CPF;
	private int telefone;
	
	public Pessoa(String _nome, int _idade)
	{
		this.nome = _nome;
		this.idade = _idade;
	}
	public Pessoa(String _nome, int _idade, char _sexo, String _CPF, int _telefone)
	{
		this.nome = _nome;
		this.idade = _idade;
		this.sexo = _sexo;
		this.CPF = _CPF;
		this.telefone = _telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
