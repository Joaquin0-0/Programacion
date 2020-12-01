package Voletin_Actividades;

import java.util.Scanner;

public class act25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int num1;
		int num2;

		String oper;

		String sum;
		String rest;
		String multi;
		String div;

		//ALGORITMOS

		System.out.println("Dime un número:");
		num1 = teclado.nextInt();

		System.out.println("Dime otro número:");
		num2 = teclado.nextInt();

		sum = "+";
		rest = "-";
		multi = "*";
		div = "/";
		
		teclado.nextLine();
		
		System.out.print("Que operador? ");
		oper = teclado.nextLine();

		if(oper.equals("+")) {
			System.out.println(num1+num2);
		}else {
			if(oper.equals("-")) {
				System.out.println(num1 - num2);
			}else {
				if(oper.equals("*")) {
					System.out.println(num1 * num2);
				}else {
					if(num2 == 0) {
						System.err.println("No se puede dividir entre 0");
					}else {
						if(oper.equals("/")) {
						System.out.println(num1 / num2);
						}
					}
				}
			}
		}
	}

}
