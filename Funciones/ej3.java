package Funciones;

import java.util.Scanner;

public class ej3 {

	static Scanner sc = new Scanner(System.in);

	//Calculo del Area
	public static double areaVl(double altura, double radio, int areaVo) {
		double resu = 0;

		if(areaVo == 1) {
			resu = 2 * 3.14 * radio;
			resu = resu * (radio+altura);
			resu = resu/2;
		}else {
			resu = 3.14 * (radio * radio) * altura;
			resu = resu/2;
		}

		return resu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int areaVolumen;

		double radio;
		double altura;
		do {
			System.out.println("Que quieres calcular?");
			System.out.println("Area = 1     Volumen = 2");
			areaVolumen = sc.nextInt();

			if(areaVolumen == 1 || areaVolumen == 2) {
				System.out.println("Dime el radio del cilindro:");
				radio = sc.nextInt();

				System.out.println("Dime la altura del cilindro: ");
				altura = sc.nextInt();

				double resu1 = areaVl(radio, altura, areaVolumen);
				System.out.println(resu1);
			}
		}while(areaVolumen == 1 || areaVolumen == 2);

	}

}
