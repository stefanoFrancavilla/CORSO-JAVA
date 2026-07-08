package esame1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esame Finale Java – Livello 1 (Base/Intermedio)
Istruzioni generali
Puoi rispondere in italiano.

Per gli esercizi di codice, scrivi il codice Java completo (classi, metodi, ecc.) come se dovessi consegnarlo in un vero esame.

Non è necessario usare framework (Spring, etc.), solo Java standard.

Tempo ideale: 60–90 minuti.

Parte A – Domande Teoriche (a risposta multipla o breve)
Domanda 1 – Tipi di dato e variabili
Quale delle seguenti affermazioni è vera riguardo ai tipi di dato in Java?

A) int e Integer sono esattamente lo stesso tipo.
B) int è un tipo primitivo, mentre Integer è una classe wrapper.
C) double può rappresentare esattamente tutti i numeri decimali.
D) In Java, le variabili di tipo primitivo sono sempre riferimenti a oggetti.

Scegli l’opzione corretta e, se vuoi, spiega brevemente perché le altre sono false.

Domanda 2 –老祖eli e costruttori
Considera questo codice:


java
public class Persona {
    private String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    public void saluta() {
        System.out.println("Ciao, " + nome);
    }
}
Quale delle seguenti affermazioni è vera?

A) La classe Persona non ha un costruttore di default senza parametri.
B) È possibile creare un oggetto Persona senza passare alcun argomento al costruttore.
C) Il campo nome è pubblico.
D) Il metodo saluta() può essere chiamato solo da altre classi.

Scegli l’opzione corretta e spiega brevemente.

Domanda 3 – Collection (ArrayList vs LinkedList)
Quale delle seguenti affermazioni è corretta?

A) ArrayList è generalmente più veloce per accessi in posizione (get(i)).
B) LinkedList è generalmente più veloce per accessi in posizione (get(i)).
C) ArrayList non può contenere elementi di tipo null.
D) LinkedList non implementa l’interfaccia List.

Scegli l’opzione corretta e, se vuoi, aggiungi una breve spiegazione.

Domanda 4 – Eccezioni
Qual è la differenza principale tra Exception e Error in Java?

Rispondi in 2–3 linee, spiegando il ruolo di ciascuno e quando vengono tipicamente usati.

Domanda 5 – Interface vs Classe astratta
Dimostra la differenza tra interface e classe astratta in Java:

Scrivi:

un esempio minimo di interface con un metodo,

un esempio minimo di abstract class con un metodo astratto e un metodo concreto.

Spiega brevemente (2–3 linee) quando è più opportuno usare un’interface e quando una classe astratta.

Parte B – Esercizi Pratici di Codice
Esercizio 1 – Classe ContoBancario
Crea una classe ContoBancario con:

Campi:

private String titolare;

private double saldo;

Costruttore:

public ContoBancario(String titolare, double saldo iniziale)

Metodi:

public void deposita(double amount) – aumenta il saldo se amount > 0.

public void benda(double amount) – diminuisce il saldo se amount > 0 e amount <= saldo; altrimenti non fa nulla.

public double getSaldo() –返回 saldo.

public String getTitolare() –返回 titolare.

Scrivi la classe completa, inclusi commenti brevi se utili.

Esercizio 2 – Uso di ArrayList e ciclo
Scrivi un programma (classe Main con metodo public static void main(String[] args)) che:

Crea un ArrayList<String> e aggiunge 3 nomi di persona.

Usa un ciclo for (o for-each) per stampare ogni nome sulla console, preceduto da “Nome: ”.

Alla fine, stampa la dimensione della lista con: “Numero di persone: X”.

Esercizio 3 – Metodo con eccezione
Crea un metodo:


java
public static int divide(int a, int b)
che:

Se b == 0, solleva una ArithmeticException con un messaggio chiaro.

Se b != 0,返回 a / b.

Scrivi poi un main che:

Chiami divide(10, 2) e stampi il risultato.

Chiami divide(10, 0) dentro un blocco try-catch e, in caso di eccezione, stampi un messaggio di errore.

Esercizio 4 – Enum e semplice logica
Definisci un enum StatoOrdine con i valori:

IN_ATTESA

SPedito

DELIVERED

Crea una classe Ordine con:

Campo: private StatoOrdine stato;

Costruttore: public Ordine(StatoOrdine stato)

Metodo: public void avanzaStato() che:

Se lo stato è IN_ATTESA, lo passa a SPedito.

Se lo stato è SPedito, lo passa a DELIVERED.

Se lo stato è già DELIVERED, non cambia nulla.

Scrivi poi un main che:

Crei un Ordine con stato IN_ATTESA.

Chiamî avanzaStato() due volte.

Stampi lo stato finale usando ordine.getStato().toString().

(Aggiungi anche il metodo public StatoOrdine getStato() necessario.)

Esercizio 5 – Comparable e ordinamento
Crea una classe Prodott con:

Campi:

private String nome;

private double prezzo;

Costruttore: public Prodotto(String nome, double prezzo)

Implementa Comparable<Prodotto> ordinando i prodotti in ordine crescente di prezzo.

Scrivi il metodo compareTo in modo che:

se prezzo < altro.prezzo →返回 negativo,

se prezzo == altro.prezzo →返回 0,

se prezzo > altro.prezzo →返回 positivo.

Scrivi poi un main che:

Crei un ArrayList<Prodotto> con almeno 3 prodotti diversi.

Usi Collections.sort(lista) per ordinare la lista.

Stampí ogni prodotto (nome e prezzo) nell’ordine ordinato.
		 */
		
		
		//PARTE A
		//Domanda 1
		// risposta B) corretta
		/*
		 * A)int e integer non sono lo stesso tipo, infatti int è un primitivo e integer è una wrapper
		 * C) è vero che con double rappresentiamo i numeri non interi , ma non tutti, poichè limitato (anche se ampio) da un range
		 * D)non è vero che in java le variabili di tipo primitivo sono riferimenti ad oggetti
		 */
		
		//Domanda 2
		//risposta A) corretta. il costruttore di default viene fornito da java a patto che non esista alcun costruttore nella classe
		/*
		 * B) falso, perche' per creare nel main un'oggetto persona con la classe impostata in questo modo dobbiamo assolutamente inserire il nome
		 * C)faslo, la variabile di istanza String nome è stata impostata con private , quindi non pubblico
		 * D)falso, il metodo saluta può essere chioamato dalla classe persona 
		 */
		
		//Domanda 3
		//risposta A) corretta poichè le Arraylist sono veloci in ricerca per indice
		/*
		 * B)falso, poichè lavora per nodi e quindi è più lento nella ricerca 
		 * C)falso, ArrayList può contenere elementi di tipo null
		 * D)falso, LinkedList può implementare l'interfaccia List
		 */
		
		//Domanda 4
		/*Con exception stiamo parlando di eccezioni che si dividono in uncheked e cheked,
		 *  posso essere gestite ad esempio con il blocco try catch.
		 *  
		 *  mentre con gli error parliamo di errori gravi che non posso essere gestiti dall'operatore
		 * 
		*/
		
		//Domanda 5
		/*
		 * l'interfaccia è come un contratto che possiamo implementare in una classe ,
		 * serve a dare al''oggetto in questione uno specifico comportamento.
		 * una classe può implementare molteplici interfacce.
		 * 
		 * la classe astratta generalmente cviene usata per non ripetere il codice in scrittura, 
		 * ed avere una leggibilità maggiore del codice, generalmente funge da superclasse (se impostata in un certo modo)
		 * una classe può estendere una sola classe astratta.
		 *
		 */
		
		//PARTE B
		
		//Esercizio 2
		
		ArrayList<String> nomi = new ArrayList<>();
		nomi.add("Anna");
		nomi.add("Marco");
		nomi.add("Luca");
		
		for(int i = 0;i < nomi.size();i++)
		{
			System.out.println("Nome: " + nomi.get(i));
		}
		
		System.out.println("Numero di persone: " + nomi.size());
		
		//Esercizio 3
		
		divide(10, 2);
		System.out.println(divide(10, 2));
		
		try
		{
			divide(10, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("E' stato intercettato l'errore , non si può dividere per 0");
		}
		finally
		{
			System.out.println("Fine controllo");
		}
		
		//Esercizio 4
		
		Ordine ordine = new Ordine(StatoOrdine.IN_ATTESA);
		
		ordine.avanzaStato();
		ordine.avanzaStato();
		System.out.println(ordine.getStato());
		
		//Esercizio 5
		
		ArrayList<Prodotti> lista = new ArrayList<>();

        lista.add(new Prodotti("Pane", 2.50));
        lista.add(new Prodotti("Latte", 1.80));
        lista.add(new Prodotti("Pasta", 1.20));

        Collections.sort(lista);

        System.out.println("Prodotti ordinati per prezzo:");

        for (Prodotti p : lista) {
            System.out.println(p);
        }
	}

	public static int divide(int a , int b)
	{
		int risultato = 0;
		if (b == 0)
		{
			System.out.println("Errore , non puoi dividere per 0");
		}
		else
		{
			risultato = a / b;
		}
			return risultato;
	}
}
