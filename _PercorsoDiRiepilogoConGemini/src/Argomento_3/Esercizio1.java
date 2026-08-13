package Argomento_3;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Crea una classe Auto con:

Tre attributi privati (private): marca (String), modello (String) e anno (int).

Un costruttore parametrizzato per inizializzare tutti gli attributi.

I metodi Getter e Setter per ogni attributo.

Un metodo stampaDettagli() che stampi a schermo le informazioni dell'auto (es. "Auto: Ford Fiesta (2018)").

Nel main, istanzia un oggetto Auto e invoca il metodo stampaDettagli().
		 */
		
		Auto auto1 = new Auto("AlfaRomeo", "159" , 2015);
		
		auto1.stampaDettagli();
	}

}
