package Argomento2_Set;

public class EsercizioSentieri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GestioneSentieri gestioneSentieri = new GestioneSentieri();
		
		 // stampa del Set vuoto
		System.out.println("Stampa del Set vuoto:");
		gestioneSentieri.stampaTuttiSentieri();
		System.out.println();
		
		// conteggio iniziale
		System.out.println("Conteggio iniziale: " + gestioneSentieri.contaSentieri());
		System.out.println("-------------------------------------------");
		System.out.println();
		
		// inserimento di almeno sei sentieri
		
		gestioneSentieri.aggiungiSentiero("Gottardo");
		gestioneSentieri.aggiungiSentiero("Bernina");
		gestioneSentieri.aggiungiSentiero("Lago di Como");
		gestioneSentieri.aggiungiSentiero("Lago di Garda");
		gestioneSentieri.aggiungiSentiero("Passo dello Stelvio");
		gestioneSentieri.aggiungiSentiero("Valtellina");
		
		// inserimento di un duplicato
		System.out.println("Inserimento di un duplicato:");
		gestioneSentieri.aggiungiSentiero("Gottardo");
		System.out.println();
		
		// inserimento di null
		System.out.println("Inserimento di null:");
		gestioneSentieri.aggiungiSentiero(null);
		System.out.println();
		
		// inserimento di una stringa vuota o composta da spazi
		System.out.println("Inserimento di una stringa vuota o composta da spazi:");
		gestioneSentieri.aggiungiSentiero("   ");
		System.out.println();
		
		// stampa completa
		System.out.println("Stampa completa:");
		gestioneSentieri.stampaTuttiSentieri();
		System.out.println();
		
		// ricerca di un sentiero presente
		System.out.println("Ricerca di un sentiero presente:");
		System.out.println("Contiene 'Gottardo': " + gestioneSentieri.contieneSentiero("Gottardo"));
		System.out.println();
		
		// ricerca di un sentiero assente
		System.out.println("Ricerca di un sentiero assente:");
		System.out.println("Contiene 'Monte Bianco': " + gestioneSentieri.contieneSentiero("Monte Bianco"));
		System.out.println();
		
		// conteggio per iniziale, usando maiuscole e minuscole diverse
		System.out.println("Conteggio per iniziale 'L': " + gestioneSentieri.contaSentieriConIniziale('L'));
		System.out.println("Conteggio per iniziale 'l': " + gestioneSentieri.contaSentieriConIniziale('l'));
		System.out.println();
		
		// stampa ordinata
		System.out.println("Stampa ordinata:");
		gestioneSentieri.stampaSentieriOrdinati();
		System.out.println();
		
		// rimozione di un sentiero presente
		System.out.println("Rimozione di un sentiero presente:");
		gestioneSentieri.rimuoviSentiero("Gottardo");
		System.out.println();
		
		// rimozione di un sentiero assente
		System.out.println("Rimozione di un sentiero assente:");
		gestioneSentieri.rimuoviSentiero("Monte Bianco");
		System.out.println();
		
		// conteggio finale
		System.out.println("Conteggio finale: " + gestioneSentieri.contaSentieri());
		
		
		
		
		
	}

}
