package incapsulamentoDeiDati;

public abstract class Pianta extends EssereVivente {
/*
 * Esercizio: modellare con ooportune classi astrate e concrete il mondo delle piante 
 * per arrivare a poter collocare nel nostro mondo virtuale degli alberi, dei fiori ecc.
 */
	//variabli
	private Tipo_di_foglie tipo_di_foglie;
	private Tipo_di_frutto tipo_di_frutto;
	
	public Pianta() {
		
	}
	
	
	public Pianta(byte anni, float altezza, float peso, Tipo_di_foglie tipo_di_foglie, Tipo_di_frutto tipo_di_frutto ) {
		super(anni, altezza, peso);
		
	}
	
	//getter/setter
	
	public byte getAnni() {
		return anni;
	}
	
	public void setAnni() {
		
	}
	
	public float getaltezza() {
		return altezza;
	}
	public void setAltezza() {
		
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso() {
		
	}


	public Tipo_di_foglie getTipo_di_foglie() {
		return tipo_di_foglie;
	}


	public void setTipo_di_foglie(Tipo_di_foglie tipo_di_foglie) {
		this.tipo_di_foglie = tipo_di_foglie;
	}


	public Tipo_di_frutto getTipo_di_frutto() {
		return tipo_di_frutto;
	}


	public void setTipo_di_frutto(Tipo_di_frutto tipo_di_frutto) {
		this.tipo_di_frutto = tipo_di_frutto;
	}
	
	//metodi
	
	public void fiorisce() {
		
	}
	
	public void effettua_fotosintesi() {
		
	}
	
	
}
