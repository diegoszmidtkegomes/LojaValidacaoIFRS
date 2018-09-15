package model;

public class Livro extends Produto {

	private String autor;

	public Livro(String nome, Double preco, String codBarras, String autor) throws Exception {
		super(nome, preco, codBarras);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Nome = " + super.getNome() + " Preco = " + super.getPreco() + " autor=" + autor + " codigo de barras "
				+ super.getCodBarras();
	}

}
