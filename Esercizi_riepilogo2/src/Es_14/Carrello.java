package Es_14;

public class Carrello {

	/*
	 * Nuova classe Carrello
Attributi:
Prodotto[] prodotti;
Metodi:
aggiungiProdotto(Prodotto p)
totaleCarrello()
stampaCarrello()



         Prodotto
            ▲
            | (usa / contiene)
            |
+---------------------------+
|        Carrello           |
+---------------------------+
| - prodotti: Prodotto[]    |
+---------------------------+
| + aggiungiProdotto(p)     |
| + totaleCarrello():double |
| + stampaCarrello():void   |
+---------------------------+

	 */
	
	//variabili di istanza
	
//	Prodotto[] prodotti = new Prodotto[5];
//	
//	public Carrello(Prodotto[] prodotti)
//	{
//		
//	}
//
//	//metodi 
//	
//  public void aggiungiProdotto(Prodotto p)
//  {
//	  for(int i = 0; i < prodotti.length; i++)
//	  {
//		  if(prodotti[i] == null)
//		  {
//			  prodotti[i] = p;
//			  break;
//		  }
//	  }
//  }
//	
//  public double totaleCarrello(Prodotto[] prodotti)
//  {
//	  double totale = 0;
//	  for( int i = 0; i < prodotti.length; i++)
//	  {
//		 totale = totale + (prodotti[i].getPrezzo() * prodotti[i].getQuantita());
//	  }
//	  
//	  return totale;
//  }
//	
//  public void stampaCarrello(Prodotto[] prodotti)
//  {
//	  for(int i = 0; i < prodotti.length; i++)
//	  {
//		  System.out.println("Nel carrello hai inserito: " + prodotti[i].getNome());
//		  System.out.println("Prezzo" + prodotti[i].getPrezzo());
//	  }
//  }
//	
//}
	
	 private Prodotto[] prodotti;

	    public Carrello(Prodotto[] prodotti) {
	        this.prodotti = prodotti;
	    }

	    public void aggiungiProdotto(Prodotto p) {
	        for (int i = 0; i < prodotti.length; i++) {
	            if (prodotti[i] == null) {
	                prodotti[i] = p;
	                return;
	            }
	        }
	        System.out.println("Carrello pieno!");
	    }

	    public double totaleCarrello() {
	        double totale = 0;

	        for (int i = 0; i < prodotti.length; i++) {
	            if (prodotti[i] != null) {
	                totale += prodotti[i].valoreTotale();
	            }
	        }

	        return totale;
	    }

	    public void stampaCarrello() {
	        for (int i = 0; i < prodotti.length; i++) {
	            if (prodotti[i] != null) {
	                prodotti[i].stampaInfo();
	                System.out.println("------------------");
	            }
	        }
	    }
	}
	
