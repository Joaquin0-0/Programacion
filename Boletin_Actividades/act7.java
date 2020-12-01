package Voletin_Actividades;

import java.util.Scanner;

public class act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Pon edad i te dice solo si eres mayor de edad
		
		// Variables
		
		int edad;
		
		// ALGORITMO
		
		System.out.println("Cual es tu edad? ");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad!");
		}
		
		
	}

}
