package com.jecq.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //count o cont
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; //i = i + 1; ou i += 1;
		}
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 12);
		System.out.println(i);
	}
	

}
