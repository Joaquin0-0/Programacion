package Programació;

import java.util.Scanner;

public class Programació1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Soy Iroman!");
		System.out.print("Benvinguts al món JAVA!");
		
		System.out.println("------------------------");
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		String nombre;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.println("La edad que has introducido es: "+ edad);
		
		System.out.println("¿Como te llamás? ");
		nombre = teclado.nextLine();	
		System.out.print("Bienvenid@ "+ nombre);
		
	}

}
