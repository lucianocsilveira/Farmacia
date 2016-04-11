
public class Funcionario extends Pessoa {

	private double salarioBase;
		
	public Funcionario(String nome, String cpf, String endereco, int telefone, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
		
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
