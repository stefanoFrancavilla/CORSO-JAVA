package Es_12;

public class es_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Gestione Biblioteca
🎯 Obiettivo

Creare una classe Libro e simulare una piccola biblioteca.

📦 Classe Libro
Attributi:
String titolo
String autore
int pagine
boolean disponibile
🔧 Costruttore:

Inizializza tutti gli attributi.

🔹 Metodi:
prestaLibro()
Se il libro è disponibile → diventa non disponibile
Altrimenti → stampa "Libro già in prestito"
restituisciLibro()
Imposta disponibile = true
stampaInfo()
Stampa tutte le informazioni del libro
🧠 Vincoli:
pagine deve essere > 0
titolo e autore non devono essere vuoti
Gestisci gli errori con if
🏠 Main (classe principale)
Devi:
Creare 3 libri
Metterli in un array
Fare queste operazioni:
Prestare un libro
Provare a prestarlo di nuovo (test errore)
Restituirlo
Stampare tutti i libri
⭐ BONUS (se vuoi alzare il livello)

Aggiungi un metodo statico:

public static int contaDisponibili(Libro[] libri)

👉 Conta quanti libri sono disponibili

💡 Cosa alleni con questo esercizio:
Classi e oggetti
Incapsulamento (private + getter/setter)
Controlli con if
Array di oggetti
Metodi statici
Logica simile al tuo ContoCorrente (ma con stato booleano)
		 */
		
		Libro pinocchio = new Libro("Pinocchio", "Collodi", 450 );
		Libro ilCodiceDaVinci = new Libro("Il codice Da Vinci", "Dan Brown", 510 );
		Libro dizionario = new Libro("Dizionario", "Deagostini", 280 );

		System.out.println(pinocchio.getContatoreLibro());
		pinocchio.presta();
		System.out.println(pinocchio.getContatoreLibro());
		pinocchio.presta();
		pinocchio.restituisci();
		System.out.println(pinocchio.getContatoreLibro());
		pinocchio.presta();
		pinocchio.stampaInfo();
		
		
		Libro[] libri = new Libro[3];
		libri[0] = pinocchio;
		libri[1] = ilCodiceDaVinci;
		libri[2] = dizionario;
		
		Libro.contaDisponibili(libri);
		
		for(int i = 0; i < libri.length; i++)
		{
			libri[i].presta();
			libri[i].presta();
			libri[i].restituisci();
			libri[i].stampaInfo();
		}
	}
}
