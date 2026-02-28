package IncapsulamentoDeiDatiEsercizio;

public class Cane extends Animale {

	//variabili d'istanza
	private RazzaCane razzaCane;
	private colorePeloCane colorePeloCane;
	
	//costruttore
	
	public Cane(
			String nome,
            String cognome,
            byte eta,
            Sesso sesso,
            float altezza,
            float peso,
            ColoreOcchi coloreOcchi,
            RazzaCane razzaCane,
            colorePeloCane colorePeloCane) {
		super(nome, eta, sesso, altezza, peso, coloreOcchi);
		
		this.razzaCane = razzaCane;
		this.colorePeloCane = colorePeloCane;	
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
	    
	    //getter/setter locali
	    
	    public RazzaCane getRazzaCane() {
	    	return razzaCane;
	    }
	    
	    public void setRazzaCane(RazzaCane razzaCane) {
	    	this.razzaCane = razzaCane;
	    }
	    
	    public colorePeloCane getcolorePeloCane() {
	    	return colorePeloCane;
	    }
	    
	    public void setColorePeloCane(colorePeloCane colorePeloCane) {
	    	this.colorePeloCane = colorePeloCane;
	    }

	    // metodi 
	    
	    public void mangia() {
	    	super.mangia();
	    	System.out.println("Mangia i suoi croccantini preferiti");
	    }
	    
	    public void dorme() {
	    	super.dorme();
	    	System.out.println("Dorme nella sua cuccia");
	    }
	    
	   public void abbaia() {
		   System.out.println("Abbaia agli estranei");
	   }
	    
	    public void stampa() {
	    	super.stampa();
	    	System.out.println("razza di cane " + razzaCane);
	    	System.out.println("colore pelo del cane " + colorePeloCane);
	    }
	    
}
