package Argomento_5_1;

public interface ProdottoRepository {

	public void salva(String codice, String nome, double prezzo);
	public boolean esistePerCodice(String codice);
}
