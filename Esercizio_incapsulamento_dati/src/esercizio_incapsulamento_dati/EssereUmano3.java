package esercizio_incapsulamento_dati;

public class EssereUmano3 {
	//variabiloi di istanza
	private String nome;
	private String cognome;
	private byte eta;
	private float altezza;
	private float peso;
	
	// costanti
	
	private final float min_peso = 20f;
	private final float max_peso = 200f;
	private final float min_altezza = 20f;
	private final float max_altezza = 230f;

	
	//costruttori
	public EssereUmano3(
			String nome,
			String cognome,
			byte eta,
			float altezza,
			float peso)
	{
		this.setNome(nome);
		this.cognome = cognome;
		this.eta = eta;
		this.setAltezza(altezza);
		this.setPeso(peso);
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		if (verificaCaratteri("1234567890?!|£$%&/()=", nome))
		{
			System.out.println ("il nome contiene caratteri non consoni");
		}
		if (verificaLunghezza(nome, 10) == true)
		{
			System.out.println("il nome è troppo lungo");
		}
		else
		{
			System.out.println ("controllo nome ok");
		}
		this.nome = nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public void steCognome()
	{
		this.cognome = cognome;
	}
	
	public byte getEta()
	{
		return eta;
	}
	
	public void setEta()
	{
		this.eta = eta;
	}
	
	public float getaltezza()
	{
		return altezza;
	}
	
	public void setAltezza(float altezza)
	{
		if (altezza >= min_altezza && altezza <= max_altezza)
		{
			
		}
		else
		{
			System.out.println("altezza fuori range");
		}
		this.altezza = altezza;
	}
	
	public float getPeso()
	{
		return peso;
	}
	
	public void setPeso(float peso)
	{
		if (peso <= max_peso && peso >= min_peso)
		{
			
		}
		else
		{
			System.out.println("peso fuori range");
		}
		this.peso = peso;
	}
	
	
	//metodi
	public void studia()
	{
		System.out.println("Sta studiando...");
	}
	
	public void mangia() 
	{
		System.out.println("Sta mangiando...");
	}

	public void stampa()
	{
		System.out.println("----------------------------------");
		System.out.println("nome \n " + nome + "\n");
		System.out.println("cognome \n " + cognome + "\n");
		System.out.println("eta  \n " + eta + "\n");
		System.out.println("altezza \n " + altezza + " cm \n");
		System.out.println("peso \n " + peso + " kg \n");
		System.out.println("----------------------------------");
	}
	
	// funzioni di controllo
	private boolean verificaCaratteri (String caratteri, String s)
	{
		boolean presente = false;
		
	for( int i = 0; i < caratteri.length(); i++)
	{
		char carattereCorrente = caratteri.charAt(i);
		if (s.indexOf(caratteri) != -1)
		{
			presente = true;
			break;
		}
	}
	return presente;
		
	}
	
	private boolean verificaLunghezza (String s, int limit)
	{
		boolean parolaLunga = false;
		
		if (s.length() > limit )
		{
			parolaLunga = true;
			return parolaLunga;
		}
		else
		{
			return false;
		}
	}
}

