package Esercizio_Sistema_di_gestione_di_uno_zoo;

public non-sealed class Scimmia extends Mammifero implements Animale {

	//costruttore
	public Scimmia(String nome, int eta) {
		super(nome, eta);
	}
	
	
	
	@Override
	public void agisci() {
		// TODO Auto-generated method stub
System.out.println("La scimmia George si arrampica.");
		
	}

	@Override
	public double costo() {
		return 30;
	}
	
	@Override
	public String toString() {
		return "Nome " + this.getNome() + " eta " + this.getEta();
	}



	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("La scimmia " + this.getNome() + " mangia la banana");
	}
	
	

}
