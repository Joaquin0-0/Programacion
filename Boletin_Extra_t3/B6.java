/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int num;
		int nul = 0;
		int cont = 1;

		//ALGORITME

		do {
			System.out.println("Dime un número: ");
			num = teclado.nextInt();
			
			if(num < 0) {
				nul++;
			}
			
			if (num != 0) {
				cont++;
			}
			
		}while(cont <= 10);

		if(nul != 0) {
			System.out.println("He leido un número negativo!!");
		}else {
			System.out.println("No he leido ningun número negativo.");
		}

	}

}
