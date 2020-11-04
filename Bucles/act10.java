package Bucles;

import java.util.Scanner;

public class act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int cont;
		int numero;
		int resu = 0;
		
		//ALGORITMO
		
		System.out.println("Diem el numero: ");
		numero = teclado.nextInt();
		
		for (cont = 1; cont <= numero; cont++) {
			resu = resu + cont;
			System.out.println(resu);
		}
		
	}

}
