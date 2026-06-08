package Esercizi_sealed_NonSealed_Final_2;

public final class CartaDiCredito implements MetodoDiPagamento {

	private final String numeroCarta;
	
	public CartaDiCredito(String numeroCarta)
	{
		this.numeroCarta = numeroCarta;
	}
	
	
	
	
	@Override
	public void elabora() {
		// TODO Auto-generated method stub
		System.out.println("Il pagamento con carta di credito " + numeroCarta + " è in elaborazione");

	}

}
