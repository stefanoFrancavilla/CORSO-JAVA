package incapsulamentoDeiDati;

import incapsulamentoDeiDati.singletons.MacchinettaDelCaffe;

public class Dipendente extends EssereUmano {

	@Override
	public void faIlCaffe()
	{
       MacchinettaDelCaffe macchinettaDelCaffe = MacchinettaDelCaffe.getInstance(); // otteniamo l'istanza della macchinetta del caffè
       
       macchinettaDelCaffe.preparaIlCaffe(); // usiamo la macchinetta del caffè per preparare un caffè
	}

}
