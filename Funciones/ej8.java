package Funciones;

import java.util.Scanner;

public class ej8 {
	/*
	 * Escriba una función que dado un número, dibuje 
	 * un triángulo de esa altura. Ejemplo altura=3
	 */

	static Scanner sc = new Scanner(System.in);

	public static void triangulo(int num) {

		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		System.out.println("Dime la altura del triángulo:");
		num = sc.nextInt();

		triangulo(num);

	}

}
