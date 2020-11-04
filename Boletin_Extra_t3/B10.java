/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int not;
		int not10 = 0;

		//ALGORITMO


		do {
			System.out.println("Dime una nota: ");
			not = teclado.nextInt();
			if(not >= -1 && not <= 10) {
				if(not == 10) {
					not10++;
				}
			}else {
				System.err.println("Valor introducido no permitido.");
			}
		}while(not != -1);

		if(not10 > 0) {
			System.out.println("Hubo una nota con valor 10");
		}else {
			System.out.println("No hubo una nota con valor 10");
		}
	}

}
