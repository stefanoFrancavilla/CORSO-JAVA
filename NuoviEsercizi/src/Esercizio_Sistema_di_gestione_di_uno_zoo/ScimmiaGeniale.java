package Esercizio_Sistema_di_gestione_di_uno_zoo;

public class ScimmiaGeniale extends Scimmia {

	//costruttore
	
	public ScimmiaGeniale(String nome, int eta) {
		super(nome, eta);
	}
	
	
	@Override
	public void agisci() {
		// TODO Auto-generated method stub
		super.agisci();
		System.out.println("La scimmia risolve un puzzle.");
	}

	@Override
	public double costo() {
		return 45;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		super.mangia();
		System.out.println("Alla scimmia geniale di nome " + this.getNome() + " tocca mangiare 2 banane, per il suo impegno");
	}

	
}
