package Programació;

import java.util.Scanner;

public class primer_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int cont = 100;
		int resuPar = 0; 
		int resuImpar = 0;
		
		//ALGORITMO
		
		//FOR
		for (cont = 100; cont <= 200; cont++) {
			if((cont % 2) == 0) {
				resuPar = resuPar + cont;
			}else {
				resuImpar = resuImpar + cont;
			}
		}
		System.out.println("Bucle 'FOR'");
		System.out.println("El resultat Par es: "+resuPar);
		System.out.println("El resultat Impar es: "+resuImpar);
		System.out.println();
		
		//WHILE
		while (cont <= 200) {
			if((cont % 2) == 0) {
				resuPar = resuPar + cont;
			}else {
				resuImpar = resuImpar + cont;
			}
			cont++;
		}
		System.out.println("Bucle 'WHILE'");
		System.out.println("El resultat Par es: "+resuPar);
		System.out.println("El resultat Impar es: "+resuImpar);
		System.out.println();
		
		//DO WHILE
		do {
			if((cont % 2) == 0) {
				resuPar = resuPar + cont;
			}else {
				resuImpar = resuImpar + cont;
			}
			cont++;
		}
		while(cont <= 200);
		
		System.out.println("Bucle 'Do While'");
		System.out.println("El resultat Par es: "+resuPar);
		System.out.println("El resultat Impar es: "+resuImpar);
	}

}
