package Argomento_6_4;



public class Libro {
	
	private String titolo;
	private String autore;
	private int pagine;
	private boolean restituito = false;
	
	
	public Libro(String titolo, String autore, int pagine) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
	
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public int getPagine() {
		return pagine;
	}


	public void setPagine(int pagine) {
		this.pagine = pagine;
	}


	public boolean isRestituito() {
		return restituito;
	}


	public void setRestituito(boolean restituito) {
		this.restituito = restituito;
	}
	
	

	public void restituisciLibro()
	{
		if(restituito == false)
		{
		 restituito = true;
		}
	}


	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", restituito=" + restituito
				+ "]";
	}
	
	
	
}
