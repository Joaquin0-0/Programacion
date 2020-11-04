package Bucles;

import java.util.Scanner;

public class act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		int cuadrado;
		int cas;
		
		//ALGORITME
		
		System.out.println("Como lo quieres hacer?");
		System.out.println("While pulse 1: do While pulse 2: for pulse 3");
		cas = teclado.nextInt();
		
		System.out.println("Dime un numero: ");
		num = teclado.nextInt();

		switch(cas) {
		case 1:
			System.out.println("While");
			System.out.println();
			
			while(num > 0) {			
				cuadrado = num * num;
				System.out.println("El cuadrado de "+num+" es "+cuadrado);
				
				System.out.println("Dime un numero: ");
				num = teclado.nextInt();
			}
			break;
		case 2:
			System.out.println("do While");
			System.out.println();
			
			do {
				cuadrado = num * num;
				System.out.println("El cuadrado de "+num+" es "+cuadrado);
				
				System.out.println("Dime un número: ");
				num = teclado.nextInt();
			}while(num > 0);
		case 3:
			System.out.println("for");
			System.out.println();
			
			for(; num > 0;) {
				cuadrado = num * num;
				System.out.println("El cuadrado de "+num+" es "+cuadrado);
				
				System.out.println("Dime un número: ");
				num = teclado.nextInt();
			}
		}
	}

}
