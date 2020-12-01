package Voletin_Actividades;

import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Calcula a partir del radio: la longitud, el area y el volumen de la cicunferencia.
		
		// VARIABLES
		
			int radio;
			double longitud; // L = 2 * PI * r
			double area; // A = Pi * (r * r)
			double volumen; // V = 0,75 * PI * (r * r * r)
			double PI = 3.141;
		
		// ALGORITMOS
			
			System.out.println("Introduce la longitud del radio: ");
			radio = teclado.nextInt();
			
			longitud = 2 * PI * radio;
			area = PI * (radio * radio);
			volumen = 0.75 * PI * (radio * radio * radio);
			
			System.out.println("Dado el radio "+radio);
			System.out.println("La longitud de la cicunferencia es: "+longitud);
			System.out.println("El area de la cicunferencia es de "+ area);
			System.out.println("El volumen de la circunferencia es de: "+volumen);
			
			
		
	}

}
