package Funciones;

import java.util.Scanner;

public class ej10 {

	/*
	 * Diseñar un programa que, dado un número positivo, 
	 * lo devuelva al revés 
	 * (si introducimos 1024 nos devolverá 4201)
	 */

	static Scanner sc = new Scanner(System.in);

	public static int numR(int num) {
		int resu = 0;
		int resuResto = 0;

		while(num > 0) {
			resuResto = num % 10;
			resu = resu * 10 + resuResto;
			num = num / 10;
		}

		return resu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		System.out.println("Dime un número positivo;");
		num = sc.nextInt();

		do {
			if(num < 0) {
				System.err.println("Error, el numero es negativo!!");

				System.out.println("Dime un número positivo:");
				num = sc.nextInt();
			}
		}while(num < 0);

		int resu = numR(num);
		System.out.println(resu);


	}

}
