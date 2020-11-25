package Boletin_Extra_t3;

import java.util.Scanner;

public class B15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner teclado = new Scanner(System.in);

				//VARIABLES
				
				int num;
				double sueldo;
				double sueldoM = 0;
				double sueldoM2 = 0;
				
				//ALGORITME
				
				System.out.println("Cuantos sueldos quieres introducir?");
				num = teclado.nextInt();
				
				System.out.println("Cual es tu sueldo?");
				sueldo = teclado.nextDouble();
				
				for (int i = 1; i < num; i++) {
					sueldoM = sueldo;
					
					if (sueldo >= sueldoM) {
						sueldoM2 = sueldoM;
						}
					
					System.out.println("Cual es tu sueldo?");
					sueldo = teclado.nextDouble();
				}
				System.out.println(sueldoM2);
				
	}

}
