package IncapsulamentoDeiDatiEsercizio;

public class Gatto extends Animale {

	//variabili d'istanza
	private RazzaGatto razzaGatto;
	private colorePeloGatto colorePeloGatto;
	
	//costruttore
	public Gatto( 
			String nome,
            String cognome,
            byte eta,
            Sesso sesso,
            float altezza,
            float peso,
            ColoreOcchi coloreOcchi,
            RazzaGatto razzaGatto,
            colorePeloGatto colorePeloGatto) {
		
        super(nome, eta, sesso, altezza, peso, coloreOcchi);  
        
        this.razzaGatto = razzaGatto;
        this.colorePeloGatto = colorePeloGatto;	
	}
	// Override setter astratti da Animale
	  @Override
	    public void setNome(String nome) {
	        super.nome = nome;  
	    }

	    @Override
	    public void setEta(byte eta) {
	        super.eta = eta;
	    }

	    @Override
	    public void setAltezza(float altezza) {
	        super.altezza = altezza;
	    }

	    @Override
	    public void setPeso(float peso) {
	        super.peso = peso;
	    }
	    
	    // getter/setter locali
	    
	    public RazzaGatto getrazzaGatto() {
	    	return razzaGatto;
	    }
	    
	    public void setRazzaGatto(RazzaGatto razzaGatto) {
	    	this.razzaGatto = razzaGatto;
	    }
	    
	    public colorePeloGatto getcolorePeloGatto() {
	    	return colorePeloGatto;
	    }
	    
	    public void setcolorePeloGatto(colorePeloGatto colorePeloGatto) {
	    	this.colorePeloGatto = colorePeloGatto;
	    }

	    // metodi
	    
	    public void mangia() {
	    	super.mangia();
	    	System.out.println("Mangia nella sua ciotolina");
	    }
	    
	    public void dorme() {
	    	super.dorme();
	    	System.out.println("Dorme tra le gambe del padrone");
	    }
	    
	   public void faLeFusa() {
		   System.out.println("Fa le fusa...");
	   }
	    
	    public void stampa() {
	    	super.stampa();
	    	System.out.println("razza di gatto " + razzaGatto);
	    	System.out.println("colore pelo del Gatto " + colorePeloGatto);
	    }
}
