package Bucles;

import java.util.Scanner;

public class act14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//Variables
		int num;
		int cont;
		
		//Algoritmo
		System.out.println("Dime un número: ");
		num = teclado.nextInt();
		
		for(cont = 1; num > 0; cont ++) {
			System.out.println("Dime un número: ");
			num = teclado.nextInt();
		}
		System.out.println(cont - 1);
		
	}

}
