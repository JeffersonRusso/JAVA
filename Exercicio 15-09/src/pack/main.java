package pack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente paciente1 = new Paciente("julio", "Cancer", "O-", 232535324);
		System.out.println(paciente1.imprimirFicha());
		
		Aviao monoMotor = new Aviao ("2GH323I", "Alcool 700x", 230, 1000, 7000000);
		System.out.println(monoMotor.imprimirCaracteristicas());
		
		ProdutoEletronico Celular = new ProdutoEletronico("CELULAR 23R", "RJD4523R", 7789, 12, 450);
		System.out.println(Celular.imprimirProduto());
	}

}
