package gestoreZoo;

public class Aquila extends Uccello {
	//variabili di istanza
	
	private String tipoAli;
	
	//costruttore
	public Aquila(String nome, double peso, String tipoAli) {
		super (nome, peso, tipoAli);
		this.tipoAli = "acute";
	}
	
	
	public String getTipoAli() {
		return tipoAli;
	}

	public void setTipoAli(String tipoAli) {
		
		this.tipoAli = "acute";	
	}

   //metodi
   @Override
	public void vola() {
		System.out.println("L'aquila plana in alto!");
	}
	@Override
	public void mangia() {
		System.out.println("L'aquila caccia in picchiata!");
		
	}
	
	
}
