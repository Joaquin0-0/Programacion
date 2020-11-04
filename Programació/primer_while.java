package Programació;

import java.util.Scanner;

public class primer_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//Variables
		
		int n;
		int cont = 1;
		
		//Algoritmo
		
		System.out.println("Dime un numero: ");
		n = teclado.nextInt();
		
		while (n != cont) {
			System.out.println(cont);
			
			cont = cont + 1;
		}
		
	}

}
