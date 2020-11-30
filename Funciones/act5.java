package Funciones;

import java.util.Scanner;

public class act5 {

	static Scanner sc = new Scanner(System.in);
	
	public static int factorial(int num) {
		int resu = 1;
		
		int num2 = 1;
		
		for (int i = 1; i <= num; i++) {
			num2 = i * num2;
		}
		
		resu = num2;
		
		
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("Dime el numero que quiere factorizar: ");
		num = sc.nextInt();
		
			int resu = factorial(num);
			System.out.println(resu);
		
	}

}
