package Voletin_Actividades;

import java.util.Scanner;

public class act19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLE
		
		int mes;
		
		//ALGORITMO
		
		System.out.println("Dime un mes del 1-12: ");
		mes = teclado.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Gener");
			break;
			case 2:
			System.out.println("Febrer");
			break;
			case 3:
			System.out.println("Març");
			break;
			case 4:
			System.out.println("Abril");
			break;
			case 5:
			System.out.println("Maig");
			break;
			case 6:
			System.out.println("Juny");
			break;
			case 7:
			System.out.println("Juliol");
			break;
			case 8:
			System.out.println("Agost");
			break;
			case 9:
			System.out.println("Setembre");
			break;
			case 10:
			System.out.println("Octubre");
			break;
			case 11:
			System.out.println("Novembre");
			break;
			case 12:
			System.out.println("Desembre");
			break;
		}
		
	}

}
