package Argomento_6_1;

public class Esercizio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3
Crea una classe RegistroStudenti con una mappa:

java

Map<String, List<Double>> registro = new HashMap<>();
Aggiungi i metodi:

aggiungiVoto(String studente, double voto)

calcolaMedia(String studente)

stampaStudenti() che mostra ogni studente, i voti e la media.

Nel main inserisci almeno:

3 studenti;

almeno 3 voti per ciascuno.

Obiettivo: imparare a gestire mappe con liste come valori.
		 */
		
		RegistroStudenti registro = new RegistroStudenti();
		registro.aggiungiVoto("Stefano", 10);
		registro.aggiungiVoto("Stefano", 8);
		registro.aggiungiVoto("Stefano", 7);
		registro.aggiungiVoto("Stefano", 3);
		registro.aggiungiVoto("Stefano", 5);
		
		registro.aggiungiVoto("Marco", 6);
		registro.aggiungiVoto("Marco", 7.5);
		registro.aggiungiVoto("Marco", 8);
		
		registro.aggiungiVoto("Sara", 5);
		registro.aggiungiVoto("Sara", 7.5);
		registro.aggiungiVoto("Sara", 10);
		
		registro.stampaStudenti();
		
	}

}
