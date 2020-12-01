package Voletin_Actividades;

import java.util.Scanner;

public class act17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// VARIABLES
		
		int hora;
		int min;
		int seg;
		
		// ALGORITMO
		
		System.out.println("Dime la Hora: ");
		hora = teclado.nextInt();
		
		System.out.println("Dime los minutos: ");
		min = teclado.nextInt();
		
		System.out.println("Dime los segundos: ");
		seg = teclado.nextInt();
		
		System.out.println(hora+"-"+min+"-"+seg);
		
		if((seg + 1) == 60) {
			min = min + 1;
			seg = 0;
			if (min == 60) {
				hora = hora + 1;
				min = 0;
				seg = 0;
			}
		}
		else {
			seg= seg + 1;
		}
		
		System.out.println(hora+"-"+min+"-"+seg);
		
	}

}
