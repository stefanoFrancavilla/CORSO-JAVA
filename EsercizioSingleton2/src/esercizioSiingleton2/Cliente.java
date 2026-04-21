package esercizioSiingleton2;

public class Cliente extends Thread{

	//variabili d'istanza
	public static String nome;
	
	//costruttore
	public Cliente(String nome)
	{
		this.nome = nome;
	}


	
	//metodi getter e setter
	
	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Cliente.nome = nome;
	}
	
	@Override
	public void run()
	{
		
	}
	
}
