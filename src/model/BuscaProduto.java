package model;

public class BuscaProduto {

	private boolean encontrou;
	private String mensagem;
	private int posicao;

	public BuscaProduto(boolean encontrou, String mensagem, int posicao) {
		super();
		this.encontrou = encontrou;
		this.mensagem = mensagem;
		this.posicao = posicao;
	}

	public BuscaProduto() {
	}

	public boolean isEncontrou() {
		return encontrou;
	}

	public void setEncontrou(boolean encontrou) {
		this.encontrou = encontrou;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

}
