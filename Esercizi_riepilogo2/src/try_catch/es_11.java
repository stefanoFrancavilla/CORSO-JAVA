package try_catch;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class es_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: gestione biblioteca
Scrivi un programma Java che gestisca una piccola biblioteca e:

parta con una lista di libri disponibili;

mostri un menu con queste opzioni:

1 vedere libri disponibili;

2 prendere in prestito un libro;

3 restituire un libro;

4 vedere storico operazioni;

5 uscire;

usi un ciclo while per ripetere il menu;

salvi ogni operazione in una ArrayList<String>;

gestisca input non numerico con try/catch;

controlli che il libro richiesto esista prima del prestito;

controlli che la restituzione non inserisca doppioni;

stampi Fine programma alla fine.

Vincoli
Usa ArrayList<String> per i libri disponibili.

Usa ArrayList<String> per lo storico.

Ogni operazione riuscita deve essere registrata nello storico.

Se l’utente sceglie 4, stampa tutto lo storico in ordine.

Se la biblioteca è vuota, stampalo chiaramente.

Suggerimenti
Puoi usare questi libri iniziali:

Il nome della rosa

Harry Potter

Il signore degli anelli

I promessi sposi

Obiettivo tecnico
Prova a creare almeno queste funzioni:

una per mostrare i libri;

una per prendere in prestito;

una per restituire;

una per leggere la scelta del menu.

Versione bonus
Aggiungi una sesta opzione:

6 cercare un libro per titolo.

Variante ancora diversa
Se vuoi un contesto più semplice, puoi farlo su:

magazzino prodotti,

negozio di gelati,

prenotazione posti cinema,

gestione animali in un rifugio.
		 */
	       ArrayList<String> libriDisponibili = new ArrayList<>();

	        libriDisponibili.add("Il nome della rosa");
	        libriDisponibili.add("Harry Potter");
	        libriDisponibili.add("Il signore degli anelli");
	        libriDisponibili.add("I promessi sposi");
	        libriDisponibili.add("Pinocchio");

	        ArrayList<String> libreria = new ArrayList<>(libriDisponibili);

	        ArrayList<String> storico = new ArrayList<>();

	        Scanner scanner = new Scanner(System.in);

	        boolean run = true;

	        while (run) {

	            System.out.println("\n------ MENU LIBRERIA ------");
	            System.out.println("1. Libri disponibili");
	            System.out.println("2. Prestito libro");
	            System.out.println("3. Restituzione libro");
	            System.out.println("4. Storico operazioni");
	            System.out.println("5. Esci");
	            System.out.println("6. Cerca libro");

	            int scelta;

	            try {
	                scelta = scanner.nextInt();
	                scanner.nextLine();
	            } catch (InputMismatchException e) {
	                System.out.println("	Inserisci solo numeri.");
	                scanner.nextLine();
	                continue;
	            }

	            switch (scelta) {

	                case 1:
	                    mostraLibri(libriDisponibili);
	                    break;

	                case 2:

	                    System.out.println("	Titolo libro da prendere:");
	                    
	                    mostraLibri(libriDisponibili);

	                    String prestito = scanner.nextLine();

	                    if (libriDisponibili.contains(prestito)) {

	                        libriDisponibili.remove(prestito);

	                        storico.add("	Prestato: " + prestito);

	                        System.out.println("	Libro prestato.");

	                    } else {
	                        System.out.println("	Libro non disponibile.");
	                    }

	                    break;

	                case 3:

	                    System.out.println("	Titolo libro da restituire:");

	                    String restituzione = scanner.nextLine();

	                    if (!libreria.contains(restituzione)) {

	                        System.out.println("	Questo libro non appartiene alla libreria.");

	                    } else if (libriDisponibili.contains(restituzione)) {

	                        System.out.println("	Libro già presente.");

	                    } else {

	                        libriDisponibili.add(restituzione);

	                        storico.add("	Restituito: " + restituzione);

	                        System.out.println("	Libro restituito.");
	                    }

	                    break;

	                case 4:

	                    mostraStorico(storico);

	                    break;

	              

	                case 5:

	                    run = false;

	                    break;

	                case 6:

	                    System.out.println("	Titolo da cercare:");

	                    String cerca = scanner.nextLine();

	                    if (libreria.contains(cerca)) {

	                        System.out.println("	Libro presente in libreria.");

	                        if (libriDisponibili.contains(cerca)) {
	                            System.out.println("	Attualmente disponibile.");
	                        } else {
	                            System.out.println("	Attualmente in prestito.");
	                        }

	                    } else {

	                        System.out.println("	Libro non presente.");
	                    }

	                    break;
	                default:
	                    System.out.println("	Scelta non valida.");
	            }
	        }

	        System.out.println("	Fine programma");

	        scanner.close();
	    }

	    public static void mostraLibri(ArrayList<String> libri) {

	        if (libri.isEmpty()) {

	            System.out.println("	Nessun libro disponibile.");

	        } else {

	            System.out.println("	\n--- LIBRI DISPONIBILI ---");

	            for (String libro : libri) {
	                System.out.println(libro);
	            }
	        }
	    }

	    public static void mostraStorico(ArrayList<String> storico) {

	        if (storico.isEmpty()) {

	            System.out.println("	Nessuna operazione registrata.");

	        } else {

	            System.out.println("	\n--- STORICO ---");

	            for (String operazione : storico) {
	                System.out.println(operazione);
	            }
	        }
	    }
	}
