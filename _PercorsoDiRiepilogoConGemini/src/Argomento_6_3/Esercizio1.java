package Argomento_6_3;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Registro allenamenti
Crea un programma per registrare i tempi di allenamento degli utenti.

Classe da creare
java

public class RegistroAllenamenti
Attributo
Dichiara questa mappa:

java

private Map<String, List<Integer>> allenamenti = new HashMap<>();
Significato:

String = nome dell’utente;

List<Integer> = durata degli allenamenti in minuti.

Metodi da implementare
java

public void aggiungiAllenamento(String nome, int minuti)
java

public int calcolaMinutiTotali(String nome)
java

public double calcolaMediaAllenamento(String nome)
java

public void stampaAllenamenti()
Comportamento richiesto
aggiungiAllenamento
Deve:

creare una lista se il nome non esiste;

aggiungere i minuti alla lista dell’utente.

calcolaMinutiTotali
Deve:

recuperare la lista dell’utente;

sommare tutti i minuti;

restituire il totale;

restituire 0 se l’utente non esiste o non ha allenamenti.

calcolaMediaAllenamento
Deve:

recuperare la lista dell’utente;

calcolare la durata media;

restituire un valore double;

gestire il caso di utente inesistente o lista vuota.

stampaAllenamenti
Deve stampare, per ogni utente:

nome;

lista degli allenamenti;

minuti totali;

media dei minuti per allenamento.

Main
Nel metodo main devi:

creare un oggetto RegistroAllenamenti;

inserire almeno 3 utenti;

inserire almeno 3 allenamenti per ogni utente;

chiamare stampaAllenamenti().

Dati suggeriti
Usa questi nomi:

"Luca"

"Anna"

"Marco"

Inserisci per ciascuno almeno tre durate diverse, espresse in minuti.

Sfide extra
Quando hai completato la traccia principale, aggiungi uno o più di questi metodi:

java

public String trovaUtenteConPiuMinuti()
java

public void stampaUtentiSopraMedia(double soglia)
java

public boolean esisteUtente(String nome)
java

public int contaAllenamenti(String nome)
		 */
		
		
		RegistroAllenamenti allenamenti = new RegistroAllenamenti();
		
		allenamenti.aggiungiAllenameto("Luca", 30);
		allenamenti.aggiungiAllenameto("Luca", 45);
		allenamenti.aggiungiAllenameto("Luca", 17);
		
		allenamenti.aggiungiAllenameto("Anna", 52);
		allenamenti.aggiungiAllenameto("Anna", 62);
		allenamenti.aggiungiAllenameto("Anna", 17);
		
		allenamenti.aggiungiAllenameto("Marco", 25);
		allenamenti.aggiungiAllenameto("Marco", 45);
		allenamenti.aggiungiAllenameto("Marco", 51);
		
		allenamenti.stampaAllenamenti();
		allenamenti.contaAllenamenti("Marco");
		
		System.out.println();
		allenamenti.stampaUtentiSopraMedia(40);
		System.out.println();
		System.out.println("L'utente con più minuti è : " + allenamenti.trovaUtenteConPiuMinuti());
	}

}
