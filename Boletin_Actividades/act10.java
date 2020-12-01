package Voletin_Actividades;

import java.util.Scanner;

public class act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Programa que lea 2 numeros y calcule la suma, resta, producto y division.
		
		// VARIABLES
		
		int num1;
		int num2;
		int sum;
		int resta;
		int mult;
		double resto;
		double div;
		
		// ALGORITMO
		
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		
		sum = num1 + num2;
		resta = num1 - num2;
		mult = num1 *num2;
		
		System.out.println("La suma es: "+ sum);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicación es: "+mult);
		
		if (num2 == 0) {
			System.err.println("Error, no se puede dividir entre 0");
			System.err.println("Error, no se puede sacar el resto");
		}
		else {
			resto = num1 % num2;
			div = num1 / num2;
			System.out.println("El resto es: "+resto);
			System.out.println("La división es: "+div);
		}
		
	}

}
