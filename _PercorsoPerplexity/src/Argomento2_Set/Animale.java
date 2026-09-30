package Argomento2_Set;

public class Animale {

	private int codiceAnimale;
	private String nome;
	private String specie;
	private int eta;
	private boolean adottabile;
	
	// costruttore
	public Animale(int codiceAnimale, String nome, String specie, int eta, boolean adottabile) {
		setCodiceAnimale(codiceAnimale);
		setNome(nome);
		setSpecie(specie);
		setEta(eta);
		this.adottabile = adottabile;
	}

	// metodi getter e setter
	public int getCodiceAnimale() {
		return codiceAnimale;
	}

	public void setCodiceAnimale(int codiceAnimale) {
		if (codiceAnimale <= 0)
		{
			return;
		}
		this.codiceAnimale = codiceAnimale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank())
		{
			return;
		}
		this.nome = nome;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		if (specie == null || specie.isBlank())
		{
			return;
		}
		this.specie = specie;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		if (eta < 0)
		{
			return;
		}
		this.eta = eta;
	}

	public boolean isAdottabile() {
		return adottabile;
	}

	public void setAdottabile(boolean adottabile) {
		this.adottabile = adottabile;
	}

	// metodo to string
	@Override
	public String toString() {
		return "Animale [codiceAnimale=" + codiceAnimale + ", nome=" + nome + ", specie=" + specie + ", eta=" + eta
				+ ", adottabile=" + adottabile + "]";
	}	
}
