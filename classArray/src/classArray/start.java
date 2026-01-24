package classArray;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		int n1 = 1;
		System.out.println("n1: " + n1);
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		int[] numeri = new int[5];
		/*
		 * con int[] abbiamo definito il tipo di dato che l'array deve gestire
		 *  con numeri assegnamo un'identificatore per l'array
		 *  dopo l'operatore di assegnamento (=), viene generato un nuovo array (new int[5]), che sia in grado di contenere 5 valori di tipo int.
		 *  l'array bisogna immaginarlo come una scatola con al suo interno un'altra scatola che possa contenere altri elementi, in questo caso 5 valori
		 */

		numeri[0] = 45;
		numeri[1] = 13;
		numeri[2] = 1;
		numeri[3] = 8;
		numeri[4] = 100;
		/*
		 * immaginando sempre delle scatole, numeri è la scatola principale
		 * [0] è l'etichetta che sta ad indicare la scatola più piccola 
		 * 45 è il valore assegnato alla scatola più piccola
		 * quindi in 45 finirà nella scatoletta [0], che a sua volta finirà nella scatoletta numeri
		 */
		
		System.out.println("--------------------------");
		System.out.println("numeri[0]: " + numeri[0]);
		System.out.println("numeri[1]: " + numeri[1]);
		System.out.println("numeri[2]: " + numeri[2]);
		System.out.println("numeri[3]: " + numeri[3]);
		System.out.println("numeri[4]: " + numeri[4]);
		System.out.println("--------------------------");
		
		for (int counter = 0; counter < numeri.length; counter++)
			/*
			 * inizzializiamo la variabile counter con valore 0 ,
			 * se counter (0), è minore di numeri.length( cioè 5 ), il numero di elementi contenuti nella scatola numeri 
			 * allora esegui il comando nelle parentesi graffe.
			 * con counter++ stiamo dicendo che una volta eseguito il comando nelle parentesi graffe di aggiungere un +1 alla variabile counter
			 * cioè ripete il procedimento iniziale ma con counter che ha valore 1
			 * questo ciclo si ripete fino a quando counter non sarà uguale a 5 e quindi uscirà dal ciclo
			 */
		{
			System.out.println("numeri[" + counter + "]: " + numeri[counter]);
		}
		/*
		 * con la riga di codice: System.out.println("numeri[" + counter + "]: " + numeri[counter]); stiamo chiedendo:
		 * "numeri[" + counter + "] ,con questa porzione stiamo chiedendo di mostraci l'etichetta della scatola con indice del valore attuale del counter
		 * con il primo counter (+ counter +) stiamo vedendo il valore acquisitopo da coubnter nei vari passi del ciclo for
		 * invece con numeri[counter] , stiamo chiedendo di mostrarci l'interno della scatola con l'indice del valore attuale del counter.
		 * cioè dalla scatola primaria numeri , mostrami il valore contenuto nella scatola con indice.... 0 , 1 , 2 , 3 , 4 (le varie fasi del ciclo)
		 */
		
		System.out.println("--------------------------");
		for (int counter2 =  numeri.length -1 ; counter2 >= 0; counter2-- )
			/*
			 * in questo caso inizzializiamo counter2 con valore numeri.length -1 
			 * cioè numeri.length -1 non è altro che la lunghezza dell'array numeri (cioè 5) , -1
			 * quindi il valore iniziale di counter2 è 4
			 * counter2 >= 0; è vero che counter2 (4) è maggiore o uguale a 0?
			 * se è vero allora esegui il comando nelle graffe
			 * una volta eseguito togli 1 a counter2
			 * ripeti lo stesso procedimento con counter che adesso ha valore 3
			 * fino a quando counter non assumerà valore -1 , quindi il ciclo si bloccherà
			 */
			
		{
			System.out.println("numeri[" + counter2 + "]: " + numeri[counter2]); 
		}
		
		System.out.println("--------------------------");
		
		int totale = 0; // creiamo una variabile dove aggiungere la somma di tutti gli elementi

		for (int counter3 = 0; counter3 < numeri.length; counter3++)
		{
			int valoreCorrente = numeri[counter3]; // stiamo prendendo in cosiderazione l'elemento contenuto nella scatola con indice corrente di counter3 (0) in questo caso
			totale = totale + valoreCorrente; //quindi sarà il valore iniziale di totale (0) + il valore corrente (45)
		}
		System.out.println("la sooma dei numeri è: " + totale ); // una volta finito il ciclo stampa il totale di tutte le oprazioni fatte con il ciclo
		
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		String[] nomi = new String[4];
		
		nomi[0] = "Luca";
		nomi[1] = "Sara";
		nomi[2] = "Marco";
		nomi[3] = "giulia";
		
		System.out.println(nomi); // [Ljava.lang.String;@3f91beef questo sarà il risultato che otterremo
		/*
		 * con nomi soltanto avremo la descrizione ci cosa è nomi e il suo codice univoco di riferimento
		 */
		int contatoreNomi = 0;
		
		while(contatoreNomi < nomi.length) 
		{
			System.out.println("nome["+ contatoreNomi + "]: " + nomi[contatoreNomi]);
			contatoreNomi++;
		}
	     
		System.out.println("--------------------------");
		
       int contatoreNomi2 = 0; //inizializziamo una variabile che ci servirà come copntatore
       
       String totaleNomi =""; // creiamo una variabile di tipo string , al momento vuota per poi inserirci gli elementi dell'array
		
		while(contatoreNomi2 < nomi.length) // creiamo un cioclo while dove, se contatoreNome2 è minore della lunghezza dell'array, allora esegui il comando nelle graffe
		{
			System.out.println("nome["+ contatoreNomi2 + "]: " + nomi[contatoreNomi2]);
			/*
			 * con questa stampa vogliamo che ci mostri il valore attuale di contatoreNomi + il contenuto dell'array con riferimento all'indice con valore attuale di contatoreNomi2
			 */
			
			String nomeCorrente = nomi[contatoreNomi2];// creiamo una variabile nomeCorrente in modo da rendere più chiaro la lettura 
			
			String separatore = ", "; // con la variabile separatore stiamo distanziando e aggiungendo una virgola ai vari elementi dell'array
			
			if(contatoreNomi2 == nomi.length -1) // con questo if secco stiamo dicendo che: se il valore di contatoreNomi2 è uguale a nomi.length -1 ( l'ultimo elemento dell'array)
			
				separatore = "."; // se si è verificata la condizione dell'if allora aggiuingi separatore modificato
			
			totaleNomi += nomeCorrente + separatore;// a totaleNomi stiamo aggiungendo nomeCorrente + la variabile separatore
			
			contatoreNomi2++;// alla fine del ciclo aggiungi un +1 al contatoreNomi2
		}
		    System.out.println("toaleNomi: " + totaleNomi);// manda a stampa il contenuto di totaleNomi
		    
		    System.out.println();
			System.out.println("4--------------------------");
			System.out.println(); 
		
			String nomi2[] = {"marco", "franco", "alessandro", "luca" };
			/*
			 * questo è un'altro modo per scrivere un'array
			 * le parentesi quadre si possono scrivere anche  sull'identificatore della variabile , non cambia nulla
			 * con questo metodo non abbiamo un limite massimo di dati da inserire, ma possiamo inserire tutti i dati che vogliamo
			 * comunque una volta definito l'array non è possibile aggiungere altri elementi al suo interno
			 * la differenza con l'array affrontato prima e questo metodo è:
			 * che con quello di prima abbiamo definito solo la sua lunghezza con il numero nelle parentesi [5] , e poi abbiamo definito gli elementi da inserire.
			 * mentre con questo metodo stiamo già definendo gli elementi inseriti e di conseguenza la sua lunghezza
			 * 
			 */
			String cognomi[] = {"rossi", "bianchi", "neri", "verdi",}; 
			
			for(int i= 0; i < nomi2.length; i++) {
				System.out.println(nomi2[i] + " " + cognomi[i]); 
			}
			/*
			 * in questo caso con un semplice ciclo for abbiamo fatto combaciare 2 array
			 * infatti con questo ciclo for stiamo dicendo di mandare a stampa il nome in nome2 alla posizione 0 , con il cognome in cognomi alla posizione 0
			 * con un ciclo for abbiamo collegato 2 array
			 * 
			 */
			System.out.println("--------------------------");
			
			for(String nomeCorrente : nomi2) 
				/*
				 * se volessi iterare (Esegui lo stesso pezzo di codice ripetutamente.) nell'array nomi2
				 * diamo una variabile con identificatore nomeCorrente
				 * una volta definita (String)
				 * va a contenere il valore dell'iterazione dell'array nomi2
				 * il foreach sa che in nomi2 ci sono 4 elementi
				 * partendo dall'indice 0 inserisce i vari elementi nella variabile nomeCorrente
				 * senza avere una variabile numerica completa il ciclo salvando in nomeCorrente
				 * sicuramente è molto più veloce , ma come contro è meno controllato di un ciclo for
				 * ed ha meno funzioni rispetto ad un ciclo for
				 * ciò non toglie che con il foreach scriviamo meno codice e di conseguenza più rapido
				 * esempio se volessi percorrere l'array al contrario con il ciclo foreach non lo posso fare
				 * altro esempio nell'esercizio precedente col il ciclo for abbiamo collegato in stampa i 2 array, cosa che non si può fare con il cilco foreach
				 */
			{
				System.out.println("nomeCorrente: " + nomeCorrente); 
			}
			
			/*
			 * se avessimo bisogno di un contatore nel ciclo foreach bisogna ragionare come nel ciclo while
			 * creiamo una variabile fuori dal ciclo foreach e la incrementiamo nel ciclo
			 * 
			 * int s = 0;
			 * for(String nomeCorrente : nomi2) 
			 * System.out.println("nomeCorrente: " + nomeCorrente); 
			 * s++
			 * System.out.println("s " + s); 
			 * 
			 * come spiegato nell'esempio
			 */
			
			System.out.println();
			System.out.println("5--------------------------");
			System.out.println(); 
			
			/*public static void main(String[] args) {
			 * nella funzione main c'e un parametro che specifica un'array
			 * l'array String[] args
			 * 
			 */
		/*	if(args.length > 0)
			{
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			}*/
			
			/*
			 * come aggiungere un valore all'array args
			 * clicchiamo con in tasto destro sulla classe start 
			 * scendiamo fino ad Run As
			 * clicchiamo su Run configuration
			 * clicchiamo su Arguments
			 * e nella finestra program Arguments aggiungere il valore desiderato
			 *
			 *nel nostro caso abbiamo aggiunto una frase " W LA CIOCCOLATA "
			 *nella prima riga di codice args[0] , stamperà la lettera W
			 *nella seconda riga di codice args [1] , stamperà la parola la
			 *e nella terza riga di codice args[2] , stamperà la parola coccolata
			 *se volessimo che la frase inserita nell'array args ( W la cioccolata) fosse divisa in in 2 indici anzichè 3 
			 *dobbiamo andare di nuovo su run configuration e dividere la frase con delle virgolette
			 *esempio: w "la cioccolata"
			 *in questo modo l'indice [0] conterrà la lettera (w) 
			 *e l'indice [1] conterrà la porzione di frase (la cioccolata)
			 *
			 */
			
			for(int i = 0; i < args.length; i++)
			{
				System.out.println(args[i]);
			}
			
			System.out.println();
			System.out.println("6--------------------------");
			System.out.println(); 
			
			//GLI ARRAY MULTIMENSIONALI
			
			int [][] numeri2 = new int [3][4];
			
			numeri2[0][0] = 1;
			numeri2[0][1] = 2;
			numeri2[0][2] = 3;
			numeri2[0][3] = 4;
			
			numeri2[1][0] = 10;
			numeri2[1][1] = 20;
			numeri2[1][2] = 30;
			numeri2[1][3] = 40;
			
			numeri2[2][0] = 100;
			numeri2[2][1] = 200;
			numeri2[2][2] = 300;
			numeri2[2][3] = 400;
			/*
			 * immaginiamo l'array bidimensionale come se fossero 3 righe e 4 colonne
			 * il valore 1 lo stiamo assegnando all'indice diella riga 0 che si interseca con l'indice della colonna 0
			 * sempre immaginado righe e colonne se volessimo individuare il valore assegnato 30 bisogna trovare l'intersecazione tra riga 1 e colonna 2
			 */
			//System.out.println(numeri2[0][0]);
			//System.out.println(numeri2[0][1]);
			
			//System.out.println(numeri2[1][0]);
			//System.out.println(numeri2[1][1]);
			
			for( int i = 0; i < numeri2.length; i++) 
			{
				System.out.println("inizio ad esplorare le colonne della riga: " + i);
				
				for(int j = 0; j < numeri2[i].length; j++) 
				{
					System.out.println("numeri[" + i + "] [" + j + "]:  " + numeri2[i][j]);	
				}
			}
			/*
			 * per stampare in ciclo l'array bidimensionale abbiamo bisogno di un doppio ciclo 
			 * con il primo ciclo stiamo iterando le righe dell'array
			 * con il secondo ciclo dentro al primo stiamo iterando le colonne
			 * il primo ad iterare è la variabile j che una volta completato il suo ciclo ripartirà con il valore diverso della variabile i
			 */
			
			System.out.println();
			System.out.println("7--------------------------");
			System.out.println();
			
			var byte1 = (byte) 18; // byte byte1 = (byte)18;
			 /*
			  * anche se non abbiamo specificato inzizialmente che si trattasse di una variabile di tipo byte , il coopilatore lo deduce
			  * con var faccio si che il coopilatore possa intuire in base a cosa ho inserito alla destra dell'operatore di assegnamento 
			  * in questo caso alla destra dell'operatore di assegnamento abbiamo effettuato un cast con il byte
			  * di conseguenza il var riconosce che il dato inserito alla destra dell'opratore di assegnamento è un byte
			  * NOTA: se avessimo scritto 18 senza aver effettuato un cast , sarebbe stato riconosciuto da default come un'int
			  * 
			  */
			var short1 = (short) 4; // short short1 = (short) 4;
			// anche in questo caso riconoscerà che si tratta di uno short e di conseguenza con il suo peso in memoria di 2 byte
			
			var int1 = 77; //int int1 = 77;
			/* come detto prima , se non viene specificato alla destra dell'operatore di assegnamento , con un cast di cosa si tratta 
			 * se inseriamo un valore numerico senza specificare , lo tratterà di default come un'int
			 * NOTA: in un contesto dove abbiamo più variabili e quindi più confusionario sarebbe opportuno non utilizzarlo
			 * nel caso dell'esempio si riesce ad intuire di cosa si tratta , grazie al nome che abbiamo dato alla variabile
			 * ma ci saranno casi dove tutto sarà più confusionarioe quindi , sarebbe più consigliato specificare sempre prima il tipo di variabile
			 */
			
			var long1 = 1234567890L; // long long1 = 1234567890L;
			
			var float1 =3.14F; //float float1 = 3.14F; ------per il float bisogna specificarlo con l'aggiunta della F
			
			var doble1 = 3.14; // double double1 = 3.14; ------- per il double non c'è il bisogno di specificarlo poichè da defoult lo riconosce come double
			
			var char1 ='H'; // char char1 = 'H';
			
			var bool1 = true; // boolean bool1 = true;
			
			
			var string1 = "Ciao"; // String string1 = "Ciao";
			
			var  string2 = "Ciao";
			
			System.out.println(string1 == string2); // abbiamo dimostrato che string1 è uguale a string2. 
			
			//--------VAR NON SI UTILIZZA NEI SEGUENTI CASI-------------
		//	var a;   quando si usa var bisogna sempre dichiarare il tipo di variabile
		//  var b = null;	null è il valore di default dei tipi reference, da un null non sappiamo il valore effettivo di b , quindi e anche in questo caso è un'errore eseguire il var in questo modo		
		//  var c1 = 1, c2 = 2;    anche scriverlo in questo modo è sbagliato scriverlo.
			
	    //  var chars[] = new char[10]; var non può essere utilizzaro per gli array
			
			System.out.println();
			System.out.println("8--------------------------");
			System.out.println();
			
			// -------------------------OPERATORE TERNARIO-------------------------------
			String nome1 = "Roberto";
			String nome2 = "Luca";
			String risposta = (nome2.equals(nome1)) ? "Nomi coincidenti" : "Nomi non coicidenti";
			
			/*String risposta = (nome2.equals(nome1)) ? "Nomi coincidenti" : "nomi non coicidenti";
			 * questa è una versione più estesa dell'equals
			 * la sintassi è la seguente: se è vero che i i valori di nome1 è uguale al valore di nome2 (Roberto == Luca)
			 * **il punto di domanda ? lo possiamo interpretare come un"ALLORA"
			 * ALLORA restituisci la stringa " nomi coicidenti "
			 * **i due punti : possiamo interpretarli come altrimenti
			 * altrimenti restituiscimi la stringa " nomi non coicidenti
			 *e' come se stessimo utilizzando un'if implicito
			 *la string risposta acquisisce il suo valore dopo aver superato la codizione (nome2.equals(nome1))
			 * -----------------PUNTI A FAVORE--------------
			 * scrivere meno codice su meno righe
			 * 
			 * -----------------PUNTI A SFAVORE---------
			 * meno leggibile per che deve leggere il nostro codice 
			 */
			
			System.out.println("risposta: " + risposta);
			
			int n = 19;
			boolean maggiorenne = (n > 18) ? true : false; // anche in questo caso stiamo chiedendo se è vero che n > 18?
			                                               // allora se è vero stampa true
		                                                   // altrimenti stampa false
			System.out.println("è maggiorenne: ?" + maggiorenne);
			
			char primaLettera = 'a';
			String saluto = (primaLettera == 97) ? "Ciao" : "Arrivederci";
			
			System.out.println(saluto);
			
			String s1 = "Musica";
			String s2 = "Musica";
			String s3 = new String ("Musica");
			String risposta2 = (s1 == s2) ? "OK" : "KO"; 
			System.out.println(risposta2);
			// grazie al pull di string  stiamo dimostrando che s1 e s2 hanno il medesimo reference e ci9 dirà che sono uguali
			
			String risposta3 = (s1 == s3) ? "OK" : "KO";
			
			System.out.println(risposta3); // scivendolo con il costruttore non entra in azione il pull di string quindi di conseguenza ci dirà che NON sono uguali
			                               // quindi di conseguenza non hanno lo stesso reference
			
			System.out.println();
			System.out.println("9--------------------------");
			System.out.println();
			//--------------------vedi classe punto-----------------------
			
			Punto punti[] = new Punto[6]; // stiamo definendo un'array di tipo punto
			
			punti[0] = new Punto(0, 0);
			/*
			 * sempre associando un'array auna scatola ,
			 * dentro la scatolina con indice 0 , stiamo inserendo un nuovo punto che rappresenta l'asse cartesiano "new Punto(0,0);" , con le due coordinate
			 * ciò significa che i valori (0,0) vanno a finire rispettivamente in PX e PY
			 * di conseguenza saranno assegnati a "x e y"
			 */
			
			punti[1] = new Punto(1, 2);
			/*
			 * abbiamo creato un'altro punto con valori (1, 2)
			 * cioè immaginado sempre l'asse cartesiano, ci stiamo spostando di 1 unità verso destra e di 2 unità verso l'alto
			 * anche in questo caso finiscono in pX e pY , che poi verranno associati al valore x e y
			 * 
			 */
			punti[2] = new Punto(3, 3);
			punti[3] = new Punto(3, 4);
			punti[4] = new Punto(6, 8);
			punti[5] = new Punto(5, 3);
			// con gli array possiamo usare stringhe , tipi primitivi, ma possiamo anche usare tipi dedotte da nostre classi
			
			System.out.println(punti[0]); // srivendolo in questo modo stiamo chiedendo di mostrarci il reference associato (classArray.Punto@7aec35a)
			
			//System.out.println("punti[0].x: " + punti[0].x); // scrivendolo in questo modo vedremo il valore associato alla coordinata x
			//System.out.println("punti[0].y: " + punti[0].y); // stessa cosa per vedere le coordinate associate alla y
			// in stampa troveremo 0.0  , perche sono di tipo booleano
			 
			for ( int i = 0; i < punti.length; i++) 
			{
				System.out.println();
				System.out.println("Punto corrente");
				
				System.out.println("punti[" + i +"].x: " + punti[i].x);
				System.out.println("punti["+ i +"].y: " + punti[i].y);
			}
			// attraverso una classe personalizzata abbiamo sfruttato gli array
			
			System.out.println();
			System.out.println("10--------------------------");
			System.out.println();
			
			Punto[] punti2 = {
					new Punto(0, 0), 
					new Punto(1, 2),
					new Punto(3, 3),
					new Punto(3, 4),
					new Punto(6, 8),
					new Punto(5, 3)
					};
			/*
			 * questo è un'altro modo per scrivere un'array
			 * se notiamo che scrivendolo su una riga , la riga diventa lunga e di conseguenza difficile da leggere,
			 * possiamo spezzettare il codice andando a capo e quindi renderlo più leggibile
			 */
			
			for ( int i2 = 0; i2 < punti.length; i2++) 
			{
				System.out.println();
				System.out.println("Punto corrente");
				
				System.out.println("punti[" + i2 +"].x: " + punti[i2].x);
				System.out.println("punti["+ i2 +"].y: " + punti[i2].y);
			}
			
		/*se volessimo ottenere un'altro array che contenga	tanti punti qunati sono quelli di punti e punti2
		 * dove ogni punto deve avere le coordinate che sono le somme delle rispettive coordinate dei punti ai rispettivi indici degli altri array
		 */
			
			System.out.println();
			System.out.println("11--------------------------");
			System.out.println();
			
			Punto sommaPunti[] = new Punto[6];
			
			sommaPunti[0] = new Punto(punti[0].x + punti2[0].x, + punti[0].y + punti2[0].y);
			/*abbiamo creato un nuovo punto da associare al nostro terzo array(sommaPunti)  (sommaPunti[0] = new Punto)
			 * la x di questo nuovo punto deve essere la somma delle x di punti e punti2    (punti[0].x + punti2[0].x,)
			 * è come se stessimo tenedo in cosiderazione : punti[0] = new Punto(0, 0); il primo zero  cioè il primo valore associato alla x
			 * quindi la somma di punti e punti2 la possiamo associare alla x
			 * in questo caso sarà punti[0] cioè 0 + punti2[0] cioè 0
			 * quindi nella prima parte la loro somma è zero
			 * con la virgola separiamo la x con la y
			 * e procediamo alla somma delle y cioè punti2[0] e punti2[0]
			 * 
			 */
			/*
			 * double newx = punti[0].x + punti2[0].x;      // mettiamo in delle variabili le porzioni di codice per renderlo più intuitivo
		       double newy =  punti[0].y + punti2[0].y;     // stessa cosa per la y 
			   sommaPunti[0] = new Punto(newx, + newy);     // come vediamo il codice diventa molto più leggibile
			*/
			//possiamo scriverlo in questo modo per renderlo più leggibile
			
		/*	double newx = punti[0].x + punti2[0].x;
			double newy =  punti[0].y + punti2[0].y; 
			sommaPunti[0] = new Punto(newx, + newy); 
			
			System.out.println("sommaPunti[0].x: " + sommaPunti[0].x);
			System.out.println("sommaPunti[0].y: " + sommaPunti[0].y);
			
			newx = punti[1].x + punti2[1].x; 
			newy = punti[1].y + punti2[1].y;
			sommaPunti[1] = new Punto(newx, + newy); 
			
			System.out.println("sommaPunti[1].x: " + sommaPunti[1].x);
			System.out.println("sommaPunti[1].y: " + sommaPunti[1].y);*/
			
			for( int i= 0; i < sommaPunti.length; i++)
			{
				double newx = punti[i].x + punti2[i].x; 
				double newy = punti[i].y + punti2[i].y;
				sommaPunti[i] = new Punto(newx, + newy); 
				
				System.out.println("sommaPunti[i].x: " + sommaPunti[i].x);
				System.out.println("sommaPunti[i].y: " + sommaPunti[i].y);
				System.out.println();
			}
			
	}
	

}
