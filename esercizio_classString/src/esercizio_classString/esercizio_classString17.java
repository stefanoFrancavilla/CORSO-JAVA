package esercizio_classString;

public class esercizio_classString17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO PROPOSTO: Generatore di pattern testuale personalizzato

Scrivi un programma che:

Crea un StringBuilder vuoto.

Per un numero di iterazioni deciso da te (es. 8):

Aggiunge alla stringa tante "x" quanto vale l’indice corrente.

Inserisce il carattere "o" esattamente a metà della stringa (usa insert()).

Sostituisce l’ultimo carattere della stringa con "z" (usa replace()).

Ogni ciclo deve stampare la sequenza generata fino a quel momento.

🔍 Esempio di comportamento atteso

Iterazione 1

Stringa iniziale: ""

Aggiungi una x: "x"

Inserisci "o" a metà → posizione 0 → "ox"

Sostituisci ultimo carattere con z: "oz"
👉 Stampa: oz

Iterazione 2

Aggiungi "xx" → "ozxx"

Inserisci "o" in mezzo → posizione 2 → "ozoxx"

Sostituisci ultimo carattere con z → "ozoxz"
👉 Stampa: ozoxz

(continua…)

🎯 OBIETTIVI DELL’ESERCIZIO

✔ Capire come gestire gli indici dopo insert e append
✔ Usare StringBuilder come buffer dinamico
✔ Combinare cicli annidati
✔ Applicare manipolazioni di stringa in sequenza
✔ Evitare errori di out-of-bounds
		 */
		
		StringBuilder carattere = new StringBuilder("");
			
		
		for(int i = 0; i < 8 ; i++ )
		{
			for( int p = 1; p <= i ; p++)
			{
				carattere.append("x");
			}
			
			if(i == 7)
			{
				carattere.insert(carattere.length() / 2, "o");
				
				carattere.replace(carattere.length() -1, carattere.length(), "z");
			}
			
			
			System.out.println(carattere);
		}
		System.out.println(carattere.length());
		
		int length = carattere.length();

		
		for (int s = 0; s <= length ; s++)
		{
			if ( s == 0)
			{
				carattere.append("xx");
			}
			
			if (s == length )
			{
				carattere.insert((length) / 2, "o");
				
				carattere.replace(length -1, length, "z");
			}
		}

		System.out.println(carattere);

		
		
	}

}
