package Funciones;

import java.util.Scanner;

public class ej6_1 {

	static Scanner sc = new Scanner(System.in);
	
	public static int producto(int num) {
		int resu = 0;
		int producto = 1;
		int max = num + 10;
		
		for (int i = num; i <= max; i++) {
			producto = i * producto;
		}
		
		resu = producto;
		
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("Dime un número:");
		num = sc.nextInt();
		
		int resu = producto(num);
		
		System.out.println(resu);
	}

}
