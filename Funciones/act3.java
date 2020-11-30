package Funciones;

import java.util.Scanner;

public class act3 {

	static Scanner sc = new Scanner(System.in);

	public static int prodcto(int num, int num2) {
		int resultado = 0;

		resultado = num * num2;

		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int num2;

		System.out.println("Die el primer número: ");
		num = sc.nextInt();

		System.out.println("Dime el segundo número: ");
		num2 = sc.nextInt();

		int res = prodcto(num, num2);
		System.out.println(res);

	}

}
