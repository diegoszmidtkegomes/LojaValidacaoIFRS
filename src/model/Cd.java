package model;

public class Cd extends Produto {

	private int numeroFaixa;

	public Cd(String nome, Double preco, String codBarras, int numeroFaixa) throws Exception {
		super(nome, preco, codBarras);
		this.numeroFaixa = numeroFaixa;
	}

	public int getNumeroFaixa() {
		return numeroFaixa;
	}

	public void setNumeroFaixa(int numeroFaixa) {
		this.numeroFaixa = numeroFaixa;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return " nome = " + super.getNome() + "preço = " + super.getPreco() + "número faixa = " + this.numeroFaixa
				+ " codigo de barras = " + super.getCodBarras();
	}

}
