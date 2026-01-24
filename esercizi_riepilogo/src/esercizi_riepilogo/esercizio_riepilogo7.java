package esercizi_riepilogo;

public class esercizio_riepilogo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Esercizio: tabella caratteri minuscoli con codici

Obiettivo:
Scrivere un programma Java che visualizzi per tutte le lettere minuscole dell’alfabeto inglese (da ‘a’ a ‘z’):

il codice numerico decimale

il codice numerico esadecimale

e il carattere corrispondente.

Requisiti:

Usa un ciclo for per scorrere i caratteri da 'a' a 'z'.

All’interno del ciclo, stampa:

il valore numerico decimale (come int);

il valore esadecimale (con Integer.toHexString()).

Il formato di stampa deve essere ordinato e chiaro.

Esempio di output atteso:

Carattere: a | Decimale: 97 | Esadecimale: 61
Carattere: b | Decimale: 98 | Esadecimale: 62
...
Carattere: z | Decimale: 122 | Esadecimale: 7a
		 */
		
		for (int i = (int) 'a'; i <= (int) 'z'; i++ ) {
			System.out.println("Carattere: " + (char) i + " | " + "Decimale: " + i + " | " + " Esadecimale: " + Integer.toHexString(i));
		}

	}

}
