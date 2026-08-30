package Argomento_6;

public class Esercizo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3 (Difficile) — Registro Voti con Map (HashMap<String, List<Double>>)
Crea una classe RegistroStudenti con una mappa privata Map<String, List<Double>> registro = new HashMap<>();.

Aggiungi i seguenti metodi:

public void aggiungiVoto(String studente, double voto): se lo studente non esiste nella mappa,
 inizializza la sua lista di voti prima di aggiungere il voto.

public double calcolaMedia(String studente): restituisce la media dei voti dello studente 
(restituisci 0.0 o gestisci il caso se lo studente non esiste o non ha voti).

public void stampaTuttiGliStudenti(): itera sulla mappa stampando per ogni studente i suoi voti e la sua media complessiva.

Nel main, inserisci alcuni studenti con più voti ciascuno e stampa il report finale.
		 */
		
		RegistroStudenti registro = new RegistroStudenti();
		
	    registro.aggiungiVoto("Marco", 7.5);
        registro.aggiungiVoto("Marco", 8.0);
        registro.aggiungiVoto("Marco", 6.5);

        registro.aggiungiVoto("Luca", 9.0);
        registro.aggiungiVoto("Luca", 8.5);

        registro.aggiungiVoto("Anna", 10.0);
        registro.aggiungiVoto("Anna", 9.5);
        registro.aggiungiVoto("Anna", 8.5);

        registro.stampaTuttiGliStudenti();
	}

}
