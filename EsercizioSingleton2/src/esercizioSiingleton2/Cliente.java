package esercizioSiingleton2;

public class Cliente extends Thread{

	//variabili d'istanza
	private String nome;
	
	//costruttore
	public Cliente(String nome)
	{
		this.nome = nome;
	}


	
	//metodi getter e setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void run()
	{
		CentraleTaxi.getInstance().corsaTaxi();
	}
	
}
