package interfacce;

public class Cpu {
	
	//variabili di istanza
	
	
	
	
/*
*	private int totalTransistor;
	*
 *   proprietà statiche
*	public static String transistorMaterial;
*	
*	costruttore
*	
*	public Cpu()
*{
*		System.out.println("Cpu -> instance-constructor");
*		this.setTotalTransistor(1000000000);
*	}
*	
*	static 
*	{
*		System.out.println("Cpu -> stastic-constructor");
*		transistorMaterial = "silicio";
*	}
*
*	  a differenza dei normali costrutturi, i blocchi statici vengono eseguiti una sola volta, quando la classe viene caricata in memoria,
*	  e vengono utilizzati per inizializzare le proprietà statiche della classe, che sono condivise da tutte le istanze della classe stessa.
*	  in questo caso, stiamo inizializzando la proprietà statica transistorMaterial con il valore "silicio",
*	  che è un materiale comunemente utilizzato per la produzione di transistor.
*	   
*	   quindi in parole semplici, quando la classe Cpu viene caricata in memoria,
*	    il blocco statico viene eseguito e la proprietà statica transistorMaterial viene inizializzata con il valore "silicio",
*	    
*	   i costruttori statici permettono di inizializzare delle prorietà tìstatiche della classe, 
*	    che sono condivise da tutte le istanze della classe stessa, e vengono eseguiti una sola volta,
*	     quando la classe viene caricata in memoria.
*	     
*	     viene eseguito prima di qualsiasi istanza della classe venga creata, e prima di qualsiasi metodo statico venga chiamato,
*	 
*
*	metodi getter/setter
*	public int getTotalTransistor() {
*		return totalTransistor;
*	}
*
*	public void setTotalTransistor(int totalTransistor) {
*		this.totalTransistor = totalTransistor;
*	}
*	
*	public static String getTransistorMaterial() {
*		return transistorMaterial;
*	}
*/	
	
	
	//Metodi
	private void fetch()
	{
		System.out.println("prelevo un'istruzione dalla memoria primaria");
	}
	
	private void decode()
	{
		System.out.println("decodifico l'istruzione");
	}
	
	private void execute()
	{
		System.out.println("combino l'istruzione coi dati e la eseguo");
	}
	
	
	public void process()
	{
		this.fetch();
		this.decode();
		this.execute();
		
		// nel momento in cui da fuori chiamiamo il metodo process , 
		//non stiamo facendo altro che chiamare una serie di metodi privati, 
		// che rappresentano le fasi di fetch, decode ed execute,
		
		/*Esercizio 1
		 * Esercizio creare una classe transitor e trasferire li, la definizione e gestione di transistorMaterial
		 * ovviamente , siete  liberi di implementare tutto quello che ritenete utile per modellare il concetto transistor
		 * 
		 * Esercizio 2
		 * espandere la classe cpu con ulteriori variabili d'istanza e metodi
		 * 
		 * Esercizio 3
		 * dare corpo a questa classe, specificare cioè un numero adeguato di prorpietà e funzionalità
		 * 
		 * Esercizio 4
		 * espandere la classe computer con ulteriori variabili d'istanza e metodi
		 * 
		 * Esercizio 5
		 * definire altre specializzazioni di computer( come abbiamo fatto per DesktopComoputer)
		 * esempio dare la possibilità di accendere uno smartphone accendeere un laptop e far fare delle cose al vostro telefono
		  */
		
		
	}
	
	
}
