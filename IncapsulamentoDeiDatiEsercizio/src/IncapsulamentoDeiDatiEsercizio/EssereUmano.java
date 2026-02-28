package IncapsulamentoDeiDatiEsercizio;

public class EssereUmano extends Animale {

    private String cognome;
    private coloreCapelli coloreCapelli;
    private coloreCarnagione coloreCarnagione;
    private ColoreOcchi coloreOcchi;

    public EssereUmano() {
        super("ND", (byte) 0, Sesso.SCONOSCIUTO, 0.0f, 0.0f, ColoreOcchi.SCONOSCIUTO);
        this.setCognome("ND");
        this.coloreCapelli = coloreCapelli.SCONOSCIUTO;
        this.coloreCarnagione = coloreCarnagione.SCONOSCIUTO;
    }
    
    public EssereUmano(
            String nome,
            String cognome,
            byte eta,
            Sesso sesso,
            float altezza,
            float peso,
            coloreCapelli coloreCapelli,
            ColoreOcchi coloreOcchi,
            coloreCarnagione coloreCarnagione) {  

        super(nome, eta, sesso, altezza, peso, coloreOcchi);  

        this.setCognome(cognome);      
        this.coloreCapelli = coloreCapelli;
        this.coloreCarnagione = coloreCarnagione;
        this.coloreOcchi = coloreOcchi;
        
    }

    // Override setter astratti da Animale (ora implementali)
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

    // Getter/setter locali
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public coloreCapelli getColoreCapelli() {
        return coloreCapelli;
    }

    public void setColoreCapelli(coloreCapelli coloreCapelli) {
        this.coloreCapelli = coloreCapelli;
    }
    
    public coloreCarnagione getColoreCarnagione() {
    	return coloreCarnagione;
    }
    
    public void setColoreCarnagione(coloreCarnagione coloreCarnagione) {
    	this.coloreCarnagione = coloreCarnagione;
    }
    public ColoreOcchi getColoreOcchi() {
		return coloreOcchi;
	}


	public void setColoreOcchi(ColoreOcchi coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}
    
    //metodi
    
    public void mangia() {
    	super.mangia();
    	System.out.println("Mangia usando forchetta e coltello");
    }
    
    public void dorme() {
    	super.dorme();
    	System.out.println("Dorme tra lenzuola e coperte");
    }
    
    public void lavora() {
    	System.out.println("lavora al pc");
    }
    
    public void stampa() {
    	super.stampa();
    	System.out.println("cognome " + cognome);
    	System.out.println("colore capelli " + coloreCapelli);
    	System.out.println("colore carnagione " + coloreCarnagione);
    }
}
