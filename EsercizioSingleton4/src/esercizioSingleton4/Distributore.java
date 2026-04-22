package esercizioSingleton4;

public class Distributore {

	//variabili di istanza
	private int credito;
	private int bevandeDisponibili = 4;
	private int prezzo = 2;
	
	//costruttore
	
	private Distributore() {
		
	}
	
	public static Distributore getInstance()
	{
		return DistributoreBuilder.INSTANCE;
	}
	
	
	
	private static class DistributoreBuilder
	{
		private static final Distributore INSTANCE = new Distributore();
	}

	//metodi getter/setter

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public int getBevandeDisponibili() {
		return bevandeDisponibili;
	}

	public void setBevandeDisponibili(int bevandeDisponibili) {
		this.bevandeDisponibili = bevandeDisponibili;
	}
	
	public synchronized void inserisciSoldi( String Cliente, int importo )
	{
		if (importo <= 0)
		{
			System.out.println("importo non valido");
			return;
		}
		
		credito += importo;
		System.out.println("Il cliente " + Cliente + "ha inserito "  + importo);
		System.out.println("Il credito attuale è: " + credito);
	}

	public synchronized void acquistaBevanda(String Cliente)
	{
		while (credito < prezzo)
		{
			System.out.println("Credito insufficiente per procedere");
			
			try 
			{
				wait();
			}
			catch(InterruptedException e )
			{
				Thread.currentThread().interrupt();
				System.out.println(Cliente + " è stato interrotto durante l'operzione");
				return;
			}
		}
		
	
			bevandeDisponibili--;
			credito = credito - prezzo;
			System.out.println("Il cliente: " + Cliente + " ha acquistato una bevanda");
			System.out.println("il credito attuale è: " + credito);
		
	}
	
	
	
}
