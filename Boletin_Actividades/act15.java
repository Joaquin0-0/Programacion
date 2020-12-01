package Voletin_Actividades;

import java.util.Scanner;

public class act15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Dados 3 números di cuál es el mayor
		
		// VARIABLES
		
		int num1;
		int num2;
		int num3;
	
		// ALGORITMOS
		
		System.out.println("Dime el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		num2 = teclado.nextInt();
		
		System.out.println("Dime el tercer numero: ");
		num3 = teclado.nextInt();
		
		if (num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1+" es el mayor");
			}
		}
		else {
			if(num2 > num3) {
				System.out.println(num2+" es el mayor");
			}
			else {
				System.out.println(num3+" es el mayor");
			}
		}
		
	}

}
