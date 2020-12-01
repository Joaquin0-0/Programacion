package Voletin_Actividades;

import java.util.Scanner;

public class act20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		
		//ALGORITMO
		
		System.out.println("Dime un número: ");
		num = teclado.nextInt();
		
		if(num < 10) {
			System.out.println("El numero tiene 1 cifra");
		}else {
			if(num < 100) {
				System.out.println("El numero tiene 2 cifras");
			}else {
				if(num < 1000) {
					System.out.println("El numero tiene 3 cifras");
				}else {
					if(num < 10000) {
						System.out.println("El numero tiene 4 cifras");
					}else {
						if(num < 100000) {
							System.out.println("El número tiene 5 cifras");
						}
					}
				}
			}
		}
		
	}

}
