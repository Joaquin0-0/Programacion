package Funciones;

import java.util.Scanner;

public class act2 {

	static Scanner sc = new Scanner(System.in);
	
	public static int numero(int num) {
			int resu;
			
			resu = num * 2;
			
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dime numero:");
		int num = sc.nextInt();
		
		int numero = numero(num);
		
		System.out.println(numero);
	}

}