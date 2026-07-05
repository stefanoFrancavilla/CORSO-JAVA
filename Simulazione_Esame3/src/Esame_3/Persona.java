package Esame_3;

public abstract class Persona {

	//variabili di istanza
	private String nome;
	private String cognome;
	
	//costruttore
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
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
	

	

	
}
