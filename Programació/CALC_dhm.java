package Programació;

import java.util.Scanner;

public class CALC_dhm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Se debe realizar un programa en el que se introduzca un número de minutos y 
		// devuelva la conversión a días, horas y minutos.

		// VARIABLES

		int min;
		int hor = 60;
		int dia = 1440;

		// ALGORITMO
		System.out.println("Quantos minutos? ");
		min = teclado.nextInt();

			hor = min % dia;
			dia = min/dia;
			min = hor%60;
			hor = hor/60;
			
			System.out.println(dia +" Dia");
			System.out.println(hor +" Hora");
			System.out.println(min +" Minuts");

		

	}
}