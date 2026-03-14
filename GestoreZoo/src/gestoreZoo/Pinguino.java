package gestoreZoo;

public class Pinguino extends Uccello {
	//variabili di istanza
	
	private String tipoAli = "brevi";
	
	//costruttore
	public Pinguino(String nome, double peso, String tipoAli) {
		super (nome, peso, tipoAli);
		this.tipoAli = tipoAli;
	}
	
	
	
	public String getTipoAli() {
		return tipoAli;
	}



	public void setTipoAli(String tipoAli) {
		if (!tipoAli.equalsIgnoreCase("brevi")) {
			this.tipoAli = "brevi";
		}
	}



   //metodi
   @Override
	public void vola() {
		System.out.println("Il pinguino nuota invece di volare!");
	}
	@Override
	public void mangia() {
		System.out.println("Il pinguino pesca sott'acqua!");
		
	}
	
	
}
