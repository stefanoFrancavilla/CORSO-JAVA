package incapsulamentoDeiDati.utilities;

public final class Calcolo {
	
	// con il costrutto final stiamo dich8iarando che la classe Calcolo non è estendibile.

	//costruttori
	private Calcolo()
	{
		
	}
	public static double somma(double... ns)
	{
		double somma = 0;
		
		for( int i = 0; i < ns.length; i++)
			
			somma = somma + ns[i];
		return somma;
	}
	
	// abbiamo impostato static perchè non è necessario creare un oggetto per poter utilizzare i metodi della classe Calcolo,
	// e abbiamo impostato il metodo come public perchè vogliamo che sia accessibile da qualsiasi altra classe.
	public static double moltiplica(double... ns)
	{
		double prodotto = 1;
		
		for( int i = 0; i < ns.length; i++)
		
			prodotto = prodotto * ns[i];
		
		return prodotto;
		
	}
}
	
