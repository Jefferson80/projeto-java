package model;

public class ItemDePedido {

	private int qtde;
	private double subtotal;

	private Notebook notebook;

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	@Override
	public String toString() {
		return "ItemDePedido [\nqtde=" + qtde + ",\n subtotal=" + subtotal + "]";
	}

	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;

	}

	
	
	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}

	public void mostrar() {

		System.out.println("`\n\nitemDePedido:\n");
		System.out.println("Qtde: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);

	}

}
