package IncapsulamentoDeiDatiEsercizio;

public abstract class Animale {

	//variabili di istanza
	protected String nome;
	protected byte eta;
	protected Sesso sesso;
	protected float altezza;
	protected float peso;
	protected coloreOcchi coloreOcchi;
	
	
	//costruttore
	public Animale(
		    String nome,
		    byte eta,
		    Sesso sesso,
		    float altezza,
		    float peso,
		    coloreOcchi coloreOcchi) {

		    this.nome = nome;      // Campo diretto
		    this.eta = eta;
		    this.sesso = sesso;
		    this.altezza = altezza;
		    this.peso = peso;
		    this.coloreOcchi = coloreOcchi;
		}
	//metodi getter/setter
	public String getNome() {
		return nome;
	}


	public abstract void setNome(String nome);


	public byte getEta() {
		return eta;
	}


	public abstract void setEta(byte eta);


	public Sesso getSesso() {
		return sesso;
	}


	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}


	public float getAltezza() {
		return altezza;
	}


	public abstract void setAltezza(float altezza);


	public float getPeso() {
		return peso;
	}


	public abstract void setPeso(float peso);


	public coloreOcchi getColoreOcchi() {
		return coloreOcchi;
	}


	public void setColoreOcchi(coloreOcchi coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}
	
	//metodi
	
	public void dorme()
	{
		System.out.println("Sta dormendo profondamente");
	}
	
	public void mangia()
	{
		System.out.println("Sta mangiando di gusto");
	}
	
	public void respira()
	{
		System.out.println("Sta respirando...");
	}
	
	public void stampa()
	{
		System.out.println("--------------------------------");
		System.out.println("nome " + this.getNome());
		System.out.println("Età " + this.getEta());
		System.out.println("Sesso " + this.getSesso());
		System.out.println("Altezza " + this.getAltezza());
		System.out.println("Peso " + this.getPeso());
		System.out.println("Colore occhi " + this.getColoreOcchi());
		System.out.println("--------------------------------");
	}
	
	
}
