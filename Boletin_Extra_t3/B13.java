package Boletin_Extra_t3;

import java.util.Scanner;

public class B13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int euros;
		
		//ALGORITME
		
		System.out.println("Dime cuantos euros (Siempre multiplo de 5!!)");
		euros = teclado.nextInt();
		
		do {
			if(euros % 5 != 0) {
				System.err.println("Datos incorrectos.");
			}else {
				if(euros >= 500) {
					System.out.println("Un billete de 500");
					euros = euros - 500;
				}else {
					if(euros >= 200) {
						System.out.println("Un billete de 200");
						euros = euros - 200;
					}else {
						if(euros >= 100) {
							System.out.println("Un billete de 100");
							euros = euros - 100;
						}else {
							if(euros >= 50) {
								System.out.println("Un billete de 50");
								euros = euros - 50;
							}else {
								if(euros >= 20) {
									System.out.println("Un billete de 20");
									euros = euros - 20; 
								}else {
									if(euros >= 10) {
										System.out.println("Un billete de 10");
										euros = euros - 10;
									}else {
										if(euros >= 5) {
											System.out.println("Un billete de 5");
											euros = euros - 5;
										}
									}
								}
							}
						}
					}
				}
			}
			
			
		}while(euros != 0);
	}

}
