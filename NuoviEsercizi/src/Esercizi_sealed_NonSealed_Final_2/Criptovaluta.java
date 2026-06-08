package Esercizi_sealed_NonSealed_Final_2;

public final class Criptovaluta implements MetodoDiPagamento {
	
	private final String numeroContoCripto;
	
	public Criptovaluta ( String numeroContoCripto) {
		this.numeroContoCripto = numeroContoCripto;
	}

	@Override
	public void elabora() {
		// TODO Auto-generated method stub

		System.out.println("Il pagamento in cripto del conto: " + numeroContoCripto + " è in elaborazione");
	}

}
