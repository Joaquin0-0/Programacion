package Voletin_Actividades;

import java.util.Scanner;

public class act19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//VARIABLES

		int mes;

		//ALGORITMO

		System.out.println("Dime un numero entre el 1-12: ");
		mes = teclado.nextInt();

		if(mes <= 0 || mes >= 12) {
			System.err.println("Error, numero de meses incorrecto.");
		}else {
			if(mes == 1) {
				System.out.println("El mes "+mes+" es Enero");
				System.out.println("El mes "+mes+" es ");
			}else {
				if(mes == 2) {
					System.out.println("El mes "+mes+" es Febrero");
				}else {
					if(mes == 3) {
						System.out.println("El mes "+mes+" es Marzo");
					}else {
						if(mes == 4) {
							System.out.println("El mes "+mes+" es Abril");
						}else {
							if(mes == 5) {
								System.out.println("El mes "+mes+" es Mayo");
							}else {
								if(mes == 6) {
									System.out.println("El mes "+mes+" es Junio");
								}else {
									if(mes == 7) {
										System.out.println("El mes "+mes+" es Julio");
									}else {
										if(mes == 8) {
											System.out.println("El mes "+mes+" es Agosto");
										}else {
											if(mes == 9) {
												System.out.println("El mes "+mes+" es Septiembre");
											}else {
												if(mes == 10) {
													System.out.println("El mes "+mes+" es Octubre");
												}else {
													if(mes == 11) {
														System.out.println("El mes "+mes+" es Noviembre");
													}else {
														if(mes == 12) {
															System.out.println("El mes "+mes+" es Diciembre");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
