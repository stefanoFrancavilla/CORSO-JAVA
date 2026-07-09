package streamapi;

import java.util.Objects;

public class Auto {

	//variabili di istanza
	private String casaProduttrice;
	private String modello;
	private String colore;
	private double prezzo;
	private double velocitaMassima;
	
	
	//costruttore
	public Auto(String casaProduttrice, String modello, String colore, double prezzo, double velocitaMassima) {
		this.setCasaProduttrice(casaProduttrice);
		this.setModello(modello);
		this.setColore(colore);
		this.setPrezzo(prezzo);
		this.setVelocitaMassima(velocitaMassima);
	}
	
	
	
	
	//metodi getter setter
	public String getCasaProduttrice() {
		return casaProduttrice;
	}
	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getVelocitaMassima() {
		return velocitaMassima;
	}
	public void setVelocitaMassima(double velocitaMassima) {
		this.velocitaMassima = velocitaMassima;
	}



	//metodi
	
	@Override
	public String toString() {
		return "Auto [casaProduttrice=" + casaProduttrice + ", modello=" + modello + ", colore=" + colore + ", prezzo="
				+ prezzo + ", velocitaMassima=" + velocitaMassima + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(casaProduttrice, colore, modello, prezzo, velocitaMassima);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return Objects.equals(casaProduttrice, other.casaProduttrice) && Objects.equals(colore, other.colore)
				&& Objects.equals(modello, other.modello)
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo)
				&& Double.doubleToLongBits(velocitaMassima) == Double.doubleToLongBits(other.velocitaMassima);
	}
	
	
	
	
	
	
}
