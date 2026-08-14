package Argomento_3;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Esercizio 3 (Difficile) — Sistema di Gestione Dipendenti
Crea una classe Dipendente con:

Attributi privati: nome (String), ruolo (String), stipendioBase (double).

Costruttore e getter/setter.

Un metodo calcolaStipendioNetto() che calcola lo stipendio considerando le seguenti trattenute fiscali:

Se lo stipendio lordo è fino a 1500€, la trattenuta è del 15%.

Se lo stipendio lordo è superiore a 1500€, la trattenuta è del 23%.

Un metodo promuovi(String nuovoRuolo, double aumentoStipendio) che aggiorna il ruolo e incrementa lo stipendio base del valore fornito.

Nel main, crea un dipendente, calcola e stampa lo stipendio netto, poi promuovilo e ricalcola il nuovo stipendio netto.
		 */
		
		Dipendente dipendente1 = new Dipendente("Mario Rossi", "Impiegato", 1400);
		
		System.out.println("Stipendio netto: " + dipendente1.calcolaStipendioNetto());
		
		dipendente1.promuovi("Responsabile", 300);
		System.out.println("Nuovo stipendio netto: " + dipendente1.calcolaStipendioNetto());
		
	}

}
