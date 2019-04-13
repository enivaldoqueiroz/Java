package com.jecq.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		LivroLivraria livroLivraria = new LivroLivraria();
		
		livroLivraria.nome = "Mastering ExtJS";
		livroLivraria.autor = "Loiane Groner";
		livroLivraria.anoLancamento = 2015;
		livroLivraria.preco = 63.52;
		
	
		System.out.println("Nome do livro: " + livroLivraria.nome);
		System.out.println("Nome do livro: " + livroLivraria.autor);
		System.out.println("Nome do livro: " + livroLivraria.anoLancamento);
		System.out.println("Nome do livro: " + livroLivraria.preco);

	}

}
