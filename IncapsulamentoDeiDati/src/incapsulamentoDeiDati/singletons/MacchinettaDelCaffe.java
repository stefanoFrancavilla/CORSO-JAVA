package incapsulamentoDeiDati.singletons;

//1

//public class MacchinettaDelCaffe {
//	
//	private static MacchinettaDelCaffe instance = null; // istanza statica che conterrà l'unica istanza della classe
//
//	/*
//	 * abbiamo creato una prorpietà statica tipizzata con il tipo della classe che stiamo definendo, 
//	 * inizializzata a null, che conterrà l'unica istanza della classe, e un costruttore privato, 
//	 * in modo da evitare che venga istanziata da altre classi, e per poterla istanziare solo all'interno della classe stessa.
//	 * 
//	 * con instance = null, stiamo dicendo che inizialmente non esiste nessuna istanza della classe, e che verrà creata solo quando sarà necessario,
//	 *  ovvero quando qualcuno chiamerà il metodo getInstance() per la prima volta.
//	 */
//	private MacchinettaDelCaffe() // mettiamo private per evitare che venga istanziata da altre classi
//	{
//		System.out.println("Nuova macchinetta del caffè!");
//		/*se il messaggio compare in console solo una volta, significa che la macchinetta è stata creata una sola volta,
//		 *e che ogni volta che viene chiamata getInstance() viene restituita la stessa istanza.
//		 *
//		 *altrimenti se il messaggio compare più volte, significa che la macchinetta è stata creata più volte,
//		 * e che ogni volta che viene chiamata getInstance() viene restituita una nuova istanza.
//		 */
//	
//		marchio = "KAFFETOP";
//		azienda = "TOP INFORMATICA";
//	}
//	
//	public static MacchinettaDelCaffe getInstance() // metodo statico che restituisce l'unica istanza della classe
//	{
//		if(instance == null) // se l'istanza non esiste ancora, la creiamo
//		{
//			instance = new MacchinettaDelCaffe(); // creiamo l'istanza
//		}
//		return instance; // restituiamo l'istanza
//	}
//	
//	/*
//	 * con questo metodo quando qualcuno chiama getInstance(), se l'istanza non esiste ancora, viene creata, 
//	 * altrimenti viene restituita quella già esistente, garantendo così che ci sia sempre e solo un'istanza della classe.
//	 * 
//	 * cioè la macchinetta verrà creata una sola volta e ogni volta che verrà chiamata sarà sempre la stessa.
//	 * 
//	 * l'obbiettivo era creare una sola macchinetta che venisse usata da tutti, e non più macchinette diverse per ogni persona che la usa,
//	 *  e questo è stato raggiunto con il pattern singleton.
//	 */
//	
//	private String marchio;
//	private String azienda;
//	
//	private void gestisciCialda()
//	{
//		System.out.println("La macchinetta sta gestendo la cialda...");
//	}
//	
//	private void riscaldaAcqua()
//	{
//		System.out.println("La macchinetta sta riscaldando l'acqua...");
//		
//	}
//	
//	private void dosaLoZucchero()
//	{
//		System.out.println("La macchinetta sta dosando lo zucchero...");
//	}
//	
//	private void preparaBicchiere()
//	{
//		System.out.println("La macchinetta sta preparando il bicchiere...");
//	}
//	
//	private void versa()
//	{
//		System.out.println("La macchinetta sta versando il caffè nel bicchiere...");
//	}
//	
//	public void preparaIlCaffe()
//	{
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " sta per fare un caffè." );
//		
//		this.gestisciCialda();
//		this.riscaldaAcqua();
//		this.dosaLoZucchero();
//		this.preparaBicchiere();
//		this.versa();
//		
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " ha preparato un caffè." );

//2

//public class MacchinettaDelCaffe {
//	
//	private static MacchinettaDelCaffe instance = null; 
//
//	static {
//		try 
//		{
//		instance = new MacchinettaDelCaffe();
//	    }
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	/*
//	 * conquesto blocco static stiamo creando l'istanza della macchinetta del caffè in modo statico, ovvero quando la classe viene caricata in memoria,
//	 * in questo modo garantiamo che l'istanza venga creata solo una volta, e che sia disponibile per tutti i thread che la richiedono,
//	 *  senza dover gestire la sincronizzazione.
//	 *  
//	 *  con il solo blocco static funziona, ma non è ancora la soluzione ottimale.
//	 *  
//	 *  utilizzando in try / catch possiamo gestire eventuali eccezioni che potrebbero verificarsi durante la creazione dell'istanza,
//	 *   come ad esempio problemi di memoria o errori di configurazione,
//	 */
//	private MacchinettaDelCaffe()
//	{
//		System.out.println("Nuova macchinetta del caffè!");
//		
//		marchio = "KAFFETOP";
//		azienda = "TOP INFORMATICA";
//	}
//	
//	public static MacchinettaDelCaffe getInstance() 
//	{
////		if(instance == null) 
////		{
////			instance = new MacchinettaDelCaffe();
////		}
//		
//		/*
//		 * nell'esempio precedente l'if si è rivelato poco efficace con i thread, perché se due thread chiamano getInstance() contemporaneamente, 
//		 * entrambi potrebbero passare l'if e creare due istanze diverse della macchinetta del caffè, violando così il principio del singleton.
//		 */
//		return instance; 
//	}
//	
//	private String marchio;
//	private String azienda;
//	
//	private void gestisciCialda()
//	{
//		System.out.println("La macchinetta sta gestendo la cialda...");
//	}
//	
//	private void riscaldaAcqua()
//	{
//		System.out.println("La macchinetta sta riscaldando l'acqua...");
//		
//	}
//	
//	private void dosaLoZucchero()
//	{
//		System.out.println("La macchinetta sta dosando lo zucchero...");
//	}
//	
//	private void preparaBicchiere()
//	{
//		System.out.println("La macchinetta sta preparando il bicchiere...");
//	}
//	
//	private void versa()
//	{
//		System.out.println("La macchinetta sta versando il caffè nel bicchiere...");
//	}
//	
//	public void preparaIlCaffe()
//	{
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " sta per fare un caffè." );
//		
//		this.gestisciCialda();
//		this.riscaldaAcqua();
//		this.dosaLoZucchero();
//		this.preparaBicchiere();
//		this.versa();
//		
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " ha preparato un caffè." );
	

//3

//public class MacchinettaDelCaffe {
//	
//	private static  MacchinettaDelCaffe instance = null; 
//	
//	private MacchinettaDelCaffe()
//	{
//		System.out.println("Nuova macchinetta del caffè!");
//		
//		marchio = "KAFFETOP";
//		azienda = "TOP INFORMATICA";
//	}
//	
//	public static synchronized MacchinettaDelCaffe getInstance() 
//	{
//		if(instance == null) 
//		{
//			instance = new MacchinettaDelCaffe();
//		}
//		
//		return instance; 
//	}
//	
//	private String marchio;
//	private String azienda;
//	
//	private void gestisciCialda()
//	{
//		System.out.println("La macchinetta sta gestendo la cialda...");
//	}
//	
//	private void riscaldaAcqua()
//	{
//		System.out.println("La macchinetta sta riscaldando l'acqua...");
//		
//	}
//	
//	private void dosaLoZucchero()
//	{
//		System.out.println("La macchinetta sta dosando lo zucchero...");
//	}
//	
//	private void preparaBicchiere()
//	{
//		System.out.println("La macchinetta sta preparando il bicchiere...");
//	}
//	
//	private void versa()
//	{
//		System.out.println("La macchinetta sta versando il caffè nel bicchiere...");
//	}
//	
//	public void preparaIlCaffe()
//	{
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " sta per fare un caffè." );
//		
//		this.gestisciCialda();
//		this.riscaldaAcqua();
//		this.dosaLoZucchero();
//		this.preparaBicchiere();
//		this.versa();
//		
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " ha preparato un caffè." );
	
//4

//public class MacchinettaDelCaffe {
//	
//	private static  MacchinettaDelCaffe instance = null; 
//	
//	private MacchinettaDelCaffe()
//	{
//		System.out.println("Nuova macchinetta del caffè!");
//		
//		marchio = "KAFFETOP";
//		azienda = "TOP INFORMATICA";
//	}
//	
//	/*
//	 * con questa solzione stiamo utilizzando il double checked locking,
//	 *  ovvero stiamo controllando se l'istanza è null prima di entrare nella sezione sincronizzata,
//	 *  
//	 *  a differenza della soluzione precedente,
//	 *   in questo modo evitiamo di sincronizzare il metodo getInstance() ogni volta che viene chiamato,
//	 *   ma solo quando l'istanza non esiste ancora,
//	 *    migliorando così le prestazioni in caso di chiamate frequenti a getInstance()
//	 *     dopo che l'istanza è stata creata.
//	 *     
//	 *     quindi migliora le prestazioni in caso di chiamate frequenti a getInstance() dopo che l'istanza è stata creata,
//	 */
//	public static MacchinettaDelCaffe getInstance() 
//	{
//		if(instance == null) 
//		{
//			synchronized(MacchinettaDelCaffe.class)
//			{
//				if(instance == null) 
//				{
//					instance = new MacchinettaDelCaffe();
//				}
//			}	
//		}
//		
//		return instance; 
//	}
//	
//	private String marchio;
//	private String azienda;
//	
//	private void gestisciCialda()
//	{
//		System.out.println("La macchinetta sta gestendo la cialda...");
//	}
//	
//	private void riscaldaAcqua()
//	{
//		System.out.println("La macchinetta sta riscaldando l'acqua...");
//		
//	}
//	
//	private void dosaLoZucchero()
//	{
//		System.out.println("La macchinetta sta dosando lo zucchero...");
//	}
//	
//	private void preparaBicchiere()
//	{
//		System.out.println("La macchinetta sta preparando il bicchiere...");
//	}
//	
//	private void versa()
//	{
//		System.out.println("La macchinetta sta versando il caffè nel bicchiere...");
//	}
//	
//	public void preparaIlCaffe()
//	{
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " sta per fare un caffè." );
//		
//		this.gestisciCialda();
//		this.riscaldaAcqua();
//		this.dosaLoZucchero();
//		this.preparaBicchiere();
//		this.versa();
//		
//		System.out.println(this.marchio + " dell'azienda: " + this.azienda + " ha preparato un caffè." );
	

//5
		public class MacchinettaDelCaffe {
			
			//private static  MacchinettaDelCaffe instance = null; 
			
			private MacchinettaDelCaffe()
			{
				System.out.println("Nuova macchinetta del caffè!");
				
				marchio = "KAFFETOP";
				azienda = "TOP INFORMATICA";
			}
			
			public static  MacchinettaDelCaffe getInstance() 
			{
				
				return MacchinettaDelCaffeBuilder.INSTANCE; 
			}
			/*
			 * a differenza delle soluzioni precedenti il metodo getInstance() non contiene più nessuna logica di controllo o sincronizzazione,
			 * ma si limita a restituire l'istanza della macchinetta del caffè, 
			 * che viene creata in modo thread-safe all'interno della classe di appoggio MacchinettaDelCaffeBuilder,
			 * 
			 * quindi non viene caricata in memoria quando viene caricata la classe MacchinettaDelCaffe, 
			 * ma solo quando viene chiamato per la prima volta il metodo getInstance(),
			 * quindi non ho a disposizione da subito l'istanza, ma solo quando viene effettivamente richiesta,
			 *  e questo è un vantaggio in termini di performance e di utilizzo della memoria.
			 */
			
			private String marchio;
			private String azienda;
			
			private void gestisciCialda()
			{
				System.out.println("La macchinetta sta gestendo la cialda...");
			}
			
			private void riscaldaAcqua()
			{
				System.out.println("La macchinetta sta riscaldando l'acqua...");
				
			}
			
			private void dosaLoZucchero()
			{
				System.out.println("La macchinetta sta dosando lo zucchero...");
			}
			
			private void preparaBicchiere()
			{
				System.out.println("La macchinetta sta preparando il bicchiere...");
			}
			
			private void versa()
			{
				System.out.println("La macchinetta sta versando il caffè nel bicchiere...");
			}
			
			public void preparaIlCaffe()
			{
				System.out.println(this.marchio + " dell'azienda: " + this.azienda + " sta per fare un caffè." );
				
				this.gestisciCialda();
				this.riscaldaAcqua();
				this.dosaLoZucchero();
				this.preparaBicchiere();
				this.versa();
				
				System.out.println(this.marchio + " dell'azienda: " + this.azienda + " ha preparato un caffè." );
					
	}
			private static class MacchinettaDelCaffeBuilder
			{
				private static final MacchinettaDelCaffe INSTANCE = new MacchinettaDelCaffe();
			}
			/*
			 * con questo sistema andiamo a sfruttare il class loading di Java,
			 *  ovvero il fatto che le classi vengono caricate in memoria solo quando vengono utilizzate per la prima volta,
			 *  
			 *  quindi utilizziamo una classe di appoggio, interna rispetto alla classe MacchinettaDelCaffe,
			 *  la quale ha definito al suo interno una proprietà statica, che altro non è che l'oggetto MacchinettaDelCaffe,
			 *   che viene istanziato quando la classe viene caricata in memoria,
			 *    ovvero quando viene chiamato per la prima volta il metodo getInstance(),
			 */
}

