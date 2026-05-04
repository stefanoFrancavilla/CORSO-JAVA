package Es_14;

public class Prodotto {


	/*
	 * Classe Prodotto
Attributi:
String nome
double prezzo
int quantita
🔧 Costruttore:

Inizializza tutti gli attributi (usa i setter)

🔹 Metodi:

1. aggiungi(int qta)
Aumenta la quantità
❌ Se qta ≤ 0 → errore

2. rimuovi(int qta)
Diminuisce la quantità
❌ Se qta ≤ 0 → errore
❌ Se qta > quantita → errore

3. valoreTotale()
ritorna: prezzo * quantita

4. stampaInfo()
stampa nome, prezzo, quantità

🧠 Vincoli:
prezzo > 0
quantita ≥ 0
nome non vuoto
	 */
	
	
	//variabili di istanza
	private String nome;
	private double prezzo;
	private int quantita;
	
	//costruttori
	public Prodotto()
	{
		
	}
	
	public Prodotto(String nome, double prezzo, int quantita)
	{
		setNome(nome);
		setPrezzo(prezzo);
		setQuantita(quantita);
	}

	
	//metodi getter / setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.isBlank())
		{
			System.out.println("Il nome non è valido");
			return;
		}
		else
		{
			this.nome = nome;
		}
		
		
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		
		if(prezzo < 0)
		{
			System.out.println("Il prezzo non è valido");
			return;
		}
		else
		{
			this.prezzo = prezzo;
		}
		
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		
		if(quantita <= 0)
		{
			System.out.println("La quantità non è valida");
			return;
		}
		else
		{
			this.quantita = quantita;
		}
		
	}

	//metodi
	
	public void aggiungi(int qta)
	{
		if(qta <= 0)
		{
			System.out.println("La quantita inserita non è corretta");
			return;
		}
		else
		{
			this.quantita += qta;
		}
	}
	
	public void rimuovi(int qta)
	{
		if(qta <= 0)
		{
			System.out.println("La quantità inserita non è corretta");
		}
		else
		{
			if(this.quantita < qta)
			{
				System.out.println("La quantità supera la disponibilità");
			}
			else
			{
				this.quantita -= qta;
			}
		}
	}
	
	public double valoreTotale ()
	{
		double valore = 0;
		valore = this.prezzo * quantita;
		return valore;
	}
	
	public void stampaInfo()
	{
		System.out.println("Prodotto: " + this.nome);
		System.out.println("Prezzo: " + this.prezzo);
		System.out.println("quantità disponibile: " + this.quantita);
	}
	
	
	
	
	
}
