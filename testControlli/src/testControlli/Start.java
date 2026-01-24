package testControlli;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		int n1 = 10;
		int n2 = 10;
		
		if (n1 == n2)
		{
			System.out.println("Si, i 2 valori sono uguali");
        }
		else
			
		{
			System.out.println("No, i 2 valori sono diversi");
		}
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		int n3  = 24;
		
		if (n3 == 10)
		{
			System.out.println("Si, il valore scelto è 10");	
		}
		else if(n3 == 20)
		{
			System.out.println("Si, il valore scelto è 20");
		}
		else if(n3 == 30)
		{
			System.out.println("Si, il valore scelto è 30");
		}
		else if(n3 == 100)
		{
			System.out.println("Si, il valore scelto è 100");
		}
		else 
			{
				System.out.println("Il valore scelto è un'altro");
			}
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		
	int anni  = 80;
	String messaggio;
	messaggio = verificaNumero(anni); 
	System.out.println("messaggio: " + messaggio);
	
	
	anni = 20;
	messaggio = verificaNumero(anni); // a messaggio stiamo assegnando il valore restituito da verificaNumero , in questo caso stiamo passando 80
	System.out.println("messaggio: " + messaggio);
	
	System.out.println();
	System.out.println("4--------------------------");
	System.out.println();
	 
	String titolo = "THE TWO TOWERS";

	
    messaggio = verificaTitolo(titolo); 
    System.out.println("messaggio: " + messaggio);


    titolo = "THE WINDS OF WINTER";
    messaggio = verificaTitolo(titolo); 
    System.out.println("messaggio: " + messaggio);
	
    
    System.out.println();
	System.out.println("5--------------------------");
	System.out.println();
	
	String colore = "Marroncino";
	messaggio = verificaColore(colore);
	System.out.println("messaggio: " + messaggio);
	
	
	
	messaggio = verificaColore2(colore);
	System.out.println("messaggio: " + messaggio);
	
	
	colore = "Azzurro";
	messaggio = verificaColore2(colore);
	System.out.println("messaggio: " + messaggio);
	
	    System.out.println();
		System.out.println("6--------------------------");
		System.out.println();
	
		    titolo = "THE TWO TOWERS";
		    messaggio = verificaTitolo2(titolo); 
		    System.out.println("messaggio: " + messaggio);


		    titolo = "THE WINDS OF WINTER";
		    messaggio = verificaTitolo2(titolo); 
		    System.out.println("messaggio: " + messaggio);
		    
		    
		    System.out.println();
			System.out.println("7--------------------------");
			System.out.println();
	
			Pianeti pianeta = Pianeti.SATURNO;
			
			if(verificaPianeta(pianeta) == true)
			{
				System.out.println(pianeta + " é nel sistema solare");
			}
			else
			{
				System.out.println(pianeta + " non è nel sistema solare");
			}
			
			Pianeti esopianeta = Pianeti.GLIESE_667CC;
			
			if(verificaPianeta(esopianeta) == true)
			{
				System.out.println(esopianeta + " é nel sistema solare");
			}
			else
			{
				System.out.println(esopianeta + " non è nel sistema solare");
			}
			
			    System.out.println();
				System.out.println("7.1--------------------------");
				System.out.println();
				
				pianeta = Pianeti.SATURNO;
				ottieniMessaggioPerTipoDiPianeta(pianeta);
				System.out.println(	ottieniMessaggioPerTipoDiPianeta(pianeta));
				
				pianeta = Pianeti.GIOVE;
				System.out.println(	ottieniMessaggioPerTipoDiPianeta(pianeta));
				
				esopianeta = Pianeti.GLIESE_667CC;
				System.out.println(	ottieniMessaggioPerTipoDiPianeta(esopianeta));
				
				esopianeta = Pianeti.KEPLER_438B;
				System.out.println(	ottieniMessaggioPerTipoDiPianeta(esopianeta));
			
			    System.out.println();
				System.out.println("8--------------------------");
				System.out.println();
				
				Devices device = Devices.PC;   // a device è stato assegnato, dalla lista della funzione devices , PC
				messaggio = verificaDevice(device); // in questo caso verificaDevice(device) contiene PC.
				                                    // quindi a messaggio verrà assegnato la stringa con il case PC
				
				System.out.println("messaggio: " + messaggio);
				
				device = Devices.TABLET;
				messaggio = verificaDevice(device);
				
				System.out.println("messaggio: " + messaggio);
				
				    System.out.println();
					System.out.println("9--------------------------");
					System.out.println();
				
					for (Pianeti pianetaCorrente : Pianeti.values()) 
					{
						System.out.println("pianetaCorrente: " + pianetaCorrente);
					}
					/*
					 * in questo ciclo foreach abbiamo definito una variabile chiamata pianetaCorrente 
					 * questa variabile viene definita per ogni iterazione che viene fatta dal ciclo
					 * ad ogni iterazione del ciclo va a contenere una delle costanti presenti nell'enumerazione Pianeti
					 * con il codice Pianeti.values abbiamo la possibilità di inserire nella variabile PianetaCorrente tutte le costanti presenti nella funzione Pianeti
					 * 
					 */
					
					    System.out.println();
						System.out.println("10--------------------------");
						System.out.println();
					
						titolo = "THE FELLOWSHIP OF THE RING";  // assegniamo il volore alla variabile titolo: (THE TWO TOWERS)
						messaggio = verificaTitoloConFreccia(titolo); //vogliamo che nella variabile messaggio vada finire la funzione verificaTitolo con il valore di titolo
						System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
						
						titolo = "A DANCE WITH DRAGONS";
						messaggio = verificaTitoloConFreccia(titolo);
						System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
						
						
						System.out.println();
						System.out.println("11--------------------------");
						System.out.println();
						
						titolo = "THE RETURN OF THE KING";  
						messaggio = verificaTitoloEspressione(titolo); 
						System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
						
						titolo = "A DANCE WITH DRAGONS";
						messaggio = verificaTitoloEspressione(titolo);
						System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
					
						System.out.println();
						System.out.println("12--------------------------");
						System.out.println();
						
						titolo = "THE RETURN OF THE KING";  
						messaggio = verificaTitoloEspressione(titolo); 
						System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
						
						titolo = "A DANCE WITH DRAGONS";
						messaggio = verificaTitoloEspressione(titolo);
						System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
						
						System.out.println();
						System.out.println("13--------------------------");
						System.out.println();
						 pianeta = Pianeti.VENERE;
						
						if(verificaPianeta2(pianeta) == true)
						{
							System.out.println(pianeta + " é nel sistema solare");
						}
						else
					
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
	
	} // in questo caso siamo usciti dalla main 
	// la funzione scritta sotto userà i parametri assegnati sopra
	
	public static String verificaNumero(int n) //verificaNumero è l'identificatore che ci da la possibilità di richiamare questa funzione all'interno del nostro programma
	{              // in quest caso il valore di n sarà 80
		String messaggio;
		
		switch(n) // con lo switch stiamo chiedendo: è n = a 80?
		{                   //una volta ricevuto in imput dalla funzione n un intero, in base al suo valore la funzione switch valuta i vari casi
		/*
		 *  con la sintassi semplice sarebbe:
		 *  nel caso  in cui il valore di n sia uguale a 20,
		 *  allora associo alla variabile messaggio , il testo : "il numero scelto è 20"
		 *  break bisogna leggerlo come un'altrimenti. 
		 *  break , e parto con il caso successivo.
		 */
		
		case 20:  // nel caso fosse 20
			messaggio = "il numero scelto è 20"; // allora messaggio assume questo valore
			break; // altrimenti
			
		case 40:
			messaggio = "il numero scelto è 40";
			break;
			
		case 60:
			messaggio = "il numero scelto è 60";
			break;
			
		case 80:
			messaggio = "il numero scelto è 80";
			break;
		
		default:
			messaggio = "se non è tra i numeri scelti, finisci qui"; // nel momento in cui il valore di n non è stato menzionato nei casi precedenti 
			break;
		}
		return messaggio;  // con questo comando stiamo restituendo il valore di messaggio; il messaggio varierà a seconda del case o del default in base al valore di n
	}
	
	public static String verificaTitolo(String titolo)
	{
		titolo = titolo.toUpperCase(); // per ovviare a ad errore tra minuscolo e maiuscolo con questo comando stiamo trasformando tutte le parole in maiuscolo
		String autore = " Non disponibile"; // abbiamo creato questa variabile nel caso in cui non siamo riusciti a trovare l'autore 
		
		switch(titolo)
		{
		/*
		 * in questo caso lo abbiamo scritto in questo modo, perchè ha come punto in comune lo stesso autore.
		 * nell'esercizio precedente ad ogni caso abbiamo scritto: il caso e l'istruzione che doveva eseguire lo switch ,qualora fosse il caso corretto.
		 * in questo esercizio il break viene messo alla fine poichè il processo non si fermi ad ogni caso ma cotinui anche se abbiamo trovato il testo.
		 * una volta trovato il testo alla String autore viene assegnato quel valore
		 * questo sistema viene usato per non ripetere più voplte la stessa cosa
		 */
		case "THE FELLOWSHIP OF THE RING":
		case "THE TWO TOWERS":
		case "THE RETURN OF THE KING":
			autore = "J. R. R. TOLKIEN";
			break;
			// quindi se uno di questi titoli citati è il titolo che stiamo cercado , allora autore assume un valore diverso
		case "A GAME OF THRONES":
		case "A CLASH OF KINGS":
		case "A STORM OF SWORDS":
		case "A FEAST FOR CROWS":
		case "A DANCE WITH DRAGONS":
		case "THE WINDS OF WINTER":
		case "A DREAM OF SPRING":
			autore = "GEORGE R. R. MARTIN";
			break;
			
			default:  // Al default non abbiamo inserito nulla perchè di base abbiamo impostato ad autore non disponibile.
				      // Nel momento in cui non trova l'autorer nei casi precedenti di default , autore rimane al valore iniziale cioè: " Non disponibile"
				      // Con default stiamo dicendo che : se le condizioni dei casi precedenti non si sono verificate, allora...
				      // il default è la condizione finale dello switch
				break;
		}
		
		return autore;  // l'errore che si genera su: public static String verificaTitolo(String titolo) , è dovuto alla assenza di return
		// con return stiamo restituendo alla funzione una stringa, cioè dopo i vari casi che abbiamo valutato il risultato ottenuto lo mandiamo alla funzione
		// return si inserisce FUORI dallo switch.
		
		}
	
	   public static String verificaColore(String colore)
	   {
		   colore  = colore.toUpperCase();
		   String messaggio;
		   
		   switch(colore)
		   {
		   case "Rosso":
			   messaggio = "Il rosso è un colore molto caldo.";
			   break;
			   
		   case "Verde":
			   messaggio = "Il verde è il colore della speranza.";
			   break;
			   
		   case "Giallo":
			   messaggio = "Il giallo mi ricorda il sole e i limoni.";
			   break;
			   
		   default:
			   messaggio = "Il colore scelto è ancora da implementare.";
			   break;
		   }
		   return messaggio;
	   }
	   public static String verificaColore2(String colore)
	   {
		   colore  = colore.toUpperCase();
		   String messaggio;
		   
		   switch(colore)
		   {
		   case "ROSSO":
		   case "GIALLO":
		   case "MARRONCINO":
		   case "ARANCIONE":   
		   case "VERDE":
			   messaggio = "Il colore scelto è caldo";
			   break;
			   
		   case "AZZURRO":
		   case "BLU":
		   case "VERDE ACQUA":
			   messaggio = "Il colore scelto è freddo.";
			   break;
			   
		   default:
			   messaggio = "Il colore scelto non si sa se sia freddo o caldo.";
			   break;
		   }
		   return messaggio;
   }
	   public static String verificaTitolo2(String titolo)
		{
			titolo = titolo.toUpperCase(); 
			String autore = " Non disponibile";
			
			switch(titolo)
			{
	
			case "THE FELLOWSHIP OF THE RING", "THE TWO TOWERS",  "THE RETURN OF THE KING":  // scrivendo la funzione in questo modo abbiaqmo compattato il codice rendendolo più semplice da scrivere
				autore = "J. R. R. TOLKIEN";                                                 // usando la virgola possiamo concatenare più casi sulla stessa riga e quindi recuperare lo spazio
				break;
			
			case "A GAME OF THRONES", "A CLASH OF KINGS", "A STORM OF SWORDS",
			"A FEAST FOR CROWS","A DANCE WITH DRAGONS", "THE WINDS OF WINTER",
		    "A DREAM OF SPRING":
				autore = "GEORGE R. R. MARTIN";
				break;
				
				default:  
					break;
			}
			
			return autore;  
			
  }
	   
	   public static boolean verificaPianeta(Pianeti pianeta)  // la funzione verificaPianeti accetta uno dei pianeti definiti dalla enumerazione 
	   {                                                       // una volta verificato ci restituisce un valore true o false a seconda se il pianeta faccia parte o meno del sistema solare
		   boolean nelSistemaSolare = false;
		   
		   switch(pianeta)
		   {
		   case MERCURIO:
		   case VENERE:
		   case TERRA:
		   case GIOVE:
		   case SATURNO:
		   case URANO:
		   case NETTUNO:
			   nelSistemaSolare = true;
			   break;
			   
		   case GLIESE_667CC:
		   case KEPLER_438B:
			   break;
			   
		   default:
			   break;
			      
		   }
		  return nelSistemaSolare;
	   }
	   
	   public static String ottieniMessaggioPerTipoDiPianeta(Pianeti pianeta)
	   {
		   String messaggio;
		   if(verificaPianeta(pianeta) == true)
			{
				messaggio = pianeta + " é nel sistema solare";
			}
			else
			{
				messaggio = pianeta + " non è nel sistema solare";
			}
		   
		   return messaggio;
	   }
	   public static String verificaDevice(Devices device) 
	   {
		   String messaggio;
		   
		   switch(device)
		   {
		   case PC:
			   messaggio = "questo è il computer di casa";
			   break;
			   
		   case SMART_PHONE, TABLET:
			   messaggio = "questo è un dispositivo mobile";
		       break;
		       
		   case MOUSE:
			   messaggio = "Serve per muovere il puntatore sul monitor.";
			   break;
			   
		   case KEYBOARD:
			   messaggio = "serve per scrivere su un documento elettronico.";
			   break;
			   
			default:
				messaggio = "device non riconosciuto.";
				break;
		   }
		   return messaggio;
		   
		   /*
		    *   public static boolean verificaPianeta(Pianeti pianeta)  // la funzione verificaPianeti accetta uno dei pianeti definiti dalla enumerazione 
	   {                                                       // una volta verificato ci restituisce un valore true o false a seconda se il pianeta faccia parte o meno del sistema solare
		   boolean nelSistemaSolare = false;
		   
		   switch(pianeta)
		   {
		   case MERCURIO:
		   case VENERE:
		   case TERRA:
		   case GIOVE:
		   case SATURNO:
		   case URANO:
		   case NETTUNO:
			   nelSistemaSolare = true;
			   break;
			   
		   case GLIESE_667CC:
		   case KEPLER_438B:
			   break;
			   
		   default:
			   break;
			      
		   }
		  return nelSistemaSolare;
	   }
	   
	   public static String ottieniMessaggioPerTipoDiPianeta(Pianeti pianeta)
	   {
		   String messaggio;
		   if(verificaPianeta(pianeta) == true)
			{
				messaggio = pianeta + " é nel sistema solare";
			}
			else
			{
				messaggio = pianeta + " non è nel sistema solare";
			}
		   
		   return messaggio;
	
-	alla funzione verificaPianeta , passiamo il valore di pianeta , in questo caso kepler
-   la funzione verificaPianeta , cerca nei vari case se il pianeta è presente nella funzione	
		    */
	   }
	   
	   public static String verificaTitoloConFreccia(String titolo)
	   
	   {
		   titolo = titolo.toUpperCase();
	       String autore;
			
			switch(titolo)
			{
	
			case "THE FELLOWSHIP OF THE RING", "THE TWO TOWERS",  "THE RETURN OF THE KING" -> autore = "J. R. R. TOLKIEN";                                                
				
			
			case "A GAME OF THRONES", "A CLASH OF KINGS", "A STORM OF SWORDS",
			"A FEAST FOR CROWS","A DANCE WITH DRAGONS", "THE WINDS OF WINTER",
		    "A DREAM OF SPRING" -> autore = "GEORGE R. R. MARTIN";
				
				
				default -> autore = "Non disponibile";
			}
			/*
			 * la sintassi di lettura della funzione è:
			 * nel caso in cui, il valore di titolo sia : THE FELLOWSHIP OF THE RING", "THE TWO TOWERS",  "THE RETURN OF THE KING,
			 * -> allora , vorrei che la variabile autore assumesse questo valore: J. R. R. TOLKIEN 
			 * 
			 * qualora invece il valore di autore sia : A GAME OF THRONES", "A CLASH OF KINGS", "A STORM OF SWORDS",
			"A FEAST FOR CROWS","A DANCE WITH DRAGONS", "THE WINDS OF WINTER",
		    "A DREAM OF SPRING"
		    
		    -> allora, vorrei che la variabile autore assumesse questo valore: GEORGE R. R. MARTIN
		    
		    se il valore di titolo è diverso dai casi precedenti, allora la variabile autore assume questo valore: Non disponibile
		    
		    con return autore stiamo restituendo il valore trovato dalla funzione.
			 */
			
			return autore;  
		  /*
		   * con questa funzione scritta in questo modo stiamo usando un modo si scrittura più moderno
		   * infatti al posto dei due punti che delimitano la fine del case ci abbiamo inserito una freccina
		   * per usare questo sistema dobbiamo eliminare i : e sostituirlo con la -> , dopodichè dobbiamo aggiungere la variabile autore.
		   * per questo modo di scrivere bisogna inoltre eliminare il break
		   * in pratica semplifichiamo il modo di scrivere con lo switch case.
		   */
	   }
  public static String verificaTitoloEspressione(String titolo)
	   
	   {
		   titolo = titolo.toUpperCase();
	      
		/*	//1.
		   String autore = switch(titolo) 
				   *
				    * Rispetto alla funzione precedente, abbiamo anteposto davanti allo switch la variabile autore.
				    * Precedentemente era una variabile da definire 
				    * Con l'operatore di assegnamento = stiamo chiedendo di assegnare alla variabile autore il valore ottenuto dal costrutto switch
				    * 
				    * Usando lo switch come espressione , valuterà sempre le stringhe proposte.
				    * nel momento in cui troviamo un matching con una delle stringhe proposte nei vari case, prende il valore assegnato dopo la -> e lo assegna alla variabile autore. 
				    *
			{
	
			case "THE FELLOWSHIP OF THE RING", "THE TWO TOWERS",  "THE RETURN OF THE KING" ->  "J. R. R. TOLKIEN";   // nel momento in cui troviamo una corrispondenza con uno dei titoli di questo caso,                                            
			                                                                                                         // automaticamente il valore di autore sarà :   "J. R. R. TOLKIEN"	
			
			case "A GAME OF THRONES", "A CLASH OF KINGS", "A STORM OF SWORDS",
			"A FEAST FOR CROWS","A DANCE WITH DRAGONS", "THE WINDS OF WINTER",
		    "A DREAM OF SPRING" ->  "GEORGE R. R. MARTIN";
				
				
				default ->  "Non disponibile";
			};
		   *
		    * a differenza della funzione precedente dobbiamo eliminare la variabile autore presente nella funzione.
		    * cioè (autore =) poichè stiamo chiedendio già in precedenza il valore della variabile autore. 
		    * visto che viene usata come un'espressione, dobbiamo aggiungere il ; alla fine delle parentesi graffe.
		    * cioè chiudiamo la condizione con un ; 
		    * 
		    * con questo sistema abbiamo ulteriormente ottimizzato e modernizato l'uso dello switch case.
		    *
	   
			return autore;  */
		   
		   //2.
		   String autore = switch(titolo) 
				   
				   /*
				    * in questo modo stiamo chiedendo di restituirci una o più istruzioni da eseguire , per arrivare poi ad elaborare quello che deve restituire la stringa autore.
				    * 
				    */
				   {
				   case "THE FELLOWSHIP OF THE RING", "THE TWO TOWERS",  "THE RETURN OF THE KING" ->  {
					  String autoreCorrente = "J. R. R. TOLKIEN";
					  System.out.println("Eseguo il case riferito a TOLKIEN");
					  yield autoreCorrente;
					  
					  /*
					   * yield si usa solo all'interno di un blocco.
					   * una volta trovato un matching con il case , viene eseguito il blocco di codice.
					   * 
					   * lo svolgimento è il seguente:
					   * memorizzo nella variabile autoreCorrente l'autore.
					   * mostro nella finestra di output il messaggio : ("System.out.println("Eseguo il case riferito a TOLKIEN")
					   * dopodichè con il comando yield restituiamo il valore dell'autoreCorrente alla variabile autore
					   * infine il valore di autore, con return , viene restituito nel punto in cui abbiamo chiamato la funzione ( nel main)
					   * 
					   * mentre nel main
					   * all'interno di messaggio verrà passato l'autore trovato
					   * quindi verrà mostrato con il comando: System.out.println(messaggio + " è l'autore del libro intitolato " + titolo + ".");
					   */
					  
				   }
				   
				   case "A GAME OF THRONES", "A CLASH OF KINGS", "A STORM OF SWORDS",
					"A FEAST FOR CROWS","A DANCE WITH DRAGONS", "THE WINDS OF WINTER",
				    "A DREAM OF SPRING" -> {
				    	 String autoreCorrente = "GEORGE R. R. MARTIN";
				    	 System.out.println("Eseguo il case riferito a MARTIN");
						 yield autoreCorrente;
				    }
				    
				    default ->  "Non disponibile";
				   };
				   return autore; 
				   /*
				    * con questa funzione possiamo eseguire più istruzioni nello stesso momento.
				    */
				    
 }
  
  public static String verificaTitoloEspressioneDuePunti(String titolo) 
  {
	  titolo = titolo.toUpperCase();
		 
		/* String autore = switch(titolo)
		{
		
		case "THE FELLOWSHIP OF THE RING":
		case "THE TWO TOWERS":
		case "THE RETURN OF THE KING": yield "J. R. R. TOLKIEN";
			
			
		case "A GAME OF THRONES":
		case "A CLASH OF KINGS":
		case "A STORM OF SWORDS":
		case "A FEAST FOR CROWS":
		case "A DANCE WITH DRAGONS":
		case "THE WINDS OF WINTER":
		case "A DREAM OF SPRING": yield "GEORGE R. R. MARTIN";
			
			
			default: yield "Non disponibile";
		};
		
		return autore;*/
		/*
		 * con la funzione scritta in questo modo stiamo sfruttando la sintassi a due punti e non con la freccia
		 * l'uso della freccia era consentito se dovevamo usare solo un'istruzione
		 * mentre con l'aggiunta di più istruzioni ( cioè in blocco) allora avevamo bisogno dello yield , anche se abbiamo usato la freccia.
		 * qualora non volessiomo usare la freccia, ma i due punti , allora siamo costretti ad usare lo yield
		 * stiamo usando il comando yield per restituire alla variabile autore, il risultato ottenuto dallo switch
		 * come nelle versioni precedenti delle funzioni , con il comando :  String autore = switch(titolo) , stiamo usando lo switch come un'espressione
		 * in questo caso stiamo usando un modo differente di eseguire la funzione.
		 */
	  // 2
	   
	  String autore = switch(titolo) 
			  /*
			   * nell'esercizio 12 abbiamo dato il valore a titolo: THE RETURN OF THE KING e nella seconda parte : A DANCE WITH DRAGONS
			   * quindi nella prima parte ha valore di: THE RETURN OF THE KING
			   * se la ricerca dello switch trova riscontro nei primi 3 case , allora eseguirà i comandi che ne seguono
			   * assegnerà come autore corrente J. R. R. TOLKIEN
			   * manderà a schermo :  Eseguo il case riferito a TOLKIEN
			   * e lo yield rimanderà l'autoreCorrente ad autore
			   * infine return autore, manderà il risultato ottenuto , dove è stata chiamata la funzione.
			   * 
			   * stessa cosa per la seconda parte , con titolo che ha valore: A DANCE WITH DRAGONS
			   */
				{
				
				case "THE FELLOWSHIP OF THE RING":
				case "THE TWO TOWERS":
				case "THE RETURN OF THE KING": 
					String autoreCorrente = "J. R. R. TOLKIEN";
					  System.out.println("Eseguo il case riferito a TOLKIEN");
					  yield autoreCorrente;
					
					
				case "A GAME OF THRONES":
				case "A CLASH OF KINGS":
				case "A STORM OF SWORDS":
				case "A FEAST FOR CROWS":
				case "A DANCE WITH DRAGONS":
				case "THE WINDS OF WINTER":
				case "A DREAM OF SPRING":
					 autoreCorrente = "GEORGE R. R. MARTIN";
			    	 System.out.println("Eseguo il case riferito a MARTIN");
					 yield autoreCorrente;
					
					
					default: yield "Non disponibile";
				};
				
				return autore;
  }
  public static boolean verificaPianeta2(Pianeti pianeta)  
  {                                                       
	  // boolean nelSistemaSolare = false;
	   
	  boolean nelSistemaSolare =switch(pianeta)
	   {
	   case MERCURIO, VENERE, TERRA, MARTE, GIOVE, SATURNO, URANO, NETTUNO -> true;
		   
		   
	   case GLIESE_667CC, KEPLER_438B -> false;
	   };
	  return nelSistemaSolare;
	  /*
	   * con questo sistema abbiamo usato una sintassi più semplice , usando lo switch come un'espressione.
	   */
}
}