package Argomento1_List;

public class Film {

	private String titolo;
	private String regista;
	private int durata;
	private boolean visto = false;
	
	
	public Film(String titolo, String regista, int durata) {
		super();
		this.titolo = titolo;
		this.regista = regista;
		this.durata = durata;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getRegista() {
		return regista;
	}


	public void setRegista(String regista) {
		this.regista = regista;
	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		if (durata < 0)
		{
			System.out.println("Errore, la durata deve essere superiore a 0");
		}
		else
		{
		this.durata = durata;
		}
	}


	public boolean isVisto() {
		return visto;
	}


	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	public void segnaComeVisto()
	{
		if( this.visto == false)
		{
			this.visto = true;
		}
	}


	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", regista=" + regista + ", durata=" + durata + ", visto=" + visto + "]";
	}
	
	
}
