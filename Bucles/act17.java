package Bucles;

import java.util.Scanner;

public class act17 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;		// numero escrito por el usuario
		int cont = 1;	// contador para el for
		int cont2 = 0;	// contador para sumar las divisiones con resto 0
		
		//ALGORITMO
		
		System.out.println("Dime el numero: ");
		num = teclado.nextInt();
		
		// con el for sumaremos todos los restos que sean iguales a 0
		for(cont = 1; cont <= num; cont++) {
			if ((num % cont) == 0) {
				cont2++;
			}
		}
		
		// Una vez recojidos todos los restos. Con un condicional ponemos la condiciona
		// de si hay m'as de 2 restos iguales a 0 el numero no es primo y si si, el numero es primo.
		if(cont2 <= 2) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El número no es primo");
		}
		
	}

}
