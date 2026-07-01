package Esame;

public class Studente {

	//variabili di istanza
	private String nome;
	private String cognome;
	private int matricola;
	private double votoMedio;
	
	//Costruttore
	public Studente(String nome, String cognome, int matricola, double votoMedio) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.votoMedio = votoMedio;
	}

	//metodi getter/setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public double getVotoMedio() {
		return votoMedio;
	}

	public void setVotoMedio(double votoMedio) {
		this.votoMedio = votoMedio;
	}
	// metodi

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", votoMedio="
				+ votoMedio + "]";
	}
	
	
	

	
	
	
}
