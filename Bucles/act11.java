package Bucles;

import java.util.Scanner;

public class act11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int num;
		int cont = 1;

		int resu = 1;

		//ALGORITMO

		System.out.println("Dime el número que quiere calcuar: ");
		num = teclado.nextInt();

		//FOR
		System.out.println("FOR");
		for(cont=1; cont<=num; cont++) {
			resu = cont * resu;
		}

		System.out.println("El factorial de "+num+" es: "+resu);


		System.out.println();

		//WHILE
		System.out.println("While");
		while(cont <= num) {
			resu = cont * resu;

			cont++;
		}
		System.out.println("El factorial de "+num+" es: "+resu);


		System.out.println();

		//Do WHILE
		resu = 1;
		cont = 1;
		System.out.println("Do While");
		do {
			resu = cont * resu;

			cont++;
		}while(cont <= num);
		System.out.println("El factorial de "+num+" es: "+resu);
	}

}
