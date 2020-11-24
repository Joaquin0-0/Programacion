package Bucles;

import java.util.Scanner;

public class act20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int aB = 0;
		int cont = 0;
		int cont2 = 0;
		String esp = " ";
		
		//ALGORITME

		System.out.println("Dime la altura del triangulo: ");
		aB = teclado.nextInt();
		
		for(cont = 1; cont <= aB; cont++) {
				for(cont2=1; cont2<= cont; cont2++) {
					System.out.print("*");
				}
				System.out.println();
		}
		
	}

}
