package Argomento1_List;

public class Artista {

	//variabili di istanza
	private int codiceArtista;
	private String nome;
	private String genere;
	private int durataEsibizioneMinuti;
	private int pubblicoPrevisto;
	
	//costruttore
	public Artista(int codiceArtista, String nome, String genere, int durataEsibizioneMinuti, int pubblicoPrevisto) {
		
		setCodiceArtista(codiceArtista);
		setNome(nome);
		setGenere(genere);
		setDurataEsibizioneMinuti(durataEsibizioneMinuti);
		setPubblicoPrevisto(pubblicoPrevisto);
	}

	//metodi getter setter
	
	public int getCodiceArtista() {
		return codiceArtista;
	}

	public void setCodiceArtista(int codiceArtista) {
		if(codiceArtista <= 0)
		{
			System.out.println("Il codice artista non è valido");
		}
		else
		{
			this.codiceArtista = codiceArtista;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank())
		{
			System.out.println("Il nome inserito non è valido");
		}
		else
		{
			this.nome = nome;	
		}
		
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		if(genere == null || genere.isBlank())
		{
		  System.out.println("Il genere inserito non è valido");
		}
		else
		{
			this.genere = genere;	
		}
		
	}

	public int getDurataEsibizioneMinuti() {
		return durataEsibizioneMinuti;
	}

	public void setDurataEsibizioneMinuti(int durataEsibizioneMinuti) {
		if(durataEsibizioneMinuti <= 0)
		{
			System.out.println("La durata dell'esibizione non è valida");
		}
		else
		{
			this.durataEsibizioneMinuti = durataEsibizioneMinuti;
		}
		
	}

	public int getPubblicoPrevisto() {
		return pubblicoPrevisto;
	}

	public void setPubblicoPrevisto(int pubblicoPrevisto) {
		if(pubblicoPrevisto < 0)
		{
			System.out.println("Il pubblico previsto non è valido");
		}
		else
		{
			this.pubblicoPrevisto = pubblicoPrevisto;
		}
		
	}

	//metodo to String
	
	@Override
	public String toString() {
		return "Artista [codiceArtista=" + codiceArtista + ", nome=" + nome + ", genere=" + genere
				+ ", durataEsibizioneMinuti=" + durataEsibizioneMinuti + ", pubblicoPrevisto=" + pubblicoPrevisto + "]";
	}
}
