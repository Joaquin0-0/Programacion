package Programació;

import java.io.IOException;
import java.util.Scanner;

public class primer_doWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int vari;
		
		//ALGORITMO
		
		System.out.println("Bienvenido al menu, pulse:");
		
		do {
			System.out.println("1 - volver a imprimir el menu." );
			System.out.println("0 - Para salir");
			
			System.out.println();
			vari = teclado.nextInt();
			
		}
		while(vari == 1);
		
	}

}
