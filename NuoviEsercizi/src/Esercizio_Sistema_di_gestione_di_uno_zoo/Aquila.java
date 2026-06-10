package Esercizio_Sistema_di_gestione_di_uno_zoo;

public final class Aquila  implements Animale {

	//variabili di istanza
	private String nome;
	private int eta;
	
	// costruttore
	public Aquila(String nome, int eta) {
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
	public void agisci() {
		// TODO Auto-generated method stub

		System.out.println("L'aquila vola.");
	}

	@Override
	public double costo() {
		return 40;
	}
	
	@Override
	public String toString() {
		return "Nome " + this.getNome() + " eta " + this.getEta();
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("L'aquila " + nome + " magia il coniglio");
	}



}
