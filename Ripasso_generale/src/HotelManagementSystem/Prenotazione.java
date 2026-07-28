package HotelManagementSystem;

import java.time.LocalDate;
import java.util.Objects;

public class Prenotazione {

	//variabili di istanza
	
	private String codice;
	private Cliente cliente;
	private Camera camera;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private StatoPrenotazione statoPrenotazione;
	
	//costruttore 
	public Prenotazione(String codice, Cliente cliente, Camera camera, LocalDate checkIn, LocalDate checkOut) {
		
		this.codice = codice;
		this.cliente = cliente;
		this.camera = camera;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.statoPrenotazione = StatoPrenotazione.CREATA;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public StatoPrenotazione getStatoPrenotazione() {
		return statoPrenotazione;
	}

	public void setStatoPrenotazione(StatoPrenotazione statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}

	//metodi
	
	@Override
	public int hashCode() {
		return Objects.hash(codice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prenotazione other = (Prenotazione) obj;
		return Objects.equals(codice, other.codice);
	}

	@Override
	public String toString() {
		return "Prenotazione \n"
				+ "codice = " + codice + ", \n"
						+ " cliente = " + cliente + ", \n"
								+ " camera = " + camera + ", \n"
										+ " checkIn = " + checkIn + ", \n"
												+ " checkOut = " + checkOut + ", \n"
					                                	+ " statoPrenotazione=" + statoPrenotazione + ".";
	}
	
	
	
	
	
	
}
