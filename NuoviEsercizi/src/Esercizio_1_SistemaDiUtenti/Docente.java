package Esercizio_1_SistemaDiUtenti;

public class Docente extends Utente {

	//variabili di istanza
	
	private String materia;

	// costruttore
	public Docente(String nome, int eta, String materia) {
		super(nome, eta);
		this.materia = materia;
	}

	//metodi getter setter
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

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
		System.out.println("Il docente " + this.getNome() + " sta spiegando la lezione");
	}

	@Override
	public int compareTo(Utente o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}
	


	
	
	
	
	
	
}
