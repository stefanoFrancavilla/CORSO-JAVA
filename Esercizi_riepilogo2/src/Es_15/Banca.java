package Es_15;

public class Banca {
	/*
	 * 🔷 Classe Banca
📦 Attributi:
Conto[] conti


🔹 Metodi:
1. aggiungiConto(Conto c)
Inserisce il conto nel primo spazio libero


2. saldoTotaleBanca()
Somma tutti i saldi dei conti


3. stampaConti()
Stampa tutti i conti

	 */
	
	

	//variabili di istanza
	
	private Conto[] conti;
	
	//costruttori
	
	public Banca ( Conto[] conti)
	{
		this.conti = conti;
	}
	
	//metodi
	
	public void aggiungiConto (Conto c )
	{
		for (int i = 0; i < conti.length;i++ )
		{
			if (conti[i] == null)
			{
				conti[i] = c;
				return;
			}
		}
		System.out.println("la banca non può accettare più clienti");
	}
	
	public double saldoTotaleBanca()
	{
		double sommaSaldoConti = 0;
		
		for (int i = 0; i < conti.length; i++)	
		{
			sommaSaldoConti += conti[i].getSaldo();
		}
		
		return sommaSaldoConti;
	}
	
	public void stampaConti()
	{
		for (int i = 0; i < conti.length; i++)
		{
			conti[i].stampainfo();
			System.out.println("---------------------");
		}
	}
	
	public void trovaConto (String nome)
	{
		for(int i = 0; i < conti.length; i++)
		{
			if ( nome.equalsIgnoreCase(conti[i].getIntestatario()))
			{
				System.out.println("Conto trovato");
				conti[i].stampainfo();
				System.out.println("---------------------");
				System.out.println("---------------------");
				return;
			}
		}
	}
	
	public void contoConSaldoMassimo ()
	{

		int indice = 0;
		double importoMax = conti[0].getSaldo();
		for(int i = 1; i < conti.length; i++)
		{
			if(conti[i].getSaldo() > importoMax)
			{
				importoMax = conti[i].getSaldo();
				indice = i;
			}
		}
		System.out.println("intestatario: " + conti[indice].getIntestatario() + " \n saldo: " + conti[indice].getSaldo());
	}
}
