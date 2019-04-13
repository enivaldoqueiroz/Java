package com.jecq.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O numero 1 é o maior " + num1);
		}else {
			System.out.println("O numero 2 é o maior " + num2);
		}
		
	}

}
