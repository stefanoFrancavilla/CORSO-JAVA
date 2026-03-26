package interfacce;

public interface ElectronicDevice {

	default void switchOn() {
		System.out.println("il dispositivo si accende.");
	}
	
	default void switchOff() {
		System.out.println("il dispositivo si spegne.");
	}
	/*
	 * con le interfacce è possibile dichiarare dei metodi di default,
	 *  e non solo dei metodi astratti.
	 *  i metodi di default, a differenza dei metodi astratti,
	 *  hanno un'implementazione di default,
	 *  ch può essere sovrascritta dalle classi che implementano l'interfaccia stessa.
	 *  
	 *  quindi con la parola default possiamo dichiarare dei metodi di default,
	 *   che hanno un'implementazione di default,
	 *   e che possono essere sovrascritti dalle classi che implementano l'interfaccia stessa.
	 *   
	 *   un'interfaccia la possiamo vedere come un'entità che dichiara dei metodi,
	 *    che possono essere di default o astratti,
	 *    con l'unica cosa che non possono avere dei campi di istanza, ma solo delle costanti.
	 *   
	 *  sia  con electronicDevice che con IO, stiamo definedo dei comportamenti 
	 *  che possono essere implementati da qualsiasi classe che implementa queste interfacce,
	 *  
	 *  cioè tutti i dispositivi che implementano l'interfaccia ElectronicDevice, avranno il comportamento di switchOn e switchOff,
	 *  quindi hanno la possibilità di accendersi e spegnersi,
	 *  
	 *   e tutti i dispositivi che implementano l'interfaccia IO, avranno il comportamento di getInput e provideOutput,
	 *   mentre i dispositivi che implementano IO hanno la possibilità di ricevere input e fornire output.
	 *   
	 */
}
