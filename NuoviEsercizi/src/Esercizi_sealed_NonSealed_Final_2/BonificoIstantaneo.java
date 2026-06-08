package Esercizi_sealed_NonSealed_Final_2;

public class BonificoIstantaneo extends Bonifico {
	

	public BonificoIstantaneo(String numeroConto) {
		super(numeroConto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void elabora() {
		// TODO Auto-generated method stub
		super.elabora();
		
		System.out.println("Il bonifico sarà effettuato con la modalità \" bonifico istantaneo \" ");
	}

}
