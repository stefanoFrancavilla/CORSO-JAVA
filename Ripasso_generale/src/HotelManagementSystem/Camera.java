package HotelManagementSystem;

import java.util.Objects;

public class Camera {

	// Variabili di istanza
	private int numero;
	private TipoCamera tipoCamera;
	private double prezzoNotte;
	private boolean isDisponibile;
	
	
	// Costruttore
	public Camera(int numero, TipoCamera tipoCamera) {
		setNumero(numero);
		setTipoCamera(tipoCamera);
		this.isDisponibile = true; 
	}

	// Metodi getter e setter
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Il numero della camera deve essere maggiore di 0");
		}
		this.numero = numero;
	}

	public TipoCamera getTipoCamera() {
		return tipoCamera;
	}

	public void setTipoCamera(TipoCamera tipoCamera) {
        if (tipoCamera == null) {
            throw new IllegalArgumentException("Il tipo di camera non può essere null");
        }
        this.tipoCamera = tipoCamera;
        this.prezzoNotte = tipoCamera.getPrezzoBase();
    }

	public double getPrezzoNotte() {
		return prezzoNotte;
	}

	public void setPrezzoNotte(double prezzoNotte) {
		if (prezzoNotte <= 0) {
			throw new IllegalArgumentException("Il prezzo per notte deve essere maggiore di 0");
		}
		
		this.prezzoNotte = prezzoNotte;
	}

	public boolean isDisponibile() {
		return isDisponibile;
	}

	public void setDisponibile(boolean isDisponibile) {
		this.isDisponibile = isDisponibile;
	}

	// Metodi override
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camera other = (Camera) obj;
		return numero == other.numero;
	}

	@Override
	public String toString() {
		return "Camera:\n"
				+ "  Numero: " + numero + "\n"
				+ "  Tipo: " + tipoCamera + "\n"
				+ "  Prezzo/Notte: " + prezzoNotte + " €\n"
				+ "  Disponibile: " + (isDisponibile ? "Sì" : "No");
	}
}
