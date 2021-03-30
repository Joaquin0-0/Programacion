package electrodomesticos;

public class Television extends electrodomesticos {

	private int pulgadas;

	private boolean smartTV;

	public Television() {
		super();
	}

	public Television(int pulgadas, boolean smartTV) {
		super();
		this.pulgadas = 20;
		this.smartTV = false;
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.pulgadas = 20;
		this.smartTV = false;
	}

	public Television(int precioBase, int carga, String color, int peso, String consumoEnergetico) {
		super(precioBase, color, peso, consumoEnergetico);
		this.pulgadas = pulgadas;
		this.smartTV = smartTV;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	//Cogemos el preciofinal de la clse padre y la pasamos a la hija y averiguamos que si la carga supera x se suma o se multiplica. 

	public double precioFinal() {
		double devolver = super.precioFinal();

		if (pulgadas > 40) {
			devolver = (devolver * 0.3) + devolver;
		}
		if (smartTV) {
			devolver = devolver + 50;

		}

		return devolver;
	}
}

