/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num1;
		int num2;
		int calculo = 1;
		int cont;
		
		//ALGORITMO
		
		System.out.println("Dime el valor A");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el valor B");
		num2 = teclado.nextInt();
		
		for(cont = 1; cont <= num2; cont++) {
			calculo = num1 * calculo;
		}
		
		System.out.println(calculo);
		
	}

}
