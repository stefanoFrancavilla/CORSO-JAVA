package collezioni;

public class Auto {
	
	//variabili di istanza
	
	private String casaProduttrice;
	private String modello;
	private String colore;
	
	//costruttori
	
	public Auto(String casaProduttrice, String modello, String colore)
	{
		this.casaProduttrice = casaProduttrice;
		this.modello = modello;
		this.colore = colore;
	}

	//metodi getter/setter
	
	public String getCasaProduttrice() {
		return casaProduttrice;
	}

	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	//metodi
	@Override
	public String toString() {
		return "Auto [casaProduttrice=" + casaProduttrice + ", modello=" + modello + ", colore=" + colore + "]";
	}

	
	
	

	
}
