package Programació;

import java.util.Scanner;

public class ACT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		// VARIABLES
			
		double imc;
		double peso;
		double altura;
		
		// ALGORITMO
			// IMC = peso(Kg) / (altura * altura)(m)
		
		System.out.println("Cual es tu peso en 'kg'? ");
		peso = teclado.nextDouble();
		
		System.out.println("Cual es tu altura en 'm'? ");
		altura = teclado.nextDouble();
		
		imc = peso /  (altura * altura);
		System.out.println("Tu IMC es: "+ imc);
		
	}

}
