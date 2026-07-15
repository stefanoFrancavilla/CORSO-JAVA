package pre_Esame;

public class Dipendente {

	//variabili di istanza
	


	private String nome;
	private double stipendio;
	
	// costruttore
	
	public Dipendente(String nome, double stipendio)
	{
		this.nome = nome;
		this.stipendio = stipendio;
	}

	
	//metodi getter setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	//metodi
	
	public double calcolaBonus(double stipendio)
	{
		double bonus = stipendio / 10;
		return bonus;
	}
	
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", stipendio=" + stipendio + "]";
	}
}
