package classAndReference;

public class Test {

//oltre ad avere le variabili nelle classi possiamo inserire anche degli oggetti

	//dentro la classe test abbiamo definito una funzione
	//una funzione è un blocco contenete un codice , che può essere eseguito qualora viene richiamata.
	
	public void modificaNumero(int n) {  //parametro: una variabile che rappresenta un dato in ingresso
		// in questo caso n che conterrà un valore nunmerico stabilito dal renge di int, verrà utilizzata nella esecuzione della funzione.
		// void significa che la funzione non restituisce niente
		
		System.out.println("n: " + n);   // in questa riga andiamo a chiedere il valore del parametro n
		
		n = 800; //aggiornamento di n
		
		System.out.println("n (dopo): " + n);  //quanto vbale n dopo l'aggiornamento?
		
		
	}

	
	public void modificaRefence(Calendario c) {
		System.out.println("c: " + c); // ci mostrerà l'indirizzo cotenuto in c  " c: classAndReference.Calendario@20ad9418 "
		System.out.println();
		
		c = new Calendario(); //dico a c , che in questo momento contiene una copia dell'indirizzo che avevamo creato(quartoAppuntamento) , gli associo un nuovo oggetto calendario.
		//in sostanza creiamo un'altro, dove creerà un nuovo indirizzo
		// aggiorniamo c senza andare ad alterare quartoApppuntamento
		System.out.println();
		System.out.println("c: " + c);
		
		//in questo caso a c sostituisco l'indirizzo , con un'altro indirizzo
		//ogni variabile aggiunta (es. quarto.Appuntamento)ha un'indirizzo diverso
		
	}
	public void modificaReference2 (Calendario c) {
		System.out.println("c 2: " + c);
		System.out.println();
		
		c.giorno = 11;
		c.mese = 7;
		c.anno = 2012;
		c.ora = 13;
		c.inizialeGiorno = 's';
		
		System.out.println("c 2: " + c);
		System.out.println();
		
		// in questo caso invece gli idirizzi coincidono, perchè in c troviamo la copia dell'indirizzo della variabile (es. quintoAppuntamento), quindi andiamo a modificare le proprietà di quell'oggetto
		
	}
 }
