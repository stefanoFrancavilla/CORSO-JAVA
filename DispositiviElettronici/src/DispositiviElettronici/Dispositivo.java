package DispositiviElettronici;

public abstract class Dispositivo implements DispositivoElettronico {

	//variabili di istanza
	
	protected String marca;
	
	protected String modello;
	
	protected boolean acceso;
	
	public Dispositivo(String marca, String modello)
	{
		this.marca = marca;
		this.modello = modello;
		this.acceso = false;
	}
	public  void accendi()
	{
		acceso = true;
		System.out.println("Il dispositivo " + marca + " è acceso");
	}
	
	public void spegni()
	{
		acceso = false;
		System.out.println("Il dispositivo " + marca + " è spento");
	}

	
	public abstract int getAutonomia();
	
	
}
