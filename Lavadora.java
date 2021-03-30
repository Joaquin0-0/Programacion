package electrodomesticos;

public class Lavadora extends electrodomesticos {

	private int carga = 5;

	public Lavadora() {
		this.carga = 5;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = carga;
	}

	public Lavadora(int precioBase, int carga, String color, int peso, String consumoEnergetico) {
		super(precioBase, color, peso, consumoEnergetico);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	//Cogemos el preciofinal de la clse padre y la pasamos a la hija y averiguamos que si la carga supera x se suma. 
	@Override
	public double precioFinal() {
		double devolver = super.precioFinal();

		if (carga > 30) {
			devolver = devolver + 50;
		}

		return devolver;
	}
}
