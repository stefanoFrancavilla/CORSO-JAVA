package HotelManagementSystem;

import java.util.Objects;

public class Cliente {

	// variabili di istanza
	private String id;
	private String nome;
	private String cognome;
	private String email;
	
	//costruttore
	public Cliente(String id, String nome, String cognome, String email) {
		
		
		setId(id);
		setNome(nome);
		setCognome(cognome);
		setEmail(email);
	}

	//metodi getter/setter
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
		if (email == null || !email.contains("@"))
		{
			throw new IllegalArgumentException("Email non valido"); 
		}
		this.email = email;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cliente  \n"
				+ " id = " + id + ", \n"
				+ " nome = " + nome + ", \n"
						+ " cognome = " + cognome + ", \n"
								+ " email=" + email + ".";
	}
	
	
	
	
}
