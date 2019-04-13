package com.jecq.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Enivaldo";
		
		System.out.print("Nome do livro: " + livro.nome);

	}

}
