package incapsulamentoDeiDati.customthread;

import incapsulamentoDeiDati.singletons.Stampante;

public class StampanteThread extends Thread {
Stampante stampante;

	@Override
	public void run() 
	{
		stampante = Stampante.getInstance();
		stampante.stampaDocumento();
    }
}

