package algoritmos.resolvildos500;

import java.util.Scanner;

public class Algoritmo20 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// Algoritmo20
		
		String c,c1,d,d1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite palavra 1: ");
		c = sc.nextLine(); 
		System.out.println("\nDigite palavra 2: ");
		c1 = sc.nextLine(); 
		System.out.println("\nQuantidade de letras: " + c.toString().length());
		System.out.println("\nConcatenando: " + c.concat(c1));
		d = c1;
		System.out.println("\n� o conteudo de d: " + d);
		d1 = c.concat(c1);
		System.out.println("\nConcatena��o: " + d1);
		System.out.println("\nPrimeiro caracter da palavra " + c + ": " + c.substring(0,1));
		System.out.println("\nUltimo caracter da palavra " + c + ": " +c.substring(c.length() - 1));
		System.out.println("\nOs tr�s primeiros caracteres da palavra " + c + ": " + c.substring(0,3));
		System.out.println("\nOs tr�s ultimos caracteres da palavra " + c + ": " +c.substring(c.length() - 3));

	}

}
