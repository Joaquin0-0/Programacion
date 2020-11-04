package Condicionales;

import java.util.Scanner;

public class act0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		
		//ALGORITMO
		
		System.out.println("DIme un número: ");
		num = teclado.nextInt();
		
		if(num >= 0) {
			System.out.println("El numero "+num+" es positivo");
		}else {
			System.out.println("El numero "+num+" es negativo");
		}
	}

}
