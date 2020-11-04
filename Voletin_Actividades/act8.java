package Voletin_Actividades;

import java.util.Scanner;

public class act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Pon edad i te dice si eres mayor de edad o menor de edad
		
		// Variables
		
		int edad;
		int mm;
		
		// ALGORITMO
		
		System.out.println("Cual es tu edad? ");
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad!");
		}
		else {
			System.out.println("Eres menor de edad :(");
		}
		
		
	}

}
