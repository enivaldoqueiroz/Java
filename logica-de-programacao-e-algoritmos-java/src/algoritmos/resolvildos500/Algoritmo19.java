package algoritmos.resolvildos500;

import java.text.DecimalFormat;

public class Algoritmo19 {

	public static void main(String[] args) {
		// Algoritmo19
		
		//Variaveis
		int x = 64;
		String padrao = "###,####.###";
		DecimalFormat p = new DecimalFormat(padrao);
		
		//Saidas
		System.out.println("Raiz de 64: " + Math.sqrt(x));
		System.out.println("\nRaiz com exp e log (Transformando real em inteiro): " + (int)Math.pow((Math.sqrt(Math.log(x))), 3));
		System.out.println("\nRaiz com exp e log (Transformando real em inteiro): " + (int)Math.exp((Math.sqrt(Math.log(x)))));
		//System.out.println("\nRaiz com exp e log (Transformando real em inteiro): " + (int)Math.pow((1%2*(Math.log(x))), 3));
		//System.out.println("\nRaiz com exp e log (Sem Transformar real em inteiro): " + Math.pow((Math.sqrt(Math.log(x))), 3));
		System.out.println("\nRaiz com exp e log (Sem Transformar real em inteiro): " + Math.exp((Math.sqrt(Math.log(x)))));
		System.out.print(p.format(Math.asin(45*Math.PI/180)+0.0001)+3);
		System.out.println("\nRaiz cubica: " + Math.log(8));
		System.out.println("\nRaiz cubica: " + Math.cbrt(8));
		System.out.println("\nAboluto: " + Math.abs(-8));
		System.out.println("\nAboluto: " + Math.abs(8));
		System.out.println("\nConvertendo para inteiro 5.5: " + (int)5.5);
		System.out.println("\nConvertendo para inteiro 6.5: " + (int)6.5);
		System.out.println("\nConvertendo para inteiro 6.5 + 0.000.1: " + (int)(6.5 + 0.0001));
		System.out.println("\nConvertendo para inteiro 5.45: " + (int)5.45);
		System.out.println("\nConvertendo para inteiro 5.51: " + (int)5.51);
		System.out.println("\nConvertendo para real 87: " + (float)87);
		System.out.println("\nConvertendo para inteiro 3/4: " + (3/4) + "\n");
		System.out.println("\n");
	}

}
