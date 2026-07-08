package Esercizi_avanzati;

public class Telefono implements Comparable<Telefono>{

	private String marca;
	private double prezzo;
	public Telefono(String marca, double prezzo) {
		
		this.marca = marca;
		this.prezzo = prezzo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
public int compareTo(Telefono t)
{
	if(this.prezzo < t.prezzo)
		return -1;
	
	if(this.prezzo > t.prezzo)
		return 1;

	return 0;
}
}
