package esercizioSingleton4;

public class Cliente extends Thread {

	//variabili di istanza
	private String nome;
	private int soldi;
	
	//costruttore
	public Cliente(String nome, int soldi)
	{
		this.nome = nome;
		this.soldi = soldi;
	}
	
	public void run()
	{
		Distributore distributore = Distributore.getInstance();
	}
	
	
	
}