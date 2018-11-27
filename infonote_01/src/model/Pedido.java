package model;

public class Pedido {


	public int numero;
	public String dataEmissao;
	public String formaDePagamento;
	public double valorTotal;
	public String situacao;
	
	
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the dataEmissao
	 */
	public String getDataEmissao() {
		return dataEmissao;
	}
	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	/**
	 * @return the formaDePagamento
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	/**
	 * @param formaDePagamento the formaDePagamento to set
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	/**
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", dataEmissao=" + dataEmissao + ", formaDePagamento=" + formaDePagamento
				+ ", valorTotal=" + valorTotal + ", situacao=" + situacao + ", getNumero()=" + getNumero()
				+ ", getDataEmissao()=" + getDataEmissao() + ", getFormaDePagamento()=" + getFormaDePagamento()
				+ ", getValorTotal()=" + getValorTotal() + ", getSituacao()=" + getSituacao() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Pedido() {
		super();
}

public Pedido (int numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao) {
	
	
	this.numero = numero;
	this.dataEmissao = dataEmissao;
	this.formaDePagamento = formaDePagamento;
	this.valorTotal = valorTotal;
	this.situacao = situacao;
	
}	
	

public void mostrar(){
		//Mostrar Endereço
		System.out.println("\n\nPedido\n");
		System.out.println("numero: " + this.numero);
		System.out.println("Data de Emissão: " + this.dataEmissao);
		System.out.println("Forma de Pagamento: " + this.formaDePagamento);
		System.out.println("Valor Total: " + this.valorTotal);
		System.out.println("Situacao: " + this.situacao);
		
	
	

}
}