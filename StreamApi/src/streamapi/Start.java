package streamapi;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Stream;

public class Start {

	public static void main(String[] args) {
		

		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();

		//Stream<String> fiumi = Stream.of(new String [] {"Po", "Adige", "Tevere", "Arno"});
		Stream<String> fiumi = Stream.of("Po", "Adige", "Tevere", "Arno");// metodo abbreviato per creare uno stream di String
		
		/*
		 * con questa riga di codice stiamo creando uno stream di stringhe che contiene i nomi dei fiumi italiani.

		 * con la parte new String [] {"Po", "Adige", "Tevere", "Arno"} stiamo creando un array di stringhe 
		 * che contiene i nomi dei fiumi.
		 * 
		 * dall'Array di Stringhe estraggo lo stream con il metodo Stream.of() 
		 * che prende come parametro l'array di stringhe.
		 * 
		 * Stream<String> fiumi stiamo creando uno Stream di stringhe con il nome fiumi.
		 * 
		 * ho la possibilità di gestire l'inizio di una pipeline , 
		 * cioè l'inizio di una serie di operazioni concatenate che verranno eseguite sugli elementi dello stream.
		 * che partono come base di informazioni da un array di stringhe.
		 */
		
		fiumi
		.filter(fiume -> fiume.contains("o")) // usa una predicate per filtrare i fiumi che contengono la lettera "o"
		.forEach(fiume -> System.out.println("fiume: " + fiume)); // usa una consumer per stampare i fiumi filtrati
		
		/*
		 * nel primo passaggio con il metodo filter() stiamo filtrando gli elementi dello stream in base a una condizione.
		 * in questo caso stiamo filtrando i fiumi che contengono la lettera "o" nel loro nome.
		 * il meto filter usa come interfaccia funzionale Predicate<T> che rappresenta una funzione che prende un argomento
		 *  di tipo T e restituisce un valore booleano.
		 *  
		 *  mentre la seconda parte con il metodo forEach() stiamo iterando sugli elementi dello stream filtrati 
		 *  e stampando il nome di ciascun fiume.
		 *  il metodo forEach() usa come interfaccia funzionale Consumer<T>
		 *   che rappresenta una funzione che prende un argomento e non restituisce alcun valore.
		 */
	
	
		System.out.println();
		System.out.println("1.1--------------------------");
		System.out.println();
	
	
		//Stream<Integer> ns = Stream.of(new Integer [] {5, 10, 13, 21, 4});
		Stream<Integer> ns = Stream.of(5, 10, 13, 21, 4); // metodo abbreviato per creare uno stream di Integer
	
		ns.filter(n -> n > 7) // usa una predicate per filtrare i numeri maggiori di 7
		.forEach(n -> System.out.println("n: " + n)); // usa una consumer per stampare i numeri filtrati
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		Stream<Integer> tabellinaDelTre = Stream.iterate(0, n -> n < 31, n -> n + 3); 
		 /*
		  * con la riga di codice sopra stiamo creando uno stream di numeri interi che rappresentano la tabellina del 3.
		  * nella parte di codice Stream.iterate(0, n -> n < 31, n -> n + 3) 
		  * stiamo usando il metodo iterate() della classe Stream per creare uno stream di numeri interi.
		  * con lo 0, stiamo specificando il valore iniziale dello stream,
		  * con n -> n < 31, stiamo specificando la condizione di terminazione dello stream,
		  * con n -> n + 3, stiamo specificando la funzione di incremento dello stream.
		  * 
		  * la sintassi è: parte da 0, finché n è minore di 31, incrementa n di 3.
		  * 
		  */

		tabellinaDelTre
		.filter(n -> n % 2 == 0) // usa una predicate per filtrare i numeri pari della tabellina del 3
		.forEach(n -> System.out.println("n: " + n)); // usa una consumer per stampare i numeri della tabellina del 3
		
		System.out.println();
		System.out.println("2.1--------------------------");
		System.out.println();
		
		Stream<Integer> multipliDiTre = Stream.iterate(0, n ->  n + 3); 
		// crea uno stream infinito di numeri interi che rappresentano i multipli di 3 se non viene specificato il limit
		
		multipliDiTre
		.skip(1) // salta il primo elemento dello stream (0)
		.limit(21) // limita lo stream ai primi 21 elementi
		.forEach(n -> System.out.println("n: " + n)); // usa una consumer per stampare i primi 21 multipli di 3
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		Stream<AstronaveNemica> astronaveNemiche = Stream.generate(Start::getAstronaveNemica);
		
		//generate accetta un Supplier<T> che rappresenta una funzione che non prende argomenti e restituisce un valore di tipo T.
		/*
		 * con la riga di codice Start::getAstronaveNemica stiamo passando un riferimento al metodo getAstronaveNemica() della classe Start.
		 * con Stream.generate() stiamo creando uno stream infinito di oggetti AstronaveNemica.
		 */
		
		astronaveNemiche
		.limit(10) // limita lo stream ai primi 10 elementi
		.forEach(astronaveNemica -> System.out.println("numero di proiettili dell'astronaveNemica: " + astronaveNemica.getNumeroDiProiettili()));
		
		System.out.println();
		System.out.println("4--------------------------");
		System.out.println();
		
		
		Collection<Auto> automobili = new HashSet<Auto>();
		automobili.add(new Auto("Volvo", "AAA", "Rosso", 20000D, 200D));
		automobili.add(new Auto("Mercedes", "BBB", "Grigio", 30000D, 210D));
		automobili.add(new Auto("BMV", "CCC", "Grigio", 40000D, 220D));
		automobili.add(new Auto("Alfa Romeo", "DDD", "Rosso", 50000D, 230D));
		automobili.add(new Auto("Alfa Romeo", "III", "Rosso", 50000D, 235D));
		automobili.add(new Auto("Ferrari", "EEE", "Giallo", 60000D, 240D));
		automobili.add(new Auto("Ferrari", "EEE", "Verde", 55000D, 180D));
		automobili.add(new Auto("Ferrari", "FFF", "Blu", 70000D, 250D));
		automobili.add(new Auto("Ferrari", "GGG", "Rosso", 80000D, 270D));
		automobili.add(new Auto("Ferrari", "HHH", "Rosso", 90000D, 270D));
		automobili.add(new Auto("Citroen", "III", "Giallo", 55000D, 270D));
		
	    //System.out.println(automobili);
		automobili.forEach(auto -> System.out.println(auto));
		
		System.out.println();
		System.out.println("4.1--------------------------");
		System.out.println();
		
		
		automobili.stream() // crea uno stream di oggetti Auto a partire dalla collezione automobili
		.filter(auto -> "aaa".equalsIgnoreCase(auto.getModello())) // filtra le auto che hanno il modello "aaa" (ignorando maiuscole e minuscole)
		.forEach(auto -> System.out.println(auto)); // stampa le auto filtrate
		
		System.out.println();
		System.out.println("5--------------------------");
		System.out.println();
		
		double velocitaMassimaMediaFerrari = automobili.stream() 
	    .filter(auto -> "Ferrari".equalsIgnoreCase(auto.getCasaProduttrice())) // come primo caso stiamo prendendo in considerazione solo le ferrari
	    .mapToDouble(auto -> auto.getVelocitaMassima()) // Per ogni auto filtrata prendo la velocità massima
	    .average() // prendiamo tutte le velocità massime delle ferrari e ne calcola la media
	    .getAsDouble(); // serve per inserire i valori ottenuti nella variabile velocitaMassimaMediaFerrari
		
		System.out.println(" velocitaMassimaMediaFerrari: " + velocitaMassimaMediaFerrari);
		
		System.out.println();
		System.out.println("5.1--------------------------");
		System.out.println();
		
		double velocitaMassimaMinimaFerrari = automobili.stream() 
	    .filter(auto -> "Ferrari".equalsIgnoreCase(auto.getCasaProduttrice())) // come primo caso stiamo prendendo in considerazione solo le ferrari
	    .mapToDouble(auto -> auto.getVelocitaMassima()) // Per ogni auto filtrata prendo la velocità massima
	    .min() // prendiamo solo la velocità minima
	    .getAsDouble(); // serve per inserire i valori ottenuti nella variabile velocitaMassimaMediaFerrari
		
		System.out.println(" velocitaMassimaMinimaFerrari: " + velocitaMassimaMinimaFerrari);
		
		System.out.println();
		System.out.println("6--------------------------");
		System.out.println();
		
		Double velocitaMassima = 200D;
		
		Optional<Double> optional = Optional.ofNullable(velocitaMassima);
		double velocitaMassimaBase = optional.orElse(150D);
		
		System.out.println("velocitaMassimaBase: " + velocitaMassimaBase);
		
		/*
		 * in questo codice stiamo usando la classe Optional per gestire il caso in cui la variabile velocitaMassima sia null.
		 * la sintassi del codice è la seguente:
		 * Optional<Double> optional = Optional.ofNullable(velocitaMassima); // crea un oggetto Optional a partire dalla variabile velocitaMassima
		 * double velocitaMassimaBase = optional.orElse(150D); // se la variabile velocitaMassima è null, allora assegna il valore 150D alla variabile velocitaMassimaBase
		 * 
		 * possiamo dire che il codice optional.orElse(150D) restituisce il valore della variabile velocitaMassima se non è null, altrimenti restituisce il valore 150D.
		 * lo possiamo trattare come un if else in una sola riga di codice.
		 * 
		 * quindi con Optional stiamo gestendo il caso in cui la variabile velocitaMassima sia null, evitando così un eventuale NullPointerException.
		 */
		
		
		
		
	}
	
	public static AstronaveNemica getAstronaveNemica() {
		
		AstronaveNemica astronaveNemica = new AstronaveNemica();
		return astronaveNemica;
	}
	/*
	 * questo metodo statico getAstronaveNemica() crea un nuovo oggetto AstronaveNemica e lo restituisce.
	 */

}
