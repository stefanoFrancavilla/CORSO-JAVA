package Argomento1_List;

public class Libro {

	//variabili di istanza
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private int copieDisponibili;
    
    //costruttore
	 public Libro(String titolo, String autore, int annoPubblicazione, int copieDisponibile) {
		
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.copieDisponibili = copieDisponibile;
	 }

	 //metodi getter/setter
	 
	 public String getTitolo() {
		 return titolo;
	 }

	 public void setTitolo(String titolo) {
		 if(titolo == null || titolo.isEmpty())
		 {
			 System.out.println("Il titolo non può essere null o vuoto");
		 }
		 else
		 {
			 this.titolo = titolo;
		 }
		
	 }

	 public String getAutore() {
		 return autore;
	 }

	 public void setAutore(String autore) {
		 if(autore == null || autore.isEmpty())
		 {
			 System.out.println("L'autore non può essere null o vuoto");
		 }
		 else
		 {
			 this.autore = autore;
		 }
		 
	 }

	 public int getAnnoPubblicazione() {
		 return annoPubblicazione;
	 }

	 public void setAnnoPubblicazione(int annoPubblicazione) {
		 if (annoPubblicazione < 0)
		 {
			 System.out.println("Errore l'anno di publicazione deve essere maggiore di 0");
		 }
		 else
		 {
			 this.annoPubblicazione = annoPubblicazione; 
		 }
		
	 }

	 public int getCopieDisponibile() {
		 return copieDisponibili;
	 }

	 public void setCopieDisponibile(int copieDisponibile) {
		 if(copieDisponibili <= 0 && copieDisponibili > 10)
		 {
			 System.out.println("Errore numero di copie non corretto, deve essere compreso tra 0 e 10");
		 }
		 else
		 {
			 this.copieDisponibili = copieDisponibile;
		 }
			  
	 }
	 //metodi
	 
	 public void prestaCopia()
	 {
		 if (copieDisponibili > 0)
		 {
			 copieDisponibili --;
		 }
	 }
	 
	 public void restituisciCopia()
	 {
		 if(copieDisponibili > 10)
		 {
			 System.out.println("Raggiunto il limite massimo di copie che si possono ritirare");
		 }
		 else
		 {
			 copieDisponibili ++; 
		 }
		
	 }

	 @Override
	 public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", annoPubblicazione=" + annoPubblicazione
				+ ", copieDisponibili=" + copieDisponibili + "]";
	 }
	 
	 
	 
}
