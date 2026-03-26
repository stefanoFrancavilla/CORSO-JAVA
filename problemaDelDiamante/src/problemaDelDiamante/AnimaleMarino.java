package problemaDelDiamante;

public non-sealed interface AnimaleMarino extends Animale {

	default void respira()
	{
		System.out.println("Respira con le branchie");
	}
}
