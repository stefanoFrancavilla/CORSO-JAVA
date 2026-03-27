package DispositiviElettronici;

public class SmartPhone extends Dispositivo {

	// variabili di istanza
	  private int capacitaBatteriaMah;
	  private String sistemaOperativo;
	  
	  //costruttore
	  
	  public SmartPhone(String marca, String modello , int capacitaBatteriaMah, String sistemaOperativo)
	  {
		  super(marca, modello);
		  this.capacitaBatteriaMah = capacitaBatteriaMah;
		  this.sistemaOperativo = sistemaOperativo;  
	  }

	
	  
	  //metodi getter/setter
	  
	  public int getCapacitaBatteriaMah() {
		  return capacitaBatteriaMah;
	  }

	  public void setCapacitaBatteriaMah(int capacitaBatteriaMah) {
		  this.capacitaBatteriaMah = capacitaBatteriaMah;
	  }

	  public String getSistemaOperativo() {
		  return sistemaOperativo;
	  }

	  public void setSistemaOperativo(String sistemaOperativo) {
		  this.sistemaOperativo = sistemaOperativo;
	  }
	  
	  //metodi
	  @Override
	  public void mostraStato()
		{
			System.out.println("Marca " + marca + " " + modello + " batteria " + capacitaBatteriaMah + " mAh , sitema operativo " + sistemaOperativo);
		}
	  @Override
	  public int getAutonomia ()
	  {
		 return  capacitaBatteriaMah;
	  }
	  
	  
}
