package introduzione;

public class test_riepilogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
 * Regole del test

Non sarà un test di memoria.

Non ti chiederò:

"Che cosa fa higherKey()?"

Ti proporrò problemi da analizzare.

Il test coprirà tutto ciò che abbiamo studiato:

Functional Interfaces
Lambda
Generics
PECS
ArrayList
LinkedList
HashSet
LinkedHashSet
TreeSet
HashMap
LinkedHashMap
TreeMap

Ci saranno sia domande a risposta multipla sia domande aperte.

Non guardare le soluzioni mentre rispondi. Correggeremo insieme ogni risposta analizzando il ragionamento.

TEST
Parte A — Scelta della struttura (Risposta multipla)
Domanda 1

Stai sviluppando una rubrica.

Il programma riceve quasi sempre l'email di un utente e deve recuperare rapidamente il relativo profilo.

Quale struttura sceglieresti?

A)

ArrayList<Utente>

B)

HashSet<Utente>

C)

HashMap<String, Utente>

D)

TreeSet<Utente>

Motiva la risposta.

Domanda 2

Un programma deve mantenere una lista di codici cliente sempre ordinata e senza duplicati.

Quale struttura è la più adatta?

A)

HashSet

B)

LinkedHashSet

C)

TreeSet

D)

ArrayList

Motiva.

Domanda 3

Hai già una HashMap.

Ora il requisito cambia.

Quando percorri gli elementi vuoi mantenerli nell'ordine in cui sono stati inseriti.

Quale struttura scegli?

A)

TreeMap

B)

LinkedHashMap

C)

HashSet

D)

ArrayList

Domanda 4

Quale struttura permette naturalmente di rispondere alla domanda:

"Qual è la prima chiave maggiore di 150?"

A)

HashMap

B)

LinkedHashMap

C)

TreeMap

D)

HashSet

Parte B — Vero/Falso motivato
Domanda 5

Una HashMap utilizza hashCode() sia delle chiavi sia dei valori.

Vero o falso?

Spiega.

Domanda 6

Due oggetti con lo stesso hashCode() sono sicuramente uguali.

Vero o falso?

Domanda 7

In una TreeMap, se compareTo() restituisce 0, le due chiavi vengono considerate uguali.

Vero o falso?

Domanda 8

LinkedHashMap ordina gli elementi alfabeticamente.

Vero o falso?

Parte C — Domande aperte
Domanda 9

Spiega, senza usare definizioni da manuale, perché è nata una HashMap.

Quale problema risolve?

Domanda 10

Qual è la differenza concettuale tra:

HashMap

e

TreeMap

Non parlare dei metodi.

Parla del modo in cui ragionano internamente.

Domanda 11

Perché una TreeMap può avere metodi come:

higherKey()
lowerKey()

mentre una HashMap no?

Domanda 12

Spiega con parole tue il principio PECS.

Non limitarti a dire:

Producer Extends Consumer Super.

Spiega perché.

Parte D — Piccoli scenari
Domanda 13

Hai:

HashMap<String, Integer>

Che cosa succede?

map.put("Anna", 20);
map.put("Anna", 30);
Domanda 14

Hai:

TreeMap<Integer, String>

Contiene:

100
200
300
400
500

Scrivi il risultato di:

higherKey(300)
lowerKey(300)
ceilingKey(300)
floorKey(300)
Domanda 15 (la più importante)

Immagina di dover spiegare a un collega come scegliere tra:

HashMap
LinkedHashMap
TreeMap

Non descrivere le classi.

Spiega quali domande dovrebbe porsi prima di scegliere.
 */
		
		
		//PARTE A
		
		/*
		 * Domanda 1
		 * 
		 * la risposta è la C) 
		 * sceglierei un'hashmap per via della sua potenza in ricerca utilizzando chiave /valore
		 */
		
		/*
		 * Domanda 2 
		 * 
		 * la risposta è la C)
		 * sceglierei un treeSet poichè non è specificato quale ordine si vuole usare, si parla di qualsiasi ordine che postremmo scegliere,
		 * e di non avere duplicati.
		 * se invece fosse specificato l'ordine richiesto, magari di inserimento avrei optato per una linkedHashSet
		 */
		
		/*
		 * Domanda 3
		 * 
		 * la risposta è la B)
		 * sceglierei una linkedHashMap poichè se ho già un'hashMap , quindi una strrttura che lavora con chiave/Valore.
		 * quindi senza stravolgere nulla , il mio obbiettivo è avere un'ordine di inserimento e mantenere la struttura.
		 */
		
		/*
		 * Domanda 4
		 * 
		 * la risposta è la C)
		 * stiamo parlando di una higherKey e lo troviamo in una treeMap 
		 */
		
		//Parte B
		/*
		 * Domanda 5
		 * la risposta è falso
		 * poichè si utilizza il codice hash , ma solo sulle chiavi e non sui valori
		 */
		
		/*
		 * Domanda 6
		 * 
		 * la risposta è falso.
		 * se due oggetti hanno lo stesso hashcode non è detto che sono sicuramente uguali
		 */
		
		/*
		 * Domanda 7
		 * 
		 * risposta è Vero
		 * dipende da come lo abbiamo impostato, comunque se la sua risposta è 0 è da considerare uguale.
		 */
		
		/*
		 * Domanda 8
		 * 
		 * la risposta è falso
		 * La linkedHashMap non ordina alfabeticamente, pa per ordine di inserimento
		 */
		
		//PARTE C
		/*
		 * Domanda 9
		 * 
		 * L'esigenza è avere una struttura che sia potente in una ricerca di dati sfruttando una chiave e ottenedo un  valore.
		 */
		
		/*
		 * Domanda 10
		 * 
		 * l'hashMap non si occupa di ordinare gli oggetti , ma il suo punto di forza è ordinare gli oggetti in modo da effettuare una ricerca rapida
		 * non tenedo comto di un'ordine preciso.
		 * 
		 * mentre una treemap ha il vantaggio di avere gli oggetti sistemati secondo un certo criterio.
		 */
		
		/*
		 * Domanda 11
		 * 
		 * l'hashmap non si interessa di un ordine preciso , quindi sostanzialmente non ha un prima di , o un dopo di.
		 * una treemap invece avendo gli oggetti ordinati ha la possibillità di avere un prima di e un dopo di.
		 */
		
		/*
		 * Domanda 12
		 * 
		 * PECS è una regola fondamentale che abbiamo visto nei generics
		 * supponiamo di avere in a List<? extend T> , significa che accetta T e tutti i suoi sottotipi (cioè tipi uguali o inferiori)
		 * mentre se abbiamo List<? super T> , significa che accetta T e tutti i sottotipi del supertipo (cioè tipi uguali o superiori)
		 */
		
		//PARTE D
		/*
		 * Domanda 13
		 * 
		 * in questo caso succede una modifica di dati , poichè questa operazione di inserire anna con un valore diverso genera una modifica dei dati.
		 * non ci saranno 2 anna , ma l'output sarà anna 30 
		 */
		
		/*
		 * Domanda 14
		 * 
		 * risultato higherKey(300) è 400
		 * risultato di lowerKey(300) è 200
		 * risultato di ceilingKey(300) 300
		 * risultato di floorKey(300) 300
		 */
		
		/*
		 * Domanda 15
		 * 
		 * se hai bisogno di una struttura che sia potente in una ricerca , e non hai bisogno di un'ordine degli oggetti allora scegli hashMap
		 * se hai bisogno di una struttura che ti ordini gli oggetti per ordine di inserimento allora scegli linkedHashMap
		 * se hai bisogno che i tuoi oggetti siano ordinati secondo un certo criterio allora scegli una treemap
		 */
	}

}
