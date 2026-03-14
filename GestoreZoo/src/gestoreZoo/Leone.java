package gestoreZoo;

public class Leone extends Mammifero {

	//variabili di istanza
	private String ruggito;
	
	//costruttori
	public Leone(String nome, double peso, boolean haPelo, String ruggito) {
		super(nome, peso, haPelo);
		
		this.ruggito = "ROAR!";
	}

	//metodi getter/setter
	
	public String getRuggito() {
		return ruggito;
	}

	public void setRuggito(String ruggito) {
		this.ruggito = "ROAR!";
	}
	
	//metodi
	@Override
	public void mangia() {
		System.out.println("Il leone divora carne!");
	}
	
	public void ruggisce() {
		System.out.println("Il leone ruggisce, ROAR!");
	}
}
