package Bucles;

import java.util.Scanner;

public class act18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
	
		int resu = 0;
		
		System.out.println("Dime un número: ");
		int num = teclado.nextInt();
		
		int num2 = num;
		
		//ALGORITMO
		
			while (num2 > 0) {
				if((num2 % 10) == 0) {
					resu++;
				}
				
				num2 = num2/10;
			}
		
		System.out.println("El número "+num+" tiene "+resu+" ceros");
		
	}

}
