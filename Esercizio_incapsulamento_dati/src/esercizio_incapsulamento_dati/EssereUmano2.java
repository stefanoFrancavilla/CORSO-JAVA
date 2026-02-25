package esercizio_incapsulamento_dati;

public class EssereUmano2 {
// variabili di istanza
	private String nome;
	private String cognome;
	private byte eta;
	private float altezza;
	private float peso;
	
//costanti	
	private final float min_peso = 10f;
	private final float max_peso = 200f;
	private final float min_altezza = 20f;
	private final float max_altezza = 220f;
	
//costruttore
	public EssereUmano2 (
			String nome,
			String cognome,
			byte eta,
			float altezza,
			float peso
			) {
	
	this.nome = nome;
	this.cognome = cognome;
	this.eta = eta;
	this.setAltezza(altezza);
	this.setPeso(peso);
	
	
//	this.altezza = altezza;
//	this.peso = peso;
	}
	
//metodi setter/getter
	public String getNome()
	{
		return nome;
	}
	
	public void setNome() 
	{
		this.nome = nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public void setCognome()
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
	
	public float getAltezza()
	{
		return altezza;
	}
	
	public void setAltezza(float altezza)
	{
		this.altezza = altezza;
		
		if (altezza >= min_altezza && altezza <= max_altezza)
		{
			System.out.println("altezza consona");
		}
		else
		{
			System.out.println("altezza non valida");
		}
	}
	
	public float getPeso() 
	{
		return peso;
	}
	
	public void setPeso(float peso)
	{
		this.peso = peso;
		
		if (peso >= min_peso && peso <= max_peso)
		{
			System.out.println("peso accettato");
		}
		else
		{
			System.out.println("peso non consono");
		}
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
	
	
	
}
