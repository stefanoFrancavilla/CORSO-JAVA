package gestoreZoo;

public abstract class Mammifero extends Animale{
	 
	//variabili di istanza
	private boolean haPelo;
	
	//costruttori
	public Mammifero(String nome, double peso, boolean haPelo) {
		super(nome, peso);
		
		this.haPelo = haPelo;
	}
	
	//metodi getter/setter

	public boolean getHaPelo() {
		return haPelo;
	}

	public void setHaPelo(boolean haPelo) {
		this.haPelo = haPelo;
	}
	
	//metodi
	
	public void allatta() {
		System.out.print(super.getNome() + " allatta");
	}

	
}
