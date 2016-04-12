import java.util.ArrayList;

public class Funcionario extends Pessoa {

	private double salarioBase;
	private ArrayList <Funcionario> funcionario ;
	
	public Funcionario(String nome, String cpf, String endereco, int telefone, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
		
	}

	public void addFuncionario(Funcionario funcionario){
		this.funcionario.add(funcionario);
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
