package Es_12;

public class Libro {
	
	//variabili di istanza
	
	private String titolo;
	private String autore;
	private int pagine;
	private boolean disponibile = true;
	
	
	private int contatoreLibro = 1;
	
	//costruttori
	
	public Libro()
	{
		
	}
	
	public Libro(String titolo, String autore, int pagine)
	{
		this.titolo = titolo;
		this.autore = autore;
		setPagine(pagine);
	}

	//metodi getter / setter
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
		
		if (pagine <= 0)
		{
			System.out.println("Il numero delle pagine non è reale");
			return;
		}
		this.pagine = pagine;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		if(contatoreLibro > 0)
		{
			disponibile = true;
			this.disponibile = disponibile;
		}
		else if (contatoreLibro == 0)
		{
			disponibile = false;
			this.disponibile = disponibile;
		}
		else 
		{
			System.out.println("Il numero non può essere negativo");
		}
		
		
	}
	public int getContatoreLibro() {
		return contatoreLibro;
	}

	public void setContatoreLibro(int contatoreLibro) {
		
		if(contatoreLibro < 0)
		{
			System.out.println("Il numero non può essere negativo");
			return;
		}
		else
		{
			this.contatoreLibro = contatoreLibro;
		}
		
		
	}
	
	//metodi
	
	public void stampaInfo()
	{
		System.out.println("Titolo: " + titolo);
		System.out.println("Autore: " + autore);
		System.out.println("Numero pagine: " + pagine);
		System.out.println("Libri disponibili: " + contatoreLibro);
		System.out.println();
	}

	public void presta()
	{
		if (contatoreLibro > 0)
		{
			System.out.println("Il libro è stato prestato");
			contatoreLibro --;	
		}
		else 
		{
			System.out.println("Il libro non è disponibile");
			disponibile = false;
		}
	}
	
	public void restituisci()
	{
		System.out.println("Il libro è stato riconsegnato");
		contatoreLibro++;
	}
	
	public static int contaDisponibili(Libro[] libri)
	{
		int numeroDisponibili = 0;
		
		for (int i = 0; i < libri.length; i++ )
		{
			numeroDisponibili = libri[i].getContatoreLibro();
			
			if(numeroDisponibili > 0)
			{
				System.out.println("I libri disponibili per questo libro " + libri[i].titolo +  " sono: " + numeroDisponibili);
			}
			else if(numeroDisponibili == 0)
			{
				System.out.println("Non ci sono libri disponibili per questo libro: " + libri[i].titolo);
			}
			
			
		}
		
		return numeroDisponibili;
	}

}
