package com.jecq.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int num = scan.nextInt();
		
		if (num >= 0) {
			System.out.print("Numero Positivo");
		} else {
			System.out.print("Numero Negativo");
		}
	}

}
