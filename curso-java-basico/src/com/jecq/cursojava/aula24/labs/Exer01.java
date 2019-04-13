package com.jecq.cursojava.aula24.labs;

public class Exer01 {
	
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.modelo = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		//Arrey
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
	}

}
