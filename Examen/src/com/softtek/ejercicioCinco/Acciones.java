package com.softtek.ejercicioCinco;

public class Acciones implements Operaciones {
	
	public static void main(String[] args) {
		Acciones numeros = new Acciones();
		numeros.suma(6, 7);
		numeros.resta(4, 7);
		numeros.multiplicacion(4, 6);
		numeros.division(10, 3);
		
		
	}

	@Override
	public void suma(int n1, int n2) {
		// TODO Auto-generated method stub
		int suma = n1 + n2;
		System.out.println("la suma es " + suma);
	}

	@Override
	public void resta(int n1, int n2) {
		// TODO Auto-generated method stub
		int resta = n1 - n2;
		System.out.println("la resta es " + resta);
		
	}

	@Override
	public void multiplicacion(int n1, int n2) {
		// TODO Auto-generated method stub
		int multiplicacion = n1 * n2;
		System.out.println("la multiplicacion es " + multiplicacion);
		
	}

	@Override
	public void division(int n1, int n2) {
		// TODO Auto-generated method stub
		int division = n1 / n2;
		System.out.println("la division es " + division);
		
	}
	
	
}
