package Funciones;

import java.util.Scanner;

public class ej0 {

	static Scanner sc = new Scanner(System.in);

	public static int maximo(int num1, int num2) {
		int resu = 0;

		if(num1 > num2) {
			resu = num1;
		}else{
			resu = num2;
		}

		return resu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		System.out.println("Dime el primer número: ");
		num1 = sc.nextInt();

		System.out.println("Dime el segundo número: ");
		num2 = sc.nextInt();

		int resu = maximo(num1, num2);
		System.out.println(resu);
	}

}
