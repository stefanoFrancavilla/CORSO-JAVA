package problemaDelDiamante;

//public interface Animale {
	public sealed interface Animale permits AnimaleMarino, AnimaleTerrestre {
		/*con questa riga di codice stiamo dicendo che interfaccia animale può essere estesa
		 * SOLO da animaleMarino e AnimaleTerrestre
		 * 
		 * 
		 */
	public static void stampa()
	{
		System.out.println("Sono un animale");// questo non viene ereditato.per chiamarlo devo sempre fare Animale.stampa()
	}

	default void respira()
	{
		System.out.println("Respira");
	}
}
