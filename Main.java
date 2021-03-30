package electrodomesticos;

public class Main {
	public static void main(String[] args) {

		electrodomesticos[] electrodomesticos = new electrodomesticos[10];
//Creas el array y lo rellenas
		
		
		electrodomesticos[0] = new Lavadora(780, 50);
		electrodomesticos[1] = new Lavadora(5, 15);
		electrodomesticos[2] = new Lavadora(10, 60);
		electrodomesticos[3] = new Lavadora(85, 50);
		electrodomesticos[4] = new Television(30, 15);
		electrodomesticos[5] = new Television(5, 15);
		electrodomesticos[6] = new Television(55, 78);
		electrodomesticos[7] = new Television(68, 95);
		electrodomesticos[8] = new electrodomesticos(25, "azul", 75, "d");
		electrodomesticos[9] = new electrodomesticos(85, "negro", 25, "A");

		
		//Lo recorres
		for (int i = 0; i < electrodomesticos.length; i++) {
			System.out.println(electrodomesticos[i].precioFinal());
		}

		double precioLavadora = 0;
		double precioTelevisor = 0;
		double precioElectrodomestico = 0;
		double sumaTotal = 0;

		
		//Ejecutasmos el instanceof y vemos y comprobamos que es un objeto de clase concreta
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Lavadora) {
				precioLavadora = precioLavadora + electrodomesticos[i].precioFinal();
			} else {
				if (electrodomesticos[i] instanceof Television) {
					precioTelevisor = precioTelevisor + electrodomesticos[i].precioFinal();

				} else {

					precioElectrodomestico = precioElectrodomestico + electrodomesticos[i].precioFinal();
				}
			}

		}
		sumaTotal = precioElectrodomestico + precioLavadora + precioTelevisor;

		System.out.println("La suma de Electrodomesticos en total es : " + sumaTotal);
		System.out.println("La suma de Lavadora es : " + precioLavadora);
		System.out.println("La suma de Televisores es : " + precioTelevisor);
	}
}
