package Condicionales;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num1;
		int num2;
		
		//ALGORITMO
		
		System.out.println("Dime el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		num2 = teclado.nextInt();
		
		if((num1 % num2) == 0) {
			System.out.println(num1+" si que es multiplo de "+num2);
		}else {
			System.out.println(num1+" no es multiplo de "+num2);
		}
		
	}

}
