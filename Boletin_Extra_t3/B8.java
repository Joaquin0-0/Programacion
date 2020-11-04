/**
 * 
 */
package Boletin_Extra_t3;

import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class B8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES

		int num;
		
		int neg = 0;
		int pos = 0;
		
		//ALGORITMOS
	
		do {
			System.out.println("Dime un número: ");
			num = teclado.nextInt();
			
			if (num != 0) {
				if(num < 0){
					neg++;
				}else {
					pos++;
				}
				
			}
		}while(num != 0);
		
		System.out.println("Numeros negativos: "+neg);
		System.out.println("Numeros positivos: "+pos);
	}

}
