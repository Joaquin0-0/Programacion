package Funciones;

import java.util.Scanner;

public class ej6 {

	/**
	 * Escribe un programa que realice el producto de n números 
	 * consecutivos, introduciendo por teclado los dos
	 * límites inferior y superior de los números a 
	 * multiplicar (incluyendo los límites en el producto)
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static int producto(int num1, int num2) {
		int resu = 0;
		int producto = 1;
		
		for (int i = num1; i <= num2; i++) {
			producto = i * producto;
		}
		
		resu = producto;
		
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println("Dime el primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime el segundo número");
		num2 = sc.nextInt();
		
		int resu = producto(num1, num2);
		
		System.out.println(resu);
		
	}

}
