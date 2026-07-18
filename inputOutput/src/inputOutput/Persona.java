package inputOutput;

public class Persona {
	//variabili d'istanza.
	private int id;
	private String nome;
	private String cognome;
	private byte anni;
	
	
	//Costruttori.
	public Persona()
	{
		
	}

	public Persona(int id, String nome, String cognome, byte anni) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
	}

	
	//Metodi getter/setter.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public byte getAnni() {
		return anni;
	}

	public void setAnni(byte anni) {
		this.anni = anni;
	}

	
	//Metodi.
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", anni=" + anni + "]";
	}
}
