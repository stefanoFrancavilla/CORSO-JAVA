package Esercizio_1_SistemaDiUtenti;

public abstract class Utente implements Comparable<Utente> {
	
	//variabili di istanza
	private String nome;
	private int eta;

	//costruttore
	public Utente(String nome, int eta) {
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
	
	//metodi

	public void lezione()
	{
		System.out.println("La lezione è appena comiciata");
	}
	
	@Override
	public int compareTo(Utente o) {
		// TODO Auto-generated method stub
		return 0;
	}



	

}
