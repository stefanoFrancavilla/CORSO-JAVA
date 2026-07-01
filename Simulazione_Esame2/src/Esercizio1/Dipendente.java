package Esercizio1;

public class Dipendente {
	
	//variabili di istanza
	private String nome;
	private String cognome;
	private double stipendio;
	
	//costruttore
	public Dipendente(String nome, String cognome, double stipendio) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}
	//metodi getter/ setter
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

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	//metodi
	
	public double aumentaStipendio(int percentuale)
	{
		
		if (percentuale == 0 || percentuale > 100)
		{
			System.out.println("Percentuale inserita non rientra nei parametri");
			return stipendio;
		}
		else
		{
			double aumento = (stipendio * percentuale) / 100;
			System.out.println("Grazie al buon operato lo stipendio ha avuto un'aumento del " + percentuale + " % con un'aumento pari a: " + aumento);
		  stipendio += aumento;
		  return stipendio;
		}
		
		
	}
	
	
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}
	
	
	 
	
	
	
	
	

}
