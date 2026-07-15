package pre_Esame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * PRE-ESAME JAVA
PARTE 1 - TEORIA (20 punti)
Domanda 1 (4 punti)

Spiega la differenza tra:

classe
oggetto
attributo
metodo

Fornisci anche un esempio.

Domanda 2 (4 punti)

Qual è la differenza tra:

==
.equals()

Quando si usa uno e quando l'altro?

Domanda 3 (4 punti)

Che cos'è l'ereditarietà?

Scrivi un piccolo esempio con una classe padre e una figlia.

Domanda 4 (4 punti)

Differenza tra:

Array
ArrayList

Quando conviene usare uno o l'altro?

Domanda 5 (4 punti)

Cos'è un'eccezione?

Differenza tra:

checked exception
unchecked exception
PARTE 2 - ANALISI DEL CODICE (20 punti)
Esercizio 1 (10 punti)

Cosa stampa questo programma?

public class Test {

    public static void main(String[] args) {

        String a = "ciao";
        String b = "ciao";

        String c = new String("ciao");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a == c);
        System.out.println(a.equals(c));

    }

}

Spiega anche il motivo.

Esercizio 2 (10 punti)

Trova gli errori.

public class Persona {

    private String nome;

    public Persona(String nome){
        nome = nome;
    }

    public void stampa(){

        System.out.println(nome);

    }

}
PARTE 3 - PROGRAMMAZIONE (60 punti)
ESERCIZIO 1 (20 punti)

Realizza la classe

Studente

con:

nome
cognome
matricola
mediaVoti

Implementa:

costruttore
getter
setter
toString()

Nel main crea almeno 3 studenti e stampali.

ESERCIZIO 2 (20 punti)

Realizza un piccolo gestionale di una biblioteca.

Classe:

Libro

Campi:

titolo
autore
anno
disponibile

Nel main

crea un ArrayList<Libro>
inserisci almeno 5 libri
stampa solo quelli disponibili.
ESERCIZIO 3 (20 punti)

Realizza un programma che:

chiede all'utente 5 numeri
li salva in un ArrayList
calcola:
somma
media
numero massimo
numero minimo

Gestisci eventuali errori di input con try-catch.

BONUS (10 punti)

Realizza una classe

ContoCorrente

con:

saldo

Metodi:

deposita()
preleva()

Se si tenta di prelevare più del saldo disponibile, lancia un'eccezione personalizzata chiamata

SaldoInsufficienteException
Modalità di consegna

Rispondi esattamente come durante un esame, iniziando da:

Domanda 1

e proseguendo fino all'ultimo esercizio.

Non ti darò suggerimenti durante lo svolgimento, proprio come farebbe un esaminatore.
		 */
		
		
		//Parte 1
		/*
		 * Domanda 1
		 * 
		 * La classe è uno strumento che ci fornisce java , dove è possibile creare e modellare il nostro oggetto.
		 * l'oggetto è il frutto della nostra creazione effettuata in una classe.
		 * l'attributo caratterizza l'oggetto 
		 * il metodo è un comportamento che può effettuare il nostro oggetto
		 * 
		 * class Persona(){...} dentro questo blocco creiamo il nostro oggetto.
		 * l'oggetto che stiamo creando è una persona
		 * il nome , il peso ecc. sono gli attributi
		 * i metodi sono i comportamenti es:
		 * public void respira() , questo è un metodo che fa compiere un'azione al nostro oggetto.
		 */
		
		/*
		 * Domanda 2
		 * 
		 * supponiamo di avere due String e di voler verificare se sono ugali.
		 * con .equals() stiamo verificando lo stesso valore delle string.
		 * esempio: String a = "casa"; String b = new String("casa");
		 * cioè tiamo verificando se "casa" di a è uguale a "casa" di b
		 * quindi il risultato sarà true;
		 * 
		 * mentre con == stiamo verificando se tutti e due puntano allo stesso indirizzo,
		 * ma in questo caso la risposta è false , poichè sono due elementi diversi.
		 * 
		 *
		 */
		
		/*
		 * Domanda 3
		 * 
		 * l'ereditarietà è una funzione che java ci mette a disposizione.
		 * con l'ereditarietà abbiamo la possibilità di non riscrivere più volte lo stesso codice.
		 * se il codice lo scriviamo alla classe padre, la classe figlio eredita quel determinato codice , 
		 * permettendo a noi di avere più facilità nella scrittura e lettura del codice stesso.
		 * es:
		 * la classe padre è sempre più generica , mentre la classe figlia è più specifica.
		 * classe padre(Animale), classe figlie(Cane, Gatto)
		 */
	
		/*
		 * Domanda 4 
		 * l'Array è più veloce di un'ArrayList
		 * l'Array ha una capacità che una volta stabilità non può cambiare
		 * l'array può lavorare con i primitivi
		 * l'array lavora solo con elementi dello stesso tipo
		 * l'ArrayList ha una size dinamica che si espande automaticamente
		 * l'ArrayList lavora solo con oggetti
		 * l'ArrayList può lavorare con oggetti anche di diverso tipo
		 * 
		 */
		
		/*
		 * Domanda 5
		 * 
		 * un'eccezione è il termine che usa java per classificare gli errori che possono bloccare il nostro programma.
		 * ci sono eccezioni che possiamo  gestire, attraverso per esempio il blocco try/catch
		 * poi ci sono degli errori che non possiamo gestire, tipo gli Error
		 * le chacked controllate dal compilatore , e noi siamo obbligati a gestirle.
		 * le un'cheked non sono controllate dal compilatore e noi non siamo obbligati a gestirle. 
		 */
		
		
		//PARTE2
		/*
		 * Esercizio1
		 * 
		 * nell'output a == b , avremo true, poichè puntano tutti e due allo stesso reference
		 * nell'output a.equals(b), avremo true, poichè il valore è uguale.
		 * nell'output a == c , avremo false, perchè sono due elementi diversi 
		 * nell'output a.equals(c) , avremo true, perchè il loro valore è uguale.
		 */
		
		/*
		 * Esercizio2 
		 * 
		 * in questa classe persona è stata creata con una variabile di istanza nome resa private,
		 * di conseguenza ha bisogno di un metodo getter/setter per lettura e scrittura nel main (manca)
		 * 
		 * nel costruttore abbiamo nome = nome, ma è sbagliato
		 * this.nome = nome; (questo è corretto)
		 * 
		 */
		
		//PARTE 3
		//Esercizio 1
		Studente studente1 = new Studente("Alessio", "Francavilla", 52, 6.5);
		Studente studente2 = new Studente("Stefano", "Francavilla", 51, 8.5);
		Studente studente3 = new Studente("Giovanna", "D'Agnano", 50, 4.5);
		
	    System.out.println(studente1.toString());
	    System.out.println(studente2.toString());
	    System.out.println(studente3.toString());
	    System.out.println("-------------------------------------------------");
	    //Esercizio 2
	    
	    Libro libro1 = new Libro("Pinocchio", " Collodi", 1950, true);
	    Libro libro2 = new Libro("Il codice da vinci", " Dan Brown", 2005, true);
	    Libro libro3 = new Libro("Angeli e demoni", " Dan brown", 2007, true);
	    Libro libro4 = new Libro("La memoria dei morti", " Angela", 2023, false);
	    Libro libro5 = new Libro("Una mente assassina", " Angela", 2024, true);
	    
	    ArrayList<Libro> libri = new ArrayList<>();
	    libri.add(libro1);
	    libri.add(libro2);
	    libri.add(libro3);
	    libri.add(libro4);
	    libri.add(libro5);
	    
	    for(Libro libro : libri)
	    {
	    	if (libro.isDisponibile() == true)
	    	{
	    		System.out.println(libro.toString());
	    	}
	    }
	    System.out.println("-------------------------------------------------");
	    
	    //Esercizio3
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("inserisci 5 numeri");
	    
	    ArrayList<Integer> numeri = new ArrayList<>();
	    
	    for (int i = 1;i <= 5; i ++)
	    {
	    	System.out.println("numero " + i + "/ 5");
	    	numeri.add(scanner.nextInt());
	    }
	    
	    try {
	    	
	    	System.out.println("La somma è: " + somma(numeri));
	    	System.out.println("La media è: " + media(numeri));
	    	System.out.println("Il numero massimo è: " + max(numeri));
	    	System.out.println("Il numero minimo è: " + min(numeri));
	    	
	    	
	    }
	    catch(NullPointerException e)
	    {
	    	e.getStackTrace();
	    }
	    catch(ArithmeticException e)
	    {
	    	e.getStackTrace();
	    }
	    finally
	    {
	    	System.out.println("Fine controllo");
	    }
	    System.out.println("-------------------------------------------------");
	    
	    //Bonus
	    
	    
	    
	}
	
	public static int somma(ArrayList<Integer> n)
	{
		int somma = 0;
		for(int numero: n)
		{
			somma += numero;
		}
		
		return somma;
	}
	
	public static double media(ArrayList<Integer> n)
	{
		int numeroCorrente = 0;
		
		for (int numero : n)
		{
			numeroCorrente += numero;
		}
		
		double media = numeroCorrente / (double) n.size();
		return media;
	}
	
	public static int max(ArrayList<Integer> n )
	{
		int numeroMax = 
				n.stream()
	            .mapToInt(Integer::intValue)
	            .max()
	            .orElseThrow();
		
		return numeroMax;
	}
	
	public static int min(ArrayList<Integer> n )
	{
		int numeroMin = 
				n.stream()
	            .mapToInt(Integer::intValue)
	            .min()
	            .orElseThrow();
		
		return numeroMin;
	}
	

}
