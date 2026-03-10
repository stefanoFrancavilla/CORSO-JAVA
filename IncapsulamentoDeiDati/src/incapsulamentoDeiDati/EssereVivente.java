package incapsulamentoDeiDati;

public abstract class EssereVivente {
	//variabili di istanza
	private byte anni;
	private float altezza;
	private float peso;
	
	
	//Costruttori
	public EssereVivente() {
		System.out.println("EssereVivente (0)");
	}
	
	public EssereVivente(byte anni, float altezza, float peso) {
		System.out.println("EssereVivente (3)");
		this.setAnni (anni);
		this.setAltezza (altezza);
		this.setPeso (peso);
		
	}
	
	//metodi getter/setter
	
	public byte getAnni() {
		return anni;
	}
	//public abstract void setAnni(byte anni);
	public void setAnni(byte anni) {
		this.anni = anni;
	}
	/*
	 * se importiamo il metodo da una classe astratta , ad un'altra super classe astratta , non abbiamo l'obbligo di implementarlo
	 * a differenza di una classe astratta che passa il suo metodo alla classe normale,
	 * che invece è obbligata ad implementarlo, altrimenti non potrebbe essere istanziata.
	 * 
	 * nel nostro caso le classi essere umano e gatto sono classi specifiche,
	 * che vengono estese da una classe più generica, Animale,
	 * che a sua volta viene estesa da un'altra classe astratta ancora più generica EssereVivente,
	 * 
	 * bisogna vederla come una ereditaria con le varie ramificazioni, in cui la classe più generica è EssereVivente,
	 *  che viene estesa da Animale, che a sua volta viene estesa da Gatto e EssereUmano,
	 * 
	 */
	
	public float getAltezza() {
		return altezza;
	}
	//public abstract void setAltezza(float altezza);
	public  void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	
	public float getPeso() {
		return peso;
	}

	//public abstract void setPeso(float peso);
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	//metodi 
	public abstract void nasce();
	
	public abstract void siNutre();
	
	public abstract void respira();
	
	public abstract void muore();
	
	public void stampa() {
		System.out.println("Anni: " + this.getAnni());
		System.out.println("Altezza: " + this.getAltezza());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("--------------------------");
	}
}
