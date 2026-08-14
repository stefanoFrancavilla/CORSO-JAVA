package Argomento_3;

public class Dipendente {

	private String nome;
	private String ruolo;
	private double stipendioBase;
	
	public Dipendente(String nome, String ruolo, double stipendioBase) {
		this.nome = nome;
		this.ruolo = ruolo;
		this.stipendioBase = stipendioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(double stipendioBase) {
		this.stipendioBase = stipendioBase;
	}
	
	
	public double calcolaStipendioNetto() {
		double stipendioNetto = stipendioBase - calcolotratenuteFiscali(stipendioBase);
		
		return stipendioNetto;
	}
	
	public double calcolotratenuteFiscali( double stipendioBase) {
		
		double trattenute = 0;
	
		if ( stipendioBase <= 1500) {
			trattenute = stipendioBase * 0.15;
		} else {
			trattenute = stipendioBase * 0.23;
		}
		return trattenute;
	}
	
	public void promuovi(String nuovoRuolo, double aumentoStipendio) {
		this.ruolo = nuovoRuolo;
		this.stipendioBase += aumentoStipendio;
	}
}
