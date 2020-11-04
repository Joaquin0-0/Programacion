package Bucles;

import java.util.Scanner;

public class act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int numIntro = 0;
		
		//ALGORITMO
		
		do {
			System.out.println("Dime un número: ");
			numIntro = teclado.nextInt();
			
			if((numIntro % 2) == 0) {
				System.out.println("El numero introducido, "+numIntro+" es par");
			}else {
				System.out.println("El numero introducido, "+numIntro+" es inpar");
			}
		}
		while(numIntro != 0);
	}

}
