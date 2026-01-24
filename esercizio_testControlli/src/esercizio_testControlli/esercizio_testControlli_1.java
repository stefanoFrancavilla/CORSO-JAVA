package esercizio_testControlli;



public class esercizio_testControlli_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Prodotti prodotto = Prodotti.PASTA;
	String messaggio = verificaProdotto(prodotto);
	
	System.out.println("messaggio: " + messaggio);
	
	Prodotti prodotto2 = Prodotti.LENZUOLA;
	messaggio = verificaProdotto(prodotto2);
	System.out.println("messaggio: " + messaggio);
	
	messaggio = verificaProdotto(Prodotti.PIGIAMA);
	System.out.println("messaggio: " + messaggio);
	
}
public static String verificaProdotto(Prodotti prodotto)

{
	String messaggio = "";
	
	switch(prodotto)
	{
	case PASTA:
	case OLIO:
	case SALE:
	case PEPE:
	case TONNO:
	case ZUCCHERO:
		
		messaggio = "questo prodotto si trova in cucina";
		break;
		
	case SAPONE:
	case BAGNOSCHIUMA:
	case DENTIFRICIO:
	case CARTA_IGIENICA:
	case SPAZZOLINO:
		
		messaggio =  "questo prodotto si trova in bagno";
		break;
		
	case LENZUOLA:
	case CUSCINO:
	case COPERTA:
	case PIUMONE:
	case PIGIAMA:
		
		messaggio = "questo prodotto si trova in camera da letto";
		break;
		
	default:
		messaggio = " questo prodotto non è nella lista";
		break;
	}
	return messaggio;
 }
}