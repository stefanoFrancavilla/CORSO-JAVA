package Argomento1_List;

public class EsercizioOrdini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ordine ordine1 = new Ordine(101, "Marco Rossi", 49.90, StatoOrdine.IN_PREPARAZIONE);
		Ordine ordine2 = new Ordine(102, "Laura Bianchi", 120.00, StatoOrdine.SPEDITO);
		Ordine ordine3 = new Ordine(103, "Marco Rossi", 75.50, StatoOrdine.CONSEGNATO);
		Ordine ordine4 = new Ordine(104, "Davide Verdi", 20.00, StatoOrdine.IN_PREPARAZIONE);
		Ordine ordine5 = new Ordine(105, "Marco Rossi", 250.00, StatoOrdine.SPEDITO);
		Ordine ordine6 = new Ordine(106, "Laura Bianchi", 99.99, StatoOrdine.CONSEGNATO);

		GestioneOrdini gestioneOrdini = new GestioneOrdini();
		
		System.out.println("\n--- TEST LISTA VUOTA ---");
		//Lista inizialmente vuota
		gestioneOrdini.stampaTuttiOrdini();
		System.out.println("-----------------------------");
		
		System.out.println("\n--- CREAZIONE E AGGIUNTA ---");
		//Inserimento valido
		gestioneOrdini.aggiungiOrdine(ordine1);
		gestioneOrdini.aggiungiOrdine(ordine2);
		gestioneOrdini.aggiungiOrdine(ordine3);
		gestioneOrdini.aggiungiOrdine(ordine4);
		gestioneOrdini.aggiungiOrdine(ordine5);
		gestioneOrdini.aggiungiOrdine(ordine6);
		
		//Stampa tutti gli ordini
	
		gestioneOrdini.stampaTuttiOrdini();
		System.out.println("-----------------------------");
		
		System.out.println("\n--- CONTROLLO DUPLICATI E NULL ---");
		//Inserimento non valido
		gestioneOrdini.aggiungiOrdine(null);
		gestioneOrdini.aggiungiOrdine(ordine1);
		System.out.println("-----------------------------");
		
		System.out.println("\n--- RICERCHE ---");
		
		//Ricerca per numero
		System.out.println(gestioneOrdini.cercaOrdinePerNumero(103));
		System.out.println(gestioneOrdini.cercaOrdinePerNumero(999));
		System.out.println(gestioneOrdini.cercaOrdinePerNumero(0));
		
		//Ricerca per cliente
		System.out.println(gestioneOrdini.cercaOrdiniPerCliente("Marco Rossi"));
		System.out.println(gestioneOrdini.cercaOrdiniPerCliente("Cliente Assente"));
		System.out.println(gestioneOrdini.cercaOrdiniPerCliente("   "));
		
		//Primo e ultimo indice
		System.out.println(gestioneOrdini.cercaIndicePrimoOrdine("Marco Rossi"));
		System.out.println(gestioneOrdini.cercaIndiceUltimoOrdine("Marco Rossi"));
		System.out.println(gestioneOrdini.cercaIndicePrimoOrdine("Cliente Assente"));
		System.out.println(gestioneOrdini.cercaIndiceUltimoOrdine("Cliente Assente"));
		System.out.println("-----------------------------");
		
		System.out.println("\n--- AGGIORNAMENTO E FILTRI ---");
		//Aggiornamento dello stato
		gestioneOrdini.aggiornaStatoOrdine(101, StatoOrdine.SPEDITO);
		gestioneOrdini.aggiornaStatoOrdine(999, StatoOrdine.CONSEGNATO);
		gestioneOrdini.aggiornaStatoOrdine(102, null);
		
		//Filtro per stato
		gestioneOrdini.stampaOrdiniPerStato(StatoOrdine.SPEDITO);
		gestioneOrdini.stampaOrdiniPerStato(StatoOrdine.ANNULLATO);
		
		//Filtro per totale minimo
		gestioneOrdini.stampaOrdiniConTotaleMinimo(100);
		gestioneOrdini.stampaOrdiniConTotaleMinimo(-10);
		
		//Totale incassi del cliente
		gestioneOrdini.stampaTotaleIncassiPerCliente("Marco Rossi");
		gestioneOrdini.stampaTotaleIncassiPerCliente("Cliente Assente");
		gestioneOrdini.stampaTotaleIncassiPerCliente(" ");
		
		System.out.println("-----------------------------");
		
		System.out.println("\n--- ORDINAMENTO E MASSIMO ---");
		//Ordinamento crescente e massimo
		gestioneOrdini.ordinaOrdiniPerTotaleCrescente();
		gestioneOrdini.stampaTuttiOrdini();
		gestioneOrdini.stampaOrdineConTotaleMassimo();
		
		System.out.println("-----------------------------");
		
		System.out.println("\n--- RIMOZIONI ---");
		//Rimozioni per numero
		gestioneOrdini.rimuoviOrdinePerNumero(104);
		gestioneOrdini.rimuoviOrdinePerNumero(999);
		gestioneOrdini.rimuoviOrdinePerNumero(0);
		
		//Rimozioni per indice
		gestioneOrdini.stampaTuttiOrdini();
		gestioneOrdini.rimuoviOrdinePerIndice(0);
		gestioneOrdini.rimuoviOrdinePerIndice(-1);
		gestioneOrdini.rimuoviOrdinePerIndice(50);
		
		gestioneOrdini.stampaTuttiOrdini();
		System.out.println("-----------------------------");
		
		
	}

}
