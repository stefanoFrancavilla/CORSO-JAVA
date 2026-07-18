package inputOutput;

public class Persona2 {
	
	//variabili d'istanza.
	private int id;
	private String email;
	private String nome;
	private String cognome;
	private String avatar;
	
	
	//Costruttori.
	public Persona2()
	{
		
	}
	
	public Persona2(int id, String email, String nome, String cognome, String avatar)
	{
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.avatar = avatar;
	}

	
	//Metodi getter/setter.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	

	//Metodi.
	@Override
	public String toString() {
		return "Persona2 [id=" + id + ", email=" + email + ", nome=" + nome + ", cognome=" + cognome + ", avatar="
				+ avatar + "]";
	}
}