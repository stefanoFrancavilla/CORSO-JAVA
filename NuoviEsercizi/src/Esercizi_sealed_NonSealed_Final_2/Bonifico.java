package Esercizi_sealed_NonSealed_Final_2;

public non-sealed class Bonifico implements MetodoDiPagamento {
//variabili di istanza
	private final String numeroConto;
	
	//costruttore 
	
	public Bonifico(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	
	
	
	
	
	@Override
	public void elabora() {
		// TODO Auto-generated method stub
		

		System.out.println("Il pagamento con bonifico del conto numero: " + numeroConto + " è in elaborazione");
	}

}
