package DispositiviElettronici;

public class SmartWatch extends Dispositivo {
	
	// variabili di istanza
	
	private int autonomiaInOre;
    private boolean monitoraggioBattitoCardiaco;
    
    // Costruttore
    
    public SmartWatch (String marca, String modello, int autonomiaInOre, boolean monitoraggioBattitoCardiaco)
    {
    	super(marca, modello);
    	this.autonomiaInOre = autonomiaInOre;
    	this.monitoraggioBattitoCardiaco = monitoraggioBattitoCardiaco;		
    }
    
    //metodi getter/setter
	public int getAutonomiaInOre() {
		return autonomiaInOre;
	}

	public void setAutonomiaInOre(int autonomiaInOre) {
		this.autonomiaInOre = autonomiaInOre;
	}

	public boolean isMonitoraggioBattitoCardiaco() {
		return monitoraggioBattitoCardiaco;
	}

	public void setMonitoraggioBattitoCardiaco(boolean monitoraggioBattitoCardiaco) {
		this.monitoraggioBattitoCardiaco = monitoraggioBattitoCardiaco;
	}
    
	// metodi
	  @Override
	public void mostraStato()
	{
	    System.out.println("Smartwatch: " + marca + " " + modello +
                ", autonomia: " + autonomiaInOre + " ore, "
                + (monitoraggioBattitoCardiaco ? "monitoraggio battito" : "no monitoraggio"));
	}
	  @Override
	public int getAutonomia()
	{
		return autonomiaInOre;
	}
    
}
