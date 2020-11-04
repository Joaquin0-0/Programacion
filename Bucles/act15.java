package Bucles;

import java.util.Scanner;

public class act15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//Variable
		int num = 1;
		int resu = 0;
		
		//Algoritmo		
		while(num != 0) {
			System.out.println("Dime un número: ");
			num = teclado.nextInt();
			
			resu = num + resu;
		}
		
		System.out.println(resu);
	}

}
