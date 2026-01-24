package classAndReference;

public class lezione_5_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		short short1 = 1_000; // alla variabile di tipo short abbiamo dato valore 1000
		short1 = 2_000; // possiamo dire che nella variabile abbiamo cambiato il suo valore da 1000 a 2000.
		
		System.out.println("short 1: " + short1);
		
		final short short2 = 1_000; // con final , stabiliamo un valore alla variabile che non può essere modificato. final sancisce la definizione di una COSTANTE
		//short2 = 2_000;  // anche se proviamo a cambiarlo, il sistema ci da errore.
		
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		int int1 = 10; // assegniamo il valore 10 alla variabile int
		int int2 = int1; // int 2 va a prendere il valore numerico di int1,del valore 10
		
		// anche se int1 e int2 hanno valore 10, corrispondono a due aree di memoria differenti
		
		System.out.println("int1 " + int1);
		System.out.println("int2 " + int2);
		
		int2 = 20; // cambiando il valore ad int 2 , modifichiamo solo l'area di memoria di int2 senza intaccare int1
		
		System.out.println("int1 " + int1);
		System.out.println("int2 " + int2);
		
		
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		Calendario appuntamento  = new Calendario();                        //calendario viene trattata come una reference------
		// appuntamento viene trattato come una scatola con dentro tutte quelle variabili specificate in calendario. // l'operatore di assegnamento (=) va ad inserire quello che andremo a definire a sinistra sua e lo va ad inserire nella scatola appuntamento
		//con (new Calendario) io creo una nuova istanza , un nuovo oggetto dal template calendario
		// Calendario() ,  vuol dire fare riferimento al costruttore
		
		appuntamento.giorno = 20; 
		appuntamento.mese = 1;
		appuntamento.anno = 2023;
		appuntamento.ora = 17;
		appuntamento.anniDalBigBang = 14_000_000_000L;
		
		// abbiamo assegnato dei valori alle variabili della funzione Calendario
		
		System.out.println("--------------------------");
		
		System.out.println("appuntamento.giorno " + appuntamento.giorno);
	    System.out.println("appuntamento.mese " + appuntamento.mese);
	    System.out.println("appuntamento.anno " + appuntamento.anno);
	    System.out.println("appuntamento.ora " + appuntamento.ora);
	    System.out.println("appuntamento.minuti " + appuntamento.minuti);
	    System.out.println("appuntamento.secondi " + appuntamento.secondi);
	    System.out.println("appuntamento.frazioneDiGiorno " + appuntamento.frazioneDiGiorno);
	    System.out.println("appuntamento.frazioneDiAnno  " + appuntamento.frazioneDiAnno);
	    System.out.println("appuntamento.anniDalBigBang " + appuntamento.anniDalBigBang);
	    System.out.println("appuntamento.inizialeGiorno " +appuntamento. inizialeGiorno);
	    System.out.println("appuntamento.isDataDiNascita " + appuntamento.isDataDiNascita);
	    
	    
	    System.out.println();
		System.out.println("3.1--------------------------");
		System.out.println();
	    
		Calendario secondoAppuntamento = new Calendario(); // chiamando di nuovo la funzione costruttrice della classe (Calendario) , che mi produce una seconda istanza della classe.
		// con secondoAppuntamento creeremo una seconda istanza dove contengono tutte le variabili di Calendario , che possiamo modificare 
		// ripartono tutte con i valori assegnati nella classe ( in questo caso , ivalori numerici con 0 , e il char con null )
		
		secondoAppuntamento.giorno = 17;
		secondoAppuntamento.mese = 5;
		
		System.out.println("--------------------------");
		
		System.out.println("secondoAppuntamento.giorno " + secondoAppuntamento.giorno);
		System.out.println("secondoAppuntamento.mese " + secondoAppuntamento.mese);
		
	    System.out.println();
		System.out.println("3.2--------------------------");
		System.out.println();
		
		Calendario terzoAppuntamento = appuntamento; // la variabile terzoAppuntamento chiamerà la funzione calendario , ma con gli aggiornamenti di appuntamento
		// a terzoAppuntamento sto assegnando una copia del contenuto di appuntamento.sarà la funzione Calendario con i valori che abbiamo assegnato ad appuntamento 
		
		System.out.println("terzoAppuntamento.giorno " + terzoAppuntamento.giorno);
		System.out.println("terzoAppuntamento.mese " + terzoAppuntamento.mese); // in questo caso anche se l'output sarà uguale ad appuntamento 
		System.out.println("terzoAppuntamento.anno " + terzoAppuntamento.anno);
		
		terzoAppuntamento.mese = 18; // assegniamo un valore diverso 
		
		System.out.println("terzoAppuntamento.mese " + terzoAppuntamento.mese);
		System.out.println("appuntamento.mese " + appuntamento.mese);
		// con questo output andiamo a dimostrare che , modificando terzoAppuntamento il valore di appuntamento verrà modificato
		
		/*questo seccede perchè appuntamento ha salvato i dati modificati nell'istanza Calendario.
		 * nel momento che richiamiamo i valori di appuntamento ( Calendario terzoAppuntamento = appuntamento;) , si rivolge all'istanza Calendario.
		 * quindi quando alla variabile ( terzoAppuntamento.mese ) gli assegniamo il valore 18 che è diverso del valore originario di (appuntamento.mese) cioe 1
		 * andiamo a modificarlo direttamente nella istanza di Calendario , e di conseguenza modificheremo anche la variabile (appuntamento.mese) di appuntamento
		 * in parole povere appuntamento è un'indirizzo che ci porta all'istanza di calendario aggiornata, e quando andiamo andiamo a richiamare da terzoAppuntamento ,
		 * l'istanza di calendario di appuntamento , copierà anche il suo indirizzo, in sostanza sono la stessa area di memoria*/
		
		System.out.println();
		System.out.println("4--------------------------");
		System.out.println();
		
		Test test = new Test();    //richiamo l'oggetto test
		int int3 = 100;    // creo una variabile contenete il valore 100
		test.modificaNumero(int3);          // test è l'identificatore della variabile che contiene l'indirizzo che porta all'oggetto Test.
		// chiedo all'oggetto test di far eseguire la sua funzione modifica numero
		
		System.out.println("int3 vale: " + int3); 
		
		// quando passo il valore di int3 (100) , alla funzione (.modificaNumero) , accade che viene fatta una copia del valore di int3 , 
		// e viene copiato in n (int n), della funzione test.
		// anche se n ha lo steso valore di int3 (prima del suo aggiornamento a 800) , sono salvate su aree di memoria differente.
		// quindi anche se modifichiamo n , portandolo a 800 , il valore di int3 non viene modificato.
		
		
		System.out.println();
		System.out.println("5--------------------------");
		System.out.println();
		
		Calendario quartoAppuntamento = new Calendario();
		
		System.out.println("--------------------------");
		
		quartoAppuntamento.giorno = 20; 
		quartoAppuntamento.mese = 2;
		quartoAppuntamento.anno = 2023;
		quartoAppuntamento.ora = 18;
		quartoAppuntamento.minuti = 30;
		quartoAppuntamento.inizialeGiorno = 'v';
		
		System.out.println("quartoAppuntamento: " + quartoAppuntamento);
		System.out.println();
		System.out.println();
		
		test.modificaRefence( quartoAppuntamento);  // quartoAppuntamento contiene l'indirizzo dell'oggetto calendario
		// l'indirizzo copiato di quartoAppuntamento va a finire in c ( Calendario c)
		//quindi sia c , che quartoAppuntamento contengono una copia del medesimo indirizzo
		System.out.println();
		System.out.println();
		
		System.out.println("quartoAppuntamento (dopo): " + quartoAppuntamento); // dopo modifica reference mi dici quanto vale quartoAppuntamento?
		// con questo andiamo a dimostrare che è avvenuto un passaggio per copia dell'indirizzo , e aver modificato il valore di c non ha implicato nessuna alterazione di quartoAppuntamento
		System.out.println();
		System.out.println();
		
		System.out.println("L'appuntamento è per il "
				+  quartoAppuntamento.giorno
				+ "/"
				+ quartoAppuntamento.mese
				+ "/" 
				+ quartoAppuntamento.anno
				+", alle "
				+ quartoAppuntamento.ora
				+" e "
				+ quartoAppuntamento.minuti );
		
		
		
		System.out.println();
		System.out.println("6--------------------------");
		System.out.println();
		
		Calendario quintoAppuntamento = new Calendario ();
		
		System.out.println();
		System.out.println("--------------------------");
		
		
		quintoAppuntamento.giorno = 16;
		quintoAppuntamento.mese = 1;
		quintoAppuntamento.anno = 2023;
		quintoAppuntamento.ora = 19;
		quintoAppuntamento.minuti = 47;
		quintoAppuntamento.inizialeGiorno = 'l';
				
		System.out.println();
		System.out.println("quintoAppuntamento: " + quintoAppuntamento);
		System.out.println();
		
		
		System.out.println("L'appuntamento è per il "
				+  quintoAppuntamento.giorno
				+ "/"
				+ quintoAppuntamento.mese
				+ "/" 
				+ quintoAppuntamento.anno
				+", alle "
				+ quintoAppuntamento.ora
				+" e "
				+ quintoAppuntamento.minuti 
				+" L'iniziale del giorno è: "
				+quintoAppuntamento.inizialeGiorno
				+".");
		
		
		System.out.println();
		System.out.println("--------------------------");
		
		
		test.modificaReference2(quintoAppuntamento);  
		
		System.out.println();
		System.out.println("quintoAppuntamento: " + quintoAppuntamento);
		System.out.println();
		
		System.out.println("L'appuntamento è per il "
				+  quintoAppuntamento.giorno
				+ "/"
				+ quintoAppuntamento.mese
				+ "/" 
				+ quintoAppuntamento.anno
				+", alle "
				+ quintoAppuntamento.ora
				+" e "
				+ quintoAppuntamento.minuti 
				+" L'iniziale del giorno è: "
				+quintoAppuntamento.inizialeGiorno
				+".");
		
		//anche se c'è stata un'azione di modifica reference , il codice identificativo dell' oggetto test coincide con il codice avuto prima della modifica
		//l'oggetto calendario che facevamo riferimento , attraverso la variabile quinto appuntamento , è il medesimo oggetto , dopo che c'è stata un'azione di modificaReference2
		//sia quintoAppuntamento che c di Calendario c , contengono entrambe copie dello stesso indirizzo
		
	}

	
}
