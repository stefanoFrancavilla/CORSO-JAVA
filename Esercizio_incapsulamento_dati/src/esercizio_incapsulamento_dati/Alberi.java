package esercizio_incapsulamento_dati;

public class Alberi {

	public TipoDiAlbero tipo;
	public double altezza;
	public int eta;
	public Colore_Foglie foglie;
	public Stagione stagione;
	
	public Alberi(TipoDiAlbero tipo, double altezza, int eta, Colore_Foglie foglie, Stagione stagione) {
		this.tipo = tipo.SCONOSCIUTO;
		this.altezza = altezza;
		this.eta = eta;
		this.foglie = foglie.SCONOSCIUTO;
		this.stagione = stagione.SCONOSCIUTO;
	    }
		
		public void cresce() {
	    System.out.println("L'albero sta crescendo.");
		}
		public void perdeFoglie() {
	    System.out.println("L'albero sta perdendo le foglie.");
		}
		public void fotosintesi() {
	    System.out.println("L'albero sta effettuando la fotosintesi.");
		}
		public void stampa() {
	    System.out.println("----------");
	    System.out.println("Tipo di albero: " + tipo);
	    System.out.println("Altezza: " + altezza + " metri");
	    System.out.println("Età: " + eta + " anni");
	    System.out.println("Colore delle foglie: " + foglie);
	    System.out.println("Stagione: " + stagione);
		}
	}
	

