/*Dados 2 valores enteros mayores a 0, regresar cualquiera que sea el valor mas cercano a 21, 
  sin pasar de este. Regresar 0 si ambos se pasan.
Ejemplo de entrada
19 21 
17 22 
22 31

Ejemplo de salida
21 
17 
0*/

package com.softtek.ejercicioDos;

import java.util.Scanner;


public class EjercicioDos {
	
	public static void main(String[] args) {
		
		
		int CONTROL = 21;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("dame el primer numero: ");
		int numero1 = lector.nextInt();
		System.out.println("dame el segundo numero: ");
		int numero2 = lector.nextInt();
		
		if((numero1 & numero2) > CONTROL) {
			System.out.println("0");
		}else if(numero1 > CONTROL) {
			System.out.println(numero2);
		}else if (numero2 > CONTROL) {
			System.out.println(numero1);
		}else if((numero1 & numero2) < CONTROL){
			do {
				int restaCon1 = CONTROL - numero1;
				int restaCon2 = CONTROL - numero2;
				
				if(restaCon1 > restaCon2) {
					System.out.println(numero2);
				}else {
					System.out.println(numero1);
				}
			}while(true);
		}
	}

}
