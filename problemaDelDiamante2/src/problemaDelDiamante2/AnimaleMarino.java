package problemaDelDiamante2;

public interface AnimaleMarino extends Animale {

	/*
	 * in questo caso abbiamo animale marino che estende animale, quindi è un animale, ma è anche un animale marino, quindi deve implementare il metodo respira()
	 *  di animale e il metodo respira() di animale marino, ma non c'è conflitto perché sono due metodi diversi,
	 *   anche se hanno lo stesso nome, perché sono in due interfacce diverse.
	 */
	abstract void respira();
}
