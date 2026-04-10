package problemaDelDiamante;

public class Rana extends Anfibio {

	
	//@Override //non si può usare con i metodei statici, perchè non si ereditano, quindi non si possono sovrascrivere
//	public static void stampaAnfibio()
//	{
//		System.out.println("Sono un'anfibio, sono una rana"); // questo viene ereditato.
//	}
	
	/*
	 * togliendo il metodo stampaAnfibio da rana in console vedremo "Sono un'anfibio" 2 volte, 
	 * perchè sia Anfibio che Rana ereditano il metodo stampaAnfibio() da Anfibio, 
	 * quindi quando chiamo Anfibio.stampaAnfibio() e Rana.stampaAnfibio() viene chiamato lo stesso metodo, quello di Anfibio.
	 * 
	 * in parole semplici, se una classe estende un'altra classe che ha un metodo statico,
	 * il metodo statico viene ereditato, ma non può essere sovrascritto, 
	 * quindi se io chiamo il metodo statico da una classe che estende l'altra classe,
	 * viene chiamato il metodo statico della classe padre, non quello della classe figlia, anche se la classe figlia ha un metodo statico con lo stesso nome.
	 */
	
	public static void stampaAnfibio()
	{
		System.out.println("Sono un'anfibio, sono una rana"); // questo viene ereditato.
	}
}
