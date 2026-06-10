package Esercizio_Sistema_di_gestione_di_uno_zoo;

public abstract class Mammifero {

	//variabili di istanza
	private String nome;
	private int eta;
	
	//costruttore
	
	public Mammifero(String nome, int eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}

	//metodi getter setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Nome " + this.nome + " eta " + eta;
	}
	

	
	
}
