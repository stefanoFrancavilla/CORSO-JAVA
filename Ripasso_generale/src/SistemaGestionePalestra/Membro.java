package SistemaGestionePalestra;

import java.util.Objects;

public class Membro {

	//variabili di istanza
	
	private String id;
	private String nome;
	private String cognome;
	private String email;
	private TipoAbbonamento abbonamento;
	
	//costruttore
	public Membro(String id, String nome, String cognome, String email, TipoAbbonamento abbonamento) {
		
		setId(id);
		setNome(nome);
		setCognome(cognome);
		setEmail(email);
		this.abbonamento = abbonamento;
	}

    //metodi getter setter
	public String getId() {
		return id;
	}


	public void setId(String id) {
		
		if(id == null || id.isBlank()) {
			throw new IllegalArgumentException("ID non valido"); 
		}
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		
		if(nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome non valido"); 
		}
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		
		if(cognome == null || cognome.isBlank()) {
			throw new IllegalArgumentException("Cognome non valido"); 
		}
		
		this.cognome = cognome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if(email == null || !email.contains("@"))
		{
			throw new IllegalArgumentException("Email non valido"); 
		}
		this.email = email;
	}


	public TipoAbbonamento getAbbonamento() {
		return abbonamento;
	}


	public void setAbbonamento(TipoAbbonamento abbonamento) {
		this.abbonamento = abbonamento;
	}

	//metodi
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membro other = (Membro) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", abbonamento="
				+ abbonamento + "]";
	}
	
	
	
	
	
}
