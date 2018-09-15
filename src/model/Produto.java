package model;

public abstract class Produto implements Comparable<Object> {

	private String nome;
	private Double preco;
	private String codBarras;

	public Produto(String nome, Double preco, String codBarras) throws Exception {
		if (codBarras == null || codBarras.equals("")) {
			throw new Exception("Codigo de barras não inserido");
		} else {
			this.codBarras = codBarras;
		}
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codBarras == null) ? 0 : codBarras.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codBarras == null) {
			if (other.codBarras != null)
				return false;
		} else if (!codBarras.equals(other.codBarras))
			return false;
		/*
		 * if (nome == null) { if (other.nome != null) return false; } else if
		 * (!nome.equals(other.nome)) return false;
		 */
		return true;
	}

}
