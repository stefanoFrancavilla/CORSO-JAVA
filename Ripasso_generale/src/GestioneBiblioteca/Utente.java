package GestioneBiblioteca;

import java.util.List;

public class Utente {

	//variabili di istanza
	private String nome;
	private int id;
	private List<Libro> libriPresi;
	
	//costruttore
	public Utente(String nome, int id, List<Libro> libriPresi) {
		this.nome = nome;
		this.id = id;
		this.libriPresi = libriPresi;
	}


	//metodi getter/setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Libro> getLibriPresi() {
		return libriPresi;
	}

	public void setLibriPresi(List<Libro> libriPresi) {
		this.libriPresi = libriPresi;
	}


	//metodi
	@Override
	public String toString() {
		return "Utente "
				+ "\n Nome = " + nome
				+ "\n ID = " + id;
	}
	
	public void prendiInPrestito(Libro libro)
	{
		if (libro.isDisponibile() == true)
		{
			libriPresi.add(libro);
		}
		
	}
	
	public void restituisciLibro(Libro libro)
	{
		if (libriPresi.contains(libro))
		{
			libriPresi.remove(libro);
		}
	}
	
	
	
	
	

	
}
