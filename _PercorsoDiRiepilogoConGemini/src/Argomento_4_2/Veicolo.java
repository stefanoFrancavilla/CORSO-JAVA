package Argomento_4_2;

public abstract class Veicolo {
	protected String cliente;

	public Veicolo(String cliente) {
		super();
		this.cliente = cliente;
	}

	public String getCliente() {
		return cliente;
	}
	
	public abstract boolean noleggia(int giorni);

}
