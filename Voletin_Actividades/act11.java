package Voletin_Actividades;

import java.util.Scanner;

public class act11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Programa que escrive 2 numeros y muestra el mayor
		
		// VARIABLES
		
		int num1;
		int num2;
		
		// ALGORITMO
		System.out.println("Dame el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dame el segundo número: ");
		num2 = teclado.nextInt();
		
		if (num1 < num2) {
			System.out.println("El "+num2+" es mayor que "+num1);
		}
		else {
			System.out.println("El "+num1+" es mayor que "+num2);
		}
	}

}
