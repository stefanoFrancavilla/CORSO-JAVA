package DispositiviElettronici;

public class Computer extends Dispositivo {

	//variabili di istanza
	private int ramGB;
	private double velocitaProcessoreGHz;
	
	//costruttore
	
	public Computer(String marca, String modello, int ramGB, double velocitàProcessoreGHz)
	{
		super(marca, modello);
		this.ramGB = ramGB;
		this.velocitaProcessoreGHz =velocitaProcessoreGHz;
	}

	public int getRamGB() {
		return ramGB;
	}

	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}

	public double getVelocitàProcessoreGHz() {
		return velocitaProcessoreGHz;
	}

	public void setVelocitàProcessoreGHz(double velocitàProcessoreGHz) {
		this.velocitaProcessoreGHz = velocitàProcessoreGHz;
	}
	
	
	//metodi
	@Override
	public void mostraStato()
	{
		System.out.println("Marca " + marca + " " + modello + " ram " + ramGB + " GB , CPU " + velocitaProcessoreGHz);
	}
	@Override
	public int getAutonomia()
	{
		return 0;
	}
	
}
