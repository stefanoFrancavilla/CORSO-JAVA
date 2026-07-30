package HotelManagementSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Prenotazione {

	// Variabili di istanza
	private String codice;
	private Cliente cliente;
	private Camera camera;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private StatoPrenotazione statoPrenotazione;
	
	// Costruttore 
	public Prenotazione(String codice, Cliente cliente, Camera camera, LocalDate checkIn, LocalDate checkOut) {
		setCodice(codice);
		setCliente(cliente);
		setCamera(camera);
		
		// Impostiamo prima entrambe le date con controllo incrociato
		validaDate(checkIn, checkOut);
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		this.statoPrenotazione = StatoPrenotazione.CREATA;
	}

	// Helper di validazione per le date
	private void validaDate(LocalDate checkIn, LocalDate checkOut) {
		if (checkIn == null || checkOut == null) {
			throw new IllegalArgumentException("Le date di check-in e check-out non possono essere null");
		}
		if (!checkOut.isAfter(checkIn)) {
			throw new IllegalArgumentException("La data di check-out deve essere successiva alla data di check-in");
		}
	}

	// Metodi getter e setter
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		if (codice == null || codice.isBlank()) {
			throw new IllegalArgumentException("Il codice della prenotazione non può essere null o vuoto");
		}
		this.codice = codice;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		if (cliente == null) {
			throw new IllegalArgumentException("Il cliente non può essere null");
		}
		this.cliente = cliente;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		if (camera == null) {
			throw new IllegalArgumentException("La camera non può essere null");
		}
		this.camera = camera;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		validaDate(checkIn, this.checkOut != null ? this.checkOut : checkIn.plusDays(1));
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		validaDate(this.checkIn != null ? this.checkIn : checkOut.minusDays(1), checkOut);
		this.checkOut = checkOut;
	}

	public StatoPrenotazione getStatoPrenotazione() {
		return statoPrenotazione;
	}

	public void setStatoPrenotazione(StatoPrenotazione statoPrenotazione) {
		if (statoPrenotazione == null) {
			throw new IllegalArgumentException("Lo stato della prenotazione non può essere null");
		}
		this.statoPrenotazione = statoPrenotazione;
	}

	// Metodi di utilità
	public long getNottiSoggiorno() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}

	public double getCostoTotale() {
		return getNottiSoggiorno() * camera.getPrezzoNotte();
	}

	// Metodi override
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
		return "Prenotazione:\n"
				+ "  Codice: " + codice + "\n"
				+ "  Cliente: " + cliente.getNome() + " " + cliente.getCognome() + "\n"
				+ "  Camera N°: " + camera.getNumero() + "\n"
				+ "  Check-In: " + checkIn + "\n"
				+ "  Check-Out: " + checkOut + "\n"
				+ "  Notti: " + getNottiSoggiorno() + "\n"
				+ "  Costo Totale: " + getCostoTotale() + " €\n"
				+ "  Stato: " + statoPrenotazione;
	}
}