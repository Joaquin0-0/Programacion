package Bucles;

import java.util.Scanner;

public class act16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//Variable
		int num;
		double cont = 0;
		double suma = 0;
		double media = 0;
		
		//Algoritmo
		do {
			System.out.println("Dime un número; ");
			num = teclado.nextInt();
			
			if(num > 0) {
				
				suma = num + suma;
				cont = cont + 1;
			}else {
				media = suma / cont;
			}
		}while(num > 0);
		System.out.println(media);
	}

}
