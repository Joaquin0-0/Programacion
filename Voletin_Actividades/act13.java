
package Voletin_Actividades;

import java.util.Scanner;

public class act13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Pide 2 números i visualizalos en orde ascendente
		
		// VARIABLES
		
		int num1;
		int num2;
		
		// ALGORITMO
		
		System.out.println("Dime el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el segundo número: ");
		num2 = teclado.nextInt();
		
		if(num1 < num2) {
			System.out.println(num1 +", "+ num2);
		}
		else {
			System.out.println(num2 +", "+ num1);
		}
		
	}

}
