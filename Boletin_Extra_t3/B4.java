/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 * 
 * Programa que et mostri tots els números fins al número
 * que has introduit. 
 *
 */
public class B4 {

	/**
	 * @param args
	 * 
	 * Amb un Scanner guardarem lo que s'introuxica per teclat.
	 * 
	 * Nessesitem 2 variables, una per a poder contar, i un 
	 * atra on es guardara el número introduit per l'usuari.
	 * 
	 * Amb un while farem que es mostre el resultat.
	 * 
	 * Data: 02/11/2020
	 * Lloc: Alzira
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		int cont = 1;
		
		//ALGORITME
		
		System.out.println("DIme un número: ");
		num = teclado.nextInt();
		
		while(cont <= num) {
			System.out.println(cont);
			
			cont++;
		}
		
	}

}
