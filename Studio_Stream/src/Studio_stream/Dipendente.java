package Studio_stream;

public class Dipendente {

	private String nome;
	private String reparto;
	private double stipendio;
	
	public Dipendente(String nome, String reparto, double stipendio) {
		this.nome = nome;
		this.reparto = reparto;
		this.stipendio = stipendio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getReparto() {
		return reparto;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	
}
