package model;

public class Dvd extends Produto {

	private String duracao;

	public Dvd(String nome, Double preco, String codBarras, String duracao) throws Exception {
		super(nome, preco, codBarras);
		this.duracao = duracao;

	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return " nome = " + super.getNome() + " preco =" + super.getPreco() + " duracao = " + this.duracao
				+ " Codigo de barras = " + super.getCodBarras();
	}
}
