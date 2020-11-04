/**
 * 
 */
package Boletin_Extra_t3;

/**
 * @author DAM
 * 
 * Programa que te mostro tots els pars fins al 200.
 * 
 * Dta: 02/11/2020
 * Lloc: Alzira
 *
 */
public class B3 {

	/**
	 * @param args
	 * 
	 * Ensenyar tots els pars fins al 200,
	 * utilitzant un for i un condicional
	 * per a poder calcular quins son pars.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		
		int cont;
		
		//ALGORITME
		
		for(cont = 0; cont <= 200; cont++) {
			if((cont % 2) == 0) {
				System.out.println(cont);
			}
		}
		
		
	}

}
