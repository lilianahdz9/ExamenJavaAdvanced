package com.softtek.ejercicioCuatro;

import java.util.Scanner;

public class EjercicioCuatro {
	
	public static void main(String[] args) {
		
		int i;
        int[] arreglo1 = new int[3];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<arreglo1.length; i++)
        {
            System.out.printf("dame el numero arreglo(1) " + i +  ": ");
            arreglo1[i] = teclado.nextInt();
        }
        
        int j;
        int[] arreglo2 = new int[3];

        for(j=0; j<arreglo1.length; j++)
        {
            System.out.printf("dame el numero arreglo(2) " + j +  ": ");
            arreglo2[j] = teclado.nextInt();
        }
        
        
        
        for(i=0; i <arreglo1.length; i++)
        {
            System.out.print(arreglo1[i] +  " ");
        }
        
        
        System.out.println("\n");
        for(j=0; j <arreglo1.length; j++)
        {
            System.out.print(arreglo2[j]+  " ");
        }
        
        System.out.println("\n\nel valor medio del arreglo 1 es: "+  arreglo1[1]);
        System.out.println("\nel valor medio del arreglo 1 es: "+  arreglo2[1]);
        
	}

}
