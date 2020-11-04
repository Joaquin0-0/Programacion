package Programació;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Se debe realizar un programa que dado un número introducido por el usuario, 
		// muestre en pantalla la tabla de multiplicar. 
		
		// VARIABLES
		
		int num;
		int cont;
		
		// ALGORITMO
		
		System.out.println("Introduce el numero que va a calcular: ");
		num = teclado.nextInt();
		
		for (cont = 1; cont <= 10; cont++) {
			System.out.println(num +" * "+ cont +" = "+ num* cont);
		}
		
	}

}
