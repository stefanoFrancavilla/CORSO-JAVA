package Argomento_3_Map;

public class Contatto {

	//variabili di istanza
	private String nome;
	private String cognome;
	private String numeroTelefono;
	private String email;
	
	//costruttore
	public Contatto(String nome, String cognome, String numeroTelefono, String email) {
		setNome(nome);
		setCognome(cognome);
		setNumeroTelefono(numeroTelefono);
		setEmail(email);
	}


	// metodi getter setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank())
		{
			return;
		}
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		if (cognome == null || cognome.isBlank())
		{
			return;
		}
		this.cognome = cognome;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		if (numeroTelefono == null || numeroTelefono.isBlank())
		{
			return;
		}
		this.numeroTelefono = numeroTelefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.isBlank())
		{
			return;
		}
		else if (!email.contains("@"))
		{
			return;
		}
		this.email = email;
	}


	
	// metodo to string
	
	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", numeroTelefono=" + numeroTelefono + ", email="
				+ email + "]";
	} 
}
