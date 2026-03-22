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
	 */
}
