package Bucles;

import java.util.Scanner;

public class act19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
	
		int resu = 0;
		
		System.out.println("Dime un número: ");
		int num = teclado.nextInt();
		
		int num2 = num;
		
		
		//ALGORITMO
		while(num != 0){
			while (num2 > 0) {
				num2 = num2/10;
				resu++;
			}
			System.out.println("El número: "+num+" tiene "+resu+" cifras");	
			
			System.out.println();
			
			System.out.println("Dime un número: ");
			num = teclado.nextInt();
				
			num2 = num;
		}
		
	}

}
