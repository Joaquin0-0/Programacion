package Funciones;

import java.util.Scanner;

public class act1 {

	static Scanner sc = new Scanner(System.in);

	//Primer Entero
	public static int imprimePrimerNum() {
		int ent1 = 0;
		System.out.println("Dime un entero");
		return ent1 = sc.nextInt();
	}

	//Segundo Entero
	public static int imprimeScunNum() {
		int ent2 = 0;
		System.out.println("dime otro entero");
		return ent2 = sc.nextInt();
	}

	//Resultado
	public static void main(int[] args) {
		int resu = 0;

		int ent1 = imprimePrimerNum();

		int ent2 = imprimeScunNum();

		resu = ent1 + ent2;

		System.out.println(resu);
	}

}
