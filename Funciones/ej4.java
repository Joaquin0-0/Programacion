package Funciones;

import java.util.Scanner;

public class ej4 {

	static Scanner sc = new Scanner(System.in);

	public static int primo(int num) {
		int resu = 0;

		int div = 0;

		for (int i = 1; i <= num; i++) {
			if((num % i) == 0) {
				div++;
				if (div == 3) {
					resu = div;
					break;
				}else {
					resu = 2;
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

		int resu = primo(num);

		if (resu == 2) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}

	}

}
