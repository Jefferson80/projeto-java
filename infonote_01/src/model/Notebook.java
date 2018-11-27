package model;

public class Notebook {


	public int numeroNote;
	public String modelo;
	public String descricao;
	public int estoque;
	public double precoUnitario;
	public String figura;
	public String dataCadastro;
	
	
	
	/**
	 * @return the numeroNote
	 */
	public int getNumeroNote() {
		return numeroNote;
	}
	/**
	 * @param numeroNote the numeroNote to set
	 */
	public void setNumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return estoque;
	}
	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	/**
	 * @return the precoUnitario
	 */
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	/**
	 * @return the figura
	 */
	public String getFigura() {
		return figura;
	}
	/**
	 * @param figura the figura to set
	 */
	public void setFigura(String figura) {
		this.figura = figura;
	}
	/**
	 * @return the dataCadastro
	 */
	public String getDataCadastro() {
		return dataCadastro;
	}
	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Notebook [numeroNote=" + numeroNote + ", modelo=" + modelo + ", descricao=" + descricao + ", estoque="
				+ estoque + ", precoUnitario=" + precoUnitario + ", figura=" + figura + ", dataCadastro=" + dataCadastro
				+ ", getNumeroNote()=" + getNumeroNote() + ", getModelo()=" + getModelo() + ", getDescricao()="
				+ getDescricao() + ", getEstoque()=" + getEstoque() + ", getPrecoUnitario()=" + getPrecoUnitario()
				+ ", getFigura()=" + getFigura() + ", getDataCadastro()=" + getDataCadastro() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Notebook() {
		super();
}

public Notebook (int numeroNote, String modelo, String descricao, int estoque, double precoUnitario, String figura, String dataCadastro) {
	
	
	this.numeroNote = numeroNote;
	this.modelo = modelo;
	this.descricao = descricao;
	this.estoque = estoque;
	this.precoUnitario = precoUnitario;
	this.figura = figura;
	this.dataCadastro = dataCadastro;
	
	
	
	
	
	
	
}
}