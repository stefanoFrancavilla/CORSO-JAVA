package SistemaGestionePalestra;

import java.util.Objects;

public class Corso {
//variabili di istanza
	
	private String codice;
	private String nomeCorso;
	private int capienzaMassima;
	private int postiOccupati;
	
	
	//costruttore
	public Corso(String codice, String nomeCorso, int capienzaMassima ) {
		
		setCodice(codice);
		setNomeCorso(nomeCorso);
		setCapienzaMassima(capienzaMassima);
		this.postiOccupati = postiOccupati;
	}


	//metodi getter setter
	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		if(codice == null || codice.isBlank()) {
			throw new IllegalArgumentException("Codice non valido"); 
		}
		this.codice = codice;
	}


	public String getNomeCorso() {
		
		return nomeCorso;
	}


	public void setNomeCorso(String nomeCorso) {
		
		if(nomeCorso == null || nomeCorso.isBlank()) {
			throw new IllegalArgumentException("NomeCorso non valido"); 
		}
		this.nomeCorso = nomeCorso;
	}


	public int getCapienzaMassima() {
		return capienzaMassima;
	}


	public void setCapienzaMassima(int capienzaMassima) {
		
		if (capienzaMassima < 0)
		{
			throw new IllegalArgumentException("La capienza massima non può essere inferiore a 0"); 
		}
		this.capienzaMassima = capienzaMassima;
	}


	public int getPostiOccupati() {
		return postiOccupati;
	}


	public void setPostiOccupati(int postiOccupati) {
		this.postiOccupati = postiOccupati;
	}


	//metodi
	@Override
	public int hashCode() {
		return Objects.hash(codice);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		return Objects.equals(codice, other.codice);
	}


	@Override
	public String toString() {
		return "Corso [codice=" + codice + ", nomeCorso=" + nomeCorso + ", capienzaMassima=" + capienzaMassima
				+ ", postiOccupati=" + postiOccupati + "]";
	}
	
	
	public boolean isDisponibile(int postiOccupati)
	{
		boolean disponibile = false;
		if(postiOccupati < capienzaMassima)
		{
			disponibile = true;
		}
		
		return disponibile;
	}
	
	
}
