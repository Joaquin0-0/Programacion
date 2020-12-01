package Voletin_Actividades;

import java.util.Scanner;

public class act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Di si un número es positivo o negativo
		
		// VARIABLES
		
		int num;
		int posneg;
		
		// ALGORITMO
		
		System.out.println("Dame un número: ");
		num = teclado.nextInt();
		
		if(num >= 0) {
			System.out.println("El número es positivo");
		}
		else {
			System.out.println("El número es negativo");
		}
	}

}
