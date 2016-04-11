
public class Clientes extends Pessoa {
	private String historico;

	public Clientes(String nome, String cpf, String endereco, int telefone, String historico) {
		super(nome, cpf, endereco, telefone);
		this.historico = historico;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	
	
}
