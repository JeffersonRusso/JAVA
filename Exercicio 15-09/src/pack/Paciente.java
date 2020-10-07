package pack;

public class Paciente {
	private String nome;
	private int registro;
	private String doenca;
	private String tipoSangue;
	
	public Paciente(String nome, String doenca, String tipoSangue, int registro)
	{
		this.nome = nome;
		this.doenca = doenca;
		this.tipoSangue = tipoSangue;
		this.registro = registro;
	}
	public String imprimirFicha()
	{
		System.out.println("---------------------------------------------");
		String ficha = "\nNome do paciente é " + nome + "\nnumero de registro : "+ registro + 
				" \ndoença do paciente"
				+ " " + doenca + " \ntipo do sangue " + tipoSangue;
		return ficha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getTipoSangue() {
		return tipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		this.tipoSangue = tipoSangue;
	}
	
}
