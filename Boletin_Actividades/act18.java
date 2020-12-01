package Voletin_Actividades;

import java.util.Scanner;

public class act18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Programa que calcula el salrario neto semanal de un trabajador en funcion de horas trabajadas
		// y la tasa de impuestos.

		//Las primeras 35 horas se pagan a tarifa normal.
		//Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.

		//VARIABLES

		String nom;			//Nombre
		String ape;			//Apellido
		String ape2;		//Apellido 2

		int ht = 0;			//HORAS TRABAJADAS
		int ph = 10;		//PRECIO HORAS
		int hx = 0;			//HORAS EXTRA

		double sb = 0;		//SALARIO BRUTO
		double sn = 0;		//SALARIO NETO

		int tn = 0;			//TARIFA NORMAL
		double tx = 0;		//TARIFA EXTRA

		double sbi1 = 0;	//SALARIO BASE IMPUESTO 25%
		double sbi2 = 0;	//SALARIO BASE IMPUESTO 45%	

		double imp1 = 0;	//IMPUESTO DE 25%
		double imp2 = 0;	//IMPUESTO DE 45%

		double tass = 0;	//TOTAL DE LAS TASSAS

		//ALGORITMO

		System.out.println("Cual es tu nombre? ");
		nom = teclado.nextLine();

		System.out.println("Cual es tu primer apellido? ");
		ape = teclado.nextLine();

		System.out.println("Cual es tu segundo apellido? ");
		ape2 = teclado.nextLine();

		System.out.println("Cuantas horas trabaja a la semana? ");
		ht = teclado.nextInt();

		//Calculo del SALARIO BRUTO
		if(ht > 35) {

			tn = 35 * ph;

			hx = ht - 35;
			tx = ph * 1.5;
			sb = hx * tx + tn;		
		}else {
			tx = 0;
			tn = ht * ph;
			sb = tn;
		}

		//####################################################################################

		//Las tasas de impuestos son:
		//Los primeros 500 euros son libres de impuestos.
		//Los siguientes 400 tienen un 25% de impuestos.
		//Los restantes un 45% de impuestos.

		if(sb > 500) {
			sbi1 = sb - 500;
			if(sbi1 > 400) {
				sbi2 = sbi1 - 400;
				sbi1 = 400;

				imp1 = sbi1 * 0.25;
				imp2 = sbi2 * 0.45;
				
				tass = imp1 + imp2;
				
				sn = sb - tass;
			}else {
				imp1 = sbi1 * 0.25;
				imp2 = 0;
				
				tass = imp1 + imp2;
				
				sn = sb - tass;
			}
		}else {
			sn = sb;
		}


		//####################################################################################

		//Escribir nombre, salario bruto, tasas y salario neto

		System.out.println(nom+" "+ape+" "+ape2);
		System.out.println("El salario bruto es de "+sb+"€");
		System.out.println("Las tasas a pagar son un total de "+tass+"€");
		System.out.println("El salario neto es un total de "+sb+" - "+tass+" = "+ sn +"€");

	}

}

