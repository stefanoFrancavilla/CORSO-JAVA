package Esercizi_avanzati;

public class Persona implements Comparable<Persona> {
	
	private String cognome;
	private String nome;
	private int eta;
	public Persona(String cognome, String nome, int eta) {
		
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
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
	
	public int compareTo( Persona p) {
	 // 1) Ordina per cognome
    if (this.cognome.compareTo(p.cognome) < 0) {
        return -1;
    }
    if (this.cognome.compareTo(p.cognome) > 0) {
        return 1;
    }

    // 2) Se cognome uguale, ordina per nome
    if (this.nome.compareTo(p.nome) < 0) {
        return -1;
    }
    if (this.nome.compareTo(p.nome) > 0) {
        return 1;
    }

    // 3) Se anche nome uguale, ordina per età
    if (this.eta < p.eta) {
        return -1;
    }
    if (this.eta > p.eta) {
        return 1;
    }

    return 0;
}

}
