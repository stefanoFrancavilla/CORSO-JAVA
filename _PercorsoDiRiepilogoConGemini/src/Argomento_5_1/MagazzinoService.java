package Argomento_5_1;

public class MagazzinoService {
	private ProdottoRepository prodottoRepository;

	public MagazzinoService(ProdottoRepository prodottoRepository) {
		this.prodottoRepository = prodottoRepository;
	}

	public ProdottoRepository getProdottoRepository() {
		return prodottoRepository;
	}

	public void setProdottoRepository(ProdottoRepository prodottoRepository) {
		this.prodottoRepository = prodottoRepository;
	}
	
	
	public void aggiungiProdotto(String codice, String nome, double prezzo)
	{
		if (prodottoRepository.esistePerCodice(codice))
		{
			System.out.println("Prodotto già presente");
		}
		else 
		{
			prodottoRepository.salva(codice, nome, prezzo);
			System.out.println("Prodotto aggiunto " + nome);
		}
	}
	

}
