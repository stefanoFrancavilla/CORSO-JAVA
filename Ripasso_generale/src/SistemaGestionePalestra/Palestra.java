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
	
	public void registrazione(Membro membro)
	{
		membri.add(membro);
	}
	
	
	
}
