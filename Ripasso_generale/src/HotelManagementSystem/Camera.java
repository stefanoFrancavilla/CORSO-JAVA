package HotelManagementSystem;

import java.util.Objects;

public class Camera {

	//variabili di istanza
	
	private int numero;
	private TipoCamera tipoCamera;
	private double prezzoNotte;
	private boolean isDisponibile;
	
	//costruttore
	public Camera(int numero, TipoCamera tipoCamera, double prezzoNotte) {
		
		this.numero = numero;
		this.tipoCamera = tipoCamera;
		this.prezzoNotte = prezzoNotte;
		this.isDisponibile = true;
	}

	//metodi getter/setter
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoCamera getTipoCamera() {
		return tipoCamera;
	}

	public void setTipoCamera(TipoCamera tipoCamera) {
		this.tipoCamera = tipoCamera;
	}

	public double getPrezzoNotte() {
		return prezzoNotte;
	}

	public void setPrezzoNotte(double prezzoNotte) {
		this.prezzoNotte = prezzoNotte;
	}

	public boolean isDisponibile() {
		return isDisponibile;
	}

	public void setDisponibile(boolean isDisponibile) {
		this.isDisponibile = isDisponibile;
	}

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
		return "Camera \n"
				+ "numero = " + numero + ", \n"
						+ " tipoCamera = " + tipoCamera + ", \n"
								+ " prezzoNotte = " + prezzoNotte+ ", \n"
										+ "isDisponibile = " + isDisponibile + ".";
	}
	
	public boolean Disponibile()
	{
		boolean disponibile = true;
		
		return disponibile;
	}
	
	
	
}
