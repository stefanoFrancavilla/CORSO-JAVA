package incapsulamentoDeiDati.singletons;

public class MacchinettaDelCaffe {
	
	private static MacchinettaDelCaffe instance = null; // istanza statica che conterrà l'unica istanza della classe

	/*
	 * abbiamo creato una prorpietà statica tipizzata con il tipo della classe che stiamo definendo, 
	 * inizializzata a null, che conterrà l'unica istanza della classe, e un costruttore privato, 
	 * in modo da evitare che venga istanziata da altre classi, e per poterla istanziare solo all'interno della classe stessa.
	 * 
	 * con instance = null, stiamo dicendo che inizialmente non esiste nessuna istanza della classe, e che verrà creata solo quando sarà necessario,
	 *  ovvero quando qualcuno chiamerà il metodo getInstance() per la prima volta.
	 */
	private MacchinettaDelCaffe() // mettiamo private per evitare che venga istanziata da altre classi
	{
		marchio = "KAFFETOP";
		azienda = "TOP INFORMATICA";
	}
	
	public static MacchinettaDelCaffe getInstance() // metodo statico che restituisce l'unica istanza della classe
	{
		if(instance == null) // se l'istanza non esiste ancora, la creiamo
		{
			instance = new MacchinettaDelCaffe(); // creiamo l'istanza
		}
		return instance; // restituiamo l'istanza
	}
	
	/*
	 * con questo metodo quando qualcuno chiama getInstance(), se l'istanza non esiste ancora, viene creata, 
	 * altrimenti viene restituita quella già esistente, garantendo così che ci sia sempre e solo un'istanza della classe.
	 * 
	 * cioè la macchinetta verrà creata una sola volta e ogni volta che verrà chiamata sarà sempre la stessa.
	 * 
	 * l'obbiettivo era creare una sola macchinetta che venisse usata da tutti, e non più macchinette diverse per ogni persona che la usa,
	 *  e questo è stato raggiunto con il pattern singleton.
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
}
