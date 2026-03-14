package gestoreZoo;

public abstract class Animale {
	
//variabili di istanza
	private String nome;
	private double peso;
	
	protected double costoBase = 10.0;
	
//costruttore
	public Animale(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	
	}
	
//metodi getter/setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
//metodi

	public void mangia() {
		
	}
	
	public double getCostoGiorno() {
		
		double costoGiorno = costoBase + (peso * 0.5);
		return costoGiorno;
		
	}
}
