package problemaDelDiamante3;

public class Jet extends Aereo implements IVolatile {

	/*
	 * in questo caso se la classe Jet non ridefinisce il metodo vola() si verifica un errore di compilazione,
	 *  in quanto il compilatore non sa quale implementazione del metodo vola()
	 *   utilizzare (quella della classe Aereo o quella dell'interfaccia IVolatile).
	 *   
	 *   ci sarà un conflitto tra le due implementazioni del metodo vola() e il compilatore non è in grado di risolverlo automaticamente.
	 *   
	 *   qual'ora ci sia un'ambiguità, e c'è un conflitto definito in una classe e in un'interfaccia il compilatore da la precedenza alla classe, 
	 *   e quindi utilizza l'implementazione del metodo vola() definita nella classe Aereo.
	 *   
	 *   e anche in jet non abbiamo implementato il metodo vola() e quindi utilizza quello della classe Aereo, e quindi stampa "Sto volando ( classe)."
	 */
	
	
}
