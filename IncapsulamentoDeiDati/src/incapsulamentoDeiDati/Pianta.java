package incapsulamentoDeiDati;

import incapsulamentoDeiDati.utilities.Verifica;

public abstract class Pianta extends EssereVivente {
/*
 * Esercizio: modellare con ooportune classi astrate e concrete il mondo delle piante 
 * per arrivare a poter collocare nel nostro mondo virtuale degli alberi, dei fiori ecc.
 */
	//variabli
	protected String nome;
	protected Tipo_di_foglie tipo_di_foglie;
	protected Tipo_di_frutto tipo_di_frutto;
	
	
	private static final String Caratteri_proibiti = "0123456789!@#$%^&*()_+-=|\\/?><.,;:'[]{}";
	public Pianta() {
		
	}
	
	
	public Pianta(String nome, byte anni, float altezza, float peso, Tipo_di_foglie tipo_di_foglie, Tipo_di_frutto tipo_di_frutto ) {
		super(anni, altezza, peso);
		this.setNome(nome);
		this.tipo_di_foglie = tipo_di_foglie;
		this.tipo_di_frutto = tipo_di_frutto;
			
	}
	
	//getter/setter
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (Verifica.verificaCratteri(Caratteri_proibiti, nome) || Verifica.verificaLunghezza(nome, 20)) 
		{
			System.out.println("Il nome non è valido");
		}
		 else 
		{
			this.nome = nome;
		}
		
	}
	
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
		System.out.println("La pianta sta fiorendo");
	}
	
	public void effettua_fotosintesi() {
		System.out.println("La pianta sta effettuando la fotosintesi");
	}
	
	
}
