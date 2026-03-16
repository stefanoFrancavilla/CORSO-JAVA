package incapsulamentoDeiDati;

public final class Cantautore extends Cantante {
/*
 * dal momento in cui cantante è una classe sealed , impone alla classe 
 * cantautore di usare solo final o sealed.
 * non può in nessun caso essere una classe normale 
 * quindi dobbiamo per forza di cose dichiararla come final o sealed,
 *  altrimenti avremmo un errore di compilazione.
 */
	
	//variabili d'istanza
	
	private String[] titoliCanzoniScritte;
	private byte contatoreCanzoniScritte;
	
	//costruttore
	
	public Cantautore() {
		this("ND","ND",Sesso.SCONOSCIUTO);
		System.out.println("Cantautore(0)");
	}
	
	public Cantautore(String nome, String cognome, Sesso sesso) {
		super(nome, cognome, sesso);
		
		System.out.println("Cantautore(3)");	
		this.inizializzaTitoliCanzoniScritte();
		//ogni volta che viene creato un cantautore , ha la posibilità di creare al massimo 10 canzoni
		
		this.setContatoreCanzoniScritte((byte)0);
		//il contatore ci serve per tenere traccia di quante canzoni ha scritto il cantautore, 
		//in modo da non superare il limite di 10 canzoni
	}


	
	//metodi getter/setter

	public byte getContatoreCanzoniScritte() {
		return contatoreCanzoniScritte;
	}

	public void setContatoreCanzoniScritte(byte contatoreCanzoniScritte) {
		this.contatoreCanzoniScritte = contatoreCanzoniScritte;
	}
	
	private void inizializzaTitoliCanzoniScritte() {
		titoliCanzoniScritte = new String[3];
	}
	
	public void aggiungiTitoloCanzoneScritta(String titolo) {
		
		if(contatoreCanzoniScritte < titoliCanzoniScritte.length )
		{
		titoliCanzoniScritte[contatoreCanzoniScritte] = titolo;
		contatoreCanzoniScritte++;
		}
		else
		{
			System.out.println("Arrey piena. Miglioreremo con le collection");
	    }
		
	}
	
	public void stampaTitoliCanzoniScritte() {
		
		StringBuilder sb = new StringBuilder();
		/*
		 * con String Builder posso creare una stringa in modo più efficiente,
		 * rispetto a concatenare le stringhe con l'operatore +, che crea una nuova stringa ogni volta,
		 * cioe ci da la possibilità di creare una stringa in modo più efficiente,
		 *  senza dover creare una nuova stringa ogni volta che concatenamo una nuova stringa.
		 */
		
		for(int i = 0; i < contatoreCanzoniScritte; i++)
		{
			if(titoliCanzoniScritte[i] != null) // se il titolo della canzone è diverso da null
			{
				sb.append(titoliCanzoniScritte[i]);//allora posso agganciare il titolo della canzone alla stringa che sto costruendo con StringBuilder
				//sb.append(", ");//aggiungo una virgola e uno spazio dopo ogni titolo di canzone, per separare i titoli delle canzoni
			}
			else
			{
				break;
			}
			if (i< titoliCanzoniScritte.length - 1)
			{
				// se i è minore della lunghezza dell'array - 1,
				/*
				 *  con questo  controllo if (i< titoliCanzoniScritte.length - 1) , siginfica che se i è minore della lunghezza dell'array - 1,
				 *   allora posso aggiungere una virgola e uno spazio dopo il titolo della canzone,
				 *   
				 *   se supponiamo di avere 3 canzoni scritte, e i è uguale a 0, allora posso aggiungere una virgola e uno spazio dopo il titolo della prima canzone,
				 *   mentre se i è uguale a 2 (che è l'ultima posizione dell'array), 
				 *   allora non posso aggiungere una virgola e uno spazio dopo il titolo della terza canzone, perchè sarebbe l'ultima canzone scritta, 
				 *   e non ci sarebbe bisogno di separare i titoli delle canzoni con una virgola e uno spazio.
				 */
			
			if(titoliCanzoniScritte[i + 1] != null)// se alla posizione i + 1 c'è un titolo di canzone diverso da null, 
				//allora posso aggiungere una virgola e uno spazio dopo il titolo della canzone
			{
				sb.append(", ");//aggiungo una virgola e uno spazio dopo ogni titolo di canzone
			}
		  }
			
			
	   }
		
		System.out.println(sb.toString());
	}
}
