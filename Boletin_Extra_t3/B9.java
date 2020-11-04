/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int cont;
		int sum = 0;
		int num;

		//ALGORITME

		for(cont = 1; cont <= 10; cont++) {
			System.out.println("Dime un número:");
			num = teclado.nextInt();
			
			sum = num+sum;
			
		}
		System.out.println("El resultado de la suma es: "+sum);


	}

}
