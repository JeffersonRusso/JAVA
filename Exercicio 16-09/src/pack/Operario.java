package pack;

public class Operario extends Pessoa implements FolhaDePagamento {
	private Ordem ordem;
	private int horasTrabalhadas;
	private int valorHora = 25;
	private double salario;
	private final int bonusOperario = 280;
	
	public Operario(String _nome, int _idade) {
		super(_nome, _idade);
	}
	
	public void setTrabalhoAtual(Ordem _ordem)
	{
		this.ordem = _ordem;
	}

	@Override
	public void calcularSalario() {
		salario = ( valorHora * horasTrabalhadas + bonusOperario ) * ordem.porcentoBonusCategoria() ;
	}
	@Override
	public double salario() {
		return salario;
	}
	@Override
	public void imprimirFolha() {
		horasTrabalhadas();
		calcularSalario();
		System.out.println("Horas trabalhadas : " + horasTrabalhadas);
		System.out.println("Salario : " + salario);
		
	}
	@Override
	public void horasTrabalhadas() {
		horasTrabalhadas = horasTrabalhadas + ordem.horas();
	}
	
	
	

}
