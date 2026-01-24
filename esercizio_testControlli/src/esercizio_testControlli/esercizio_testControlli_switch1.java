package esercizio_testControlli;

public class esercizio_testControlli_switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1) IF / ELSE (confronto tra numeri)

📌 Esercizio:
Crea due variabili a e b.
Stampa:

"a è maggiore" se a > b

"b è maggiore" se b > a

"sono uguali" se a == b

✅ Extra: prova con numeri diversi e uguali.
 */
		
		int a = 8;
		int b = 6;
		
		if (a > b)
		{
			System.out.println("a è maggiore");
		}
		else if (a < b)
		{
			System.out.println("b è maggiore");
		}
		else 
		{
			System.out.println("sono uguali");
		}
		
		System.out.println("-----------------------------------------------");
		
		a = 15;
		b = 15;
		
		if (a > b)
		{
			System.out.println("a è maggiore");
		}
		else if (a < b)
		{
			System.out.println("b è maggiore");
		}
		else 
		{
			System.out.println("sono uguali");
		}
		/*
		 * ⭐ VOTO: 10/10 ✅
Perché 10?

✅ Codice corretto
✅ Stampa esatta come richiesto
✅ Struttura if / else if / else perfetta
✅ Extra completato
✅ Nessun errore di sintassi o logica
		 */
	}

}
