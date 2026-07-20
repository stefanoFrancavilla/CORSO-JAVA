package rubrica_Contatti;

public class Contatto {

	//variabili di istanza
	
	private String nome;
	private String telefono;
	private String email;
	
	//costruttore
	public Contatto()
	{
		
	}
	
	public Contatto(String nome, String telefono, String email)
	{
		this.nome = nome;
		this.telefono = telefono;
		this.email = email;
	}
	
	//metodi getter e setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//metodi
	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", \n telefono=" + telefono + ", \n email=" + email + "]";
	}
	
	
	
	
	
	
	
}
