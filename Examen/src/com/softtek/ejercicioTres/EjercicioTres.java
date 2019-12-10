package com.softtek.ejercicioTres;

import java.util.Scanner;

public class EjercicioTres {
	
		public static void main(String[] args) {
	        Scanner lector = new Scanner(System.in);
	        System.out.print("Introduce una frase para saber si es palindromo: ");
	        String frase = lector.nextLine();
	        
	        frase=frase.replace(" ", "");
	        frase=frase.replace(",", "");
	        frase=frase.replace(".", "");
	        System.out.print(frase);
	        int finalPalabra = frase.length()-1;
	        int inicioPalabra=0;
	        boolean espalin=true;
	        
	        while(inicioPalabra < finalPalabra){
	            if(frase.charAt(inicioPalabra)!=frase.charAt(finalPalabra)){
	                espalin=false;
	            }
	        inicioPalabra++;
	        finalPalabra--;
	        }
	        if(espalin)
	            System.out.print("\nsi");
	        else
	            System.out.print("\nno");
	}
}
