package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.BuscaProduto;
import model.Cd;
import model.Dvd;
import model.Livro;
import model.Produto;

public class LojaMain {

	public static void main(String[] args) throws Exception {
		List<Produto> produtosDaLoja = new ArrayList<>();

		Produto livro1 = new Livro("Livro 1", 30.0, "1234567891234", "autor1");
		Produto cd1 = new Cd("Cd 1", 15.0, "1111111112223", 3); // 3 e a duracao
		Produto dvd1 = new Dvd("DVD 1", 25.0, "2223333337778", "69.00"); // duracao 69 min
		Produto livro2 = new Livro("Livro 2", 35.0, "1234444444444", "autor2");
		Produto cd2 = new Cd("Cd 1", 20.0, "1234444445555", 4);
		Produto cd3 = new Cd("Cd 1", 20.0, "3333333333333", 4);
		// Produto cd4 = new Cd("Cd 1", 20.0, null, 4); teste de nulo

		produtosDaLoja.add(livro1);
		produtosDaLoja.add(cd1);
		produtosDaLoja.add(dvd1);
		produtosDaLoja.add(livro2);
		produtosDaLoja.add(cd2);

		System.out.println("Antes insercão");
		imprimeVetor(produtosDaLoja);

		BuscaProduto buscaProduto = busvaProdutoLista(produtosDaLoja, cd2);
		if (buscaProduto.isEncontrou()) {
			System.out.println("Produto encontrado! na posição " + buscaProduto.getPosicao());
		} else {
			System.out.println(buscaProduto.getMensagem());
		}

		ordenaVetor(produtosDaLoja);
		System.out.println("Após insercão");
		imprimeVetor(produtosDaLoja);
	}

	private static BuscaProduto busvaProdutoLista(List<Produto> produtos, Produto produto) {
		int i = 0;
		BuscaProduto retorno = new BuscaProduto();
		for (Produto p : produtos) {
			if (p.equals(produto)) {
				retorno.setEncontrou(true);
				retorno.setPosicao(i);
				return retorno;
			}
			System.out.println(p.toString());
			i++;
		}
		retorno.setEncontrou(false);
		retorno.setMensagem("Produto não encontrado");
		return retorno;
	}

	private static List<Produto> ordenaVetor(List<Produto> lista) {
		Collections.sort(lista, new Comparator<Produto>() {
			public int compare(Produto p1, Produto p2) {
				return p1.getNome().compareTo(p2.getNome());
			}
		});
		return lista;
	}

	private static void imprimeVetor(List<Produto> lista) {
		for (Produto p : lista) {
			System.out.println(p.toString());
		}
	}
}
