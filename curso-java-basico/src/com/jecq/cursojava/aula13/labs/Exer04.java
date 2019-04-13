package com.jecq.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Nota:");
		double nota1 = scan.nextInt();		
		System.out.println("Segunda Nota:");
		double nota2 = scan.nextInt();
		System.out.println("Terceira Nota:");
		double nota3 = scan.nextInt();
		System.out.println("Quarta Nota:");
		double nota4 = scan.nextInt();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Media das 4 notas : " + media);

	}

}