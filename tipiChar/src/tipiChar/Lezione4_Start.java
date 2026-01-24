package tipiChar;

import java.util.Scanner;

public class Lezione4_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		boolean isEven = true;
		boolean isOdd = false;
		
		System.out.println("isEven: " + isEven);  //stampa il contenuto di isEven
		System.out.println("isOdd: " + isOdd);   // stampa il contenuto di isOdd
		
		//if (isEven == true) {     // è vero che nella variabile isEven è associato il valore true?
		if (isEven) { // è una short cut per scrivere la stessa cosa
			System.out.println("il numero è pari");  // se è vero che è associato true scrivi è pari
			}
		else {
			System.out.println("il numero è dispari");  // altrimenti scrivi è dispari
		}
		
		if (isEven != true) { // è vero che nella variabile isEven è diverso da true?
			System.out.println("il numero è dispari"); //se è vero scrivi è dispari
			
		}else {
			System.out.println("il numero è pari"); // altrimenti scrivi è pari
		}
		
		//2
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		// con il tipo char andiamo ad utilizzare un carattere;
		// al posto delle virgolette come una stringa si usano gli apici;
		// il tipo char sfrutta 2 byte;
		
		char char1 = 'a';
		char char2 = '?';
		char char3 = '2';
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		System.out.println("char3: " + char3);
		
		char charMin = Character.MIN_VALUE;
		char charMax = Character.MAX_VALUE;
		
		System.out.println("charMin: " + charMin);
		System.out.println("charMax: " + charMax);
		
		// come risultato non si vedrà nulla ma sono i caratteri numerici associati ai codici numerici 0 e 65535 cioè il più piccolo e il più grande gestibile da 2 byte
		// non si vedono perche non sono stampabili
		
		System.out.println("charMin (int): " + (int) charMin); //usando questa sintassi si può mostrare il codice numerico
		System.out.println("charMax (int): " + (int) charMax);
		
		// con il link " https://www.ssec.wisc.edu/~tomw/java/unicode.html#x0000 " possiamo vedere a cosa corrisponde il codice numerico del char
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		char char4 = 'a';

		System.out.println(char4 + " " + (int) char4); // sto chiedendo alla console: mi fai vedere il contenuto di char4?
	                                                   // poi ho creato lo spazio con le virgolette per distanziare
		                                               // infine mostrami il valore numerico associato al carattere.
		
		// il risultato è a 97 , dove a sta per il carattere e 97 è il valore numerico associato al carattere.
		
		System.out.println(97 + " " + (char) 97); // e possibile associare un numero ad un carattere.
		                                          // partendo da un valore numerico chiedo di valutare in chiave char il numero 97
		
		char char5 = (char) (char4 + 1); // in questo caso sto sommando a char4 un 1  
		                                 // scrivendolo con questa sintassi con (char) come casting e poi (char4 + 1) come operazione
		
		System.out.println("char5 : " + char5);
		// in pratica ci da la possibilità di accedere ad altre lettere utilizzando il numero associato a char
		
		System.out.println();
		System.out.println("4--------------------------");
		System.out.println();
		
		char char7 = '\u0061'; // quando vediamo un codice con u seguito da 4 cifre vuol dire che stiamo parlando di numeri esadecimali
		char char8 = '\u03F1';
		char char9 = '\u0000';
		char char10 = '\u0030';
		
		// a differenza del sistema binario che si usa la potenza del 2 , qui si usa la potenza del sedici per calcolare. 
		// si parte da destra e si sommano le potenze del 16
		/* nel caso  di 0x0061 , la prima potenza è 16^0 che fa 1 , poi 1*1 che fa ancora 1  e lo metto da parte
		 * passiamo al secondo numero , 16 ^ 1 = 16 , 16 * 6 = 96 , + 1 di prima = 97  */  
		
		System.out.println("char 7: " + char7);
		System.out.println("char 8: " + char8);
		System.out.println("char 9: " + char9);
		
		System.out.println(char9 == Character.MIN_VALUE); // è vero che il carattere char9 è uguale al carattere MIN_VALUE?
		
		System.out.println("char 10: " + char10); // come risultato ci darà lo 0. da non confondere con lo zero null.
		                                          // è il numero associato al carattere 0
		

		System.out.println();
		System.out.println("5--------------------------");
		System.out.println();
		
		for (int counter = 0; counter <11; counter++) { 
			System.out.println(counter); }
			// nel comando for viene eseguita la prima iastuzuine( int counter = 0) una volta sola. un int dal nome counter inizializzata con il valore 0
			// la seconda istruzione è come un'if inglobato , è vero che il valore di counter è minore di 11? , allora viene esuito il contenuto delle parentesi graffe.
			// la terza istruzione ( counter++) vuol dire che viene incrementato di 1 il valore di counter.
			// essendo variato il contenuto di counter ci riporta alla seconda istruzione ma con il valore 1, è vero che counter (1) è minore di 11?
			// fino a quando non diventa false non esce dal ciclo.
		
		
	
		for (int counter2 = 10; counter2 >= 0; counter2--) {
		System.out.println(counter2); }
		//come prima viene eseguita una volta sola la variabile ( int conter2 = 10)
		// si passa alla seconda istruzione che chiede: è vero che counter2 è aggiore o uguale a 10? ,  allora viene eseguito il valore delle parentesi graffe.
		//con la terza istruzione (counter2 -- ) vuol dire che al counter 2 viene sottratto 1.
		// essendo che counter è cambiato si riapte dalla seconda istruzione , ma con il valore 9, è vero che 9 è maggiore o uguale di 0? 
		//fino a quando non diventa false non esce dal ciclo.
		
		
		
		
		for (int counter3 = 0; counter3 < 11; counter3++ ) {  //è vero che countere è minore di 11?
			if ((counter3 % 2) == 0) {  // è vero che counter3 %(modulo) 2 è uguale a 0? il resto di counter è uguale a 0? ottenedo il resto di una divisione intera , è vero che il suo resto è uguale a 0?
				System.out.println(counter3 + "  è pari"); // se è vero , allora esegui questo
			}
			else { //altrimenti
				System.out.println(counter3 + "  è dispari"); // se non è vero , esegui questo
			}
		   }
		
		System.out.println();
		System.out.println("5.1--------------------------");
		System.out.println();
		
		// il ciclo whiile
		
		/*int i = 0; // creiamo una variabile i , a cui viene assegnato il valore 0
		
		while (i < 11)  //è vero che i è minore di 11? se è vero allora viene eseguito il contenuto delle parentesi graffe
		{	
		 System.out.println(i); // stampa il contenuto della variabile i
        
        i++; } // incrementa di 1*/
       
		//una volta che si è incrementato di 1 il ciclo riparte da : (i < 11) e riformula la stessa domanda ma con i incrementato di 1
		
		System.out.println();
		System.out.println("6--------------------------");
		System.out.println();
		// ciclo for con char
		for (int c = 'A'; c <= 'Z'; c++) { // nel primo comando stiamo associando alla variabile c , che è un int , il valore numerico di 'A'
	                                       // nel secondo comando chiediamo se è vero che il valore numerico della variabile c ('A') è minore o uguale al valore numerico corrispondente a 'Z'	
			                               // se è vero che è minore allora mi svolgi quello che è nelle parentesi graffe
			                               // con il terzo comando mi incrementi di 1
			System.out.println("il codice numerico decimale " + c + " corrisponde al carattere: " + (char) c); // ci farà vedere il valore numerico di c , e nella seconda parte ci dirà il carattere corrispondente
		    
		    System.out.println();
		    
		    System.out.println("il codice numerico esadecimale " + Integer.toHexString(c) + " corrispondente al carattere: " + (char) c); //con questo comando possiamo vedere il codice numerico in esadecimale e il suo corrispondente in carattere
		    
		    System.out.println();
		}
	 // il valore numerico di c è di 65 mentre il valore numerico di z è 90.
	// quindi il secondo comando è 65 è minore di 90? (c <= 'Z')
		
		System.out.println();
		System.out.println("7--------------------------");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in); // definisco l'oggetto scanner che è in grado di leggere l'imput della tastiera.
		
		System.out.println("inserisci una lettera: "); // con questa istruzione metto questo messaggio , e dico all'utente cosa deve fare.
		
		char currentChar = scanner.next().charAt(0); //l'ogetto scanner va a recuperare la porzione di testo inserito dall'utente , in questo caso solo il primo carattere.(charAt(0)
		                                             // anche se l'utente scrive una parola , prende solo il carattere alla posizione 0
		System.out.println("currentChar: " + currentChar); // stampa il carattere currentChar
		
		char charUp = Character.toUpperCase(currentChar); //serve per convertire la lettera nella sua variante maiouscola. anche se la scrivo in minuscolo , viene convertita in maiuscolo
		
		System.out.println("charUp: " + charUp);
		
		if(Character.isLetter(charUp) == true) { // serve per valutare se effettivamente stiamo valutando una lettera o un simbolo.
		                                         // se l'oggetto inserito dall'utente è una lettera allora puoi procedere con quello che è dentro le parentesi graffe
			 if (charUp == 'A' || charUp == 'E' || charUp == 'I' || charUp == 'O' || charUp == 'U')  { // se la lettera inserita dall'utente è uguale ad 'A' oppure ad 'E' oppure 'I' oppure 'O' oppure 'U' allora esegui quello che viene nelle parentesi graffe
		    System.out.println(charUp + " è una vocale");
			 }
			 else {
				 System.out.println(charUp + " è una consonante"); // altrimenti esegui questo
				 
			 }
			System.out.println("si, " + charUp + " è una lettera dell'alfabeto");}
		  
		else {
			System.out.println("no, " + charUp + " non è una lettera dell'alfabeto"); // altrimenti se non è una lettera ed è un numero o un simbolo allora , esegui questo
		}
		scanner.close();
		
		
		System.out.println();
		System.out.println("8--------------------------");
		System.out.println();
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("inserisci una lettera minuscola: ");
		
		char currentChar1 = scanner1.next().charAt(0);
		char charUpper = '?';
		
		System.out.println("currentChar1 " + currentChar1);
		
		scanner1.close();
		
		if (Character.isLowerCase(currentChar1) == true) { // se la lettera inserita è minuscola allora esegui quello che c'è nelle graffe
			charUpper = (char) (currentChar1 - 32); // prendo il numero associato alla lettera minuscola e gli sottraggo 32
			                                        // il valore che otteniamo è la controparte maiuscola. in pratica cambia la lettera da minuscola a maiuscola
			                                        
			System.out.println("charUpper: " + charUpper);
		}
		else {
			System.out.println(currentChar1 + " non è una lettera minuscola.");
			
		}
	}
         }

