package gestoreZoo;

public abstract class Uccello extends Animale {

	//variabili di istanza
	private String tipoAli;
	
	//costruttore
	
	public Uccello(String nome, double peso, String tipoAli) {
		super (nome, peso);
		this.tipoAli = tipoAli;
		
	}
	//metodi getter/setter
	
	public String getTipoAli() {
		return tipoAli;
	}



	public void setTipoAli(String tipoAli) {
		this.tipoAli = tipoAli;
	}
	
	//metodi
	
	public abstract void vola();

	public abstract void mangia();


	
}
