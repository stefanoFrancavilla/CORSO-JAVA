package problemaDelDiamante2;

public class Rana implements AnimaleMarino, AnimaleTerrestre {

/*
 * in questo caso il possibile conflitto tra i due metodi respira di animale marino e animale terrestre si risolve ,
 * aggiungendo un'implementazione del metodo respira() nella classe rana.
 * 
 * in questo modo, quando si chiama il metodo respira() su un oggetto di tipo rana, viene eseguito il metodo respira() della classe rana,
 */
	@Override
	public void respira() {
		System.out.println("La rana respira da girino con le branchie e da adulta con i polmoni.");
	}

}
