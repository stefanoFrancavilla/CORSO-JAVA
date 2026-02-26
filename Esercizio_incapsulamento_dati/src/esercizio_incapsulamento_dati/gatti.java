package esercizio_incapsulamento_dati;

public class gatti {

	private String nome;
	private byte eta;
	private float altezza;
	private float peso;
	private Esercizio_Sesso sesso;
	private Esercizio_ColoreOcchi coloreOcchi;
	
	//costanti
	
	private final byte eta_min = 0;
	private final byte eta_max = 20;
	private final byte eta_default = 3;
	
	private final float altezza_min = 0;
	private final float altezza_max = 40;
	private final float altezza_default = 20;
	
	private final float peso_min = 0;
	private final float peso_max = 30;
	private final float peso_default = 7;
	
	
	//costruttore
	
	public gatti()
	{
		System.out.println("costruttore (0) parametri");
	}
	
	//metodi setter e getter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getEta() {
		return eta;
	}

	public void setEta(byte eta) {
		
		if (eta <= eta_min && eta >= eta_max)
		{
			System.out.println("età non valida");
			this.eta = eta_default;
		}
		else
		{
			System.out.println("età valida");
			this.eta = eta;
		}
		
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		
		if (altezza <= altezza_min && altezza >= altezza_max)
		{
			System.out.println("altezza non valida");
			this.altezza = altezza_default;
		}
		else
		{
			System.out.println("altezza valida");
			this.altezza = altezza;
		}
		
		
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		
		if (altezza <= altezza_min && altezza >= altezza_max)
		{
			System.out.println("peso non valido");
			this.peso = peso_default;
		}
		else
		{
			System.out.println("peso valido");
			this.peso = peso;
		}
		
	}

	public Esercizio_Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Esercizio_Sesso sesso) {
		this.sesso = sesso;
	}

	public Esercizio_ColoreOcchi getColoreOcchi() {
		return coloreOcchi;
	}

	public void setColoreOcchi(Esercizio_ColoreOcchi coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}
	
	
	//metodi
	
	public void mangia()
	{
		System.out.println("Sta mangiando...");
	}
	
	public void dorme()
	{
		System.out.println("Sta dormendo...");
	}
	
	public void gioca()
	{
		System.out.println("Sta giocando...");
	}
	
	public void stampa()
	{
		System.out.println("--------------------");
		System.out.println("nome " + nome);
		System.out.println("età " + eta);
		System.out.println("altezza " + altezza);
		System.out.println("peso " + peso);
		System.out.println("sesso " + sesso);
		System.out.println("colore occhi " + coloreOcchi);
		System.out.println("--------------------");
	}
	
	//funzioni di controllo
	
	public boolean verificaCaratteri(String caratteri, String s) {
		boolean presente = true;
		
	    for(int i = 0; i < caratteri.length(); i++) {
	    	
	        char carattereCorrente = caratteri.charAt(i);
	        
	        if (s.indexOf(carattereCorrente) == -1) 
	        {  
	           presente = false;  
	        }
	    }
	    return presente;  
	}
	
	public boolean verificaLunghezza(String s, int limit)
	{
		boolean parolaLunga = false;
		
		if (s.length() > limit)
		
			parolaLunga = true;
		    return parolaLunga;
	}


	
	}
	

