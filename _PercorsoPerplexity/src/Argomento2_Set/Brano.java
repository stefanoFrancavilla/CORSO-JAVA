package Argomento2_Set;

public class Brano {

	private int codiceBrano;
	private String titolo;
	private String artista;
	private String genere;
	private int durataSecondi;
	
	//costruttore
	public Brano(int codiceBrano, String titolo, String artista, String genere, int durataSecondi) {
		setCodiceBrano(codiceBrano);
		setTitolo(titolo);
		setArtista(artista);
		setGenere(genere);
		setDurataSecondi(durataSecondi);
	}
	
	//metodi getter setter

	public int getCodiceBrano() {
		return codiceBrano;
	}

	public void setCodiceBrano(int codiceBrano) {
		if (codiceBrano <= 0)
		{
			System.out.println("Il codice del brano non può essere minore o uguale a zero");
		}
		else
		{
			this.codiceBrano = codiceBrano;
		}
		
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		if (titolo == null || titolo.isBlank())
		{
			System.out.println("Il titolo non può essere null o vuoto");
		}
		else
		{
			this.titolo = titolo;
		}
		
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		if (artista == null || artista.isBlank())
		{
			System.out.println("L'artista non può essere null o vuoto");
		}
		else
		{
			this.artista = artista;
		}
	
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		if (genere == null || genere.isBlank())
		{
			System.out.println("Il genere non può essere null o vuoto");
		}
		else
		{
			this.genere = genere;
		}
	
	}

	public int getDurataSecondi() {
		return durataSecondi;
	}

	public void setDurataSecondi(int durataSecondi) {
		if (durataSecondi <= 0)
		{
			System.out.println("La durata del brano non può essere minore o uguale a zero");
		}
		else
		{
			this.durataSecondi = durataSecondi;
		}
	
	}

	@Override
	public String toString() {
		return "Brano [codiceBrano=" + codiceBrano + ", titolo=" + titolo + ", artista=" + artista + ", genere="
				+ genere + ", durataSecondi=" + durataSecondi + "]";
	}
	
	
	
}
