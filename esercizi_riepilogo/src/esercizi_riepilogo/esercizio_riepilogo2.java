package esercizi_riepilogo;

public class esercizio_riepilogo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 🧩 Esercizio: Lavorare con i caratteri (char)

Scrivi un programma Java che:

Dichiari almeno 3 variabili di tipo char contenenti:

una lettera minuscola

una lettera maiuscola

un numero o un simbolo

Stampi a video i tre caratteri.

Converta i caratteri in numeri interi (codici Unicode) e li stampi.
👉 Usa il cast: (int) char1

Faccia l’operazione inversa: partendo da un numero intero (ad esempio 65), convertilo in char e stampa il risultato.
👉 Usa il cast: (char) 65

(Facoltativo) Scrivi un piccolo ciclo for che stampi i caratteri dall’‘A’ alla ‘Z’.

💻 Esempio di output atteso
char1: a
char2: Z
char3: ?
Codice di char1: 97
Codice di char2: 90
Codice di char3: 63
Carattere del codice 65: A

Alfabeto maiuscolo:
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		 */

		char char1 ='q';
		char char2 ='W';
		char char3 ='?';
		int car = 75;
		String risultato ="";
		String risultato2 ="";
		
		System.out.println("il carattere char1 è: " + char1 + " ed il suo valore numerico è: " + (int)(char1));
		System.out.println();
		
		System.out.println("il carattere char1 è: " + char2 + " ed il suo valore numerico è: " + (int)(char2));
		System.out.println();
		
		System.out.println("il carattere char1 è: " + char3 + " ed il suo valore numerico è: " + (int)(char3));
		System.out.println();
		
		System.out.println("il numero della variabile car è: " + car + " il carattere corrispondente è: " + (char) (car));
		System.out.println();
		
		for (int i = 'a'; i <= 'z'; i++) {
			risultato = risultato + (char) i;
			
		}System.out.println("l'alfabeto in minuscolo e: " + risultato);
	
		// esercizio compiuto all'90% da solo
	
		System.out.println("---------------------------------------------");
		
	 for(int s = 'z'; s >= 'a'; s--) {
		 risultato2 = risultato2 + (char) s;
	 }
	 System.out.println("l'alfabeto in minuscolo al contrario e: " + risultato2);
	 
	 // esercizio completato al 100% da solo
	
	
	}

}










