package com.jecq.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Numero:");
		int numero1 = scan.nextInt();
		System.out.println("Segundo Numero:");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma dos numeros é  " + (numero1 + numero2));

	}

}
