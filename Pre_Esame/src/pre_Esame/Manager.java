package pre_Esame;

public class Manager extends Dipendente {
	
	//variabili di istanza

	private int teamSize;
	
	//costruttore
	public Manager(String nome, double stipendio, int teamSize) {
		super(nome, stipendio);
		this.teamSize = teamSize;
	}

	//metodi getter setter
	
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	//metodi
	@Override
	public double calcolaBonus(double stipendio) {

		double bonus = stipendio / 5;
		return bonus;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getNome()=" + getNome() + ", getStipendio()=" + getStipendio()
				+ "]";
	}

	

	

}
