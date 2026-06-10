package Esercizio_Sistema_di_gestione_di_uno_zoo;

public final class Leone extends Mammifero implements Animale {

	//costruttore
	public Leone(String nome, int eta) {
		super(nome, eta);
	}


	//metodi
	@Override
	public void agisci() {
		// TODO Auto-generated method stub

		System.out.println("Il leone Simba ruggisce.");
	}
	

	@Override
	public double costo() {
		return 50;
	}


	@Override
	public String toString() {
		return "Nome " + this.getNome() + " eta " + this.getEta();
	}


	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Il leone " + this.getNome() + " mangia la preda");
	}


	
	

	

}
