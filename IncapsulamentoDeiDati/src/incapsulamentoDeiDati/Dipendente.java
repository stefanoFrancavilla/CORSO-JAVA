package incapsulamentoDeiDati;

import incapsulamentoDeiDati.singletons.MacchinettaDelCaffe;
import incapsulamentoDeiDati.singletons.Stampante;

public class Dipendente extends EssereUmano {

	@Override
	public void faIlCaffe()
	{
       MacchinettaDelCaffe macchinettaDelCaffe = MacchinettaDelCaffe.getInstance(); // otteniamo l'istanza della macchinetta del caffè
       
       macchinettaDelCaffe.preparaIlCaffe(); // usiamo la macchinetta del caffè per preparare un caffè
	}
	
	@Override
	public void stampaDocumento()
	{
		Stampante stampante = Stampante.getInstance();
		
		stampante.StampaDocumento();
	}
/*
 * quindi quando un dipendente vuole stampare un documento, invece di creare una nuova istanza della stampante, 
 * ottiene l'istanza esistente della stampante e la utilizza per stampare il documento. In questo modo,
 *  tutti i dipendenti condividono la stessa stampante, evitando sprechi di risorse e garantendo un accesso centralizzato alla stampante.
 */
}
