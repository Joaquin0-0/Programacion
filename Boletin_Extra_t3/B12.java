/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int num;
		int numPc = 0;
		int cont = 0;

		//ALGORITMO

		System.out.println("Piensa un número, o apuntalo en un papel.");

		System.out.println("El número es mayor de 50? 1 = SI, 0 = NO: ");
		num = teclado.nextInt();

		if(num == 1) {
			System.out.println("El numero es mayor de 75? Si, no: ");
			num = teclado.nextInt();
			if(num == 1) {
				System.out.println("El numero es mayor de 85? Si, No: ");
				num = teclado.nextInt();
				if(num == 1) {
					for(cont = 86; cont <= 100; cont++) {
						System.out.println(cont);
						System.out.println("Es este tu número? Si = 1, No = 0");
						num = teclado.nextInt();
						if(num == 1) {
							System.out.println("Tu número es "+cont+"!!!!");
							break;
						}
					}
				}else {
					for(cont = 76; cont <= 85; cont++) {
						System.out.println(cont);
						System.out.println("Es este tu número? Si = 1, No = 0");
						num = teclado.nextInt();
						if(num == 1) {
							System.out.println("Tu número es "+cont+"!!!!");
							break;
						}
					}
				}

			}else {
				for(cont = 51; cont <= 75; cont++) {
					System.out.println(cont);
					System.out.println("Es este tu número? Si = 1, No = 0");
					num = teclado.nextInt();
					if(num == 1) {
						System.out.println("Tu número es "+cont+"!!!!");
						break;
					}
				}
			}
		}else {
			System.out.println("El numero es mayor de 25? Si, No: ");
			num = teclado.nextInt();
			if(num == 1) {
				for(cont = 26; cont <= 50; cont++) {
					System.out.println(cont);
					System.out.println("Es este tu número? Si = 1, No = 0");
					num = teclado.nextInt();
					if(num == 1) {
						System.out.println("Tu número es "+cont+"!!!!");
						break;
					}
				}
			}else {
				for(cont = 1; cont <= 25; cont++) {
					System.out.println(cont);
					System.out.println("Es este tu número? Si = 1, No = 0");
					num = teclado.nextInt();
					if(num == 1) {
						System.out.println("Tu número es "+cont+"!!!!");
						break;
					}
				}
			}
		}
	}
}