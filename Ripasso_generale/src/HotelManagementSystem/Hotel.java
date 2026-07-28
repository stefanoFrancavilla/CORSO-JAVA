package HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	//variabili di istanza
	private List<Cliente> cliente;
	private List<Camera> camere;
	private List <Prenotazione> prenotazione;
	
	//costruttore
	public Hotel() {
		
		this.cliente = new ArrayList<>();
		this.camere = new ArrayList<>();
		this.prenotazione = new ArrayList<>();
	}

	
	//metodi getter setter
	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Camera> getCamere() {
		return camere;
	}

	public void setCamere(List<Camera> camere) {
		this.camere = camere;
	}

	public List<Prenotazione> getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(List<Prenotazione> prenotazione) {
		this.prenotazione = prenotazione;
	}

	//metodi
	
	@Override
	public String toString() {
		return "Hotel \n"
				+ "cliente = " + cliente + ", \n"
						+ " camere = " + camere + ", \n"
								+ " prenotazione = " + prenotazione + ".";
	}
	
	//metodi cliente --------------------------------------------------------
	
	
	
	public void registraCliente (Cliente cliente)
	{
		
	}
	
	
	
	
}
