package Argomento1_List;

public class Giocatore {

	//variabili di istanza
	
	private String nome;
	private String ruolo;
	private int numeroMaglia;
	private int golSegnati;

	//costruttore
	
	public Giocatore(String nome, String ruolo, int numeroMaglia, int golSegnati) {
		this.nome = nome;
		this.ruolo = ruolo;
		this.numeroMaglia = numeroMaglia;
		this.golSegnati = golSegnati;
	}

	//metodi getter setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty())
		{
			System.out.println("Il nome non è valido");
		}
		else
		{
			this.nome = nome;	
		}
		
	}

	public String getRuolo() {
		
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		if(ruolo == null || ruolo.isEmpty())
		{
			System.out.println("Il ruolo non è valido");
		}
		else
		{
			this.ruolo = ruolo;
		}
	
	}

	public int getNumeroMaglia() {
		
		return numeroMaglia;
	}

	public void setNumeroMaglia(int numeroMaglia) {
		if(numeroMaglia < 1 || numeroMaglia > 99)
		{
			System.out.println("Il numero di maglia non è valido");
		}
		else
		{
			this.numeroMaglia = numeroMaglia;
		}
		
	}

	public int getGolSegnati() {
		return golSegnati;
	}

	public void setGolSegnati(int golSegnati) {
		if(golSegnati < 0 )
		{
			System.out.println("Il numero di gol non può essere inferiore a 0");
		}
		else
		{
			this.golSegnati = golSegnati;
		}
		
	}
	
	public void segnaGol()
	{
		golSegnati ++;
	}

	@Override
	public String toString() {
		return "Giocatore [nome=" + nome + ", ruolo=" + ruolo + ", numeroMaglia=" + numeroMaglia + ", golSegnati="
				+ golSegnati + "]";
	}
}
