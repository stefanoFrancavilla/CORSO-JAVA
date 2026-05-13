package incapsulamentoDeiDati;

import java.time.LocalDate;

import incapsulamentoDeiDati.Cittadino.Comune;
import incapsulamentoDeiDati.Cittadino.Nazione;
import incapsulamentoDeiDati.singletons.MacchinettaDelCaffe;
import incapsulamentoDeiDati.singletons.Stampante;

public class Dipendente extends Cittadino {
	
	public Dipendente(String nome,
			String cognome,
			Sesso sesso,
			float altezza,
			float peso,
			ColoreOcchi coloreOcchi,
			ColoreCapelli coloreCapelli,
			Nazione nazioneDiNascita,
			LocalDate dataDiNascita,
			Comune comuneDiNascita) 
	{
		super(nome, cognome, sesso, altezza, peso, coloreOcchi, coloreCapelli,nazioneDiNascita, dataDiNascita,comuneDiNascita);
		System.out.println("--------------------------");
		System.out.println("Cittadino (10)");
		
	}

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
