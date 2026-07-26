package Sistema_di_gestione_ordini;

import java.util.Objects;

public class Prodotto {

	//variabilii di istanza
	
	private String id;
	private String nome;
	private Categoria categoria;
	private double prezzo;
	private int quantitaMagazzino;
	
	//costruttore
	

	public Prodotto(String id, String nome, Categoria categoria, double prezzo, int quantitaMagazzino) {
		
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
		this.quantitaMagazzino = quantitaMagazzino;
	}

	
	//metodi getter/setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if(prezzo >= 0)
		this.prezzo = prezzo;
	}

	public int getQuantitaMagazzino() {
		return quantitaMagazzino;
	}

	public void setQuantitaMagazzino(int quantitaMagazzino) {
		
		if(quantitaMagazzino >= 0)
		this.quantitaMagazzino = quantitaMagazzino;
	}

	//metodi
	
	@Override
	public String toString() {
		return "Prodotto \n "
				+ "id =" + id + ", \n"
				+ " nome =" + nome + ", \n"
				+ " categoria =" + categoria + ", \n"
				+ " prezzo =" + prezzo + ", \n"
				+ " quantitaMagazzino =" + quantitaMagazzino + ".";
	}


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
		Prodotto other = (Prodotto) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
}
