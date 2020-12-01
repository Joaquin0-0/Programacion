package Funciones;

import java.util.Scanner;

public class ej4 {

	static Scanner sc = new Scanner(System.in);


	public static boolean primo(int num) {
		boolean resu = false;

		int div = 0;

		for (int i = 1; i <= num; i++) {
			if((num % i) == 0) {
				div++;
				if (div == 3) {
					resu = false;
					break;
				}else {
					resu = true;
				}
			}
		}
		return resu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		System.out.println("Dime un número: ");
		num = sc.nextInt();

		boolean resu = primo(num);

		if (resu==true) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}

	}

}
