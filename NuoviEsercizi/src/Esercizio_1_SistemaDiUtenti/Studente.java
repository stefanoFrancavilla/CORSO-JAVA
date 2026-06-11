package Esercizio_1_SistemaDiUtenti;

public final class Studente extends Utente {

	
	
	//costruttore

	public Studente(String nome, int eta) {
		super(nome, eta);
	}

	//metodi getter setter
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getEta() {
		// TODO Auto-generated method stub
		return super.getEta();
	}

	@Override
	public void setEta(int eta) {
		// TODO Auto-generated method stub
		super.setEta(eta);
	}

	//metodi
	
	@Override
	public void lezione() {
		// TODO Auto-generated method stub
		super.lezione();
		
		System.out.println("Lo studente " + this.getNome() + " ascolta attentamente la lezione");
	}

	@Override
	public int compareTo(Utente o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}
	

	
	
}
