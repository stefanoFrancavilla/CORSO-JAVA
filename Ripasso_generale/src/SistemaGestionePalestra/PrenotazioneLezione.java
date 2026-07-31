package SistemaGestionePalestra;

import java.time.LocalDate;

public class PrenotazioneLezione {

	// variabili di istanza
	
	private String codicePrenotazione;
	private Membro membro;
	private Corso corso;
	private LocalDate data;
	private TipoAbbonamento tipoAbbonamento;
	private LocalDate dataScadenza;
	
	public PrenotazioneLezione(String codicePrenotazione, Membro membro, Corso corso, TipoAbbonamento tipoAbbonamento ) {
		
		setCodicePrenotazione(codicePrenotazione);
		setMembro(membro);
		setCorso(corso);
		setTipoAbbonamento(tipoAbbonamento);
		
		this.data = LocalDate.now();
		this.dataScadenza = data.plusMonths(tipoAbbonamento.getDurataInMesi());
		
	}


	


	public LocalDate getDataScadenza() {
		return dataScadenza;
	}


	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}


	public Membro getMembro() {
		return membro;
	}


	public void setMembro(Membro membro) {
		if (membro == null)
		{
			throw new IllegalArgumentException("il membro non esiste");
		}
		this.membro = membro;
	}


	public Corso getCorso() {
		return corso;
	}


	public void setCorso(Corso corso) {
		if (corso == null)
		{
			throw new IllegalArgumentException("il corso non esiste");
		}
		this.corso = corso;
	}


	public TipoAbbonamento getTipoAbbonamento() {
		return tipoAbbonamento;
	}


	public void setTipoAbbonamento(TipoAbbonamento tipoAbbonamento) {
		this.tipoAbbonamento = tipoAbbonamento;
	}
	
	public String getCodicePrenotazione() {
		return codicePrenotazione;
	}

	public void setCodicePrenotazione(String codicePrenotazione) {
		if(codicePrenotazione == null || codicePrenotazione.isBlank()) {
			throw new IllegalArgumentException("CodicePrenotazione non valido"); 
		}
		this.codicePrenotazione = codicePrenotazione;
	}

	public LocalDate getData() {
		return data;
	}
	
	
	
	
}
