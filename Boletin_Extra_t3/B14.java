package Boletin_Extra_t3;

import java.util.Scanner;

public class B14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int edad;
		int contEdad = 0;
		
		double alt;
		int contAlt = 0;
		
		double edadMedia = 0;
		double altMedia = 0;
		
		//ALGORIMTE
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime edad: ");
			edad = teclado.nextInt();
			
			if(edad >= 18) {
				contEdad = contEdad + 1;
			}
			
			System.out.println("dime altura: ");
			alt = teclado.nextDouble();
			
			if(alt >= 1.75) {
				contAlt = contAlt + 1;
			}
			
			edadMedia = edadMedia + edad;
			altMedia = altMedia + alt;
		}
		
		edadMedia = edadMedia/5;
		System.out.println("La edad media es de "+edadMedia);
		
		altMedia = altMedia/5;
		System.out.println("La altura media es de "+altMedia);
		
		System.out.println("La cantidad de alumnos mayores de 18 es: "+contEdad);
		System.out.println("La cantidad de alumnos que miden más de 1,75 es de: "+contAlt);
		
		
		
	}

}
