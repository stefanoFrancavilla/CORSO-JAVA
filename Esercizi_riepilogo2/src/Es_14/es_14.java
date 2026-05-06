package Es_14;

public class es_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prossimo esercizio (più avanzato)
🛒 Carrello Spesa
Classe Prodotto

(riusi quella che hai fatto 👍)

Nuova classe Carrello
Attributi:
Prodotto[] prodotti;
Metodi:
aggiungiProdotto(Prodotto p)
totaleCarrello()
stampaCarrello()


Classe Prodotto
Attributi:
String nome
double prezzo
int quantita
🔧 Costruttore:

Inizializza tutti gli attributi (usa i setter)

🔹 Metodi:
1. aggiungi(int qta)
Aumenta la quantità
❌ Se qta ≤ 0 → errore
2. rimuovi(int qta)
Diminuisce la quantità
❌ Se qta ≤ 0 → errore
❌ Se qta > quantita → errore
3. valoreTotale()
ritorna: prezzo * quantita
4. stampaInfo()
stampa nome, prezzo, quantità
🧠 Vincoli:
prezzo > 0
quantita ≥ 0
nome non vuoto

+----------------------+
|      Prodotto        |
+----------------------+
| - nome: String       |
| - prezzo: double     |
| - quantita: int      |
+----------------------+
| + Prodotto(...)      |
| + aggiungi(int)      |
| + rimuovi(int)       |
| + valoreTotale():double |
| + stampaInfo():void  |
+----------------------+


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
		 Prodotto pasta = new Prodotto("Pasta", 0.50, 5);
		    Prodotto uova = new Prodotto("Uova", 1.5, 4);
		    Prodotto latte = new Prodotto("Latte", 1, 7);
		    Prodotto bistecche = new Prodotto("Bistecche", 4.5, 2);
		    Prodotto sale = new Prodotto("Sale", 0.50, 6);

		    Prodotto[] prodotti = {pasta, pasta, uova, uova, latte, latte, latte, bistecche, sale, sale};

		    Carrello carrello = new Carrello(prodotti);

		    carrello.stampaCarrello(); 
		    System.out.println("Totale: " + carrello.totaleCarrello());
		}
}