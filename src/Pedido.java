import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedido {
	private String cliente;
	private String funcionario;
	private double quantidade;
	private double total;
	private ArrayList<Item> itens;
	
	public Pedido(String cliente, String Funcionario, String item, double quantidade, double total) {
	
		this.itens = new ArrayList<Item>();
	}	
	
	public void addItem (Item item){
		this.itens.add(item);
	}
}
