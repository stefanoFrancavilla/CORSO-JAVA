package Argomento_5_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdottoRepository prodottoRepository = new ProdottoRepositoryImpl();
		
		MagazzinoService magazzinoService = new MagazzinoService(prodottoRepository);
		
		magazzinoService.aggiungiProdotto("P001", "Tastiera", 49.90);
		magazzinoService.aggiungiProdotto("P002", "Mouse", 24.90);
		magazzinoService.aggiungiProdotto("P003", "Monitor", 199.90);
		magazzinoService.aggiungiProdotto("P002", "Mouse nuovo", 29.90);
		
	}

}
