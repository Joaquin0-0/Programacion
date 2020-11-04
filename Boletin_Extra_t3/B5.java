/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		int cont = 1;
		int factorial = 1;
		
		//ALGORITME
		
		System.out.println("Dime un número: ");
		num = teclado.nextInt();
		
		while(cont <= num) {
			
			factorial = factorial * cont;
			cont ++;
			System.out.println(factorial);
		}
		
	}

}
