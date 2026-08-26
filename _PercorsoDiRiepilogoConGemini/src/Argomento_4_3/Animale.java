package Argomento_4_3;

public abstract class Animale {

	protected String nome;
	protected int eta;
	
	
	public Animale(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}


	public String getNome() {
		return nome;
	}


	public int getEta() {
		return eta;
	}
	
	public abstract double calcoloCostoGiornaliero();
}
