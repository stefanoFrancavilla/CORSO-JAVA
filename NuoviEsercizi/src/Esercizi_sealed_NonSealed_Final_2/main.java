package Esercizi_sealed_NonSealed_Final_2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestorePagamenti gestore = new GestorePagamenti();
		
		MetodoDiPagamento cartaDiCredito = new CartaDiCredito("456123456123");
		
		MetodoDiPagamento bonifico = new Bonifico("IT00389452188686");
		
		MetodoDiPagamento criptoValuta = new Criptovaluta("a2e365g45");
		
		cartaDiCredito.elabora();
		System.out.println("-------------------------------------");
		bonifico.elabora();
		System.out.println("-------------------------------------");
		criptoValuta.elabora();
		System.out.println("-------------------------------------");
		
		MetodoDiPagamento bonificoIstantaneo = new BonificoIstantaneo("IT00389452188686");
		bonificoIstantaneo.elabora();
		System.out.println("-------------------------------------");
		
		gestore.processa(cartaDiCredito);
		System.out.println("-------------------------------------");
	}

}
