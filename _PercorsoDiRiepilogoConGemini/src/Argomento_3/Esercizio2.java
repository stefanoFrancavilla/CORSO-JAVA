package Argomento_3;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2 (Medio) — Gestione Conto Corrente
Crea una classe ContoBancario con:

Attributi privati: numeroConto (String) e saldo (double).

Un costruttore che accetta numeroConto e un saldoIniziale.

Un metodo deposita(double importo) che aggiunge l'importo al saldo solo se importo > 0.

Un metodo preleva(double importo) che sottrae l'importo dal saldo solo se importo > 0 e se ci sono fondi sufficienti 
(altrimenti stampa un messaggio d'errore come "Saldo insufficiente").

Un getter per il saldo.

Nel main, crea un conto, effettua un deposito, un prelievo valido e un prelievo non valido per testare la logica.
		 */
		
		ContoBancario conto1 = new ContoBancario("U123", 1000);
		
		conto1.deposita(100);
		conto1.preleva(1000);
		conto1.preleva(200);
		
	}

}
