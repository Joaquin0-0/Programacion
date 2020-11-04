package Bucles;

import java.util.Scanner;

public class act13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//Variables
		int num;

		//Algoritmo
		do {
			System.out.println("Dime un número: ");
			num = teclado.nextInt();

			if(num != 0) {
				if(num < 0) {
					System.out.println("El número, "+num+" es negativo");
				}else {
					System.out.println("El número, "+num+" es positivo!");
				}
			}
		}while(num != 0);


	}

}
