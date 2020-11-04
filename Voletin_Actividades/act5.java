package Voletin_Actividades;

import java.util.Scanner;

public class act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//Dado el precio de venta y elprecio de venta real calcula el % de descuento.
		
		// VARIABLES
		
		int pv;
		int pvr;
		int desc;
		
		// ALGORITMO
		
		System.out.println("Cuanto cuesta el producto rebajado? ");
		pv = teclado.nextInt();
		
		System.out.println("Cual era el precio del producto sin rebajar? ");
		pvr = teclado.nextInt();
		
		desc = pv * 100;
		desc = desc / pvr;
		System.out.println("El descuento sera de "+desc +"%");
		
	}

}
