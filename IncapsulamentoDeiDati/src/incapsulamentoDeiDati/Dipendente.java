package incapsulamentoDeiDati;

import java.time.LocalDate;

import incapsulamentoDeiDati.Cittadino.Comune;
import incapsulamentoDeiDati.Cittadino.Nazione;
import incapsulamentoDeiDati.singletons.MacchinettaDelCaffe;
import incapsulamentoDeiDati.singletons.Stampante;

public class Dipendente extends Cittadino {
	
	private static final float DEFAULT_STIPENDIO = 1000;
	private static final int DEFAULT_LIVELLO = 5;
	
	//Variabili d'istanza.
	private float stipendio;
	private int livello;
	//private List<String> ss;
	
	//Costruttori.
	public Dipendente(String nome,
			String cognome,
			Sesso sesso,
			//byte anni,
			float altezza,
			float peso,
			ColoreOcchi coloreOcchi,
			ColoreCapelli coloreCapelli,
			Nazione nazioneDiNascita,
			LocalDate dataDiNascita,
			Comune comuneDiNascita)
	{
		super(nome, cognome, sesso, altezza, peso, coloreOcchi, coloreCapelli, nazioneDiNascita, dataDiNascita, comuneDiNascita);
		
		System.out.println("--------------------------");
		System.out.println("Dipendente(10)");
		
		this.setStipendio(Dipendente.DEFAULT_STIPENDIO);
		this.setLivello(Dipendente.DEFAULT_LIVELLO);
	}
	

	//Metodi getter/setter.
	public float getStipendio() {
		return stipendio;
	}

	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}
	
	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}


	//Metodi.
	@Override
	public String toString()
	{
		System.out.println(super.toString());
		
		return """
				Dipendente -> toString()
					stipendio: %s,
					livello: %s
				""".formatted(this.getStipendio(),
						this.getLivello());
	}
	
	
	@Override
	public void faIlCaffe()
	{
		System.out.println("--------------------------");
		System.out.println("Dipendente -> faIlCaffè()");
		
		MacchinettaDelCaffe macchinettaDelCaffe = MacchinettaDelCaffe.getInstance();
		
		macchinettaDelCaffe.preparaIlCaffe();
	}
	
	@Override
	public void stampaDocumento()
	{
		System.out.println("--------------------------");
		System.out.println("Dipendente -> stampaDocumento()");
		
		Stampante stampante = Stampante.getInstance();
		
		stampante.StampaDocumento();
	}
}