package Funciones;

import java.util.Scanner;

public class ej1 {

	static Scanner sc = new Scanner(System.in);
	
	public static int numerosComprendidos(int num, int cont) {
		int resu = 0;
		
		for (int i = num; i <= cont; i++) {
			System.out.println(i);
		}
		
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int cont;
		
		System.out.println("Dime un número: ");
		num = sc.nextInt();
		
		System.out.println("Dime otro mayor: ");
		cont = sc.nextInt();
		
		num = numerosComprendidos(num, cont);
		cont = numerosComprendidos(cont, num);
		
	}

}
