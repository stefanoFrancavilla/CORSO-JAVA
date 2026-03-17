package incapsulamento_dati_biblioteca;

public final class Rivista extends Pubblicazione {
//variabili d'istanza
	private int numero;
	private String periodicità;
	
//Costruttore
	public Rivista() {
		this("ND", 0, "ND", 0 );
	}
	
	public Rivista(String titolo, int numero, String periodicità, int annoPubblicazione) {
		super(titolo, annoPubblicazione);
	}

	//metodi getter/setter
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(String periodicità) {
		this.periodicità = periodicità;
	}
	
//metodi
	
	@Override
	public void stampaDettagli() {
		super.stampaDettagli();
		System.out.println("numero: " + numero);
		System.out.println("periodicità: " + periodicità);
	}
}
