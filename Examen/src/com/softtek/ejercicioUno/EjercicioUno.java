package com.softtek.ejercicioUno;

import java.util.Scanner;

public class EjercicioUno {
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("cual es la tabla que quisieras conocer: ");
		int tabla = lector.nextInt(); 
		
		for(int i=1;i<=10;i++) {
			
			int multiplicacion = tabla*i;
			System.out.println(String.valueOf(tabla)+ " X " + i + " = " + multiplicacion);
		}
	}

}
