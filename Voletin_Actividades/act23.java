package Voletin_Actividades;

import java.util.Scanner;

public class act23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int dias;
		int mes;
		int año;

		//ALGORITMO

		System.out.println("Dime dias en numero: ");
		dias = teclado.nextInt();

		System.out.println("Dime mes: ");
		mes = teclado.nextInt();

		System.out.println("Dime año: ");
		año = teclado.nextInt();
		if(dias < 31) {
			if(mes < 13) {
				if((dias + 1) == 31) {
					mes = mes + 1;
					dias = 0;
					if (mes == 13) {
						año = año + 1;
						mes = 0;
						dias = 0;
						System.out.println(dias+"-"+mes+"-"+año);
					}

				}else {
					dias = dias + 1;
					System.out.println(dias+"-"+mes+"-"+año);
				}
			}else {
				System.err.println("Error en los datos, no hay mas de 12 messes!");
			}
		}else {
			System.err.println("Error en los datos, no hay mas de 30 dias!");
		}
	}

}
