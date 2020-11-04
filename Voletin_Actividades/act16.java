package Voletin_Actividades;

import java.util.Scanner;

public class act16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// escribe una calificación numérica entre 0 y 10 y la transforma en calificación alfabética
		
		// VARIABLES
		
		int cali;
		int md;
		int in;
		int bn;
		int not;
		int sob;
		
		// ALGORITMO
		
		System.out.println("Que nota has sacado? ");
		cali = teclado.nextInt();
		
		if (cali <= 2) {
			System.out.println("Muy deficiente");
		}
		else {
			if (cali <= 4) {
				System.out.println("Insuficiente");
			}
			else {
				if(cali <=5) {
					System.out.println("Suficiente");
				}
				else {
					if(cali <= 6) {
						System.out.println("Bien");
					}
					else {
						if(cali <= 8) {
							System.out.println("Notable");
						}
						else {
							System.out.println("Sobresaliente");
						}
					}
				}
				
			}
		}
		
	}

}
