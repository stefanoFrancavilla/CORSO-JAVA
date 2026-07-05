package Esercizi_avanzati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio_riepilogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Domanda 1

Qual è la differenza tra:

Function<T, R>

e

Predicate<T>

Spiega:

cosa ricevono;
cosa restituiscono;
quale metodo si utilizza.
Domanda 2

Quando useresti un Consumer<T> invece di un Function<T, R>?

Fai un esempio pratico.

Domanda 3

Che differenza c'è tra:

class Contenitore<T>

e

public static <T> void mostra(T valore)
Domanda 4

Perché questo codice non compila?

List<Object> lista = new ArrayList<String>();

Spiegalo con parole tue.

Domanda 5

Spiega con parole tue la differenza tra:

List<? extends Number>

e

List<? super Integer>
PARTE B - Vero o Falso

Scrivi V o F e spiega il motivo.

1
Function<String, Integer> f = s -> s.length();

Restituisce un boolean.

2
Predicate<Integer> p = n -> n % 2 == 0;

Il metodo da chiamare è apply().

3
Consumer<String> c = s -> System.out.println(s);

accept() restituisce una String.

4
Supplier<Integer> s = () -> 10;

Riceve un parametro.

5

Con

List<? extends Number>

si possono aggiungere Integer.

6

Con

List<? super Integer>

get() restituisce un Object.

PARTE C - Completa il codice
Esercizio 1

Completa:

Function<String, Integer> lunghezza = ____________;
Esercizio 2

Completa:

Predicate<String> lungo =

in modo che restituisca true se la stringa ha almeno 8 caratteri.

Esercizio 3

Completa:

Consumer<String> stampa =

che stampi la stringa in minuscolo.

Esercizio 4

Completa:

Supplier<Double> pi =

che restituisca 3.14.

PARTE D - Programmazione
Esercizio 1

Scrivi una classe generica

Registro<T>

che contenga:

una variabile dato
costruttore
getter
setter

Nel main crea:

Registro<String>

contenente

Java

e stampa il valore.

Esercizio 2

Scrivi un metodo generico

public static <T> void stampa(T valore)

e chiamalo con:

100

"Generics"

true

9.8
Esercizio 3

Scrivi un metodo

public static void stampaLista(List<?> lista)

che stampi tutti gli elementi.

Testalo con:

["A","B","C"]

[10,20,30]
Esercizio 4

Scrivi un metodo

public static int somma(List<? extends Number> lista)

che restituisca la somma degli elementi.

Provalo con:

[5,10,15]
Esercizio 5

Scrivi un metodo

public static void aggiungi(List<? super Integer> lista)

che aggiunga:

1
2
3

e testalo con

List<Number>
PARTE E - Ragionamento

Qui non devi scrivere codice.

Domanda 1

Perché questo non compila?

List<? extends Number> lista =
        new ArrayList<Integer>();

lista.add(10);
Domanda 2

Perché questo compila?

List<? super Integer> lista =
        new ArrayList<Number>();

lista.add(10);
Domanda 3

Perché questo compila?

Object o = lista.get(0);
Domanda 4

Perché questo non compila?

Integer n = lista.get(0);

dove

List<? super Integer> lista
Domanda 5 (la più importante)

Spiega con parole tue la regola PECS.
 */
		
		
		//Domanda 1
		
		/*
		 * con Function<T, R> accetta un parametro di tipo T e restituisce un parametro di tipo R
		 * il metodo utilizzato è apply()
		 * 
		 * con Predicate<T> invece accetta un parametro di tipo T e restituisce un true o false
 		 * il suo metodo è test()
		 */
		
		//Domanda 2
		/*
		 * Consumer <T> accetta un parametro di tipo T ma non restituisce nulla
		 * 
		 * mentre con Function<T,R> accetta un parametro di tipo T e restituisce uno di tipo R
		 * 
		 * quindi se ho bisogno per esempio quanto è lunga una stringa, userò: Function<String, Integer>
		 * che accetta una String e restituisce un'Integer.
		 * 
		 * mentre con consumer per esempio prende una String e posso fargli eseguire un'azione. 
		 */
		
		//Domanda 3
		
		/*
		 * con class contenitore <T> stiamo creando una classe che può avere varie forme.
		 * è una classe riutilizzabile con più tipi.
		 * 
		 * mentre con public static <T> void mostra(T valore)
		 * stiamo creando un metodo che accetta un tipo di valore non definito e lo stampa, 
		 * anche questo è riutilizzabile con più tipi
		 */
		
		//Domanda 4
		/*
		 * con Object stiamo gestendo qualsiasi tipo di oggetto, poichè Object è al di sopra di tutto.
		 * in questo caso non ha senso mettere Object, perchè stiamo mettendo in un'ArrayList di String un qualsiasi tipo di oggetto.
		 * non può compilare poichè potremmo inserire in un'ArrayList di String anche un'Integer ,  e questo non avrebbe senso.  
		 */
		
		//Domanda 5
		/*
		 * con List<? extends Number> possiamo leggere gli elementi di una lista che può essere di tipo Integer, Double o Float
		 * 
		 * con List<? super Integer> possiamo aggiungere elementi alla lista
		 */
		
		//PARTE B
		//1
		/*
		 * Function<String, Integer> f = s -> s.length();
		 * falso
		 * perchè con questo codice accetta una String e restituisce un'Integer
		 */
		
		//2
		/*
		 * Predicate<Integer> p = n -> n % 2 == 0;
		 * falso
		 * il metodo da chiamare è test()
		 */
		
		//3
		/*
		 * Consumer<String> c = s -> System.out.println(s);
		 * vero 
		 * partiamo dal presupposto che Consumer accetta un parametro ma non restituisce nulla
		 * con accept() mandiamo a stampa la nostra stinga
		 */
		
		//4
		/*Supplier<Integer> s = () -> 10;
		 * falso
		 * Supplier non riceve nessun parametro ma ritorna un valore
		 * infatti le  parentesi () stanno a rappresentare che non accetta alcun valore
		 */
		
		//5
		/*
		 * falso
		 * con List<? extends Number> non possiamo aggiungere Integer ma solo leggere
		 */
		
		//6
		/*
		 * con List<? super Integer>
		 * vero
		 * get() restituisce un'object
		 */
		
		//PARTE C
		//Esercizio 1
		/*
		 * Function<String, Integer> lunghezza = s -> s.length();
		 */
		
		//Esercizio 2
		/*
		 * Predicate<String> lungo = s -> s.length >= 8;
		 */
		
		//Esercizio 3
		/*
		 * Consumer<String> stampa = s -> System.out.println(s.toLowerCase());
		 */
		
		//Esercizio 4
		/*
		 * Supplier<Double> pi = () -> 3.14;
		 */
		
		//PARTE D
		//Esercizio 1
		
		Registro<String> registro = new Registro<>("Java");
		
		System.out.println(registro.get());
		
		//Esercizio 2
		
		stampa(100);
		stampa("Generics");
		stampa(true);
		stampa(9.8);
		System.out.println("----------------------------------------");
		//Esercizio 3
		
		List<String> lettere = Arrays.asList("A", "B", "C");
		List<Integer> numeri = Arrays.asList(10, 20, 30);
		stampaLista(lettere);
		System.out.println("----------------------------------------");
		stampaLista(numeri);
		System.out.println("----------------------------------------");
		
		//Esercizio 4
		
		List<Integer> lista = Arrays.asList(5, 10, 15);
		System.out.println(somma(lista));
		
		System.out.println("----------------------------------------");
		
		//Esercizio 5
		
		List<Number> numeri1 = new ArrayList<Number>();
		aggiungi(numeri1);
		System.out.println(numeri1);
		
		System.out.println("----------------------------------------");
		//PARTE E
		//Domanda 1
		/*
		 * non può compilare poichè Number è un livello superiore a Integer ,
		 * volendo possiamo aggiungere anche un Double e questo non avrebbe senso, visto che vogliamo un ArrayList di Integer
		 */
		
		//Domanda 2
		
		/*
		 * certo questo compila
		 * con super inoltre abbiamo la possibilità di aggiungere un'elemento 
		 */
		
		//Domanda 3
		
		/*
		 * questo compila poichè lista.get(0), è sicuramente un parametro di tipo Object , visto che con Object gestiamo tutti gli oggetti
		 */
		
		//Domanda 4
		/*
		 * questo non può compilare poichè non è specificato cosa contiene lista, non per forza deve contenere un'Integer
		 * diverso è se conosciamo il contenuto , quindi possiamo gestirla con un cast
		 */
		
		//Domanda 5
		/*
		 * la regola PECS non è altro una abbreviazione di PE e CS 
		 * con PE intendiamo la lettura (extends)
		 * con CS intendiamo la scrittura(super)
		 */
		
	}
	
	public static <T> void stampa(T valore)
	{
		System.out.println(valore);
	}
	
	public static void stampaLista(List<?> lista)
	{
		for (Object elemento : lista)
		{
			System.out.println(elemento);
		}
	}
	
	public static int somma(List<? extends Number> lista)
	{
		int somma = 0;
		for (int i = 0; i < lista.size();i++)
		{
			somma += (int) lista.get(i);
		}
		return somma;
	}
	
	public static void aggiungi(List<? super Integer> lista)
	{
		lista.add(1);
		lista.add(2);
		lista.add(3);
	}

}
