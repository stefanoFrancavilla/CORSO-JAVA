package pre_Esame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Esame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Volentieri. Questa volta però alzo leggermente il livello, perché 89/100 significa che gli argomenti base li padroneggi. Se il primo pre-esame era un 7/10 di difficoltà, questo sarà un 9/10, molto vicino a quello che potrebbe proporti un docente che vuole verificare se hai davvero capito Java e non solo memorizzato gli esercizi.

Regole

Tempo: 2 ore
Punteggio: 100 punti
Superamento: 60/100
Io correggerò in maniera severa, come un docente.
PRE-ESAME JAVA n°2
PARTE 1 - TEORIA (20 punti)
Domanda 1 (4 punti)

Spiega:

Incapsulamento
Ereditarietà
Polimorfismo

Per ciascuno scrivi anche un piccolo esempio.

Domanda 2 (4 punti)

Spiega la differenza tra:

this
super

Quando si utilizzano?

Domanda 3 (4 punti)

Qual è la differenza tra:

Overloading
Overriding

Scrivi un esempio di entrambi.

Domanda 4 (4 punti)

Che differenza c'è tra:

List
ArrayList

Perché spesso si scrive:

List<String> nomi = new ArrayList<>();

anziché

ArrayList<String> nomi = new ArrayList<>();
Domanda 5 (4 punti)

A cosa servono:

throw
throws

Qual è la differenza?

PARTE 2 - LETTURA DEL CODICE (20 punti)
Esercizio 1 (10 punti)

Cosa stampa?

class Animale {

    public void verso() {
        System.out.println("...");
    }

}

class Cane extends Animale {

    @Override
    public void verso() {
        System.out.println("bau");
    }

}

public class Main {

    public static void main(String[] args) {

        Animale a = new Cane();

        a.verso();

    }

}

Spiega il motivo.

Esercizio 2 (10 punti)

Trova almeno 5 errori o cattive pratiche.

public class Automobile {

    public String marca;

    public Automobile(String marca) {

        marca = marca;

    }

    public void stampa() {

        System.out.println(marca.toUpperCase());

    }

}
PARTE 3 - PROGRAMMAZIONE (60 punti)
ESERCIZIO 1 (20 punti)

Realizza una gerarchia di classi.

Classe padre:

Dipendente

Campi:

nome
stipendio

Metodo:

calcolaBonus()

che restituisce il 10% dello stipendio.

Classe figlia:

Manager

Aggiungi:

teamSize

Override del metodo

calcolaBonus()

che restituisce il 20% dello stipendio.

Nel main:

crea un Dipendente
crea un Manager
inseriscili in un ArrayList<Dipendente>
stampa bonus e dati di entrambi.
ESERCIZIO 2 (20 punti)

Crea una classe

Prodotto

con:

nome
prezzo

Nel main:

crea almeno 6 prodotti
inseriscili in un ArrayList
stampa solo quelli con prezzo superiore a 50€

Successivamente calcola:

prodotto più costoso
prezzo medio
ESERCIZIO 3 (20 punti)

Realizza una rubrica telefonica.

Classe:

Contatto

Campi:

nome
telefono

Nel main

crea un ArrayList<Contatto> con almeno 5 contatti.

Successivamente chiedi all'utente un nome.

Se il contatto esiste stampa:

Contatto trovato
Mario - 3331234567

altrimenti

Contatto non presente

Utilizza un ciclo e confronta le stringhe nel modo corretto.

BONUS (10 punti)

Realizza una tua eccezione:

PrezzoNonValidoException

Nel costruttore di Prodotto, se il prezzo è minore di zero:

throw new PrezzoNonValidoException("Prezzo non valido");

Gestisci l'eccezione nel main.
 */
		
		
		//PARTE 1
		
		/*
		 * Domanda 1
		 * 
		 * con incapsulamento intendiamo una barriera protettiva per i nostri dati
		 * nelle nostre classi di oggetti impostando le variabili di istanza con private e 
		 * inserendo dei metodi di lettura e scrittura (getter/setter) pubblici e controllati, 
		 * possiamo proteggere i nostri dati interni delle classi evitando manomissioni
		 * 
		 * con l'ereditarietà invece abbiamo la possibilità di risparmiare di scrivere il codice 
		 * più volte e ripetutamente , avendo un netto miglioramento anche nella lettura.
		 * una classe figlia eredita dalla classe padre parte di codice.
		 * 
		 * con il poliformismo(più forme) possiamo chiamare la superclasse come tipo e poi chiamare l'oggetto della sua sottotipo.
		 * esempio se ho una superclasse Animale posso creare partendo dalla superclasse Animale un suo oggetto specifico.
		 * Animale animale = new Cane();
		 */
		
		
		/*
		 * Domanda 2
		 * 
		 * il this in java sta a rappresentare l'oggetto corrente della classe stessa.
		 * se avessimo un metodo abbaia sia per Cane che per Gatto
		 * e nel main scrivessimo
		 * Animale animale = new Cane();
		 * Animale animale2 = new Gatto();
		 * il this ci consente di chiamare il metodo esatto dell'animale cane o gatto.
		 * si può semplificare leggendolo (questo oggetto).
		 * 
		 * con il super invece si usa per ereditare
		 * per esempio in una sottoclasse nel suo costruttore può comparire il supe , che sta a significare , 
		 * che la sottoclasse eredita dalla superclasse i suoi parametri.
		 */
		
		
		/*
		 * Domanda 3
		 * 
		 * con l'Overloading abbiamo la possibilità di avere più metodi con lo stesso nome ,
         * a patto che i parametri abbiamo un numero diverso, tipo diverso.
         * 
         * con Overriding stiamo sovrascrivendo un metodo a patto che abbia la stessa firma 
         * grazie all'Override possiamo evitare errorri che potrebbero accadere.
		 */
		
		/*
		 * Domanda 4
		 *  
		 * List è il supertipo di ArrayList, e comprende ArrayList e LinkedList
		 * 
		 *  l'ArrayList è un sistema che offre java per organizzare in una lista ordinata i nostri oggetti.
		 *  
		 *  spesso scriviamo 
		 *  List<String> nomi = new ArrayList<>();
		 *  impostando List come tipo di nomi abbaimo la possibilità di cambiare in futuro ArrayList con LinkedList in base alle nostre esigenze
		 *  
		 *  se abbiamo bisogno di una lista che ricerchi per indice per esempio sceglieremo ArrayList, altrimenti
		 *  se abbiamo bisogno di una lista che sia performante in inserimento per esempio allora sceglieremo una LinkedList
		 *  
		 * 
		 */
		
		/*
		 * Domanda 5
		 * 
		 * con throw siamo noi che creiamo eccezione personalizzata 
		 * con throws stiamo dichiarando un metodo che potrebbe generare un'eccezione 
		 */
		
		
		//PARTE 2
		
		/*
		 * Esercizio 1
		 * 
		 * la stampa sarà il bau.
		 * questo perchè l'oggetto creato è un tipo animale che è la superclasse di cane , 
		 * ma è un cane 
		 * quindi Animale a (ci dice che a è di tipo animale)
		 * mentre:  = new Cane(); è il nostro oggetto creato
		 * 
		 * quindi quanda andremo a dire a.verso(); verrà preso in considerazione quello di Cane 
		 */
		
		/*Esercizio 2
		 * 
		 * l'errore principale è la mancanza del this nel costruttore
		 * di conseguenza lasciarlo senza il this provocherebbe un'eccezione nel metodo stampa.
		 * poi è buona regola incapsulare i dati con private e inserire i metodi getter e setter, mentre qui la variabile è public.
		 */
		
		//Parte 3
		
		//Esercizio 1
		
		Dipendente dipendente1 = new Dipendente("Marco", 2500);
		Manager manager1 = new Manager("Luca", 3000, 5);
		
		ArrayList<Dipendente> ufficio = new ArrayList<>();
		ufficio.add(dipendente1);
		ufficio.add(manager1);
		
		for (Dipendente dipendenti : ufficio)
		{
			System.out.println(dipendenti.toString());
			System.out.println("Il bonus calcolato è: " + dipendenti.calcolaBonus(dipendenti.getStipendio()));
			System.out.println("--------------");
		}
		System.out.println("--------------------------------------------------");
		
		//Esrcizio 2
		
		Prodotto prodotto1 = new Prodotto("cuffie", 25);
		Prodotto prodotto2 = new Prodotto("custodia telefono", 15);
		Prodotto prodotto3 = new Prodotto("telefono", 150);
		Prodotto prodotto4 = new Prodotto("monitor", 125);
		Prodotto prodotto5 = new Prodotto("mouse", 28);
		Prodotto prodotto6 = new Prodotto("tastiera", 30);
		
		ArrayList<Prodotto> prodotti = new ArrayList<>();
		prodotti.add(prodotto1);
		prodotti.add(prodotto2);
		prodotti.add(prodotto3);
		prodotti.add(prodotto4);
		prodotti.add(prodotto5);
		prodotti.add(prodotto6);
		
		prodotti.stream()
		.filter(p -> p.getPrezzo() > 50)
		.forEach(p -> System.out.println(p.getNome() + " " + p.getPrezzo()));
		System.out.println("--------------");
		
		Optional prodottoPiuCostoso = 
				prodotti.stream()
				.max(Comparator.comparing(Prodotto::getPrezzo));
		System.out.println("prodotto più costoso è: " + prodottoPiuCostoso);
		System.out.println("--------------");
		
		double prezzoMedio = 
				
				prodotti.stream()
				.mapToDouble(Prodotto::getPrezzo)
				.average()
				.getAsDouble();
		System.out.println("prezzo medio è:" + prezzoMedio);
		
		
		System.out.println("--------------------------------------------------");
		//Esercizio 3
		
		Contatto contatto1 = new Contatto("Marco", 33256544);
		Contatto contatto2 = new Contatto("Sara", 33212345);
		Contatto contatto3 = new Contatto("Maria", 33232165);
		Contatto contatto4 = new Contatto("Nico", 33298765);
		Contatto contatto5 = new Contatto("Luigi", 33257845);
		
		ArrayList<Contatto> rubrica = new ArrayList<>();
		
		rubrica.add(contatto1);
		rubrica.add(contatto2);
		rubrica.add(contatto3);
		rubrica.add(contatto4);
		rubrica.add(contatto5);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un nome");
		String nome = scanner.nextLine();
		
		
		for (Contatto contatti : rubrica)
		{
			if(nome.equalsIgnoreCase(contatti.getNome()))
			{
				System.out.println("Contatto trovato");
				
				System.out.println(contatti.getNome() + " - " +contatti.getTelefono());
			}
			else
				System.out.println("Contatto non trovato");
			break;
			
		}
		
		System.out.println("--------------------------------------------------");
		
	
		
		
		
	}

}
