package Voletin_Actividades;

import java.util.Scanner;

public class act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Passa de millas a metros. 1 milla = 1852 m.
		
		// VARIABLES
		
		int millas;
		int metros;
		
		// ALGORITMO
		
		System.out.println("Introduce las millas: ");
		millas = teclado.nextInt();
		
		metros = millas * 1852;
		System.out.println(millas+" Millas son "+metros+" Metros");
		
	}

}
