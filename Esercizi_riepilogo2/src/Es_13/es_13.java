package Es_13;

public class es_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto pasta = new Prodotto("Pasta", 0.50 );
		Prodotto uova = new Prodotto("Uova",  1.5);
		Prodotto latte = new Prodotto("Latte", 1);
		
		pasta.setQuantita(2);
		uova.setQuantita(1);
		latte.setQuantita(2);
		
		Prodotto[] prodotti = new Prodotto[3];
		prodotti[0] = pasta;
		prodotti[1] = uova;
		prodotti[2] = latte;
		
		for(int i = 0; i < prodotti.length; i++)
		{
			prodotti[i].aggiungi(2);
			prodotti[i].rimuovi(4);
			prodotti[i].stampaInfo();
		}
		Prodotto.valoreMagazzino(prodotti);
	}

}
