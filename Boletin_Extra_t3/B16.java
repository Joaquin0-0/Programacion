package Boletin_Extra_t3;

import java.util.Scanner;

public class B16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int num;
		int cantmulti = 0;
		
		//ALGORITME
		
		System.out.print("Dime un número: ");
		num = teclado.nextInt();
		
		for (int i = 1; i < num; i++) {
			if((i % 3) == 0) {
				cantmulti++;
			}
		}
		
		System.out.print("Cantidad de multiplos de 3: "+cantmulti);
		
	}

}
