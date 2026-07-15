package pre_Esame;

public class Contatto {
//variabii
	private String nome;
	private int telefono;
	//costruttore
	public Contatto(String nome, int telefono) {
		this.nome = nome;
		this.telefono = telefono;
	}
//getter setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
