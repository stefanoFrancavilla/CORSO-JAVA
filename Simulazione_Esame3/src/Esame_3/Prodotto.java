package Esame_3;

public class Prodotto {
	//variabili di istanza
	private String nome;
	private double prezzo;
	private int quantità;
	
	//costruttore
	
	public Prodotto(String nome, double prezzo, int quantità) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantità = quantità;
	}
	//metodi getter/setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	
	//metodi
	public double valoreMagazzino()
	{
		double totale = prezzo * quantità;
		return totale;
	}

	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + ", quantità=" + quantità + "]";
	}

	
	
	
	
	

}
