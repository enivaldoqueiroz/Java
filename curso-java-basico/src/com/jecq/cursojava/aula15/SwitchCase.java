package com.jecq.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia da semana:");
		int diaSemana = scan.nextInt();		
		
		/*if(diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("Ter�a");
		} else if (diaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else {
			System.out.println("Esse dia da semana invalido");
		} 
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a");   break;
		case 4: System.out.println("Quarta");  break;
		case 5: System.out.println("Quinta");  break;
		case 6: System.out.println("Sexta");   break;
		case 7: System.out.println("Sabado");   break;
		default:System.out.println("Esse dia da semana invalido");
		}*/
		

		switch (diaSemana) {
		
		case 2: 
		case 3: 
		case 4:
		case 5: 
		case 6: System.out.println("Dia uteis");  break;
		case 1: 
		case 7: System.out.println("Fim de Semana");  break;
		default:System.out.println("Esse dia da semana invalido");
		}
		
		

	}

}
