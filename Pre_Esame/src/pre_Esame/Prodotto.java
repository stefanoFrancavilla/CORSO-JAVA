package pre_Esame;

public class Prodotto {

	//variabili di istanza
	
	private String nome;
	private double prezzo;
	
	//costruttore
	public Prodotto(String nome, double prezzo) {
		
		this.nome = nome;
		this.prezzo = prezzo;
	}
	//metodi getter setter
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
	
	
	
	
}
