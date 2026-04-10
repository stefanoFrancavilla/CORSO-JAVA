package problemaDelDiamante;

//public non-sealed interface AnimaleTerrestre extends Animale {
//// con non sealed stiamo dicendo che questa interfaccia può essere estesa da chiunque, non è più limitata a Rana e Anfibio 
//	default void respira()
//	{
//		System.out.println("Respira con i polmoni");
//	}


/*
 * in questo caso l'interfaccia Animale terrestre puo essere estesa solo da Anfibio e felino,
 *  quindi se io creo una classe che estende AnimaleTerrestre, 
 *  il compilatore mi darà un errore perchè non è una classe che estende Anfibio o Felino.
 *  
 *  poichè AnimaleTerrestre estende Animale, 
 *  e Animale è una interfaccia sigillata che può essere estesa solo da AnimaleMarino e AnimaleTerrestre,
 *  tutto questo gtrazie alla parola chiave sealed,
 */
public sealed interface AnimaleTerrestre extends Animale permits Anfibio, Felino {
		default void respira()
		{
			System.out.println("Respira con i polmoni");
		}
}
