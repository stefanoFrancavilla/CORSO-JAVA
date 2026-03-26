package problemaDelDiamante;

public non-sealed interface AnimaleTerrestre extends Animale {
// con non sealed stiamo dicendo che questa interfaccia può essere estesa da chiunque, non è più limitata a Rana e Anfibio 
	default void respira()
	{
		System.out.println("Respira con i polmoni");
	}
}
