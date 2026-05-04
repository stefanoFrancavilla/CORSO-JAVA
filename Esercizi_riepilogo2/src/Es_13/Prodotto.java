package Es_13;

public class Prodotto {

	//variabili di istanza
	private String nome;
	private double prezzo;
	
	private int quantita;
	
	//costruttori
	
	public Prodotto()
	{
	
	}
	
	public Prodotto(String nome, double prezzo)
	{
		setNome(nome);
		setPrezzo(prezzo);
		setQuantita(quantita);
	}

	// metodi getter/setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!nome.isBlank())
		{
			this.nome = nome;
		}
		else
		{
			System.out.println("Nome non valido");
			return;
		}
		
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if(prezzo <= 0)
		{
			System.out.println("Prezzo non valido");
			return;
		}
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		
		if (quantita < 0)
		{
			System.out.println("La quantità deve essere superiore o uguale a 0");
			return;
		}
		this.quantita = quantita;
	}
	
	// metodi
	
	public void aggiungi(int qta)
	{
		if (qta <= 0)
		{
			System.out.println("La quantità inserita non è corretta");
		}
		else
		{
			this.quantita += qta;
		}
	}
	
	public void rimuovi(int qta)
	{
		if (qta <= 0)
		{
			System.out.println("La quantità inserita non è corretta");
		}
		else
		{
			if(qta > quantita)
			{
				System.out.println("La quantità inserita supera la quantità disponibile");
			}
			else
			{
				this.quantita -= qta;
			}
		}
	}
	
	public double valoreTotale()
	{
		double valore = 0;
		
		valore = this.prezzo * this.quantita;
		
		return valore;
	}
	
	public void stampaInfo()
	{
		System.out.println("Il nome del prodotto è: " + this.nome);
		System.out.println("Il prezzo del prodotto è: " + this.prezzo);
		System.out.println("La quantità disponibile è: " + this.quantita);
		System.out.println();
	}
	
	public static double valoreMagazzino (Prodotto[] prodotti)
	{
		double valore = 0;
		for(int i = 0; i < prodotti.length; i++)
		{
			valore += prodotti[i].valoreTotale();
		}
		
		System.out.println("Il valore totale di tutto il magazzino è: " + valore);
		
		return valore;
	}
	
}
