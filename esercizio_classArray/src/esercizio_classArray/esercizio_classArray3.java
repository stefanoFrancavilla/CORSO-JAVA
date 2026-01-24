package esercizio_classArray;

public class esercizio_classArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Esercizio: Gestione di un elenco di città

Scrivi un programma che:

Crea un array di 5 città italiane a tua scelta.

Stampa l’array usando un ciclo while, come hai fatto per i nomi (stampando città + indice).

Costruisci una stringa unica chiamata listaCittà che contenga tutte le città con queste regole:

dopo ogni città ci deve essere una virgola e uno spazio ", "

solo l’ultima deve terminare con un punto "."

Stampa il risultato finale, ad esempio:

Lista delle città: Roma, Milano, Firenze, Napoli, Torino.

🔥 Obiettivo bonus (opzionale, se vuoi allenarti di più)

Aggiungi un controllo che:

se una città inizia con la lettera maiuscola → ok

se inizia con la minuscola → convertirla in maiuscola con:

nome = nome.substring(0,1).toUpperCase() + nome.substring(1);


e poi inserirla correttamente nella lista.
		 */

		String[] citta = new String[5];
		
		citta[0] = "milano";
		citta[1] = "Lecce";
		citta[2] = "brindisi";
		citta[3] = "Torino";
		citta[4] = "Roma";
		
		String stringaUnica = "";
		String  virgola = ", ";
		String punto = ".";
		int c = 0;
		
		while ( c < citta.length) 
		{
		
		
		if(c == citta.length -1) 
		{
		stringaUnica = stringaUnica + citta[c] + punto;
		}
		else
		{
	    stringaUnica = stringaUnica + citta[c] + virgola;
		}
		c++;
		}
		System.out.println(stringaUnica);


	}

}
