package classString;

import java.util.Random;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		char char1 = 'a';
		
		String string1 = new String("Stringa di esempio."); //dentro la variabile string1 , troveremo l'oggetto string che ci permetterà di usare la frase
		
		String string2 = "Stringa di esempio.";
		/*nella variabile string 2 abbiamo inserito il valore di string 1 , ma in modalità diffeerenti
		 * questo metodo sarà il più utilizzato.
		 */
		
		
		
		System.out.println(string1);
		 //grazie all'identificatore string 1 stiamo rerferenziando l'oggetto string che ,rappresenta la frase.
		
		System.out.println(string2);
		
		char currentChar = string1.charAt(0);//dammi il carattere alla posizione 0 di string1 . in questo caso sarà la S
		
		
		//charAt è un metodo della classe string che accetta in imput un valore numerico, che rappresenta un'indice.
		//cioè la posizione di un determinato carattere nella frase.
		//lo zero rappresenta il primo carattere della stringa , in questo caso la S
		
		int currentCodePoint = string1.codePointAt(0); // dammi il codice decimale (valore numerico) , che si riferisce al carattere nella posizione 0 ( in questo caso la S)
		
		int totalChars = string1.length(); // senza scrivere nel ciclo for (string1.length()), possiamo creare una variabile int che va a sostituirlo
		
		
		System.out.println(currentChar);
		
		System.out.println(currentCodePoint);
		
		System.out.println();
		System.out.println("--------------------------------------");
		
		System.out.println(" la lunghezza totale della stringa è: " + totalChars);
		
		for (int i = 0; i < totalChars; i++) { 
			/* con il ciclo for incontriamo 3 istruzioni 
			 * int i = 0 , dove inizializziamo la variabile
			 * i < string.length, andiamo a fare una valutazione (come un'IF), se i è minore della lunghezza della stringa
			 * string.length , rappresenta il numero totale di caratteri. in questo caso 19 
			 * i++ una volta eseguita l'istruzione passa al carattere successivo, fino a tutta la lunghezza della stringa.
			 * il ciclo si ferma quando, incrementando la (i) , raggiungerà un valore superiore della lunghezza della stringa (in questo caso 19)
			 */
			
			currentChar = string1.charAt(i);
			/*dammi il carattere corrispondente al valore di (i)
			 * inizialmente ad (i) abbiamo assegnato 0 , quindi ci mostrerà il caratere alla posizione 0 (in questo caso la S)
			 * una volta che ha terminato l'istruzione ripete il ciclo con (i) ,aggiornato ad 1 , quindi ci mostrerà il carattere associato alla posizione 1
			 */
			currentCodePoint = string1.codePointAt(i); 
			/*dammi il valore numerico associato al catarrere corrispondente al valore di (i)
			 * quindi se il primo carattere alla posizione 0 ,è S , ci mostrerà il valore decimale del carattere (in questo caso 83) 
			 */
			
			
			System.out.println();
			System.out.println("il valore di currentChar è: " + currentChar);
			
			System.out.println("il valoree di currentCodePoint è: " +currentCodePoint);
			
		}
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		String nome = "Luca";  // abbiamo creato un'oggetto stringa.
		String nomeMaiuscolo = nome.toUpperCase(); // con il (toUpperCase) vogliamo che tutte le lettere della stringa siano in maiuscolo.
		
		
		System.out.println(nome);
		System.out.println(nomeMaiuscolo);
		
		System.out.println(nome);
		
		/*con il toUpperCase ,il valore di nome non è stato modificato.
		 * con il toUpperCase su nome abbiamo generato un nuovo oggetto stringa
		 * quindi quando usiamo il toUpperCase sulla variabile di tipo stringa, non agisce sulla variabile , ma ne crea un'altra.
		 * una Stringa una volta che è definita non è più modificabile 
		 * anche se in senso pratico può sembrare che stia modificando, in realtà genera una copia con la sequenza di carattere che riflettono le modifiche 
		 */
		
		System.out.println(nome == nomeMaiuscolo); // stiamo chiedendo se l'indirizzo dell'oggetto nome è uguale all'indirizzo dell'oggetto nomeMaiuscolo.
		// in questo caso abbiamo dimostrato che sono due oggetti diversi, poichè gli indirizzi sono diversi.
		
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		String test1 = "test"; // abbiamo creato un'oggetto di tipo string 
		
		System.out.println(test1);
		
		test1 = "computer";
		
		/* con (test1 = computer), non stiamo modicando il testo di test1
		 * ma stiamo creando un secodo oggetto string che va ad aggiornare test1 con un nuovo reference.
		 * al primo test1 che ormai non è più referenziabile, verrà poi cancellato dai meccanismi della jvm
		 */
		
		System.out.println(test1);
		
		System.out.println();
		System.out.println("4--------------------------");
		System.out.println();
		
		final String test2 = "test"; // con final assegnamo un valore che non può essere cambiato
		// con final abbiamo creato una costante che non può essere modificata
		System.out.println(test2);
		
		//test2 = "computer";  // anche provando a modificare la variabile test2 il programma , nega il cambiamento.
		
		System.out.println();
		System.out.println("5--------------------------");
		System.out.println();
		
		// il simbolo (\) è un'escape che consente di inserire un simbolo senza che il sistema ci dia errore
		
		char c1 = '\'';  // con l'utilizzo dello (\) ci permette di stampare ('), senza che il sitema ci dia errore
		char c2 = '"';  // a char c2 è associato correttamente il carattere (") senza l'utilizzo dello (\)
		String s1 = "\""; // stesso problema del char ,se vogliamo mandare a stampa il simbolo (") dobbiamo utilizzare comunque (\) per non creare un'errore nel sistema
		String s2 = "'"; // in questo caso non c'è nessun problema , e non abbiamo bisogno di utilizzare (\)
		String s3 = "\"L\""; // per stampare ogni singola virgoletta nella stringa deve essere preceduta dallo (\)
		String s4 ="\\"; //anche per (\) bisogna metterne uno avanti per far si che il sistema non ci dia errore
		String s5 = "Cesare disse \"il dado è tratto\""; // in questo caso per mostrare le virgolette utilizziamo (\)
		
		
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s5: " + s5);
		
		System.out.println();
		System.out.println("6--------------------------");
		System.out.println();
		
		//esesrcizio
		//stampare in modo alternato una lettera maiuscola ed una minuscola
		//tutte le lettere pari devono essere maiuscole
		
		String parolaLunga = "precipitevolissimevolmente";
		String parolaRisultato = ""; // abbiamo creato una variabile vuota dove verranno salvate informazioni con il ciclo for
		char carattereCorrente; // anche qui abbiamo creato una variabile char , dove ci servirà per valutare ogni carattere della striga (carattereCorrente)
		
		for (int s = 0; s < parolaLunga.length(); s++ ) 
			/*con questo ciclo andiamo a percorrere tutte le lettere della parola, utilizzando (.length())
			 * con (int s = 0) stiamo dicendo che il ciclo inizia dalla posizione 0
			 * con (s++) stiamo incrementando di 1 posizione alla volta il ciclo
			 */
		{
		    carattereCorrente = parolaLunga.charAt(s);
		    /*con la variabile (carattereCorrente) che è un char, stiamo dicendo che , dobbiamo valutare il carattere corrispondente, alla posizione arrivata
		     * con questa riga di codice stiamo chiedendo , che sia preso in considerazione , il carattere dalla stringa (parolaLunga) corrispondente alla posizione (s)
		     */
		      	if ((s % 2) == 0) {
		      		/*
		      		 * in questo caso stiamo chidendo :se la posizione che stiamo valutando (s) è pari ,allora esegui il codice successivo
		      		 */
		     
			
				//System.out.println(carattereCorrente); // stampa il carattere di quella posizione
				
			} else { // altrimenti se non è pari
			
				 carattereCorrente = (char) ( carattereCorrente - 32); 
				 /*con questa riga di codice dichiaro (carattereCorrente) come una maiuscola 
				  * con (carattereCorrente - 32) otteniamo la sua controparte in maiuscolo 
				  * 
				  */
				// System.out.println(carattereCorrente); // quindi stampa il carattere corrispondente (carattereCorrente) , modificato a maiuscolo
		}
		
			parolaRisultato = parolaRisultato + carattereCorrente;
			/*parolaRisultato si aggiorna ad ogni posizione.
			 * con questa riga stiamo aggiungendo un carattere a parola risultato ad ogni posizione vautata dal ciclo
			 * esempio : se ci troviamo alla posizione 1, (in parolaRisultato) troveremo il risultato della posizione 0
			 * quindi al risultato della posizione 0 , che è stato salvato in (parolaRisultato) stiamo chiedendo di aggiuingere il risultato che abbiamo ottenuto nella posizione 1
			 * (parolaRisultato) + (carattereCorrente) non è altro che parolaRisultato, cioè (p), + carrattereCorrente, cioè (R), il carattere corrispondente alla posizione 1 
			 */
		}
		System.out.println("parolaRisultato: " + parolaRisultato); // stampami il risultato aggiornato dal ciclo for, della variabile (parolaLunga)
		
		System.out.println();
		System.out.println("6.2--------------------------");
		System.out.println();
		
		String parolaRisultato2 = "";
		char carattereCorrente2;
		
		//String esempio = "abc";
		/*la lunghezza della stringa esempio è 3
		 * ma l'idice da dove cominciamo a contare è lo 0
		 * se su (esempio.length () -1), sottraiamo 1 , otteniamo il numero degli indici più alto della stringa
		 * nel caso di esmpio sarà: 0 (a), 1(b), 2(c), la lunghezza massima è 3 caratteri (a,b,c), ma l'indice massimo è 2 (0,1,2)
		 * quindi con il codice (esempio.length() -1) , ci riferiamo all' indice massimo della stringa  
		 */
		for(int s = parolaLunga.length() -1; s >= 0  ; s--) {
			//for(int s = parolaLunga.length() -1; s >= 0  ; s = s -1) altro modo per dire che il valore attuale di s deve decrementare di 1
			
			/*in questo ciclo for la s ha il valore dell'indice massimo della stringa (parolaLunga)
			 * fino a quando la s è maggiore o uguale a 0 esegui il codice successivo
			 * ad ogni ciclo sottrai 1 e scala a ritroso la posizione
			 * in questo caso la (s) per via di (.length() -1) partirà dall'ultima posizione della stringa, quindi la (e)
			 * 
			 */
			
			carattereCorrente2 = parolaLunga.charAt(s);
			
			//System.out.println("carattereCorrente2: " + carattereCorrente2);
			//System.out.println();
			
			parolaRisultato2 += carattereCorrente2;
			/*questo è un sistema abbreviato di scrivere : (parolaRisultato2 = parolaRisultato2 + carattereCorrente2;)
			 *a parola risultato viene aggiunto ad ogni passo del ciclo, il carattere corrispondente alla posizione valutata di carattereCorrente2 
			 */
			
		}
		
		System.out.println(parolaRisultato2);
		
		System.out.println();
		System.out.println("7--------------------------");
		System.out.println();
		
		String colore1 ="Rosso";     
		String colore2 = "Rosso";
		String colore3 = new String("Rosso");
		
		/*gli oggetti (colore1) e (colore2) sono stringhe letterali , e sono generati senza il costruttore
		 * mentre con l'oggetto (colore3) stiamo chimado la funzione costruttrice della classe string
		 * 
		 */
		
		System.out.println(colore1 == colore2);
		System.out.println();
		/*colore1 e colore2 , sono due variabili che contengono copia del medesimo rerference
		 * cioè le referenze hanno lo stesso oggetto stringa
		 * con la sintassi utilizzata in colore1 e colore2 non stiamo creando 2 oggetti diversi , ma stiamo utilizzando lo stesso oggetto.
		 * questo è un caso dove la jvm utilizza lo string pull. che consiste nell'utilizzare oggetti creati per nuove variabili
		 * in pratica tutte le volte che viene creata una stringa con questa sintassi letterale, viene generato un'oggetto che viene associato ad una tabella,
		 * e quando in un'altra stringa letterale si fa riferimento alla stessa stringa,non viene creato un nuovo reference ma viene mandato l'oggetto mappato prima nella tabella
		 */
		
		System.out.println(colore2 == colore3); // il simobolo (==) mette a confronto qualcosa che sta a sinitra con qualcosa che sta a destra.
		/*la variabile colore2 e colore3 non contengono copie del medesimo reference
		 * cioè l'oggetto stringa creato in colore2 ,è associato ad un'idirizzo , mentre l'oggetto stringa colore3 è associoato ad un'altro indirizzo
		 * in pratica sono due stringhe con valore(Rosso) , che non hanno a che fare l'una con l'altra
		 * in questo caso non è associato allo string pull.
		 */
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		String citta1 = "Mantova";
		String citta2 = new String("Mantova");
		String citta3 = "Mantova";
		String citta4 = "Mantova";
		
		System.out.println(citta1 == citta2); // in questo caso citta1 , contiene un'idirizzo che è diverso da citta2
		System.out.println(citta1 == citta3); // in questo caso invece entra in azione lo string pull. che associa a città3 lo stesso refence, che è stato associato a città1
		System.out.println(citta1 == citta4); // anche in citta4 entra in azione lo stringpull.quindi il reference di citta1 viene associato a citta4
		
		System.out.println();
		System.out.println("8--------------------------");
		System.out.println();
		
		String nazione1 = "Italia";
		String nazione2 = new String("Italia");
		String nazione3 = "Spagna";
		
		System.out.println(nazione1.equals(nazione2));// è vero che i caratteri di nazione1 , sono uguali ai caratteri di nazione2?
		/*con .equals , stiamo chiedendo se i caratteri di nazione1 sono uguali ai caratteri di nazione 2
		 * praticamente se l'oggetto nazione1 ha gli stessi caratteri , lo stesso case di nazione2
		 * se cambiassimo anche un solo carattere in maiuscola o minuscola e il risultato diventa false
		 */
		
		System.out.println(nazione1.equals(nazione3)); // qui otteniamo un false perchè non combaciano i caratteri essendo diversi

		System.out.println();
		System.out.println("9--------------------------");
		System.out.println();
		
		String auto1 = "Ford";
		String auto2 = "ForD";
		
		System.out.println(auto1.equals(auto2));
		
		System.out.println("--------------------------");
		
		System.out.println(auto1.equalsIgnoreCase(auto2));
		/*in questo caso valutiamo se la parola ford è unguale ad entrambe , indipendentemente dalla maiuscola o minuscola
		 * 
		 */
		
		System.out.println();
		System.out.println("10--------------------------");
		System.out.println();
		
		int index10 = "ABCDEFGHILMNOPQRSTUVZ".indexOf('B');
		System.out.println("index: " + index10);
		
		/*
		 * l'indexOf con char serve per ricercare il singolo carattere di una stringa
		 *con la funzione indexOf , verifichiamo se all'interno della stringa scritta ci sia quel determinato carattere.
		 * nel caso nel testo ci sono caratteri corrispondenti a quello che abbimo inserito in indexOf(), ci darà l'indice di riferimento corrispondente
		 * in questo caso il carattere 'B' che noi abbiamo scelto , si trova nella posizione 1 della stringa, e a stampa troveremo l'indice 1.
		 * la posizione 0 è riferita alla 'A',la posizione 1 è riferita alla 'B', la posizione 2 è siferita alla 'C', e così via... 
		 */
		
		 int index11 ="ACDEFGHILMNOPQRSTUVZ".indexOf('B');
		 System.out.println("index11: " + index11);
		
		 /*in questo caso abbiamo appositamente elimintato il carattere 'B' dalla stringa, ed abbiamo rifatto la stessa ricerca , con indexOf
		  * indexOf()  non ha trovato il carattere 'B', quindi di conseguenza a stampa troviamo la scritta -1
		  * quando il carattere non è presente nella stringa il risultato finale sarà sempre -1
		 */
		 
		 int index12 = "ABCDEFGHILMNOPQRSTUVZ".indexOf(0x0047);
		 System.out.println("index12: " + index12);
		 
		 /*anche se scrivo in indexOf() il codice esadecimale , che corrisponde al carattere 'G', il risultato non cambia.
		  *ci dirà l'idice di posizione del carattere 'G', in questo caso nella sesta posizione.
		  *è indifferente se in indexOf() scriviamo il carattere 'G' , o il suo valore numerico in esadecimale o decimale. 
		  */
		 
		 int index13 = "ABCDEFGHILMNOPQRSTUVZ".indexOf('\u004D');
		 System.out.println("index13: " + index13);
		 
		 /*stessa cosa di prima, anche se abbiamo usato il codice '\004D' in indexOf , il sistema riconosce il carattere corrispondente al codice.
		  * in questo caso il codice usato corrisponde al carattere 'N' 
		  * come risultato ci darà l'indice di posizione riferita al carattere 'N' , in questo caso 10 
		  */
		 
		 int index14 = "ABCDEFGHILMNOPQRSTUVZ".indexOf("NO");
		 System.out.println("index14: " + index14);
		 
		 /*l'idexOf che stiamo usando per ricercare una parola , in questo caso "NO", è indexOf string
		  * a stampa vedremo l'indice della lettera N che è la prima della sequenza di caratteri NO che stiamo ricercando
		  * eliminando la O dalla stringa , e andando a ricercare la parola NO , troveremo a stampa il -1 ,che ci indica che non è stata trovata la parola NO
		  * per trovare la parola c'è bisogno che tutti i caratteri della parola da ricercare siano presenti nella stringa, e non bastano solo alcuni caratteri 
		  */
		 
		 int index15 = "ABCDEFGHILMNOPQRSTUVZ".indexOf('B', 2);
		 System.out.println("index15: " + index15);
		 
		 /*scrivendo indexOf('B', 2) , stiamo dicendo che la ricercxa inizia dall'indice 2
		  * a stampa troveremo come risultato il -1 , perchè il carattere 'B' si trova nell'indice di posizione 1
		  * noi stiamo partendo dall'indice di posizione 2 la ricerca, di conseguenza non trova il carattere 'B' da ricercare  
		  * in teoria stiamo escludendo l'idice di posizione 0 e 1
		  */
		 
		 int index16 = "ABCDEFGHILMNOPQRSTUVZNO".indexOf("NO", 12);
		 System.out.println("index16: " + index16);
		 
		 /*in questo caso stiamo ricercando la parola"NO" , partendo dall'indice 12
		  * in teoria partendo dall'indice 12 stiamo escludendo il primo NO della stringa 
		  * come risultato in stampa troveremo 21 che è il riferimento al primo carattere N della parola NO
		  * 
		  */
		 
		    System.out.println();
			System.out.println("10.1--------------------------");
			System.out.println();
		 
		 String nomeCognome = "Marco Rossi";
		 
		 if(nomeCognome.indexOf("Rossi") > -1) { 
			 /*
			  * con il -1 stiamo dicendo che se e presente , perchè il -1 sta a indicare che non è presente
			  * quindi : se nella stringa nomeCognome è presente la parola Rossi ,ed il suo indice è maggiore di -1, allora...
			  * se è presente nella stringa nomeCognome il suo indice varrà per forza di cose più di -1.
			  * anche se per esempio il primo carattere della parola Rossi si trovasse alla posizione 0 , sarebbe comunque superiore al -1
			  * in caso contrario non ci fosse nessuna corrispondenza con la parola Rossi allora il valore diventerebbe -1 e e si svolgerebbe la seconda situazione
			  */
			 
			 System.out.println("Ho trovato Rossi");
		 }
		 else
		 {
			 System.out.println("Non ho trovato nessun Rossi");
		 }
		 
		 /*con indexOf stiamo ricercando la stringa Rossi , all'interno della stringa referenziata con nomeCognome
		  * 
		  */
		 
		 System.out.println();
			System.out.println("11--------------------------");
			System.out.println();
		 
			int index17 = "ABCDEFGHILMNOPQRSTUVZA".lastIndexOf('A');
		 
		 System.out.println("index17: " + index17);
		 /*
		  * con il comando lastIndexOf stiamo cominciando la ricerca non più partendo da sinistra verso destra
		  * ma la ricerca si svolge al contrario partendo da destra verso sinistra
		  * infatti a stampa troveremo l'indice 21 e non 0 , perchè prende in cosiderazione la prima A trovata partendo da destra
		  */
		 
		 System.out.println();
			System.out.println("12--------------------------");
			System.out.println();
			
			String nomeCognome2 = "";
			String nomeCognome3 =" ";
			String nomeCognome4 ="\t"; // questo è il carattere con cui possiamo rappresentare un TAB
			
			boolean isEmpty =  nomeCognome2.isEmpty();
			boolean isEmpty2 =  nomeCognome3.isEmpty();
			boolean isEmpty3 =  nomeCognome4.isEmpty();
			
			System.out.println("isEmpty: " + isEmpty);
			System.out.println("isEmpty2: " + isEmpty2);
			System.out.println("isEmpty4: " + isEmpty3);
			
			/*con il comando boolean  nomeCognome2.isEmpty , stiamo verifivando se è vero che la lunghezza della stringa è 0 cioè vuota.
			 * come risutato in stampa troveremo true, perchè nel nostro caso abbiamo una stringa priva di caratteri 
			 * nel caso di nomeCognome3 la risposta sarà false perchè nella stringa abbiamo inserito uno spazio
			 * anche lo spazio è un carattere con il suo valore numerico
			 */
			
			System.out.println("lunghezza di nomeCognome2: " + nomeCognome2.length());
			System.out.println("lunghezza di nomeCognome3: " + nomeCognome3.length());
			System.out.println("lunghezza di nomeCognome3: " + nomeCognome4.length());
			/*
			 * in questo caso stiamo verificando la lunghezza di caratteri nelle due variabili
			 * anche se nella stringa abbiamo scritto il codice "\t" come riferimento a TAB, il risultato in stampa è di 1 carattere
			 * a stampa troveremo 1 , poichè fa riferimento al singolo carattere del TAB e non al codice di riferimento
			 */
			
			boolean isBlank = nomeCognome.isBlank();
			boolean isBlank2 = nomeCognome3.isBlank();
			
			System.out.println("isBlank: " + isBlank);
			System.out.println("isBlank: " + isBlank2);
			/*
			 * con il comando isBlank stiamo verificando , se e vero che nella stringa nomeCognome ci siano caratteri
			 * infatti nella stampa troveremo false
			 * cioè ci sta dicendo che non è vero che nella stringa nomeCognome ci siano caratteri , infatti la stringa di riferimento è vuota
			 */
			
			System.out.println();
			System.out.println("13--------------------------");
			System.out.println();
			
			String animale = "gatto";
			String mezzoDiTrasporto= "treno";
			
			System.out.println(animale.endsWith("to"));
			/*
			 * stiamo chiedendo se la stringa associata alla variabile animale finisce con la stringa to
			 * con la funzione endsWith() possiamo verificare che: è vero che nella stringa associata alla variabile animale, finisce per "to"?
			 */
			System.out.println(mezzoDiTrasporto.startsWith("tr"));
			/*
			 * con la funzione startsWith invece stiamo chiedendo se alla variabile assegnata la stringa comincia con "tr"
			 * cioè: è vero che la stringa associata alla variabile mezzoDiTrasporto inizia per "tr"?
			 */
			
			System.out.println(animale.startsWith("tr")); // abbiamo dimostrato che la stringa nella variabile animale non comincia con "tr" quindi il risultato sarà un false
			
			System.out.println();
			System.out.println("14--------------------------");
			System.out.println();
			
			String messaggio1 = "'come va?' gli chiesi,\n" + 
								"Dobbiamo parlare di tante cose!\n" + 
								"per esempio dobbiamo parlare di java e oop!\n" +
								"si, è vero!\n" +
								"non vedo l'ora!\n";
			
			System.out.println(messaggio1);
			
			/*
			 * con la funzione \n possiamo mancare a capo e concatenare porzioni di testo.
			 */
			String messaggio2 ="""
					'come va?' gli chiesi,
					Dobbiamo parlare di tante cose!
					per esempio dobbiamo parlare di java e oop!
					si, è vero!
					non vedo l'ora!
					""";
			
			
			System.out.println(messaggio2);
			
			/*
			 * con la funzione text block diventa ancora più leggibile
			 * con questo metodo ( il text block) possiamo concatenare una stringa lunga senza scriverla in un'unica riga
			 * possiamo evitare di aggiungere ad ogni riga il \n 
			 * basta solo """ all'inizio e """ alla fine
			 */
			
			System.out.println(messaggio1.equals(messaggio2));
			System.out.println(messaggio1 == messaggio2); 
			
			// in tutti e due i casi avremo un true poichè si riferiscono al medesimo oggetto 
			// viene generato un nuovo oggetto ma sostanzialmete viene recuperato il reference della stringa già creata
			
			
			System.out.println();
			System.out.println("14.1--------------------------");
			System.out.println();
			
			String html1 = "<html>\n" +
							"	<head>\n" +
							"		<title>Pagina di esempio</title>\n" + 
							"	<head>\n" +
							"	<body>\n" +
							"		<hl>Prima pagina</hl>\n" +
							"	</body>\n" + 
							"</html>";
			
			System.out.println(html1);
			
			String html2 = """
					<html>
						<head>
							<title>Pagina di esempio</title>
						<head>
						<body>
							<hl>Prima pagina</hl>
						</body>
					</html>
					""";
			System.out.println("--------------------------");
			
			System.out.println(html2);
			
			if (html2.indexOf("<html>") > -1) {
				System.out.println("abbiamo a che fare con un documento html");
			}
			else 
			{
				System.out.println("non è un documento html");
			}
			
			
			System.out.println();
			System.out.println("15--------------------------");
			System.out.println();
			
			//--------------.split------------------
			//creare un'array da una stringa
			
			String parole = "Fiore Computer Cavallo Formaggio Scala Armadio";
			String[] paroleArray = parole.split(" ");
			/*
			 * il metodo split è una funzione della classe string
			 * ci permette di ottenere un'array di stringhe
			 * nella stringa parole , split  valuta come elemento quello che è stato separato dallo spazio.
			 * aggiunge tanti elementi quanti sono le divisioni fatte con lo spazio.
			 */
			
			System.out.println("paroleArray.length: " + paroleArray.length); // stiamo verificando quanti elementi contiene l'Array
			System.out.println("--------------------------");
			System.out.println("paroleArray: " + paroleArray); // in questo modo stiamo verificando il codice univoco assegnato all'array
			System.out.println("--------------------------");
			
			for (int i = 0; i < paroleArray.length; i++) // in questo caso stiamo utilizzando il ciclo for 
			{
				System.out.println("paroleArray[" + i + "]: " + paroleArray[i]);
			}
			
			System.out.println("--------------------------");
			
			for(String parolaCorrente : paroleArray) // in questo caso abbiamo utilizzato il ciclo foreach, ed il risultato è il medesimo
			{
				System.out.println("parolaCorrente: " + parolaCorrente);
			}
			
			
			System.out.println();
			System.out.println("16--------------------------");
			System.out.println();
			 // partendo da un'Array dobbiamo creare una stringa
			
			String parole2 = String.join(" ", paroleArray);
			/*
			 * String.join ci serve per passare da un'Array ad una stringa
			 * cioè mettere gli elementi si un'Array di stinghe su una singola stringa
			 * (" ", paroleArray) , con il primo parametro ( lo spazio ) stiamo specificando quello che è il nostro delimitatore , servirà a separare gli elementi dell'Array , traane l'ultimo
			 * mentre paroleArray è il nostro array preso in cosinderazione
			 */
			System.out.println("parole2: " + parole2);
			
			System.out.println();
			System.out.println("17--------------------------");
			System.out.println();
			// ------------------------ string builder -------------------
			// ------------------------.append--------------------------
			
			StringBuilder stringBuilder = new StringBuilder(); // utilizzando stringBuider possiamo modificare la sequenza di caratteri (stringa) , senza generare nuovi oggetti stringa
			// la StringBuilder è usata tantissimo poichè da la possibilità di modificare gli oggetti senza crearne altri
			
			stringBuilder.append("Luca"); // in questo modo stiamo dicendo che la sequenza di caratteri su cui possiamo operare sarà questa
			System.out.println("La stringa attualmente gestita da stringBuider è: " + stringBuilder);
			
			stringBuilder.append(" ha gli occhi castani");
			/*
			 * con append stiamo aggiungendo del testo alla stringa stringBuilder
			 * l'output sarà: "Luca ha gli occhi castani"
			 * senza creare un nuovo oggetto stringa aggiunge delle sequenze di carattere alla stringa presa in considerazione 
			 * 
			 */
			System.out.println("La stringa attualmente gestita da stringBuider è: " + stringBuilder);
			
			System.out.println("--------------------------");
			
			StringBuilder stringBuilder2 = new StringBuilder("Ciao, come và?");
			
			
			//System.out.println("La stringa attualmente gestita da stringBuider2 è: " + stringBuilder2.toString());

			stringBuilder2.append(" Tutto bene, grazie mille.");
			
			System.out.println("La stringa attualmente gestita da stringBuider2 è: " + stringBuilder2.toString());
			
			System.out.println("--------------------------");
			
			StringBuilder stringBuilder3 = new StringBuilder(24); // vorrei che la capacità iniziale dello stringBuilder sia dall'iniizio 24 anzichè 16
			System.out.println("La capacità di stringBuilder3 è: " + stringBuilder3.capacity());
			
			/*
			 * con la funzione capacity stiamo definedo la capacità, cioè il numero di caratteri che possono essere immagazzinati , prima che una nuova locazione accada
			 * cioè sono i caratteri che posso essere gestiti inizialmente dal nostro stringBuilder
			 * di default caqpacity è 16
			 * in questo caso che abbiamo inserito 24, abbiamo aumentato la sua capacità iniziale 
			 */
			
			System.out.println("--------------------------");
			
			StringBuilder stringBuilder4 = new StringBuilder(stringBuilder2.toString());
			/*
			 * al nuovo oggetto apena creato stiamo passando la stringa restituita dallo stringbuilder precedente
			 * quindi stiamo tenendo in considerazione la stringa precedente  "Ciao, come và? Tutto bene, grazie mille."
			 */
			
			System.out.println("stringBuilder4.toString(): " + stringBuilder4.toString()); // con il toString riusciamo ad ottenere un'oggetto da un'oggetto stringa
			
			System.out.println();
			System.out.println("18--------------------------");
			System.out.println();
			
			StringBuilder stringBuilder5 = new StringBuilder();
			 
			System.out.println("stringBuilder5.capacity() è: " + stringBuilder5.capacity()); // abbiamo verificato che la capacità iniziale dello stringBuilder è 16
			
			StringBuilder stringBuilder6 = new StringBuilder("Ciao a tutti!");
			
			System.out.println("stringBuilder6.capacity()1 è: " + stringBuilder6.capacity());
			
			/*per quanto riguarda la capacità di stringBuider5 abbiamo detto che la sua capacità iniziale di default è 16 perchè non sta lavorando su nessun oggetto.
			 * mentre per stringBuilder6 l'output sarà 29 poichè all'interno ha un'oggetto
			 * quando usiamo uno stringbuilder con il costruttore , se aggiungiamo una sequenza di caratteri, in questo caso ("Ciao a tutti!"),
			 * si somma la capacity iniziale con il numero dei caratteri inseriti, in questo caso 16 di default + 13 la length della stringa
			 * quindi questo striong builder da la possibilità di manipolare 29 caratteri e non 16
			 * 
			 */
			
			stringBuilder6.append(" Come và?");
			System.out.println("stringBuilder6.toString(): " + stringBuilder6.toString()); 
			// l'output sarà :(Ciao a tutti! Come và?) , abbiamo aggiunto all'oggetto stringBuilder6 , utilizzando .append , un'altra sequenza di caratteri
			//il comando .append ci consente di inserire una sequenza di caratteri in coda alla stringa
			
			System.out.println("stringBuilder6.capacity()2 è: " + stringBuilder6.capacity()); // la capacity dopo la prima modifica sarà ancora 29, perchè non abbiamo superato i 29 

			stringBuilder6.append(" A me, molto bene!");
			System.out.println("stringBuilder6.capacity()3 è: " + stringBuilder6.capacity());

			/*ricapitolando alla creazione di stringBuilder6 abbiamo aggiunto 13 caratteri con la sequenza: ciao a tutti! , ai 16 di default --- 13 + 16 =29
			 * con il primo append abbiamo usato 9 dei 16 caratteri , cioè dai 29 iniziali ne abbiamo tolti 13 della prima frase (ciao a tutti!) e 9 del primo append( come và?) 29 - 13 - 9 = 7
			 * abbiamo uno scarto ancora di 7 sette caratteri, quindi non abbiamo superato il limite dei 29 caratteri
			 * mentre con il secondo append abbiamo superato il limite dei 29 caratteri , infatti l'output sarà 60
			 * quando si supera il limite iniziale dello stringBuilder entra in funzione una regola dello stringBuider
			 * cioè viene sommato 1 alla capacity iniziale e il tutto poi moltiplicato per 2
			 * quindi il 60 di capacity che troveremo in output sarà: (29 (capacity iniziale) + 1) * 2 
			 * 
			 */
			
		//	stringBuilder6.append("1234567890");
		//	System.out.println("stringBuilder6.capacity()4 è: " + stringBuilder6.capacity());
			
			stringBuilder6.append("1234567890");
			System.out.println("stringBuilder6.capacity()5 è: " + stringBuilder6.capacity());

			stringBuilder6.append("a");
			System.out.println("stringBuilder6.capacity()6 è: " + stringBuilder6.capacity());

			// ora l'output sarà 122
			// abbiamo dimostrato la regola dello stringBuilder
			// superando il 60 entra in funzione la regola: cioè al 60 viene aggiunto un +1 e poi il tutto viene moltiplicato per 2
			// ecco spiegato il 122 in output
			
			System.out.println("stringBuilder6.length()6 è: " + stringBuilder6.length()); // per capire il numero totale gestito nello stringBuilder
			System.out.println("--------------------------");


			/*quindi con length vediamo la lunghezza dei caratteri inseriti (in questo caso 61)
			 * con capacity vediamo la capacità che può contenere lo stringBuilder (in questo caso 122)
			 * il calcolo sarà 122 - 61 = 61. il 61 non è altro che lo scarto che abbiamo a disposizione prima che la regola entri in funzione e generi altro spazio
			 */
			System.out.println("stringBuilder6.toString()6 è: " + stringBuilder6.toString());
			
			System.out.println("--------------------------");
			
			//------------modifichiamo i carattri in una determinata posizione------------------
			/*inizialmente individuiamo la posizione corretta dove poi verrà inserita la porzione di testo
			 * una volta individuato , in questo caso : 19
			 * 19 è la posizione dove inseriremo la pozione di testo , inserendo la porzione di testo , andiamo a spostare la restante parte dei caratteri
			 * e come se ci creiassimo uno spazio tra i caratteri
			 * si parte a contare da 0
			 * 
			 */
			
			stringBuilder6.insert(19, "vi ");
			/*
			 * con il comando insert stiamo dicendo che: alla posizione 19 , devi aggiungere la sequenza di caratteri "vi "
			 * abbiamo aggiunto una sequeza di caratteri alla posizione dichiarata , senza andare a creare un nuovo oggetto
			 */
			System.out.println("stringBuilder6.toString()6 è: " + stringBuilder6.toString());
			
			System.out.println("--------------------------");
			stringBuilder6.replace(26, stringBuilder6.length(), "Tutto nella media. Potrebbe andare meglio.");
			/*
			 * con la funzione .replace abbiamo la possibilità di sostituire una sequeza di caratteri con un'altra sequenza di caratteri in qualsiasi punto della stringa
			 * con .append andiamo ad aggiugere una sequenza dio caratteri ad una stringa in coda.
			 * con .insert andiamo ad aggiungere una sequenza di caratteri in qualsiasi punto della stringa
			 * con .replace sostituiamo una porzione di caratteri con un'altra porzione di caratteri a nostro piacimento, in qualsiasi punto della stringa
			 * sostanzialmente con .replace abbiamo 3 parametri (a, b, c,) 
			 * con il primo parametro decidiamo a che punto inserire la nostra sequenza di caratteri
			 * con il secondo punto decidiamo fino a dove deve arrivare la modifica
			 * con il terzo la sequenza di carartteri da inserire
			 * nel nostro caso la sequenza di caratteri che dovevamo sostituire deve arrivare fino alla fine della stringa, di conseguenza abbiamo usato (strinBuilder.length)
			 * con stringBuilder.length stiamo dichiarando che la sequenza aggiunta deve sostituire la porzione di stringa fino alla fine della stringa stessa  
			 */

			System.out.println("stringBuilder6.toString()6 è: " + stringBuilder6.toString());
			
			System.out.println("--------------------------");
			stringBuilder6.delete(0, 14);
			/*
			 * con la funzione .delete abbiamo la possibilità di eliminare una porzione di caratteri dalla stringa
			 * con il primo indice andiamo a definire la partenza e con il secondo indice la fine 
			 */
			System.out.println("stringBuilder6.toString()6 è: " + stringBuilder6.toString());
			System.out.println("--------------------------");

			stringBuilder6.reverse();
			// con la funzione .reverse abbiamo la possibilità di mostrare la sequenza di caratteri al contrario
			System.out.println("stringBuilder6.toString()6 è: " + stringBuilder6.toString());
			
			System.out.println();
			System.out.println("19--------------------------");
			System.out.println();
			
			//---------Generare una password casuale-----------

			String caratteri = "ABCDEFGHILMNOPQRSTUVZ1234567890_@";
			
			// creiamo l'elemento che terrà traccia di ogni estrazione effettuata con la funzione stringBuilder
			StringBuilder password = new StringBuilder();
			
			Random random = new Random();
			
			/*
			 * una volta importata la classe random 
			 * specifico quale sia il valore massimo entro il quale poter operare un'estrazione
			 * cioè il numero totale della stringa caratteri
			 * quindi il numero totale di caratteri di cui è composta la stringa caratteri, diventerà il valoreMassimo
			 */
			int valoreMassimo = caratteri.length(); // valore massimo corrisponde alla lunghezza di caratteri
			// decidiamo la lunghezza della password.
			// cioè il numero totale di estrazioni da compiere
			
			int lunghezzaPassword = 30;
			
			for(int estrazioneCorrente = 0; estrazioneCorrente < lunghezzaPassword; estrazioneCorrente++) // con questo ciclo estraiamo l'indice associato al determinato carattere
			{
				int indiceCasuale = random.nextInt(valoreMassimo);// genera un numero casuale che va da 0 fino alla lunghezza massima della di carattri
				/*
				 * con questa variabile int stiamo chiedendo alla funzione random di generare un numero che va da 0 fino al valore massimo
				 */
				char carattereEstratto = caratteri.charAt(indiceCasuale);// mi mostri il carattre corrispondente al valore di indice casuale?
				/*
				 * char carattereEstratto = caratteri.charAt(indiceCasuale); con questa funzione stiamo chiedendo di restituirci il carattere associato a indice casuale
				 * in pratica: indice casuale , con la funzione random, genera un numero che va da 0 fino alla lunghezza massima di (caratteri)
				 * con la funzione charAt(indiceCasuale) stiamo convertendo il numero in uscita (indice) dalla funzione random, nel carattere corrispondente
				 * esempio: se l'indice casuale è 0 , con charAt avremo il carattere corrispondente ,cioè (A)
				 * se l'indice casuale è 4 , con charAt avremo il carattere (E)
				 * inizia a contare sempre da 0 
				 */
				
				password.append(carattereEstratto); // stiamo chiedendo di aggiungere in coda a password il carattere estratto
				// ad ogni ciclo aggiunge un carattere fino alla fine della nostra iterazione
			}
			
			System.out.println("password: " + password); // mostrami il risultato finale di password dopo l'iterazione;
			System.out.println("password length: " + password.length()); //mostrami la lunghezza della password
			
			/*
			 * se non avessimo usato la funzione stringBuilder, ma la funzione string, ad ogni ciclo generavamo un nuovo oggetto
			 * per via dell'immutabilità della funzione string avremmo avuto 30 nuovi oggetti
			 * mentre usando la funzione stringBuilder associando la funzione append , stiamo modificando l'oggetto aggiungendo in coda un nuovo carattere 
			 */
			
			System.out.println("password capacity: " + password.capacity()); // mostrami la capacity di password
			/*
			 * la capacity di password parte da default a 16
			 * poi dal 17 carattere aumenta di 1 e il tutto viene moltiplicato per 2
			 * quindi il risultato finale sarà 34
			 */
			
			System.out.println();
			System.out.println("20--------------------------");
			System.out.println();
			
			StringBuilder sequenza = new StringBuilder();
			
			int indiceCorrente = 1; // stiamo creando una variabile con l'indiceCorrente che parta da 1
			int iterazioneMassima = 10; // creiamo una variabile che ci delimiti il numero massimo di iterazioni del ciclo
			
			while(indiceCorrente <= iterazioneMassima) // fino a quando l'indice corrente è inferiore o uguale del valore di iterazione massima, allora svolgi il comando nelle graffe
			{
				for (int indiceInterno = 0; indiceInterno < indiceCorrente; indiceInterno++)
					/*
					 * con questo ciclo for interno stiamo chiedendo:
					 * indiceInterno è minore di indice corrente? in questo caso è come se dicessimo 0 è minore di 1?
					 * quindi in partenza sarà 0 < 1 , e aggiunge una a 
					 * al ciclo interno successivo sarà: 1 < 1 (falso) quindi esce dal ciclo interno e continua il ciclo principale
					 * al secondo giro l'indiceCorrente saà 2
					 * quindi nel ciclo interno sarà 0 < 2 ? (vero) , quindi append a
					 * poi sarà 1 < 2 ? ancora (vero) e append un'altra a
					 * infine sarà 2 < 2 (falso) quindi esce dal ciclo for interno e continua con quello principale
					 * facendo così stiamo aggiungendo tante a quanto il valore corrente di IndiceCorrente
					 */
				{
				sequenza.append("a");
				
				}
				sequenza.insert(indiceCorrente, "i");// con questo comando ad ogni ciclo interno stiamo inserendo una i
				
				sequenza.replace(indiceCorrente -1, indiceCorrente, "u"); 
				// sostituisci il carattere alla posizione indiceCorrente -1(posizione 0) , fino alla posizione con valore indiceCorrente (inizialmente 1) con il carattere "u"
				
				System.out.println("sequenza: " + sequenza.toString());
				
				indiceCorrente += 1; // incrementa di 1 ad ogni ciclo il valore di indice corrente
			}
			
			System.out.println();
			System.out.println("21--------------------------");
			System.out.println();

			int limit = 100_000;
			
			StringBuffer stringBuffer = new StringBuffer("Un caro saluto a tutti!");
			
			long startTime = System.currentTimeMillis(); // con questa funzione stiamo andando a memorizzare un lasso di tempo iniziale in millisecondi
			
			for(int i = 0; i < limit; i++)
			{
				stringBuffer.append(" Anche a te!");
				
			}
			
			long endTime =System.currentTimeMillis(); //  mentre con questa funzione stiamo andando a memorizzare un lasso di tempo finale in millisecondi
			
			System.out.println("stringBuffer ha impiegato: " + (endTime - startTime) + " millisecondi.");
			
			StringBuilder stringBuilder7 = new StringBuilder("Un caro saluto a tutti!");
			startTime = System.currentTimeMillis();
			
			for(int i = 0; i < limit; i++)
			{
				stringBuilder7.append("Anche a te!");
				
			}
			
			endTime =System.currentTimeMillis();
			System.out.println("stringBuilder ha impiegato: " + (endTime - startTime) + " millisecondi.");
	}
}
