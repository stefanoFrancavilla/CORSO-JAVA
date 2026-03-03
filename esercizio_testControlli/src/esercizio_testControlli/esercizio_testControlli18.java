package esercizio_testControlli;

public class esercizio_testControlli18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO: Simulatore Vendite Supermercato con Magazzino
Crea sistema gestione casse/supermercato con 3 casse (A=veloce, B=standard, C=lenta). Simula vendite con controlli magazzino.

Requisiti OBBLIGATORI
Menu principale (switch):

1: Nuova vendita (simula)

2: Stato casse (stampa)

3: Ricerca prodotto (switch categoria)

0: Esci

Classe Prodotto (metodo statico? No, array globale bidimensionale):

text
Categoria | Codice | Prezzo | Stock
FRUTTA    | F001  | 1.20  | 50
LATTE     | L001  | 0.90  | 30
CEREALI   | C001  | 2.50  | 20
... (5 prodotti totali)
Funzione nuovaVendita():

Chiedi cassa (A/B/C) → switch velocità (A=1min/cliente, B=2min, C=4min)

For 1-5 prodotti:

Codice prodotto (switch per categoria/prezzo, if stock>0)

--stock se ok

Somma totale double

Tempo totale = num_prodotti * velocità_cassa

Stampa scontrino con for lista prodotti

Funzione statoCasse():

Conta tot ricavi per cassa (usa array double)

Tempo medio (usa for storico)

Tabella markdown

Validazioni:

Codice invalido → "Prodotto non trovato"

Stock 0 → "Esaurito, salta"

Input non-num → riprova (Scanner + if)

Extra difficile:

For storico 10 vendite max

Se ricavi cassa A > 100€ → bonus 10% (if)

Salva/ripristina magazzino (array)

Esempio Output Vendita (Cassa B, 3 prodotti)
text
--- SCONTRINO CASSA B ---
Prodotto F001 (Mele): 1.20€ x1 = 1.20€
Prodotto L001 (Latte): 0.90€ x2 = 1.80€
Totale: 3.00€
Tempo: 6 min
Esempio Stato Casse
text
| Cassa | Ricavi | Clienti | Tempo Medio |
|-------|--------|---------|-------------|
| A     | 45.50€ | 3       | 1.3 min    |
| B     | 120.00€| 5       | 2.4 min    |
| C     | 30.00€ | 2       | 4.0 min    |
BONUS A: +10% (4.55€)
Scrivi codice completo (classe Supermercato, 5+ funzioni, array 2D prodotti [5][4]). Compila/testa:

Vendita cassa A: F001 x3 → stock F001=47

Stato casse
		 */
	}

}
