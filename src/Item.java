
public class Item {
	private String nome;
	private String fabricante;
	private String fornecedor;
	private double valorUnitario;
	public Item(String nome, String fabricante, String fornecedor, double valorUnitario) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
		this.valorUnitario = valorUnitario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
}
