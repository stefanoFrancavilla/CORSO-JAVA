package Argomento_5_1;

public class ProdottoRepositoryImpl implements ProdottoRepository {
	
	private String[] codici = new String[10];
	private String[] nomi = new String[10];
	private double[] prezzi = new double[10];
	private int posizione = 0;
	
	

	@Override
	public void salva(String codice, String nome, double prezzo) {
		if (posizione >= codici.length)
		{
			System.out.println("Errore, memoria piena");
			return;
		}
		codici[posizione] = codice;
		nomi[posizione] = nome;
		prezzi[posizione] = prezzo;
		
		posizione ++;
		
	}

	@Override
	public boolean esistePerCodice(String codice) {
	
		for (int i = 0; i < posizione; i++)
		{
			if(codici[i].equals(codice))
			{
				return true;
			}
		}
		return false;
	}

}
