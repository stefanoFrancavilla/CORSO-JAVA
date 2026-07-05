package Esame_3;

public class Studente extends Persona {
//variabili di istanza
	private int matricola;
	private double mediaVoti;
	
	//costruttore
	public Studente(String nome, String cognome, int matricola, double mediaVoti) {
		super(nome, cognome);
		this.matricola = matricola;
		this.mediaVoti = mediaVoti;
	
	}
	//metodi getter/setter

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public double getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}

	//metodi
	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", mediaVoti=" + mediaVoti + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + "]";
	}


	
	
	
	
	
	
	
}
