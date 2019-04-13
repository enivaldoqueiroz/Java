package com.jecq.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M):");
		String imput = scan.next();
		
		if (imput.equalsIgnoreCase("f")) {
			System.out.println("F - Feminio");
		} else if (imput.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo invalido");
		}
	}

}