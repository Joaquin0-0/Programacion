package Programació;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// VARIABLES
		
		int num1;
		int num2;
		int suma;
		
		// ALGORITMO
		System.out.println("Dame un numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro numero: ");
		num2 = teclado.nextInt();
		
		suma = num1 + num2;
		System.out.println("El resulatdo de la suma es= "+ suma);
	}

}
