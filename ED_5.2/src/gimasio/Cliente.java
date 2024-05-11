package gimasio;

public class Cliente extends Actor {
	private Pago[] pagos;
	private Clase[] reservas;

	public Cliente() {
	}

	public Pago[] getPagos() {
		return pagos;
	}

	public void setPagos(Pago[] pagos) {
		this.pagos = pagos;
	}

	public Clase[] getReservas() {
		return reservas;
	}

	public void setReservas(Clase[] reservas) {
		this.reservas = reservas;
	}

}
