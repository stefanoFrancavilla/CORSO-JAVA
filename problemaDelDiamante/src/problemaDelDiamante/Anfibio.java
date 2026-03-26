package problemaDelDiamante;

public abstract class Anfibio implements AnimaleMarino, AnimaleTerrestre {

	public void respira()
	{
		AnimaleMarino.super.respira();
		AnimaleTerrestre.super.respira();
	}
	
	/*
	 * il problema del diamante è che se io non implemento il metodo respira() in Anfibio,

	 *  quando vado a creare un oggetto di tipo Anfibio,
	 *   non so quale metodo respira() chiamare tra quello di AnimaleMarino e quello di AnimaleTerrestre.
	 *    Quindi devo implementarlo in Anfibio e specificare quale dei due metodi voglio chiamare.
	 *    
	 * quindi il problema del diamante è che se una classe implementa due interfacce che hanno lo stesso metodo,
	 *  non sa quale metodo chiamare e quindi deve implementarlo nella classe che implementa le due interfacce
	 *   e specificare quale dei due metodi vuole chiamare.
	 *   
	 *   
	 */
	
	
	
}
