package pack;

public class Vendedor extends Pessoa implements FolhaDePagamento {
	
	private int horasTrabalhadas;
	private double salario;
	private int valorHora = 40;
	private Ordem ordem;
	private final int bonusVendedor = 400;
	
	
	public Vendedor(String _nome, int _idade) {
		super(_nome, _idade);
	}
	public void setTrabalhoAtual(Ordem _ordem)
	{
		this.ordem = _ordem;
	}

	@Override
	public void calcularSalario() {
		salario = ( valorHora * horasTrabalhadas + bonusVendedor ) * ordem.porcentoBonusCategoria();
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
		horasTrabalhadas += ordem.horas();
	}

}
