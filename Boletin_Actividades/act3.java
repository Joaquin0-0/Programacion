package Voletin_Actividades;

import java.util.Scanner;

public class act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Calcula el área de un cuadrado
		
		//VARIABLES
		int cost;
		
		System.out.println("Introduce el largo del costado: ");
		cost = teclado.nextInt();
		
		cost = cost*4;
		
		System.out.println("El area del cuadrado es: "+cost);
		
	}

}
