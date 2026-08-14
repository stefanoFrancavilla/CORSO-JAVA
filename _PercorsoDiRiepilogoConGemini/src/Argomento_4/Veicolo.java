package Argomento_4;

public class Veicolo {

	private String marca;
	private int velocitaMassima;
	
	public Veicolo(String marca, int velocitaMassima) {
		this.marca = marca;
		this.velocitaMassima = velocitaMassima;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getVelocitaMassima() {
		return velocitaMassima;
	}
	
	public void mostraInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Velocità Massima: " + velocitaMassima + " km/h");
	}
}
