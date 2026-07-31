package SistemaGestionePalestra;

import java.util.ArrayList;
import java.util.List;

public class Palestra {

	//variabili di istanza
	
	private List<Membro> membri;
	private List<Corso> corsi;
	private List<PrenotazioneLezione> prenotazioni;
	
	//costruttore
	public Palestra() {
		
		this.membri = new ArrayList<>();
		this.corsi = new ArrayList<>();
		this.prenotazioni = new ArrayList<>();
	}

	//metodi getter setter
	public List<Membro> getMembri() {
		return membri;
	}

	public void setMembri(List<Membro> membri) {
		this.membri = membri;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public List<PrenotazioneLezione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(List<PrenotazioneLezione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	//metodi override
	@Override
	public String toString() {
		return "Palestra [membri=" + membri + ", corsi=" + corsi + ", prenotazioni=" + prenotazioni + "]";
	}
	
	//metodi membri
	public void registrazione(Membro membroDaRegistrare)
	{
		if(membroDaRegistrare == null)
		{
			throw new IllegalArgumentException("Membro non idoneo");
		}
		for(Membro membro : membri)
		{
			if(membro.getId().equals(membroDaRegistrare) || membro.getEmail().equals(membroDaRegistrare))
			{
				System.out.println("Membro presente nel sistema");
				return;
			}
			
		}
		membri.add(membroDaRegistrare);
	}
	
	public Membro ricercaMembroPerId (String id)
	{
		Membro membroDaTrovare = null;
		for( Membro membro : membri)
		{
			if (membro.getId().equals(id))
			{
				membroDaTrovare = membro;
			}
		}
		
		return membroDaTrovare;
	}
	
	//metodi corsi
	public void inserimentoCorso( Corso corsoDaInserire)
	{
		if(corsoDaInserire == null)
		{
			throw new IllegalArgumentException("Corso non idoneo");
		}
		for(Corso corso : corsi)
		{
			if(corso.getCodice().equals(corsoDaInserire))
			{
				System.out.println("Corso presente nel sistema");
				return;
			}
		}
			corsi.add(corsoDaInserire);
	}
	
	public Corso ricercaCorsoPerCodice ( String codice)
	{
		for(Corso c : corsi)
		{
			if(c.getCodice().equals(codice))
			{
				return c;
			}
		}
		
		return null;
	}
	
	//metodi prenotazioni
	
	public void inserisciPrenotazione ( PrenotazioneLezione prenotazione)
	{
		if()
	}
	
	
}
