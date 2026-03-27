package EsercizioVeicoli;

public abstract class Mezzo implements Veicolo {
	
	//variabili di istanza
	protected String marca;
	protected String modello;
	protected boolean inMovimento;
	
	//costruttori
	public Mezzo (String marca, String modello)
	{
		this.marca = marca;
		this.modello = modello;
	}
	//metodi getter/ setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void avvia()
	{
        
    	 System.out.println("Il mezzo " + marca + " " + modello + " è in movimento");
    
	}
     public void ferma()
     {
    	
    	 System.out.println("Il mezzo " + marca + " " + modello + " è fermo");
     
    }
     
     public void inMovimento()
     {
    	 if(inMovimento == true)
    	 {
    		 this.avvia();
    	 }
    	 else
    	 {
    		 this.ferma();
    	 }
     }
	
	
	//metodi
	public abstract int getNumeroruote();
	
	
	
	

}
